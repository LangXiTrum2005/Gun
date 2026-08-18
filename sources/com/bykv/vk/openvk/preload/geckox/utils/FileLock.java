package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f361a = new HashMap();
    private final int b;
    private final String c;

    static {
        System.loadLibrary("file_lock");
    }

    private FileLock(String str, int i) {
        this.c = str;
        this.b = i;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e) {
            StringBuilder sbU = AbstractC3950lJ.u("lock failed, file:", str, ", pid:");
            sbU.append(Process.myPid());
            sbU.append(" caused by:");
            sbU.append(e.getMessage());
            throw new RuntimeException(sbU.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e) {
            StringBuilder sbU = AbstractC3950lJ.u("try lock failed, file:", str, " caused by:");
            sbU.append(e.getMessage());
            throw new RuntimeException(sbU.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e) {
            StringBuilder sbU = AbstractC3950lJ.u("try lock failed, file:", str, " caused by:");
            sbU.append(e.getMessage());
            throw new RuntimeException(sbU.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f361a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    public static FileLock a(String str, int i) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i);
            return new FileLock(str, iD);
        } catch (Exception e) {
            StringBuilder sbU = AbstractC3950lJ.u("lock segment failed, file:", str, " caused by:");
            sbU.append(e.getMessage());
            throw new RuntimeException(sbU.toString());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f361a;
        synchronized (map) {
            numRemove = map.remove(this.c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.c + " caused by:" + e.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.c);
        }
    }
}

package com.bykv.vk.openvk.preload.geckox.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws Exception {
        if (!file.exists()) {
            throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        file3.mkdirs();
        File file4 = new File(file3, str);
        file4.delete();
        int iPatch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
        if (iPatch == 0) {
            return;
        }
        StringBuilder sbQ = AbstractC5044xl.q("patch merged failed, code：", iPatch, " full:");
        sbQ.append(file.getAbsolutePath());
        sbQ.append(" patch:");
        sbQ.append(file2.getAbsolutePath());
        sbQ.append(" dest:");
        sbQ.append(file4.getAbsolutePath());
        throw new RuntimeException(sbQ.toString());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}

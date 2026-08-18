package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lc;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.multipro.LD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QG;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class CacheDirFactory {
    private static String Lxb = null;
    public static volatile QG MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    private static QG Lxb() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        OK ok = new OK();
                        ok.f3500a = "video_reward_full";
                        ok.b = "video_brand";
                        ok.c = "video_splash";
                        ok.d = "video_default";
                        ok.e = null;
                        ok.f = null;
                        ok.g = null;
                        ok.h = null;
                        ok.i = null;
                        MEDIA_CACHE_DIR = ok;
                        ok.e = getRootDir();
                        ((OK) MEDIA_CACHE_DIR).c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return DM.m(sb, File.separator, str);
    }

    public static QG getICacheDir(int i) {
        return Lxb();
    }

    public static String getImageCacheDir() {
        if (Lxb == null) {
            Lxb = getDiskCacheDirPath("image");
        }
        return Lxb;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileLxb = lc.Lxb(kqm.Lxb(), LD.lk(), "tt_ad");
        if (fileLxb.isFile()) {
            fileLxb.delete();
        }
        if (!fileLxb.exists()) {
            fileLxb.mkdirs();
        }
        String absolutePath = fileLxb.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}

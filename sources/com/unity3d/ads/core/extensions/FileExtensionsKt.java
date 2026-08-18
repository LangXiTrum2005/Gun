package com.unity3d.ads.core.extensions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] fileArrListFiles;
        AbstractC2995aW.q(file, "<this>");
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File file3 : fileArrListFiles) {
                    if (file3.isDirectory()) {
                        linkedList.add(file3);
                    } else {
                        length += file3.length();
                    }
                }
            }
        }
        return length;
    }
}

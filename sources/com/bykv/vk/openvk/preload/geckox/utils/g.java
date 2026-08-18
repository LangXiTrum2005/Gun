package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static Long a(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    Long lValueOf = Long.valueOf(file2.getName());
                    long jLongValue = lValueOf.longValue();
                    if (l == null || jLongValue > l.longValue()) {
                        l = lValueOf;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }
}

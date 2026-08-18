package com.google.android.gms.internal.ads;

import java.util.Collection;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfwm {
    public static boolean zza(Collection collection, @CheckForNull Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

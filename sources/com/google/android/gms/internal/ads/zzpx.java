package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
final class zzpx {
    public static void zza(AudioTrack audioTrack, @Nullable zzoo zzooVar) {
        audioTrack.setPreferredDevice(zzooVar == null ? null : zzooVar.zza);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbub {

    @Nonnull
    private final View zza;

    @Nullable
    private final Map zzb;

    @Nullable
    private final zzbyu zzc;

    public zzbub(zzbua zzbuaVar) {
        View view = zzbuaVar.zza;
        this.zza = view;
        Map map = zzbuaVar.zzb;
        this.zzb = map;
        zzbyu zzbyuVarZza = zzbtv.zza(zzbuaVar.zza.getContext());
        this.zzc = zzbyuVarZza;
        if (zzbyuVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzbyuVarZza.zzg(new zzbuc(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbtz(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbyu zzbyuVar = this.zzc;
        if (zzbyuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbyuVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbty(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyu zzbyuVar = this.zzc;
        if (zzbyuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbyuVar.zzk(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbtx(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbtw(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}

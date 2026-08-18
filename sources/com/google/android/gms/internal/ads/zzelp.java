package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelp implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final zzfcj zzc;

    @Nullable
    private final View zzd;

    public zzelp(zzgcs zzgcsVar, Context context, zzfcj zzfcjVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzgcsVar;
        this.zzb = context;
        this.zzc = zzfcjVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        zzbcl.zza(this.zzb);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzelq zzc() throws Exception {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzelq(this.zzb, this.zzc.zze, arrayList);
    }
}

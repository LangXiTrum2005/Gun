package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdmt extends zzbgp {
    private final Context zza;
    private final zzdif zzb;
    private zzdjf zzc;
    private zzdia zzd;

    public zzdmt(Context context, zzdif zzdifVar, zzdjf zzdjfVar, zzdia zzdiaVar) {
        this.zza = context;
        this.zzb = zzdifVar;
        this.zzc = zzdjfVar;
        this.zzd = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzg(String str) {
        return (zzbfw) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzk() {
        try {
            SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
            SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
            String[] strArr = new String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
                strArr[i] = (String) simpleArrayMapZzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
                strArr[i] = (String) simpleArrayMapZzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strZzC)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdia zzdiaVar = this.zzd;
            if (zzdiaVar != null) {
                zzdiaVar.zzf(strZzC, false);
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(String str) {
        zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() {
        zzdia zzdiaVar = this.zzd;
        if (zzdiaVar != null) {
            zzdiaVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdia zzdiaVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdiaVar = this.zzd) == null) {
            return;
        }
        zzdiaVar.zzK((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() {
        zzdia zzdiaVar = this.zzd;
        return (zzdiaVar == null || zzdiaVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdjf zzdjfVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjfVar = this.zzc) == null || !zzdjfVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdms(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdjf zzdjfVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjfVar = this.zzc) == null || !zzdjfVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdms(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() {
        zzecr zzecrVarZzu = this.zzb.zzu();
        if (zzecrVarZzu == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzk(zzecrVarZzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}

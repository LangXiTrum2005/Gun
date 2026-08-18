package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoa extends zzcqz {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgc zze;
    private final zzdcw zzf;
    private final zzcwg zzg;
    private final zzcxn zzh;
    private final zzcru zzi;
    private final zzbwm zzj;
    private final zzfnt zzk;
    private final zzfcc zzl;
    private boolean zzm;

    public zzdoa(zzcqy zzcqyVar, Context context, @Nullable zzcex zzcexVar, zzdgc zzdgcVar, zzdcw zzdcwVar, zzcwg zzcwgVar, zzcxn zzcxnVar, zzcru zzcruVar, zzfbo zzfboVar, zzfnt zzfntVar, zzfcc zzfccVar) {
        super(zzcqyVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdgcVar;
        this.zzd = new WeakReference(zzcexVar);
        this.zzf = zzdcwVar;
        this.zzg = zzcwgVar;
        this.zzh = zzcxnVar;
        this.zzi = zzcruVar;
        this.zzk = zzfntVar;
        zzbwi zzbwiVar = zzfboVar.zzl;
        this.zzj = new zzbxg(zzbwiVar != null ? zzbwiVar.zza : "", zzbwiVar != null ? zzbwiVar.zzb : 1);
        this.zzl = zzfccVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcex zzcexVar = (zzcex) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgA)).booleanValue()) {
                if (!this.zzm && zzcexVar != null) {
                    zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcexVar.destroy();
                        }
                    });
                }
            } else if (zzcexVar != null) {
                zzcexVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwm zzc() {
        return this.zzj;
    }

    public final zzfcc zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcex zzcexVar = (zzcex) this.zzd.get();
        return (zzcexVar == null || zzcexVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzh(boolean z, @Nullable Activity activity) {
        Context context;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdk.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdgb e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}

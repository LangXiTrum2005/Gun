package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdeq extends zzcqz {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdcw zze;
    private final zzdgc zzf;
    private final zzcru zzg;
    private final zzfnt zzh;
    private final zzcwg zzi;
    private final zzbzq zzj;
    private boolean zzk;

    public zzdeq(zzcqy zzcqyVar, Context context, @Nullable zzcex zzcexVar, zzdcw zzdcwVar, zzdgc zzdgcVar, zzcru zzcruVar, zzfnt zzfntVar, zzcwg zzcwgVar, zzbzq zzbzqVar) {
        super(zzcqyVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcexVar);
        this.zze = zzdcwVar;
        this.zzf = zzdgcVar;
        this.zzg = zzcruVar;
        this.zzh = zzfntVar;
        this.zzi = zzcwgVar;
        this.zzj = zzbzqVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcex zzcexVar = (zzcex) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgA)).booleanValue()) {
                if (!this.zzk && zzcexVar != null) {
                    zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdep
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
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
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        Context context;
        zzfbo zzfboVarZzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                zzcex zzcexVar = (zzcex) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlL)).booleanValue() || zzcexVar == null || (zzfboVarZzD = zzcexVar.zzD()) == null || !zzfboVarZzD.zzar || zzfboVarZzD.zzas == this.zzj.zzb()) {
                    if (this.zzk) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                        this.zzi.zza(zzfdk.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzk) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        try {
                            this.zzf.zza(z, context, this.zzi);
                            this.zze.zza();
                            this.zzk = true;
                            return true;
                        } catch (zzdgb e) {
                            this.zzi.zzc(e);
                        }
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial consent form has been shown.");
                    this.zzi.zza(zzfdk.zzd(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            zzcex zzcexVar2 = (zzcex) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlL)).booleanValue()) {
                if (this.zzk) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(zzfdk.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            } else {
                if (this.zzk) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                    this.zzi.zza(zzfdk.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            }
        }
        return false;
    }
}

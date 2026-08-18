package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcog extends zzcqz {

    @Nullable
    private final zzcex zzc;
    private final int zzd;
    private final Context zze;
    private final zzcnu zzf;
    private final zzdgc zzg;
    private final zzdcw zzh;
    private final zzcwg zzi;
    private final boolean zzj;
    private final zzbzq zzk;
    private boolean zzl;

    public zzcog(zzcqy zzcqyVar, Context context, @Nullable zzcex zzcexVar, int i, zzcnu zzcnuVar, zzdgc zzdgcVar, zzdcw zzdcwVar, zzcwg zzcwgVar, zzbzq zzbzqVar) {
        super(zzcqyVar);
        this.zzl = false;
        this.zzc = zzcexVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcnuVar;
        this.zzg = zzdgcVar;
        this.zzh = zzdcwVar;
        this.zzi = zzcwgVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfq)).booleanValue();
        this.zzk = zzbzqVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzb() {
        super.zzb();
        zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.destroy();
        }
    }

    public final void zzc(zzazx zzazxVar) {
        zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.zzak(zzazxVar);
        }
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
    public final void zzd(Activity activity, zzbak zzbakVar, boolean z) throws RemoteException {
        zzcex zzcexVar;
        zzfbo zzfboVarZzD;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(context)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaN)).booleanValue()) {
                    new zzfnt(context.getApplicationContext(), com.google.android.gms.ads.internal.zzv.zzu().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlL)).booleanValue() && (zzcexVar = this.zzc) != null && (zzfboVarZzD = zzcexVar.zzD()) != null && zzfboVarZzD.zzar && zzfboVarZzD.zzas != this.zzk.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The app open consent form has been shown.");
            this.zzi.zza(zzfdk.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfdk.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdgb e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.ay;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3611hU;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawr extends zzaxr {
    private static final zzaxs zzh = new zzaxs();
    private final zzary zzi;
    private final Context zzj;
    private final zzatv zzk;

    public zzawr(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, Context context, zzarp zzarpVar, zzary zzaryVar, zzatv zzatvVar) {
        super(zzawdVar, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", zzascVar, i, 27);
        this.zzj = context;
        this.zzi = zzaryVar;
        this.zzk = zzatvVar;
    }

    private final zzats zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        int iIntValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcN)).booleanValue() ? ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcS)).intValue() : this.zzi.zza();
        zzats zzatsVar = new zzats((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatv zzatvVar = this.zzk;
        if (zzatvVar == null || zzatvVar.zza() == null) {
            str = ExifInterface.LONGITUDE_EAST;
        } else {
            try {
                str = (String) zzatvVar.zza().get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = ExifInterface.LONGITUDE_EAST;
            }
        }
        zzatsVar.zza = str;
        return zzatsVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzasy zzasyVarZzc = this.zza.zzc();
            if (zzasyVarZzc == null || !zzasyVarZzc.zzaj()) {
                return null;
            }
            return zzasyVarZzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzats zzatsVarZzc;
        zzats zzatsVar;
        AtomicReference atomicReferenceZza = zzh.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzats zzatsVar2 = (zzats) atomicReferenceZza.get();
                if (zzatsVar2 == null || zzawg.zzd(zzatsVar2.zza) || zzatsVar2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzatsVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawg.zzd(null)) {
                        zzawg.zzd(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzatsVarZzc = zzc();
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(i == 3 && !this.zzi.zzd());
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcB);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcA)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzp() && zzawg.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzats zzatsVar3 = new zzats((String) this.zze.invoke(null, this.zzj, boolValueOf, strZzb));
                        if (zzawg.zzd(zzatsVar3.zza) || zzatsVar3.zza.equals(ExifInterface.LONGITUDE_EAST)) {
                            int i2 = i - 1;
                            if (i2 == 3) {
                                String strZzd = zzd();
                                if (!zzawg.zzd(strZzd)) {
                                    zzatsVar3.zza = strZzd;
                                }
                            } else if (i2 == 4) {
                                throw null;
                            }
                        }
                        zzatsVarZzc = zzatsVar3;
                    }
                    atomicReferenceZza.set(zzatsVarZzc);
                }
                zzatsVar = (zzats) atomicReferenceZza.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzd) {
            if (zzatsVar != null) {
                try {
                    this.zzd.zzx(zzatsVar.zza);
                    this.zzd.zzX(zzatsVar.zzb);
                    this.zzd.zzZ(zzatsVar.zzc);
                    this.zzd.zzi(zzatsVar.zzd);
                    this.zzd.zzw(zzatsVar.zze);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzaxt] */
    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzf = zzawg.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcC));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals(ay.m)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawg.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcD)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
                return null;
            }
            final zzgdb zzgdbVarZze = zzgdb.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxt
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzgdb zzgdbVar = zzgdbVarZze;
                    if (list == null) {
                        zzgdbVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumE = AbstractC3611hU.e(list.get(i));
                            if (apkChecksumE.getType() == 8) {
                                zzgdbVar.zzc(zzawg.zzb(apkChecksumE.getValue()));
                                return;
                            }
                        }
                        zzgdbVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgdbVar.zzc(null);
                    }
                }
            });
            return (String) zzgdbVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.bc;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzaki implements zzadt {
    private final zzadt zza;
    private final zzakd zzb;

    @Nullable
    private zzakf zzg;
    private zzab zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzei.zzf;
    private final zzdy zzc = new zzdy();

    public zzaki(zzadt zzadtVar, zzakd zzakdVar) {
        this.zza = zzadtVar;
        this.zzb = zzakdVar;
    }

    private final void zzb(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    public final /* synthetic */ void zza(long j, int i, zzajx zzajxVar) {
        zzcw.zzb(this.zzh);
        zzfxn zzfxnVar = zzajxVar.zza;
        long j2 = zzajxVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfxnVar.size());
        Iterator<E> it = zzfxnVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzco) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(bc.aL, arrayList);
        bundle.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzdy zzdyVar = this.zzc;
        int length = bArrMarshall.length;
        zzdyVar.zzJ(bArrMarshall, length);
        this.zza.zzr(this.zzc, length);
        long j3 = zzajxVar.zzb;
        if (j3 == C.TIME_UNSET) {
            zzcw.zzf(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzt;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzt(j, i, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ int zzf(zzl zzlVar, int i, boolean z) {
        return zzadr.zza(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzg(zzl zzlVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i, z, 0);
        }
        zzb(i);
        int iZza = zzlVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzm(zzab zzabVar) {
        String str = zzabVar.zzo;
        str.getClass();
        zzcw.zzd(zzbb.zzb(str) == 3);
        if (!zzabVar.equals(this.zzh)) {
            this.zzh = zzabVar;
            this.zzg = this.zzb.zzc(zzabVar) ? this.zzb.zzb(zzabVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzabVar);
            return;
        }
        zzadt zzadtVar = this.zza;
        zzz zzzVarZzb = zzabVar.zzb();
        zzzVarZzb.zzaa("application/x-media3-cues");
        zzzVarZzb.zzA(zzabVar.zzo);
        zzzVarZzb.zzae(Long.MAX_VALUE);
        zzzVarZzb.zzE(this.zzb.zza(zzabVar));
        zzadtVar.zzm(zzzVarZzb.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ void zzr(zzdy zzdyVar, int i) {
        zzadr.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzs(zzdy zzdyVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzs(zzdyVar, i, i2);
            return;
        }
        zzb(i);
        zzdyVar.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzt(final long j, final int i, int i2, int i3, @Nullable zzads zzadsVar) {
        if (this.zzg == null) {
            this.zza.zzt(j, i, i2, i3, zzadsVar);
            return;
        }
        zzcw.zze(zzadsVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        this.zzg.zza(this.zzf, i4, i2, zzake.zza(), new zzdb() { // from class: com.google.android.gms.internal.ads.zzakh
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                this.zza.zza(j, i, (zzajx) obj);
            }
        });
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}

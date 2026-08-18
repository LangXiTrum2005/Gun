package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzay implements Parcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzaw();
    public final long zza;
    private final zzax[] zzb;

    public zzay(long j, zzax... zzaxVarArr) {
        this.zza = j;
        this.zzb = zzaxVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzay.class == obj.getClass()) {
            zzay zzayVar = (zzay) obj;
            if (Arrays.equals(this.zzb, zzayVar.zzb) && this.zza == zzayVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.zza;
        return DM.B("entries=", Arrays.toString(this.zzb), j == C.TIME_UNSET ? "" : AbstractC5044xl.h(", presentationTimeUs=", j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzax zzaxVar : this.zzb) {
            parcel.writeParcelable(zzaxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzax zzb(int i) {
        return this.zzb[i];
    }

    public final zzay zzc(zzax... zzaxVarArr) {
        int length = zzaxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzax[] zzaxVarArr2 = this.zzb;
        int i = zzei.zza;
        int length2 = zzaxVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaxVarArr2, length2 + length);
        System.arraycopy(zzaxVarArr, 0, objArrCopyOf, length2, length);
        return new zzay(j, (zzax[]) objArrCopyOf);
    }

    public final zzay zzd(@Nullable zzay zzayVar) {
        return zzayVar == null ? this : zzc(zzayVar.zzb);
    }

    public zzay(Parcel parcel) {
        this.zzb = new zzax[parcel.readInt()];
        int i = 0;
        while (true) {
            zzax[] zzaxVarArr = this.zzb;
            if (i >= zzaxVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzaxVarArr[i] = (zzax) parcel.readParcelable(zzax.class.getClassLoader());
                i++;
            }
        }
    }

    public zzay(List list) {
        this(C.TIME_UNSET, (zzax[]) list.toArray(new zzax[0]));
    }
}

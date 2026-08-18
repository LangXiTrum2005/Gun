package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafx extends zzagh {
    public static final Parcelable.Creator<zzafx> CREATOR = new zzafw();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    public zzafx(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzei.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new zzagh[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (zzagh) parcel.readParcelable(zzagh.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.zzb == zzafxVar.zzb && this.zzc == zzafxVar.zzc && this.zzd == zzafxVar.zzd && this.zze == zzafxVar.zze && Objects.equals(this.zza, zzafxVar.zza) && Arrays.equals(this.zzg, zzafxVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagh zzaghVar : this.zzg) {
            parcel.writeParcelable(zzaghVar, 0);
        }
    }

    public zzafx(String str, int i, int i2, long j, long j2, zzagh[] zzaghVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaghVarArr;
    }
}

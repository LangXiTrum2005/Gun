package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagk extends zzagh {
    public static final Parcelable.Creator<zzagk> CREATOR = new zzagj();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagk(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (Objects.equals(this.zzb, zzagkVar.zzb) && Objects.equals(this.zza, zzagkVar.zza) && Objects.equals(this.zzc, zzagkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + 527;
        String str3 = this.zzc;
        return (((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagk(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzags extends zzagh {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagr();

    @Nullable
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzags(Parcel parcel) {
        String string = parcel.readString();
        int i = zzei.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzags.class == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (this.zzf.equals(zzagsVar.zzf) && Objects.equals(this.zza, zzagsVar.zza) && Objects.equals(this.zzb, zzagsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i = iHashCode * 31;
        String str2 = this.zzb;
        return ((i + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzags(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}

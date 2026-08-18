package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaft extends zzagh {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaft(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = zzei.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaft.class == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.zzc == zzaftVar.zzc && Objects.equals(this.zza, zzaftVar.zza) && Objects.equals(this.zzb, zzaftVar.zzb) && Arrays.equals(this.zzd, zzaftVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        zzatVar.zza(this.zzd, this.zzc);
    }

    public zzaft(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}

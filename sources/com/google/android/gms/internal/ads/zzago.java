package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzago extends zzagh {
    public static final Parcelable.Creator<zzago> CREATOR = new zzagn();
    public final String zza;
    public final byte[] zzb;

    public zzago(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = zzei.zza;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (Objects.equals(this.zza, zzagoVar.zza) && Arrays.equals(this.zzb, zzagoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzago(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}

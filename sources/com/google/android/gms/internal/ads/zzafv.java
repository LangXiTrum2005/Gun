package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafv extends zzagh {
    public static final Parcelable.Creator<zzafv> CREATOR = new zzafu();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzafv(Parcel parcel) {
        String string = parcel.readString();
        int i = zzei.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafv.class == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zzf.equals(zzafvVar.zzf) && Arrays.equals(this.zza, zzafvVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzafv(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}

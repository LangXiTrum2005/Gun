package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt implements Parcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzs();
    public final UUID zza;

    @Nullable
    public final String zzb;
    public final String zzc;

    @Nullable
    public final byte[] zzd;
    private int zze;

    public zzt(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i = zzei.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzt zztVar = (zzt) obj;
        return Objects.equals(this.zzb, zztVar.zzb) && Objects.equals(this.zzc, zztVar.zzc) && Objects.equals(this.zza, zztVar.zza) && Arrays.equals(this.zzd, zztVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iD = DM.d(this.zzc, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.zzd);
        this.zze = iD;
        return iD;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzt(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzbb.zze(str2);
        this.zzd = bArr;
    }
}

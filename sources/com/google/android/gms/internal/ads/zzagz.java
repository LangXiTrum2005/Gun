package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagz implements zzax {
    public static final Parcelable.Creator<zzagz> CREATOR = new zzagw();
    public final List zza;

    public zzagz(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzagy) list.get(0)).zzb;
            for (int i = 1; i < list.size(); i++) {
                if (((zzagy) list.get(i)).zza < j) {
                    z = true;
                    break;
                }
                j = ((zzagy) list.get(i)).zzb;
            }
        }
        zzcw.zzd(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagz.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }
}

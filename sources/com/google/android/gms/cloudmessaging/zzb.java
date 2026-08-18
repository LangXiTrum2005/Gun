package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class zzb implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzd createFromParcel(Parcel parcel) {
        return new zzd(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzd[] newArray(int i) {
        return new zzd[i];
    }
}

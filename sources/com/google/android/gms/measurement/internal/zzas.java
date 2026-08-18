package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.bc;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    @SafeParcelable.Field(getter = bc.aJ, id = 2)
    private final Bundle zza;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzar(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.zza);
    }

    public final Double zzd(String str) {
        return Double.valueOf(this.zza.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Long zze(String str) {
        return Long.valueOf(this.zza.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    public final Object zzf(String str) {
        return this.zza.get(str);
    }

    public final String zzg(String str) {
        return this.zza.getString(str);
    }
}

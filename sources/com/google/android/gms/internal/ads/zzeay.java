package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzeay extends zzebc {

    @Nullable
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    public zzeay(@Nullable String str, String str2, @Nullable Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebc) {
            zzebc zzebcVar = (zzebc) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzebcVar.zzb()) : zzebcVar.zzb() == null) {
                if (this.zzb.equals(zzebcVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzebcVar.zza()) : zzebcVar.zza() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder("OfflineAdAssets{advertiserName=");
        sb.append(this.zza);
        sb.append(", imageUrl=");
        return DM.n(sb, this.zzb, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    @Nullable
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    @Nullable
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final String zzc() {
        return this.zzb;
    }
}

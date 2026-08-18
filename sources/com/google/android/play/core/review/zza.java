package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.zza = pendingIntent;
        this.zzb = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent b() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean c() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.zza.equals(reviewInfo.b()) && this.zzb == reviewInfo.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.zza.toString() + ", isNoOp=" + this.zzb + "}";
    }
}

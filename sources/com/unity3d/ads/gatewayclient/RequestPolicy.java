package com.unity3d.ads.gatewayclient;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        this.maxDuration = i;
        this.retryMaxInterval = i2;
        this.retryWaitBase = i3;
        this.retryJitterPct = f;
        this.retryScalingFactor = f2;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.writeTimeout = i6;
        this.overallTimeout = i7;
        this.shouldStoreLocally = z;
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, boolean z) {
        return new RequestPolicy(i, i2, i3, f, f2, i4, i5, i6, i7, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iFloatToIntBits = (((((((((Float.floatToIntBits(this.retryScalingFactor) + ((Float.floatToIntBits(this.retryJitterPct) + (((((this.maxDuration * 31) + this.retryMaxInterval) * 31) + this.retryWaitBase) * 31)) * 31)) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.overallTimeout) * 31;
        boolean z = this.shouldStoreLocally;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iFloatToIntBits + r1;
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", retryScalingFactor=" + this.retryScalingFactor + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", overallTimeout=" + this.overallTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}

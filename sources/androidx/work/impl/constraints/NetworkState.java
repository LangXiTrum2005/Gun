package androidx.work.impl.constraints;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class NetworkState {
    private boolean mIsConnected;
    private boolean mIsMetered;
    private boolean mIsNotRoaming;
    private boolean mIsValidated;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.mIsConnected = z;
        this.mIsValidated = z2;
        this.mIsMetered = z3;
        this.mIsNotRoaming = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.mIsConnected == networkState.mIsConnected && this.mIsValidated == networkState.mIsValidated && this.mIsMetered == networkState.mIsMetered && this.mIsNotRoaming == networkState.mIsNotRoaming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r0 = this.mIsConnected;
        int i = r0;
        if (this.mIsValidated) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.mIsMetered) {
            i2 = i + 256;
        }
        return this.mIsNotRoaming ? i2 + 4096 : i2;
    }

    public boolean isConnected() {
        return this.mIsConnected;
    }

    public boolean isMetered() {
        return this.mIsMetered;
    }

    public boolean isNotRoaming() {
        return this.mIsNotRoaming;
    }

    public boolean isValidated() {
        return this.mIsValidated;
    }

    @NonNull
    public String toString() {
        return "[ Connected=" + this.mIsConnected + " Validated=" + this.mIsValidated + " Metered=" + this.mIsMetered + " NotRoaming=" + this.mIsNotRoaming + " ]";
    }
}

package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jc0;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final InitializationException parseFrom(Exception exc) {
            String str;
            AbstractC2995aW.q(exc, "e");
            if ((exc instanceof Jc0) || (exc instanceof NetworkTimeoutException)) {
                return new InitializationException(AndroidInitializeBoldSDK.MSG_TIMEOUT, exc, "timeout", exc.getMessage());
            }
            if (!(exc instanceof UnityAdsNetworkException)) {
                if (!(exc instanceof GatewayException)) {
                    return exc instanceof InitializationException ? (InitializationException) exc : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, exc, "unknown", exc.getMessage());
                }
                GatewayException gatewayException = (GatewayException) exc;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
            UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) exc;
            if (unityAdsNetworkException.getCode() == null) {
                str = "network";
            } else {
                str = "network." + unityAdsNetworkException.getCode();
            }
            return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, exc, str, unityAdsNetworkException.getMessage());
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String str, Throwable th, String str2, String str3) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(str2, "reason");
        return new InitializationException(str, th, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return AbstractC2995aW.i(getMessage(), initializationException.getMessage()) && AbstractC2995aW.i(this.throwable, initializationException.throwable) && AbstractC2995aW.i(this.reason, initializationException.reason) && AbstractC2995aW.i(this.reasonDebug, initializationException.reasonDebug);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int iD = DM.d(this.reason, (iHashCode + (th == null ? 0 : th.hashCode())) * 31, 31);
        String str = this.reasonDebug;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("InitializationException(message=");
        sb.append(getMessage());
        sb.append(", throwable=");
        sb.append(this.throwable);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", reasonDebug=");
        return DM.l(sb, this.reasonDebug, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String str, Throwable th, String str2, String str3) {
        super(str);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(str2, "reason");
        this.message = str;
        this.throwable = th;
        this.reason = str2;
        this.reasonDebug = str3;
    }
}

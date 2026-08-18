package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadResult {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public static final class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject) {
            super(null);
            AbstractC2995aW.q(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i, Object obj) {
            if ((i & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            AbstractC2995aW.q(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && AbstractC2995aW.i(this.adObject, ((Success) obj).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    private LoadResult() {
    }

    public /* synthetic */ LoadResult(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public static final class Failure extends LoadResult {
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z, int i, AbstractC2471Hm abstractC2471Hm) {
            this(unityAdsLoadError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i & 2) != 0) {
                str = failure.message;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            Throwable th2 = th;
            if ((i & 8) != 0) {
                str2 = failure.reason;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                z = failure.isScarAd;
            }
            return failure.copy(unityAdsLoadError, str4, th2, str5, str6, z);
        }

        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        public final Failure copy(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z) {
            AbstractC2995aW.q(unityAdsLoadError, "error");
            AbstractC2995aW.q(str2, "reason");
            return new Failure(unityAdsLoadError, str, th, str2, str3, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && AbstractC2995aW.i(this.message, failure.message) && AbstractC2995aW.i(this.throwable, failure.throwable) && AbstractC2995aW.i(this.reason, failure.reason) && AbstractC2995aW.i(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
        }

        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final String getMessage() {
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int iD = DM.d(this.reason, (iHashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31);
            String str2 = this.reasonDebug;
            int iHashCode3 = (iD + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.isScarAd;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode3 + r1;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z) {
            super(null);
            AbstractC2995aW.q(unityAdsLoadError, "error");
            AbstractC2995aW.q(str2, "reason");
            this.error = unityAdsLoadError;
            this.message = str;
            this.throwable = th;
            this.reason = str2;
            this.reasonDebug = str3;
            this.isScarAd = z;
        }
    }
}

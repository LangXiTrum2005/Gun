package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OMResult {

    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i, AbstractC2471Hm abstractC2471Hm) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String str, String str2) {
            AbstractC2995aW.q(str, "reason");
            return new Failure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return AbstractC2995aW.i(this.reason, failure.reason) && AbstractC2995aW.i(this.reasonDebug, failure.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Failure(reason=");
            sb.append(this.reason);
            sb.append(", reasonDebug=");
            return DM.l(sb, this.reasonDebug, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String str, String str2) {
            super(null);
            AbstractC2995aW.q(str, "reason");
            this.reason = str;
            this.reasonDebug = str2;
        }
    }
}

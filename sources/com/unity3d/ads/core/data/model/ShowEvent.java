package com.unity3d.ads.core.data.model;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.ShowStatus;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShowEvent {

    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    public static final class Completed extends ShowEvent {
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus showStatus) {
            super(null);
            AbstractC2995aW.q(showStatus, NotificationCompat.CATEGORY_STATUS);
            this.status = showStatus;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            return completed.copy(showStatus);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final Completed copy(ShowStatus showStatus) {
            AbstractC2995aW.q(showStatus, NotificationCompat.CATEGORY_STATUS);
            return new Completed(showStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && this.status == ((Completed) obj).status;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Completed(status=" + this.status + ')';
        }
    }

    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, int i, String str2) {
            super(null);
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            AbstractC2995aW.q(str2, "reason");
            this.message = str;
            this.errorCode = i;
            this.reason = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String str, int i, String str2) {
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            AbstractC2995aW.q(str2, "reason");
            return new Error(str, i, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return AbstractC2995aW.i(this.message, error.message) && this.errorCode == error.errorCode && AbstractC2995aW.i(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + (((this.message.hashCode() * 31) + this.errorCode) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", errorCode=");
            sb.append(this.errorCode);
            sb.append(", reason=");
            return DM.l(sb, this.reason, ')');
        }
    }

    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    public /* synthetic */ ShowEvent(AbstractC2471Hm abstractC2471Hm) {
        this();
    }
}

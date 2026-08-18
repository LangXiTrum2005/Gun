package com.unity3d.ads.adplayer.model;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoadEvent {

    public static final class Completed extends LoadEvent {
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    public static final class Error extends LoadEvent {
        private final int errorCode;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, int i) {
            super(null);
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            this.message = str;
            this.errorCode = i;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            return error.copy(str, i);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final Error copy(String str, int i) {
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            return new Error(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return AbstractC2995aW.i(this.message, error.message) && this.errorCode == error.errorCode;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.errorCode;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", errorCode=");
            return DM.k(sb, this.errorCode, ')');
        }
    }

    private LoadEvent() {
    }

    public /* synthetic */ LoadEvent(AbstractC2471Hm abstractC2471Hm) {
        this();
    }
}

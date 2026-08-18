package com.unity3d.ads.core.data.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SessionChange {

    public static final class PrivacyFsmChange extends SessionChange {
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(ByteString byteString) {
            super(null);
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = byteString;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final PrivacyFsmChange copy(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new PrivacyFsmChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && AbstractC2995aW.i(this.value, ((PrivacyFsmChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    public static final class UserConsentChange extends SessionChange {
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(ByteString byteString) {
            super(null);
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = byteString;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final UserConsentChange copy(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new UserConsentChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && AbstractC2995aW.i(this.value, ((UserConsentChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(AbstractC2471Hm abstractC2471Hm) {
        this();
    }
}

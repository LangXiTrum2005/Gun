package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    private final Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;
    private final IntentSender intentSender;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            AbstractC2995aW.q(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    };

    public static final class Builder {
        private Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;
        private final IntentSender intentSender;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            AbstractC2995aW.q(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        public final Builder setFillInIntent(Intent intent) {
            this.fillInIntent = intent;
            return this;
        }

        public final Builder setFlags(int i, int i2) {
            this.flagsValues = i;
            this.flagsMask = i2;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(PendingIntent pendingIntent) {
            AbstractC2995aW.q(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC2995aW.p(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2, int i3, AbstractC2471Hm abstractC2471Hm) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbstractC2995aW.q(parcel, "dest");
        parcel.writeParcelable(this.intentSender, i);
        parcel.writeParcelable(this.fillInIntent, i);
        parcel.writeInt(this.flagsMask);
        parcel.writeInt(this.flagsValues);
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        AbstractC2995aW.q(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        AbstractC2995aW.q(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC2995aW.n(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}

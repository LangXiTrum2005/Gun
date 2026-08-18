package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    @RequiresApi(33)
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i, int i2) {
            this.deletionMode = i;
            this.matchBehavior = i2;
            Instant instant = Instant.MIN;
            AbstractC2995aW.p(instant, "MIN");
            this.start = instant;
            Instant instant2 = Instant.MAX;
            AbstractC2995aW.p(instant2, "MAX");
            this.end = instant2;
            C2812Uq c2812Uq = C2812Uq.f3846a;
            this.domainUris = c2812Uq;
            this.originUris = c2812Uq;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> list) {
            AbstractC2995aW.q(list, "domainUris");
            this.domainUris = list;
            return this;
        }

        public final Builder setEnd(Instant instant) {
            AbstractC2995aW.q(instant, TtmlNode.END);
            this.end = instant;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> list) {
            AbstractC2995aW.q(list, "originUris");
            this.originUris = list;
            return this;
        }

        public final Builder setStart(Instant instant) {
            AbstractC2995aW.q(instant, "start");
            this.start = instant;
            return this;
        }
    }

    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i, int i2, Instant instant, Instant instant2, List list, List list2, int i3, AbstractC2471Hm abstractC2471Hm) {
        if ((i3 & 4) != 0) {
            instant = Instant.MIN;
            AbstractC2995aW.p(instant, "MIN");
        }
        Instant instant3 = instant;
        if ((i3 & 8) != 0) {
            instant2 = Instant.MAX;
            AbstractC2995aW.p(instant2, "MAX");
        }
        Instant instant4 = instant2;
        int i4 = i3 & 16;
        C2812Uq c2812Uq = C2812Uq.f3846a;
        this(i, i2, instant3, instant4, i4 != 0 ? c2812Uq : list, (i3 & 32) != 0 ? c2812Uq : list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && AbstractC2995aW.i(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && AbstractC2995aW.i(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && AbstractC2995aW.i(this.start, deletionRequest.start) && AbstractC2995aW.i(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return ((this.end.hashCode() + ((this.start.hashCode() + ((this.originUris.hashCode() + ((this.domainUris.hashCode() + (this.deletionMode * 31)) * 31)) * 31)) * 31)) * 31) + this.matchBehavior;
    }

    public String toString() {
        StringBuilder sbR = DM.r("DeletionRequest { DeletionMode=", this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbR.append(this.start);
        sbR.append(", End=");
        sbR.append(this.end);
        sbR.append(", DomainUris=");
        sbR.append(this.domainUris);
        sbR.append(", OriginUris=");
        sbR.append(this.originUris);
        sbR.append(" }");
        return sbR.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i, int i2, Instant instant, Instant instant2, List<? extends Uri> list, List<? extends Uri> list2) {
        AbstractC2995aW.q(instant, "start");
        AbstractC2995aW.q(instant2, TtmlNode.END);
        AbstractC2995aW.q(list, "domainUris");
        AbstractC2995aW.q(list2, "originUris");
        this.deletionMode = i;
        this.matchBehavior = i2;
        this.start = instant;
        this.end = instant2;
        this.domainUris = list;
        this.originUris = list2;
    }
}

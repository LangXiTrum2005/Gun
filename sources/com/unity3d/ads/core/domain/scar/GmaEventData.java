package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class GmaEventData {
    private final BannerBridge.BannerEvent bannerEvent;
    private final Integer errorCode;
    private final String errorMessage;
    private final GMAEvent gmaEvent;
    private final String opportunityId;
    private final String placementId;
    private final String queryId;

    public /* synthetic */ GmaEventData(GMAEvent gMAEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i, AbstractC2471Hm abstractC2471Hm) {
        this(gMAEvent, (i & 2) != 0 ? null : bannerEvent, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? num : null);
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, GMAEvent gMAEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            gMAEvent = gmaEventData.gmaEvent;
        }
        if ((i & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        BannerBridge.BannerEvent bannerEvent2 = bannerEvent;
        if ((i & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        return gmaEventData.copy(gMAEvent, bannerEvent2, str5, str6, str7, str8, num);
    }

    public final GMAEvent component1() {
        return this.gmaEvent;
    }

    public final BannerBridge.BannerEvent component2() {
        return this.bannerEvent;
    }

    public final String component3() {
        return this.opportunityId;
    }

    public final String component4() {
        return this.placementId;
    }

    public final String component5() {
        return this.queryId;
    }

    public final String component6() {
        return this.errorMessage;
    }

    public final Integer component7() {
        return this.errorCode;
    }

    public final GmaEventData copy(GMAEvent gMAEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        AbstractC2995aW.q(gMAEvent, "gmaEvent");
        return new GmaEventData(gMAEvent, bannerEvent, str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) obj;
        return this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && AbstractC2995aW.i(this.opportunityId, gmaEventData.opportunityId) && AbstractC2995aW.i(this.placementId, gmaEventData.placementId) && AbstractC2995aW.i(this.queryId, gmaEventData.queryId) && AbstractC2995aW.i(this.errorMessage, gmaEventData.errorMessage) && AbstractC2995aW.i(this.errorCode, gmaEventData.errorCode);
    }

    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final GMAEvent getGmaEvent() {
        return this.gmaEvent;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int iHashCode = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int iHashCode2 = (iHashCode + (bannerEvent == null ? 0 : bannerEvent.hashCode())) * 31;
        String str = this.opportunityId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.queryId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public GmaEventData(GMAEvent gMAEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        AbstractC2995aW.q(gMAEvent, "gmaEvent");
        this.gmaEvent = gMAEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }
}

package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes4.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private ByteString trackingToken;

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, int i, AbstractC2471Hm abstractC2471Hm) {
        this(byteString, str, byteString2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : adPlayer, (i & 256) != 0 ? null : str5, unityAdsLoadOptions, z2, diagnosticAdType);
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final UnityAdsLoadOptions component10() {
        return this.loadOptions;
    }

    public final boolean component11() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component12() {
        return this.adType;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final AdPlayer component8() {
        return this.adPlayer;
    }

    public final String component9() {
        return this.playerServerId;
    }

    public final AdObject copy(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        AbstractC2995aW.q(byteString, "opportunityId");
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        AbstractC2995aW.q(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        AbstractC2995aW.q(diagnosticAdType, "adType");
        return new AdObject(byteString, str, byteString2, z, str2, str3, str4, adPlayer, str5, unityAdsLoadOptions, z2, diagnosticAdType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return AbstractC2995aW.i(this.opportunityId, adObject.opportunityId) && AbstractC2995aW.i(this.placementId, adObject.placementId) && AbstractC2995aW.i(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && AbstractC2995aW.i(this.scarQueryId, adObject.scarQueryId) && AbstractC2995aW.i(this.scarAdUnitId, adObject.scarAdUnitId) && AbstractC2995aW.i(this.scarAdString, adObject.scarAdString) && AbstractC2995aW.i(this.adPlayer, adObject.adPlayer) && AbstractC2995aW.i(this.playerServerId, adObject.playerServerId) && AbstractC2995aW.i(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = (this.trackingToken.hashCode() + DM.d(this.placementId, this.opportunityId.hashCode() * 31, 31)) * 31;
        boolean z = this.isScarAd;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode5 = (iHashCode4 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str4 = this.playerServerId;
        int iHashCode6 = (this.loadOptions.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31;
        boolean z2 = this.isHeaderBidding;
        return this.adType.hashCode() + ((iHashCode6 + (z2 ? 1 : z2)) * 31);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setTrackingToken(ByteString byteString) {
        AbstractC2995aW.q(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }

    public AdObject(ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        AbstractC2995aW.q(byteString, "opportunityId");
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        AbstractC2995aW.q(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        AbstractC2995aW.q(diagnosticAdType, "adType");
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isScarAd = z;
        this.scarQueryId = str2;
        this.scarAdUnitId = str3;
        this.scarAdString = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z2;
        this.adType = diagnosticAdType;
    }
}

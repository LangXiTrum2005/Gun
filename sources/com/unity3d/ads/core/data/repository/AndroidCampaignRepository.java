package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final InterfaceC4309pQ campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        AbstractC2995aW.q(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = AbstractC4995x90.a(C2838Vq.f3896a);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString byteString) {
        AbstractC2995aW.q(byteString, "opportunityId");
        return (CampaignStateOuterClass.Campaign) ((Map) ((C4907w90) this.campaigns).getValue()).get(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection collectionValues = ((Map) ((C4907w90) this.campaigns).getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllShownCampaigns(dsl_create.getShownCampaigns(), arrayList);
        dsl_create.addAllLoadedCampaigns(dsl_create.getLoadedCampaigns(), arrayList2);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString byteString) {
        C4907w90 c4907w90;
        Object value;
        Map linkedHashMap;
        AbstractC2995aW.q(byteString, "opportunityId");
        InterfaceC4309pQ interfaceC4309pQ = this.campaigns;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Map map = (Map) value;
            Object stringUtf8 = byteString.toStringUtf8();
            AbstractC2995aW.p(stringUtf8, "opportunityId.toStringUtf8()");
            AbstractC2995aW.q(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(stringUtf8);
            int size = linkedHashMap.size();
            if (size == 0) {
                linkedHashMap = C2838Vq.f3896a;
            } else if (size == 1) {
                linkedHashMap = AbstractC3375el.c0(linkedHashMap);
            }
        } while (!c4907w90.h(value, linkedHashMap));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(byteString, "opportunityId");
        AbstractC2995aW.q(campaign, MBInterstitialActivity.INTENT_CAMAPIGN);
        InterfaceC4309pQ interfaceC4309pQ = this.campaigns;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, U5.w0((Map) value, new C4839vT(byteString.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString byteString) {
        AbstractC2995aW.q(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(byteString, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString byteString) {
        AbstractC2995aW.q(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(byteString, dsl_create._build());
        }
    }
}

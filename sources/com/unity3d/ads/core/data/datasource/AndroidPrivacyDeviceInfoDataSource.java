package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final Context context;
    private final InterfaceC4309pQ idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(Context context) {
        AbstractC2995aW.q(context, f.X);
        this.context = context;
        this.idfaInitialized = AbstractC4995x90.a(Boolean.FALSE);
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowedPii) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC2995aW.q(allowedPii, "allowed");
        if (!((Boolean) ((C4907w90) this.idfaInitialized).getValue()).booleanValue()) {
            ((C4907w90) this.idfaInitialized).i(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (allowedPii.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID uuidFromString = UUID.fromString(advertisingTrackingId);
                AbstractC2995aW.p(uuidFromString, "fromString(adId)");
                dsl_create.setAdvertisingId(ProtobufExtensionsKt.toByteString(uuidFromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID uuidFromString2 = UUID.fromString(openAdvertisingTrackingId);
                AbstractC2995aW.p(uuidFromString2, "fromString(openAdId)");
                dsl_create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(uuidFromString2));
            }
        }
        return dsl_create._build();
    }
}

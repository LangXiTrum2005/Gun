package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    public CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, AndroidGetAdPlayerContext androidGetAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws JSONException {
        CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        String str;
        AdObject adObject;
        IsOMActivated isOMActivated;
        Map map;
        Map map2;
        Map map3;
        if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) interfaceC2857Wj;
            int i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, interfaceC2857Wj);
            }
        } else {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, interfaceC2857Wj);
        }
        Object objInvoke = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            String str2 = this.$adData;
            String str3 = this.$impressionConfig;
            String str4 = this.$adDataRefreshToken;
            AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
            AdObject adObject2 = this.$adObject;
            IsOMActivated isOMActivated2 = this.$isOMActivated;
            C2985aM c2985aMW = AbstractC3375el.w();
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_AD_DATA, str2);
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = c2985aMW;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = c2985aMW;
            str = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = c2985aMW;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
            objInvoke = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            adObject = adObject2;
            isOMActivated = isOMActivated2;
            map = c2985aMW;
            map2 = map;
            map3 = map2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
            str = (String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
            map2 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
            map3 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
            isOMActivated = (IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
            adObject = (AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
            AbstractC3375el.b0(objInvoke);
        }
        map.put(str, objInvoke);
        map2.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        JSONObject data = adObject.getLoadOptions().getData();
        if (data != null && data.length() != 0) {
            Iterator<String> itKeys = data.keys();
            AbstractC2995aW.p(itKeys, "loadOptions.keys()");
            InterfaceC4545s40<String> interfaceC4545s40G0 = A40.G0(itKeys);
            JSONObject jSONObject = new JSONObject();
            for (String str5 : interfaceC4545s40G0) {
                if (!AbstractC2995aW.i(str5, LegacyLoadUseCase.KEY_AD_MARKUP) && !AbstractC2995aW.i(str5, "objectId")) {
                    jSONObject = jSONObject.put(str5, data.get(str5));
                    AbstractC2995aW.p(jSONObject, "acc.put(key, loadOptions[key])");
                }
            }
            map2.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
        }
        if (isOMActivated.invoke()) {
            map2.put(HandleInvocationsFromAdViewer.KEY_OMID, U5.u0(new C4839vT(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new C4839vT(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
        }
        map2.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
        return AbstractC3375el.g(map3);
    }
}

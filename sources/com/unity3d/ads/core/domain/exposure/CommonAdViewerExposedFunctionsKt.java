package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4133nQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K20;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonAdViewerExposedFunctionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22201 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;

        public C22201(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws JSONException {
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            String str;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, interfaceC2857Wj);
            }
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            Object objInvoke = commonAdViewerExposedFunctionsKt$download$1$invoke$2.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$download$1$invoke$2.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objInvoke);
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) U5.p0(2, objArr);
                int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                CacheFile cacheFile = this.$cacheFile;
                AbstractC2995aW.p(string, "url");
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0 = string;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.label = 1;
                objInvoke = cacheFile.invoke(string, adObject, jSONArray, iOptInt, commonAdViewerExposedFunctionsKt$download$1$invoke$2);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = string;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) commonAdViewerExposedFunctionsKt$download$1$invoke$2.L$0;
                AbstractC3375el.b0(objInvoke);
            }
            CacheResult cacheResult = (CacheResult) objInvoke;
            if (cacheResult instanceof CacheResult.Success) {
                CacheResult.Success success = (CacheResult.Success) cacheResult;
                String extension = success.getCachedFile().getExtension();
                if (extension == null || extension.length() != 0) {
                    str = "unity-ads-cache://unity.ads.cache/" + success.getCachedFile().getName() + '.' + success.getCachedFile().getExtension();
                } else {
                    str = "unity-ads-cache://unity.ads.cache/" + success.getCachedFile().getName();
                }
            } else if (!(cacheResult instanceof CacheResult.Failure)) {
                throw new C3770jF(7, 0);
            }
            AbstractC2995aW.p(str, "when (result) {\n        …sult.Failure -> url\n    }");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22261 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C22261(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, interfaceC2857Wj);
            }
            Object privacy = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(privacy);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                privacy = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                if (privacy == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(privacy);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22271 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C22271(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, interfaceC2857Wj);
            }
            Object privacyFsm = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(privacyFsm);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = 1;
                privacyFsm = sessionRepository.getPrivacyFsm(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1);
                if (privacyFsm == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(privacyFsm);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22381 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        public C22381(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, interfaceC2857Wj);
            }
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            Object obj = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
                String strOptString3 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_STRING);
                String strOptString4 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                int iOptInt = jSONObject.optInt("videoLength");
                this.$adObject.setScarAd(true);
                this.$adObject.setScarAdUnitId(strOptString2);
                this.$adObject.setScarQueryId(strOptString4);
                this.$adObject.setScarAdString(strOptString3);
                LoadScarAd loadScarAd = this.$loadScarAd;
                AbstractC2995aW.p(strOptString, "adType");
                String placementId = this.$adObject.getPlacementId();
                AbstractC2995aW.p(strOptString2, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
                AbstractC2995aW.p(strOptString3, HandleInvocationsFromAdViewer.KEY_AD_STRING);
                AbstractC2995aW.p(strOptString4, HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label = 1;
                if (loadScarAd.invoke(strOptString, placementId, strOptString2, strOptString3, strOptString4, iOptInt, commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22401 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        public C22401(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                OmFinishSession omFinishSession = this.$omFinishSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = 1;
                if (omFinishSession.invoke(adObject, commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22411 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        public C22411(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, interfaceC2857Wj);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objInvoke);
                GetOmData getOmData = this.$getOmData;
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                objInvoke = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
            OMData oMData = (OMData) objInvoke;
            C2985aM c2985aMW = AbstractC3375el.w();
            c2985aMW.put("version", oMData.getVersion());
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
            return AbstractC3375el.g(c2985aMW);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22421 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public C22421(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                OmImpressionOccurred omImpressionOccurred = this.$omImpressionOccurred;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = 1;
                if (omImpressionOccurred.invoke(adObject, zBooleanValue, commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22431 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmStartSession $omStartSession;

        public C22431(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
            this.$omStartSession = androidOmStartSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                AndroidOmStartSession androidOmStartSession = this.$omStartSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = 1;
                if (androidOmStartSession.invoke(adObject, (JSONObject) obj2, commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22461 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        public C22461(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
            ByteString byteStringFromBase64$default;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, interfaceC2857Wj);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objInvoke);
                if (objArr.length == 0) {
                    byteStringFromBase64$default = ByteString.EMPTY;
                } else {
                    Object obj = objArr[0];
                    AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    String strOptString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                    AbstractC2995aW.p(strOptString, "refreshToken");
                    byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null);
                }
                Refresh refresh = this.$refresh;
                AbstractC2995aW.p(byteStringFromBase64$default, "refreshTokenByteString");
                ByteString opportunityId = this.$adObject.getOpportunityId();
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                objInvoke = refresh.invoke(byteStringFromBase64$default, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) objInvoke;
            if (adDataRefreshResponse.hasError()) {
                throw new IllegalArgumentException("Refresh failed");
            }
            C2985aM c2985aMW = AbstractC3375el.w();
            ByteString adData = adDataRefreshResponse.getAdData();
            AbstractC2995aW.p(adData, "adRefreshResponse.adData");
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_AD_DATA, ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
            ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
            AbstractC2995aW.p(adDataRefreshToken, "adRefreshResponse.adDataRefreshToken");
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
            ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
            AbstractC2995aW.p(trackingToken, "adRefreshResponse.trackingToken");
            c2985aMW.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
            return AbstractC3375el.g(c2985aMW);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22481 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public C22481(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                AbstractC2995aW.p(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                if (getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22491 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public C22491(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, interfaceC2857Wj);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objInvoke);
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String strOptString = jSONObject.optString("content");
                int iOptInt = jSONObject.optInt("version");
                SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                AbstractC2995aW.p(strOptString, "privacyUpdateContentBase64");
                ByteString byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null);
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                objInvoke = sendPrivacyUpdateRequest.invoke(iOptInt, byteStringFromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) objInvoke;
            C2985aM c2985aMW = AbstractC3375el.w();
            c2985aMW.put("version", new Integer(privacyUpdateResponse.getVersion()));
            ByteString content = privacyUpdateResponse.getContent();
            AbstractC2995aW.p(content, "response.content");
            c2985aMW.put("content", ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
            return AbstractC3375el.g(c2985aMW);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22511 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public C22511(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                InterfaceC4221oQ displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                String stringUtf8 = this.$adObject.getOpportunityId().toStringUtf8();
                AbstractC2995aW.p(stringUtf8, "adObject.opportunityId.toStringUtf8()");
                DisplayMessage.SetOrientation setOrientation = new DisplayMessage.SetOrientation(stringUtf8, iIntValue);
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = 1;
                if (displayMessages.emit(setOrientation, commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22521 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C22521(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                AbstractC2995aW.p(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacy(byteString, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22531 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C22531(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1;
            if (interfaceC2857Wj instanceof CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) interfaceC2857Wj;
                int i = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, interfaceC2857Wj);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, interfaceC2857Wj);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                AbstractC2995aW.p(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacyFsm(byteString, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        AbstractC2995aW.q(androidAttribution, "androidAttribution");
        AbstractC2995aW.q(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, interfaceC2857Wj);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        AbstractC2995aW.q(androidAttribution, "androidAttribution");
        AbstractC2995aW.q(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, interfaceC2857Wj);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        AbstractC2995aW.q(cacheFile, "cacheFile");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22201(cacheFile, adObject);
    }

    /* JADX INFO: renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m76getAdContextyLuu4LI(AndroidGetAdPlayerContext androidGetAdPlayerContext, String str, String str2, String str3, IsOMActivated isOMActivated, AdObject adObject) {
        AbstractC2995aW.q(androidGetAdPlayerContext, "getAndroidAdPlayerContext");
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_AD_DATA);
        AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG);
        AbstractC2995aW.q(str3, HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
        AbstractC2995aW.q(isOMActivated, "isOMActivated");
        AbstractC2995aW.q(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(str, str2, str3, androidGetAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                String strEncodeToString = Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) ((C4907w90) deviceInfoRepository.getAllowedPii()).getValue()).toByteArray(), 2);
                AbstractC2995aW.p(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                AbstractC2995aW.p(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                AbstractC2995aW.o(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new C22261(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new C22271(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                sessionRepository.incrementTokenStartsCount();
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                sessionRepository.incrementTokenWinsCount();
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                sessionRepository.resetTokenCounters();
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                sessionRepository.incrementBannerImpressionCount();
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        AbstractC2995aW.q(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return androidAttribution.isAvailable(interfaceC2857Wj);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIsFileCache) {
        AbstractC2995aW.q(getIsFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                return getIsFileCache.invoke((String) obj, interfaceC2857Wj);
            }
        };
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        AbstractC2995aW.q(loadScarAd, "loadScarAd");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22381(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        AbstractC2995aW.q(campaignRepository, "campaignRepository");
        AbstractC2995aW.q(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        AbstractC2995aW.q(omFinishSession, "omFinishSession");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22401(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        AbstractC2995aW.q(getOmData, "getOmData");
        return new C22411(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        AbstractC2995aW.q(omImpressionOccurred, "omImpressionOccurred");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22421(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
        AbstractC2995aW.q(androidOmStartSession, "omStartSession");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22431(androidOmStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final HandleOpenUrl handleOpenUrl) {
        AbstractC2995aW.q(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object objP0 = U5.p0(1, objArr);
                JSONObject jSONObject = objP0 instanceof JSONObject ? (JSONObject) objP0 : null;
                handleOpenUrl.invoke(str, jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null);
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        AbstractC2995aW.q(refresh, ToolBar.REFRESH);
        AbstractC2995aW.q(adObject, "adObject");
        return new C22461(refresh, adObject);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                String string;
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                C2985aM c2985aMW = AbstractC3375el.w();
                Iterator<String> itKeys = jSONObject.keys();
                AbstractC2995aW.p(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c2985aMW.put(next, jSONObject.getString(next));
                }
                C2985aM c2985aMG = AbstractC3375el.g(c2985aMW);
                Object objP0 = U5.p0(2, objArr);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (objP0 == null || (string = objP0.toString()) == null) ? null : new Double(Double.parseDouble(string)), c2985aMG, null, adObject, 8, null);
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        AbstractC2995aW.q(getOperativeEventApi, "getOperativeEventApi");
        AbstractC2995aW.q(adObject, "adObject");
        return new C22481(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        AbstractC2995aW.q(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C22491(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                C4907w90 c4907w90;
                Object value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                InterfaceC4309pQ allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    c4907w90 = (C4907w90) allowedPii;
                    value = c4907w90.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    AbstractC2995aW.p(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    new AbstractC4133nQ(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3947lG
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                        }

                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3685iG
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                        }
                    }.set(Boolean.valueOf(jSONObject.optBoolean("idfa")));
                    new AbstractC4133nQ(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3947lG
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                        }

                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3685iG
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                        }
                    }.set(Boolean.valueOf(jSONObject.optBoolean("idfv")));
                } while (!c4907w90.h(value, dsl_create._build()));
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        AbstractC2995aW.q(adObject, "adObject");
        return new C22511(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new C22521(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        return new C22531(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        AbstractC2995aW.q(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String strOptString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (strOptString != null && strOptString.length() != 0) {
                    AdObject adObject2 = adObject;
                    AbstractC2995aW.p(strOptString, BidResponsed.KEY_TOKEN);
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null));
                }
                return C5033xf0.f5238a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                K20 k20 = new K20(WD.w(interfaceC2857Wj));
                Object obj = objArr[0];
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(k20));
                return k20.a();
            }
        };
    }
}

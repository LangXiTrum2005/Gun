package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage jsonStorage) {
        AbstractC2995aW.q(flattenerRulesUseCase, "flattenerRulesUseCase");
        AbstractC2995aW.q(jsonStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = jsonStorage;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setType(getDeveloperConsentType(str));
        if (dsl_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            dsl_create.setCustomType(str);
        }
        dsl_create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z)));
        return dsl_create._build();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() throws JSONException {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionCreateDeveloperConsentOption;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectFetchData = fetchData();
        Iterator<String> itKeys = jSONObjectFetchData.keys();
        AbstractC2995aW.p(itKeys, "data.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObjectFetchData.get(next);
            if (obj instanceof Boolean) {
                AbstractC2995aW.p(next, "key");
                AbstractC2995aW.p(obj, "storedValue");
                developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                AbstractC2995aW.p(obj, "storedValue");
                String str = (String) obj;
                if (AbstractC3089ba0.o0(str, "true") || AbstractC3089ba0.o0(str, "false")) {
                    AbstractC2995aW.p(next, "key");
                    developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(next, Boolean.parseBoolean(str));
                } else {
                    developerConsentOptionCreateDeveloperConsentOption = null;
                }
            } else {
                developerConsentOptionCreateDeveloperConsentOption = null;
            }
            if (developerConsentOptionCreateDeveloperConsentOption != null) {
                arrayList.add(developerConsentOptionCreateDeveloperConsentOption);
            }
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectFlattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        AbstractC2995aW.p(jSONObjectFlattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return jSONObjectFlattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        if (AbstractC2995aW.i(bool, Boolean.TRUE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        return AbstractC2995aW.i(bool, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1998919769:
                if (str.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (str.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (str.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (str.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (str.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (str.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllOptions(dsl_create.getOptions(), developerConsentList());
        return dsl_create._build();
    }
}

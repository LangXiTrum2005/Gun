package com.mbridge.msdk.videocommon.entity;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2399a;
    private String b;

    public a(String str, String str2) {
        this.f2399a = str;
        this.b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.unity3d.services.ads.token;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    C5033xf0 getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}

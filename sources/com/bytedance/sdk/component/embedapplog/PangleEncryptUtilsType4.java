package com.bytedance.sdk.component.embedapplog;

import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class PangleEncryptUtilsType4 {
    public static Pair<Integer, String> decrypt(String str) {
        try {
            Pair<Integer, String> pairCypher4Decrypt = PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new Pair<>(Integer.valueOf(getCryptFailedReason(((Integer) pairCypher4Decrypt.first).intValue())), pairCypher4Decrypt.second);
        } catch (Throwable th) {
            th.getMessage();
            return new Pair<>(2, null);
        }
    }

    public static JSONObject encrypt(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, JSONObject> pairCypher4Encrypt;
        Object obj;
        try {
            pairCypher4Encrypt = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (Throwable th) {
            th.getMessage();
            pairCypher4Encrypt = null;
        }
        if (pairCypher4Encrypt != null && ((Integer) pairCypher4Encrypt.first).intValue() == 0 && (obj = pairCypher4Encrypt.second) != null) {
            return (JSONObject) obj;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, pairCypher4Encrypt == null ? 0 : getCryptFailedReason(((Integer) pairCypher4Encrypt.first).intValue()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair<Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        Pair<Integer, byte[]> pairCypher4Encrypt;
        Object obj;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pairCypher4Encrypt = PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (Throwable th) {
            th.getMessage();
            pairCypher4Encrypt = null;
        }
        int cryptFailedReason = 0;
        if (pairCypher4Encrypt != null && ((Integer) pairCypher4Encrypt.first).intValue() == 0 && (obj = pairCypher4Encrypt.second) != null && ((byte[]) obj).length > 0) {
            bArr2 = (byte[]) obj;
        } else if (pairCypher4Encrypt != null) {
            cryptFailedReason = getCryptFailedReason(((Integer) pairCypher4Encrypt.first).intValue());
        }
        return new Pair<>(Integer.valueOf(cryptFailedReason), bArr2);
    }

    private static int getCryptFailedReason(int i) {
        switch (i) {
            case 501:
                return 6;
            case 502:
                return 4;
            case 503:
                return 1;
            case 504:
                return 3;
            case 505:
            case 506:
                return 2;
            default:
                return 0;
        }
    }
}

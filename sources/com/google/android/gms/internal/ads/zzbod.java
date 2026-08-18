package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbod {
    private static final Charset zzc = Charset.forName(C.UTF8_NAME);
    public static final zzboa zza = new zzboc();
    public static final zzbny zzb = new zzbny() { // from class: com.google.android.gms.internal.ads.zzbob
        @Override // com.google.android.gms.internal.ads.zzbny
        public final Object zza(JSONObject jSONObject) {
            return zzbod.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}

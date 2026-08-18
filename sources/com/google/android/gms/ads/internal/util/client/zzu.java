package com.google.android.gms.ads.internal.util.client;

import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu implements zze {

    @Nullable
    private final String zza;

    public zzu() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[PHI: r5
  0x00eb: PHI (r5v2 com.google.android.gms.ads.internal.util.client.zzt) = 
  (r5v0 com.google.android.gms.ads.internal.util.client.zzt)
  (r5v1 com.google.android.gms.ads.internal.util.client.zzt)
  (r5v5 com.google.android.gms.ads.internal.util.client.zzt)
 binds: [B:43:0x00e9, B:39:0x00c9, B:29:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzo.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                try {
                    zzbc.zzb();
                    String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzl zzlVar = new zzl(null);
                    zzlVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zze(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        zzo.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                        if (responseCode == 502) {
                            zztVar = zzt.RETRIABLE_FAILURE;
                        }
                    } else {
                        zztVar = zzt.SUCCESS;
                    }
                    httpURLConnection.disconnect();
                    if (ClientLibraryUtils.isPackageSide()) {
                        TrafficStats.clearThreadStatsTag();
                    }
                    return zztVar;
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                zztVar = zzt.RETRIABLE_FAILURE;
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (RuntimeException e3) {
                e = e3;
                zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                zztVar = zzt.RETRIABLE_FAILURE;
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (URISyntaxException e4) {
                e = e4;
                zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th2) {
            if (ClientLibraryUtils.isPackageSide()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th2;
        }
    }

    public zzu(@Nullable String str) {
        this.zza = str;
    }
}

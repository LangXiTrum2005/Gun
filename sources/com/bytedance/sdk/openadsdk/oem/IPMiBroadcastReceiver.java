package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ZU.lk;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.HD;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IPMiBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPMiBroadcastReceiver Lxb;
    private final LruCache<String, tD> LD;
    private int ZU = 0;
    private Lxb lk;

    private IPMiBroadcastReceiver() {
        int i = 10;
        int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("ip_data_config", "ip_ad_cache_count", 10);
        if (iLxb > 0 && iLxb <= 200) {
            i = iLxb;
        }
        this.LD = new LruCache<>(i);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            hg.lk(new OY("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                /* JADX WARN: Code duplicated, block: B:33:0x009c A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0004, B:5:0x000f, B:16:0x0028, B:27:0x004b, B:30:0x005d, B:31:0x0060, B:33:0x009c, B:21:0x003c, B:19:0x0033), top: B:37:0x0004, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                public void run() {
                    final int i;
                    final int intExtra;
                    final int intExtra2;
                    String stringExtra;
                    Lxb lxb;
                    tD tDVarLxb;
                    try {
                        final int intExtra3 = intent.getIntExtra("errorCode", 0);
                        if (intExtra3 < 0) {
                            int intExtra4 = intent.getIntExtra("reason", 0);
                            if (intExtra3 == -4 && intExtra4 == -1) {
                                return;
                            } else {
                                i = intExtra4;
                            }
                        } else {
                            i = 0;
                        }
                        if (intExtra3 == 5) {
                            intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
                            if (intExtra == -2) {
                                try {
                                    intExtra2 = intent.getIntExtra("progress", 0);
                                } catch (Throwable unused) {
                                    IPMiBroadcastReceiver.this.ZU = 1;
                                    intExtra2 = 0;
                                }
                                if (intExtra2 < 100) {
                                    return;
                                }
                            }
                            stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                            lxb = IPMiBroadcastReceiver.this.lk;
                            if (intExtra3 > 0 && lxb != null) {
                                lxb.Lxb(stringExtra, intExtra3);
                            }
                            tDVarLxb = IPMiBroadcastReceiver.this.Lxb(stringExtra);
                            sLN.Lxb("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra3), " reason=", Integer.valueOf(i), " status=", Integer.valueOf(intExtra), " progress=", Integer.valueOf(intExtra2));
                            if (tDVarLxb != null) {
                                lk.Lxb(System.currentTimeMillis(), tDVarLxb, nJ.Lxb(tDVarLxb), "ip_listener_log", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                    @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                                    public JSONObject Lxb() {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("ip_error_code", intExtra3);
                                            int i2 = intExtra3;
                                            if (i2 > 0) {
                                                if (i2 == 5) {
                                                    jSONObject3.put("ip_status", intExtra);
                                                    jSONObject3.put("ip_exec_type", IPMiBroadcastReceiver.this.ZU);
                                                }
                                                if (intExtra == -2) {
                                                    jSONObject3.put("ip_progress", intExtra2);
                                                }
                                            }
                                            if (intExtra3 < 0) {
                                                jSONObject3.put("ip_reason", i);
                                            }
                                            jSONObject2.put("pag_json_data", jSONObject3.toString());
                                            jSONObject.put("ad_extra_data", jSONObject2);
                                        } catch (Throwable th) {
                                            sLN.Lxb("IPMiBroadcastReceiver", th.getMessage());
                                        }
                                        return jSONObject;
                                    }
                                });
                            }
                        }
                        intExtra = 0;
                        intExtra2 = 0;
                        stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                        lxb = IPMiBroadcastReceiver.this.lk;
                        if (intExtra3 > 0) {
                            lxb.Lxb(stringExtra, intExtra3);
                        }
                        tDVarLxb = IPMiBroadcastReceiver.this.Lxb(stringExtra);
                        sLN.Lxb("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra3), " reason=", Integer.valueOf(i), " status=", Integer.valueOf(intExtra), " progress=", Integer.valueOf(intExtra2));
                        if (tDVarLxb != null) {
                            lk.Lxb(System.currentTimeMillis(), tDVarLxb, nJ.Lxb(tDVarLxb), "ip_listener_log", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                                public JSONObject Lxb() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("ip_error_code", intExtra3);
                                        int i2 = intExtra3;
                                        if (i2 > 0) {
                                            if (i2 == 5) {
                                                jSONObject3.put("ip_status", intExtra);
                                                jSONObject3.put("ip_exec_type", IPMiBroadcastReceiver.this.ZU);
                                            }
                                            if (intExtra == -2) {
                                                jSONObject3.put("ip_progress", intExtra2);
                                            }
                                        }
                                        if (intExtra3 < 0) {
                                            jSONObject3.put("ip_reason", i);
                                        }
                                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                                        jSONObject.put("ad_extra_data", jSONObject2);
                                    } catch (Throwable th) {
                                        sLN.Lxb("IPMiBroadcastReceiver", th.getMessage());
                                    }
                                    return jSONObject;
                                }
                            });
                        }
                    } catch (Throwable th) {
                        sLN.Lxb("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }

    public void Lxb(String str, tD tDVar) {
        if (TextUtils.isEmpty(str) || tDVar == null || this.LD.get(str) != null) {
            return;
        }
        this.LD.put(str, tDVar);
    }

    public tD Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LD.get(str);
    }

    public void Lxb(Lxb lxb) {
        this.lk = lxb;
    }

    public void Lxb() {
        this.lk = null;
    }

    public static IPMiBroadcastReceiver Lxb(Context context) {
        int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("ip_data_config", "ip_link_listener", 0);
        sLN.Lxb("IPMiBroadcastReceiver", "open =", Integer.valueOf(iLxb));
        if (iLxb == 0) {
            return null;
        }
        if (Lxb == null) {
            synchronized (IPMiBroadcastReceiver.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new IPMiBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        if (Build.VERSION.SDK_INT >= 34 && nJ.nBu(context) >= 34) {
                            context.registerReceiver(Lxb, intentFilter, 2);
                        } else {
                            context.registerReceiver(Lxb, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public static void Lxb(final Context context, tD tDVar) {
        HD hdWVT;
        if (Lxb == null && tDVar != null && (hdWVT = tDVar.wVT()) != null && hdWVT.Lxb()) {
            STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPMiBroadcastReceiver.Lxb(kqm.Lxb(context));
                    } catch (Throwable th) {
                        sLN.Lxb("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }
}

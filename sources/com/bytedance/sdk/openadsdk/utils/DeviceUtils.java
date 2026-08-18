package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceUtils {
    private static int JVA = 0;
    public static String Lxb = "";
    private static int NXR;
    private static int OY;
    private static int QAg;
    private static int nBu;
    private static int sLN;
    private static volatile long LD = System.currentTimeMillis();
    private static volatile boolean lk = false;
    private static volatile boolean ZU = false;
    private static volatile boolean JXs = false;
    private static volatile boolean lc = true;
    private static long ebl = 0;
    private static AtomicBoolean STP = new AtomicBoolean(false);

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.sLN.ebl> Lxb = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void LD(Context context) {
            if (DeviceUtils.ZU || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                boolean unused = DeviceUtils.ZU = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.sLN = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.nBu = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    Iterator<com.bytedance.sdk.openadsdk.sLN.ebl> it = Lxb.iterator();
                    while (it.hasNext()) {
                        it.next().Lxb(DeviceUtils.nBu);
                    }
                    if (DeviceUtils.QAg != 0) {
                        int unused3 = DeviceUtils.JVA = (int) ((((double) DeviceUtils.nBu) / ((double) DeviceUtils.QAg)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void Lxb(com.bytedance.sdk.openadsdk.sLN.ebl eblVar) {
            if (eblVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.sLN.ebl> copyOnWriteArrayList = Lxb;
                if (copyOnWriteArrayList.contains(eblVar)) {
                    return;
                }
                copyOnWriteArrayList.add(eblVar);
            }
        }

        public static void LD(com.bytedance.sdk.openadsdk.sLN.ebl eblVar) {
            if (eblVar == null) {
                return;
            }
            Lxb.remove(eblVar);
        }
    }

    public static class LD extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.lc = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.lc = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.LD = System.currentTimeMillis();
            }
        }
    }

    public static class Lxb extends BroadcastReceiver {
        private Lxb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void LD(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i >= 33) {
                    context.registerReceiver(new Lxb(), intentFilter, 2);
                } else {
                    context.registerReceiver(new Lxb(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.tD(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.NXR = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    public static class lk extends com.bytedance.sdk.component.OY.OY {
        public lk() {
            super("gaid_task");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.bytedance.sdk.openadsdk.core.lk] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r3;
            boolean zIsLimitAdTrackingEnabled;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
                if (advertisingIdInfo != null) {
                    zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    DeviceUtils.LD(advertisingIdInfo, zIsLimitAdTrackingEnabled);
                } else {
                    r3 = -1;
                }
                if (r3 == -1) {
                    r3 = zIsLimitAdTrackingEnabled;
                    return;
                } else {
                    r3 = zIsLimitAdTrackingEnabled;
                    com.bytedance.sdk.openadsdk.core.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).Lxb("limit_ad_track", r3);
                }
            } catch (IOException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int DY(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return Sfi(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static void HD(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                DeviceUtils.tD(applicationContext);
            }
        });
    }

    private static int IeN(Context context) {
        return sLN;
    }

    public static void JVA() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                OY = 1;
            } else if (ringerMode == 1) {
                OY = 2;
            } else {
                OY = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject JXs(Context context) {
        return Lxb(context, false);
    }

    public static int OY(Context context) {
        return OY;
    }

    public static int QAg() {
        return QAg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private static int Sfi(Context context) {
        try {
            String str = Build.MANUFACTURER;
            int i = 1;
            if (str.equalsIgnoreCase("XIAOMI")) {
                if (Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") != 1) {
                    i = 0;
                }
            } else {
                if (!str.equalsIgnoreCase("HUAWEI")) {
                    return 0;
                }
                if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") != 4) {
                    i = 0;
                }
            }
            return i;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static float VVE(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static void brP(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            QAg = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            nBu = streamVolume;
            JVA = (int) ((((double) streamVolume) / ((double) QAg)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    public static int ebl(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int kqm(Context context) {
        return NXR;
    }

    public static int lc() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    @JProtect
    public static void nBu() {
        hg.Lxb((com.bytedance.sdk.component.OY.OY) new lk());
        com.bytedance.sdk.openadsdk.core.settings.VVE.Lxb(new com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void LD() {
                hg.Lxb((com.bytedance.sdk.component.OY.OY) new lk());
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void Lxb() {
                hg.Lxb((com.bytedance.sdk.component.OY.OY) new lk());
            }
        });
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        if (contextLxb != null) {
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("cpu_count", OY.Lxb());
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("cpu_max_frequency", OY.Lxb(OY.Lxb()));
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("cpu_min_frequency", OY.LD(OY.Lxb()));
            String strQAg = nJ.QAg();
            if (strQAg != null) {
                com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("total_memory", strQAg);
            }
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("total_internal_storage", nJ.nBu());
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("free_internal_storage", com.bytedance.sdk.component.utils.NXR.Lxb());
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("total_sdcard_storage", nJ.JVA());
            com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("is_root", nJ.sLN() ? 1 : 0);
            if (TextUtils.isEmpty(QAg(contextLxb))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    Lxb = "unity";
                } catch (ClassNotFoundException unused) {
                    Lxb = "native";
                }
                com.bytedance.sdk.openadsdk.core.lk.Lxb(contextLxb).Lxb("framework_name", Lxb);
            }
            JVA();
            brP(contextLxb);
            NXR = DY(contextLxb);
            lc.Lxb(contextLxb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tD(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        hg.LD(new com.bytedance.sdk.component.OY.OY("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.NXR = DeviceUtils.DY(applicationContext);
            }
        });
    }

    public static float JXs() {
        int i = -1;
        try {
            Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
            if (contextLxb != null) {
                i = Settings.System.getInt(contextLxb.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int OY() {
        return JVA;
    }

    public static String QAg(Context context) {
        if (TextUtils.isEmpty(Lxb)) {
            Lxb = com.bytedance.sdk.openadsdk.core.lk.Lxb(context).LD("framework_name", "");
        }
        return Lxb;
    }

    private static int STP(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    public static int ZU(Context context) {
        if (lk(context)) {
            return 3;
        }
        return LD(context) ? 2 : 1;
    }

    public static int ebl() {
        return nBu;
    }

    public static boolean lk(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    @JProtect
    public static boolean LD() {
        if (SystemClock.elapsedRealtime() - ebl >= 20000) {
            ebl = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("power");
                if (powerManager != null) {
                    lc = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return lc;
    }

    public static int lc(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int lk() {
        return com.bytedance.sdk.openadsdk.core.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).LD("limit_ad_track", -1);
    }

    public static String ZU() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void Lxb(Context context) {
        if (lk) {
            return;
        }
        try {
            LD ld = new LD();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(ld, intentFilter);
            lk = true;
        } catch (Throwable unused) {
        }
    }

    public static void JVA(Context context) {
        Context applicationContext;
        if (JXs || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                Lxb.LD(applicationContext);
            } else {
                HD(applicationContext);
            }
            JXs = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean LD(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void LD(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.kqm.ZU().KPU("gaid")) {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
        }
    }

    public static long Lxb() {
        return LD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(AdvertisingIdClient.Info info, boolean z) {
        if (z || !com.bytedance.sdk.openadsdk.core.kqm.ZU().KPU("gaid")) {
            return;
        }
        String id = info.getId();
        String strLD = com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD();
        if (!TextUtils.isEmpty(id)) {
            com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().Lxb(id);
            com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(id);
        }
        if (strLD.equals(id)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb();
    }

    private static void Lxb(JSONObject jSONObject) throws JSONException {
        LD(jSONObject);
    }

    @JProtect
    public static JSONObject Lxb(Context context, boolean z) {
        String strLD;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", lc(context));
            Lxb(jSONObject);
            jSONObject.put("type", ZU(context));
            jSONObject.put(bc.x, 1);
            jSONObject.put(bc.y, Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", nJ.sLN(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.ZU.lk());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.ZU.LD());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.ZU.ZU());
            jSONObject.put("screen_width", le.lk(context));
            jSONObject.put("screen_height", le.ZU(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.QAg.lk.lc());
            com.bytedance.sdk.openadsdk.core.settings.lc lcVarZU = com.bytedance.sdk.openadsdk.core.kqm.ZU();
            if (lcVarZU.KPU("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.sLN.lk(context));
            jSONObject.put("rom_version", CSn.Lxb());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.sLN.LD(context));
            jSONObject.put(bc.M, nJ.brP());
            jSONObject.put(bc.N, com.bytedance.sdk.openadsdk.core.sLN.LD());
            jSONObject.put("carrier_name", foI.Lxb());
            if (z) {
                strLD = nJ.Lxb(context);
            } else {
                strLD = nJ.LD(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strLD) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            jSONObject.put("locale_language", ZU());
            jSONObject.put("screen_bright", Math.ceil(JXs() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (LD() ? 1 : 0));
            jSONObject.put("cpu_num", OY.Lxb(context));
            jSONObject.put("cpu_max_freq", OY.LD(context));
            jSONObject.put("cpu_min_freq", OY.lk(context));
            JXs.Lxb Lxb2 = JXs.Lxb();
            jSONObject.put("battery_remaining_pct", (int) Lxb2.LD);
            jSONObject.put("is_charging", Lxb2.Lxb);
            jSONObject.put("total_space", String.valueOf(nJ.lk(context)));
            jSONObject.put("free_space_in", String.valueOf(nJ.ZU(context)));
            jSONObject.put("sdcard_size", String.valueOf(nJ.JXs(context)));
            jSONObject.put("rooted", nJ.lc(context));
            jSONObject.put("enable_assisted_clicking", lc());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.tD.Lxb(context, "tt_choose_language"));
            jSONObject.put("airplane", ebl(context));
            jSONObject.put("darkmode", STP(context));
            jSONObject.put("headset", IeN(context));
            jSONObject.put("ringmute", OY(context));
            jSONObject.put("screenscale", VVE(context));
            jSONObject.put("volume", OY());
            jSONObject.put("low_power_mode", kqm(context));
            if (z) {
                lc.Lxb(jSONObject, context);
            }
            if (lcVarZU.KPU("mnc")) {
                jSONObject.put("mnc", foI.lk());
            }
            if (lcVarZU.KPU("mcc")) {
                jSONObject.put("mcc", foI.LD());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.Lxb.LD(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.Lxb.Lxb());
            String strLk = com.bytedance.sdk.openadsdk.core.QAg.lk.lk();
            com.bytedance.sdk.openadsdk.core.QAg.lk.ZU();
            if (!TextUtils.isEmpty(strLk)) {
                jSONObject.put("sof_chara", strLk);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void nBu(Context context) {
        AudioInfoReceiver.LD(context);
    }
}

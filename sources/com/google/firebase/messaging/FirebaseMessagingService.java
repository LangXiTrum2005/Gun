package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractServiceC2320Br;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2323Bu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3736ir;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4308pP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4396qP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4524rp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4550s7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4617su;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4044mP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4132nP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4220oP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Td0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ud0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X7;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC2320Br {
    public static final ArrayDeque g = new ArrayDeque(10);

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:103:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01df  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0204  */
    /* JADX WARN: Code duplicated, block: B:140:0x0216  */
    /* JADX WARN: Code duplicated, block: B:142:0x0223 A[Catch: NumberFormatException -> 0x0228, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0228, blocks: (B:142:0x0223, B:151:0x023e), top: B:189:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x022a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0235  */
    /* JADX WARN: Code duplicated, block: B:151:0x023e A[Catch: NumberFormatException -> 0x0228, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0228, blocks: (B:142:0x0223, B:151:0x023e), top: B:189:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0246  */
    /* JADX WARN: Code duplicated, block: B:157:0x0266  */
    /* JADX WARN: Code duplicated, block: B:159:0x0289  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:175:0x02db  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractServiceC2320Br
    public final void b(Intent intent) {
        String stringExtra;
        int iHashCode;
        byte b;
        Bundle extras;
        NN nn;
        ExecutorService executorServiceNewSingleThreadExecutor;
        Context context;
        SharedPreferences sharedPreferences;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z;
        EnumC4044mP enumC4044mP;
        Td0 td0;
        Bundle extras2;
        Object obj;
        int iIntValue;
        int i;
        String string;
        EnumC4132nP enumC4132nP;
        String string2;
        String str;
        String string3;
        String str2;
        String string4;
        String str3;
        String string5;
        String str4;
        String string6;
        String str5;
        long j;
        C4308pP c4308pP;
        C3736ir c3736ir;
        C2953a0 c2953a0;
        Ud0 ud0;
        Set set;
        C4266ou c4266ouB;
        C2323Bu c2323Bu;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        String stringExtra2;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            String stringExtra3 = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(stringExtra3)) {
                stringExtra = intent.getStringExtra("message_type");
                if (stringExtra == null) {
                    stringExtra = "gcm";
                }
                iHashCode = stringExtra.hashCode();
                b = -1;
                if (iHashCode != 102161) {
                    if (iHashCode != 814694033) {
                        if (iHashCode == 814800675 && stringExtra.equals("send_event")) {
                            b = 2;
                        }
                    } else if (stringExtra.equals("send_error")) {
                        b = 1;
                    }
                } else if (stringExtra.equals("gcm")) {
                    b = 0;
                }
                if (b != 0) {
                    if (AbstractC2995aW.t0(intent)) {
                        AbstractC2995aW.a0(intent.getExtras(), "_nr");
                    }
                    if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                        try {
                            C4266ou.b();
                            C4266ou c4266ouB2 = C4266ou.b();
                            c4266ouB2.a();
                            context = c4266ouB2.f4812a;
                            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                            if (sharedPreferences.contains("export_to_big_query")) {
                                z = sharedPreferences.getBoolean("export_to_big_query", false);
                            } else {
                                packageManager = context.getPackageManager();
                                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                    z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                            }
                            if (z) {
                                enumC4044mP = EnumC4044mP.MESSAGE_DELIVERED;
                                td0 = FirebaseMessaging.l;
                                if (td0 != null) {
                                    extras2 = intent.getExtras();
                                    if (extras2 == null) {
                                        extras2 = Bundle.EMPTY;
                                    }
                                    obj = extras2.get("google.ttl");
                                    if (obj instanceof Integer) {
                                        iIntValue = ((Integer) obj).intValue();
                                    } else {
                                        if (obj instanceof String) {
                                            try {
                                                iIntValue = Integer.parseInt((String) obj);
                                            } catch (NumberFormatException unused) {
                                                Objects.toString(obj);
                                                i = 0;
                                            }
                                        }
                                        i = 0;
                                        string = extras2.getString("google.to");
                                        if (TextUtils.isEmpty(string)) {
                                            try {
                                                C4266ou c4266ouB3 = C4266ou.b();
                                                Object obj2 = C4617su.m;
                                                Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                                c4266ouB3.a();
                                                string = (String) Tasks.await(((C4617su) c4266ouB3.d.a(InterfaceC4705tu.class)).d());
                                            } catch (InterruptedException | ExecutionException e) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                        String str9 = string;
                                        C4266ou c4266ouB4 = C4266ou.b();
                                        c4266ouB4.a();
                                        String packageName = c4266ouB4.f4812a.getPackageName();
                                        EnumC4220oP enumC4220oP = EnumC4220oP.ANDROID;
                                        if (NN.t(extras2)) {
                                            enumC4132nP = EnumC4132nP.DISPLAY_NOTIFICATION;
                                        } else {
                                            enumC4132nP = EnumC4132nP.DATA_MESSAGE;
                                        }
                                        EnumC4132nP enumC4132nP2 = enumC4132nP;
                                        string2 = extras2.getString("google.message_id");
                                        if (string2 == null) {
                                            string2 = extras2.getString("message_id");
                                        }
                                        if (string2 != null) {
                                            str = string2;
                                        } else {
                                            str = "";
                                        }
                                        string3 = extras2.getString(TypedValues.TransitionType.S_FROM);
                                        if (string3 != null || !string3.startsWith("/topics/")) {
                                            string3 = null;
                                        }
                                        if (string3 != null) {
                                            str2 = string3;
                                        } else {
                                            str2 = "";
                                        }
                                        string4 = extras2.getString("collapse_key");
                                        if (string4 != null) {
                                            str3 = string4;
                                        } else {
                                            str3 = "";
                                        }
                                        string5 = extras2.getString("google.c.a.m_l");
                                        if (string5 != null) {
                                            str4 = string5;
                                        } else {
                                            str4 = "";
                                        }
                                        string6 = extras2.getString("google.c.a.c_l");
                                        if (string6 != null) {
                                            str5 = string6;
                                        } else {
                                            str5 = "";
                                        }
                                        if (extras2.containsKey("google.c.sender.id")) {
                                            try {
                                                j = Long.parseLong(extras2.getString("google.c.sender.id"));
                                            } catch (NumberFormatException unused2) {
                                                c4266ouB = C4266ou.b();
                                                c4266ouB.a();
                                                c2323Bu = c4266ouB.c;
                                                str6 = c2323Bu.e;
                                                if (str6 != null) {
                                                    try {
                                                        j = Long.parseLong(str6);
                                                    } catch (NumberFormatException unused3) {
                                                        c4266ouB.a();
                                                        str7 = c2323Bu.b;
                                                        try {
                                                            if (str7.startsWith("1:")) {
                                                                strArrSplit = str7.split(":");
                                                                if (strArrSplit.length >= 2) {
                                                                    str8 = strArrSplit[1];
                                                                    if (str8.isEmpty()) {
                                                                        j = Long.parseLong(str8);
                                                                    }
                                                                }
                                                                j = 0;
                                                            } else {
                                                                j = Long.parseLong(str7);
                                                            }
                                                        } catch (NumberFormatException unused4) {
                                                        }
                                                    }
                                                } else {
                                                    c4266ouB.a();
                                                    str7 = c2323Bu.b;
                                                    if (str7.startsWith("1:")) {
                                                        j = Long.parseLong(str7);
                                                    } else {
                                                        strArrSplit = str7.split(":");
                                                        if (strArrSplit.length >= 2) {
                                                            str8 = strArrSplit[1];
                                                            if (str8.isEmpty()) {
                                                                j = Long.parseLong(str8);
                                                            }
                                                        }
                                                        j = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            c4266ouB = C4266ou.b();
                                            c4266ouB.a();
                                            c2323Bu = c4266ouB.c;
                                            str6 = c2323Bu.e;
                                            if (str6 != null) {
                                                j = Long.parseLong(str6);
                                            } else {
                                                c4266ouB.a();
                                                str7 = c2323Bu.b;
                                                if (str7.startsWith("1:")) {
                                                    j = Long.parseLong(str7);
                                                } else {
                                                    strArrSplit = str7.split(":");
                                                    if (strArrSplit.length >= 2) {
                                                        str8 = strArrSplit[1];
                                                        if (str8.isEmpty()) {
                                                            j = Long.parseLong(str8);
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                            }
                                        }
                                        c4308pP = new C4308pP(j > 0 ? j : 0L, str, str9, enumC4132nP2, enumC4220oP, packageName, str3, i, str2, enumC4044mP, str4, str5);
                                        c3736ir = new C3736ir("proto");
                                        c2953a0 = new C2953a0(5);
                                        ud0 = (Ud0) td0;
                                        set = ud0.f3829a;
                                        if (set.contains(c3736ir)) {
                                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3736ir, set));
                                        }
                                        new L4(ud0.b, "FCM_CLIENT_EVENT_LOGGING", c3736ir, c2953a0, ud0.c).a(new X7(new C4396qP(c4308pP)));
                                    }
                                    i = iIntValue;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        C4266ou c4266ouB5 = C4266ou.b();
                                        Object obj3 = C4617su.m;
                                        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                        c4266ouB5.a();
                                        string = (String) Tasks.await(((C4617su) c4266ouB5.d.a(InterfaceC4705tu.class)).d());
                                    }
                                    String str10 = string;
                                    C4266ou c4266ouB6 = C4266ou.b();
                                    c4266ouB6.a();
                                    String packageName2 = c4266ouB6.f4812a.getPackageName();
                                    EnumC4220oP enumC4220oP2 = EnumC4220oP.ANDROID;
                                    if (NN.t(extras2)) {
                                        enumC4132nP = EnumC4132nP.DISPLAY_NOTIFICATION;
                                    } else {
                                        enumC4132nP = EnumC4132nP.DATA_MESSAGE;
                                    }
                                    EnumC4132nP enumC4132nP3 = enumC4132nP;
                                    string2 = extras2.getString("google.message_id");
                                    if (string2 == null) {
                                        string2 = extras2.getString("message_id");
                                    }
                                    if (string2 != null) {
                                        str = string2;
                                    } else {
                                        str = "";
                                    }
                                    string3 = extras2.getString(TypedValues.TransitionType.S_FROM);
                                    if (string3 != null) {
                                        string3 = null;
                                    } else {
                                        string3 = null;
                                    }
                                    if (string3 != null) {
                                        str2 = string3;
                                    } else {
                                        str2 = "";
                                    }
                                    string4 = extras2.getString("collapse_key");
                                    if (string4 != null) {
                                        str3 = string4;
                                    } else {
                                        str3 = "";
                                    }
                                    string5 = extras2.getString("google.c.a.m_l");
                                    if (string5 != null) {
                                        str4 = string5;
                                    } else {
                                        str4 = "";
                                    }
                                    string6 = extras2.getString("google.c.a.c_l");
                                    if (string6 != null) {
                                        str5 = string6;
                                    } else {
                                        str5 = "";
                                    }
                                    if (extras2.containsKey("google.c.sender.id")) {
                                        j = Long.parseLong(extras2.getString("google.c.sender.id"));
                                    } else {
                                        c4266ouB = C4266ou.b();
                                        c4266ouB.a();
                                        c2323Bu = c4266ouB.c;
                                        str6 = c2323Bu.e;
                                        if (str6 != null) {
                                            j = Long.parseLong(str6);
                                        } else {
                                            c4266ouB.a();
                                            str7 = c2323Bu.b;
                                            if (str7.startsWith("1:")) {
                                                j = Long.parseLong(str7);
                                            } else {
                                                strArrSplit = str7.split(":");
                                                if (strArrSplit.length >= 2) {
                                                    str8 = strArrSplit[1];
                                                    if (str8.isEmpty()) {
                                                        j = Long.parseLong(str8);
                                                    }
                                                }
                                                j = 0;
                                            }
                                        }
                                    }
                                    c4308pP = new C4308pP(j > 0 ? j : 0L, str, str10, enumC4132nP3, enumC4220oP2, packageName2, str3, i, str2, enumC4044mP, str4, str5);
                                    c3736ir = new C3736ir("proto");
                                    c2953a0 = new C2953a0(5);
                                    ud0 = (Ud0) td0;
                                    set = ud0.f3829a;
                                    if (set.contains(c3736ir)) {
                                        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3736ir, set));
                                    }
                                    new L4(ud0.b, "FCM_CLIENT_EVENT_LOGGING", c3736ir, c2953a0, ud0.c).a(new X7(new C4396qP(c4308pP)));
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IllegalStateException | RuntimeException unused5) {
                        }
                    }
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (NN.t(extras)) {
                        nn = new NN(extras);
                        executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                        try {
                            if (new C4524rp(this, nn, executorServiceNewSingleThreadExecutor).a()) {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                return;
                            } else {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                if (AbstractC2995aW.t0(intent)) {
                                    AbstractC2995aW.a0(intent.getExtras(), "_nf");
                                }
                            }
                        } catch (Throwable th) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            throw th;
                        }
                    }
                    new RemoteMessage(extras);
                    return;
                }
                if (b != 1) {
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    stringExtra2 = intent.getStringExtra("error");
                    new C4550s7(stringExtra2);
                    if (stringExtra2 != null) {
                        stringExtra2.toLowerCase(Locale.US).getClass();
                    }
                } else if (b == 2) {
                    intent.getStringExtra("google.message_id");
                }
            } else {
                ArrayDeque arrayDeque = g;
                if (!arrayDeque.contains(stringExtra3)) {
                    if (arrayDeque.size() >= 10) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(stringExtra3);
                    stringExtra = intent.getStringExtra("message_type");
                    if (stringExtra == null) {
                        stringExtra = "gcm";
                    }
                    iHashCode = stringExtra.hashCode();
                    b = -1;
                    if (iHashCode != 102161) {
                        if (iHashCode != 814694033) {
                            if (iHashCode == 814800675) {
                                b = 2;
                            }
                        } else if (stringExtra.equals("send_error")) {
                            b = 1;
                        }
                    } else if (stringExtra.equals("gcm")) {
                        b = 0;
                    }
                    if (b != 0) {
                        if (AbstractC2995aW.t0(intent)) {
                            AbstractC2995aW.a0(intent.getExtras(), "_nr");
                        }
                        if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                            C4266ou.b();
                            C4266ou c4266ouB7 = C4266ou.b();
                            c4266ouB7.a();
                            context = c4266ouB7.f4812a;
                            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                            if (sharedPreferences.contains("export_to_big_query")) {
                                z = sharedPreferences.getBoolean("export_to_big_query", false);
                            } else {
                                packageManager = context.getPackageManager();
                                if (packageManager != null) {
                                    z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                            }
                            if (z) {
                                enumC4044mP = EnumC4044mP.MESSAGE_DELIVERED;
                                td0 = FirebaseMessaging.l;
                                if (td0 != null) {
                                    extras2 = intent.getExtras();
                                    if (extras2 == null) {
                                        extras2 = Bundle.EMPTY;
                                    }
                                    obj = extras2.get("google.ttl");
                                    if (obj instanceof Integer) {
                                        iIntValue = ((Integer) obj).intValue();
                                    } else {
                                        if (obj instanceof String) {
                                            iIntValue = Integer.parseInt((String) obj);
                                        }
                                        i = 0;
                                        string = extras2.getString("google.to");
                                        if (TextUtils.isEmpty(string)) {
                                            C4266ou c4266ouB8 = C4266ou.b();
                                            Object obj4 = C4617su.m;
                                            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                            c4266ouB8.a();
                                            string = (String) Tasks.await(((C4617su) c4266ouB8.d.a(InterfaceC4705tu.class)).d());
                                        }
                                        String str11 = string;
                                        C4266ou c4266ouB9 = C4266ou.b();
                                        c4266ouB9.a();
                                        String packageName3 = c4266ouB9.f4812a.getPackageName();
                                        EnumC4220oP enumC4220oP3 = EnumC4220oP.ANDROID;
                                        if (NN.t(extras2)) {
                                            enumC4132nP = EnumC4132nP.DISPLAY_NOTIFICATION;
                                        } else {
                                            enumC4132nP = EnumC4132nP.DATA_MESSAGE;
                                        }
                                        EnumC4132nP enumC4132nP4 = enumC4132nP;
                                        string2 = extras2.getString("google.message_id");
                                        if (string2 == null) {
                                            string2 = extras2.getString("message_id");
                                        }
                                        if (string2 != null) {
                                            str = string2;
                                        } else {
                                            str = "";
                                        }
                                        string3 = extras2.getString(TypedValues.TransitionType.S_FROM);
                                        if (string3 != null) {
                                            string3 = null;
                                        } else {
                                            string3 = null;
                                        }
                                        if (string3 != null) {
                                            str2 = string3;
                                        } else {
                                            str2 = "";
                                        }
                                        string4 = extras2.getString("collapse_key");
                                        if (string4 != null) {
                                            str3 = string4;
                                        } else {
                                            str3 = "";
                                        }
                                        string5 = extras2.getString("google.c.a.m_l");
                                        if (string5 != null) {
                                            str4 = string5;
                                        } else {
                                            str4 = "";
                                        }
                                        string6 = extras2.getString("google.c.a.c_l");
                                        if (string6 != null) {
                                            str5 = string6;
                                        } else {
                                            str5 = "";
                                        }
                                        if (extras2.containsKey("google.c.sender.id")) {
                                            j = Long.parseLong(extras2.getString("google.c.sender.id"));
                                        } else {
                                            c4266ouB = C4266ou.b();
                                            c4266ouB.a();
                                            c2323Bu = c4266ouB.c;
                                            str6 = c2323Bu.e;
                                            if (str6 != null) {
                                                j = Long.parseLong(str6);
                                            } else {
                                                c4266ouB.a();
                                                str7 = c2323Bu.b;
                                                if (str7.startsWith("1:")) {
                                                    j = Long.parseLong(str7);
                                                } else {
                                                    strArrSplit = str7.split(":");
                                                    if (strArrSplit.length >= 2) {
                                                        str8 = strArrSplit[1];
                                                        if (str8.isEmpty()) {
                                                            j = Long.parseLong(str8);
                                                        }
                                                    }
                                                    j = 0;
                                                }
                                            }
                                        }
                                        c4308pP = new C4308pP(j > 0 ? j : 0L, str, str11, enumC4132nP4, enumC4220oP3, packageName3, str3, i, str2, enumC4044mP, str4, str5);
                                        c3736ir = new C3736ir("proto");
                                        c2953a0 = new C2953a0(5);
                                        ud0 = (Ud0) td0;
                                        set = ud0.f3829a;
                                        if (set.contains(c3736ir)) {
                                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3736ir, set));
                                        }
                                        new L4(ud0.b, "FCM_CLIENT_EVENT_LOGGING", c3736ir, c2953a0, ud0.c).a(new X7(new C4396qP(c4308pP)));
                                    }
                                    i = iIntValue;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        C4266ou c4266ouB10 = C4266ou.b();
                                        Object obj5 = C4617su.m;
                                        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                        c4266ouB10.a();
                                        string = (String) Tasks.await(((C4617su) c4266ouB10.d.a(InterfaceC4705tu.class)).d());
                                    }
                                    String str12 = string;
                                    C4266ou c4266ouB11 = C4266ou.b();
                                    c4266ouB11.a();
                                    String packageName4 = c4266ouB11.f4812a.getPackageName();
                                    EnumC4220oP enumC4220oP4 = EnumC4220oP.ANDROID;
                                    if (NN.t(extras2)) {
                                        enumC4132nP = EnumC4132nP.DISPLAY_NOTIFICATION;
                                    } else {
                                        enumC4132nP = EnumC4132nP.DATA_MESSAGE;
                                    }
                                    EnumC4132nP enumC4132nP5 = enumC4132nP;
                                    string2 = extras2.getString("google.message_id");
                                    if (string2 == null) {
                                        string2 = extras2.getString("message_id");
                                    }
                                    if (string2 != null) {
                                        str = string2;
                                    } else {
                                        str = "";
                                    }
                                    string3 = extras2.getString(TypedValues.TransitionType.S_FROM);
                                    if (string3 != null) {
                                        string3 = null;
                                    } else {
                                        string3 = null;
                                    }
                                    if (string3 != null) {
                                        str2 = string3;
                                    } else {
                                        str2 = "";
                                    }
                                    string4 = extras2.getString("collapse_key");
                                    if (string4 != null) {
                                        str3 = string4;
                                    } else {
                                        str3 = "";
                                    }
                                    string5 = extras2.getString("google.c.a.m_l");
                                    if (string5 != null) {
                                        str4 = string5;
                                    } else {
                                        str4 = "";
                                    }
                                    string6 = extras2.getString("google.c.a.c_l");
                                    if (string6 != null) {
                                        str5 = string6;
                                    } else {
                                        str5 = "";
                                    }
                                    if (extras2.containsKey("google.c.sender.id")) {
                                        j = Long.parseLong(extras2.getString("google.c.sender.id"));
                                    } else {
                                        c4266ouB = C4266ou.b();
                                        c4266ouB.a();
                                        c2323Bu = c4266ouB.c;
                                        str6 = c2323Bu.e;
                                        if (str6 != null) {
                                            j = Long.parseLong(str6);
                                        } else {
                                            c4266ouB.a();
                                            str7 = c2323Bu.b;
                                            if (str7.startsWith("1:")) {
                                                j = Long.parseLong(str7);
                                            } else {
                                                strArrSplit = str7.split(":");
                                                if (strArrSplit.length >= 2) {
                                                    str8 = strArrSplit[1];
                                                    if (str8.isEmpty()) {
                                                        j = Long.parseLong(str8);
                                                    }
                                                }
                                                j = 0;
                                            }
                                        }
                                    }
                                    c4308pP = new C4308pP(j > 0 ? j : 0L, str, str12, enumC4132nP5, enumC4220oP4, packageName4, str3, i, str2, enumC4044mP, str4, str5);
                                    c3736ir = new C3736ir("proto");
                                    c2953a0 = new C2953a0(5);
                                    ud0 = (Ud0) td0;
                                    set = ud0.f3829a;
                                    if (set.contains(c3736ir)) {
                                        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3736ir, set));
                                    }
                                    new L4(ud0.b, "FCM_CLIENT_EVENT_LOGGING", c3736ir, c2953a0, ud0.c).a(new X7(new C4396qP(c4308pP)));
                                }
                            }
                        }
                        extras = intent.getExtras();
                        if (extras == null) {
                            extras = new Bundle();
                        }
                        extras.remove("androidx.content.wakelockid");
                        if (NN.t(extras)) {
                            nn = new NN(extras);
                            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                            if (new C4524rp(this, nn, executorServiceNewSingleThreadExecutor).a()) {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                return;
                            } else {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                if (AbstractC2995aW.t0(intent)) {
                                    AbstractC2995aW.a0(intent.getExtras(), "_nf");
                                }
                            }
                        }
                        new RemoteMessage(extras);
                        return;
                    }
                    if (b != 1) {
                        if (intent.getStringExtra("google.message_id") == null) {
                            intent.getStringExtra("message_id");
                        }
                        stringExtra2 = intent.getStringExtra("error");
                        new C4550s7(stringExtra2);
                        if (stringExtra2 != null) {
                            stringExtra2.toLowerCase(Locale.US).getClass();
                        }
                    } else if (b == 2) {
                        intent.getStringExtra("google.message_id");
                    }
                }
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            intent.getStringExtra(BidResponsed.KEY_TOKEN);
        } else {
            intent.getAction();
        }
    }
}

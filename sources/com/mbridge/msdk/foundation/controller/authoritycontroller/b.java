package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    private static boolean h = true;
    private static boolean i = true;
    protected AuthorityInfoBean b;
    private e g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f1118a = new ArrayList<>();
    private int c = 3;
    private int d = 0;
    private int e = 0;
    private String f = "";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1119a;
        final /* synthetic */ OnCompletionListener b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f1119a = context;
            this.b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f1119a);
            this.b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    public class C0162b implements e.a {
        public C0162b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public b() {
        h();
    }

    public static void b(boolean z) {
        i = z;
    }

    public static boolean i() {
        return h;
    }

    public static boolean j() {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void k() {
        boolean zC = this.g.c();
        b(this.g.b());
        d(zC ? 1 : 2);
        this.b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public abstract int a(g gVar, String str);

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.c;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i2 = 0; i2 < this.f1118a.size(); i2++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f1118a.get(i2)));
                jSONObject.put("client_status", a(this.f1118a.get(i2)));
                jSONObject.put("server_status", a(gVarC, this.f1118a.get(i2)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.b.authDeviceIdStatus(1);
            this.b.authSerialIdStatus(1);
            this.b.authOtherDataStatus(1);
            this.f1118a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f1118a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f1118a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f1118a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            o0.b("SDKAuthorityController", e.getMessage());
        }
    }

    private void d(int i2) {
        this.c = i2 != 1 ? 2 : 1;
    }

    public boolean b() {
        int i2 = this.c;
        return i2 == 1 || i2 == 3;
    }

    public void c(int i2) {
        this.e = i2;
    }

    public static void a(boolean z) {
        h = z;
    }

    public void b(int i2) {
        this.d = i2;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i2) {
        this.c = i2 != 1 ? 2 : 1;
        if (this.b != null) {
            d(i2);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e) {
            o0.b("SDKAuthorityController", e.getMessage());
            return 0;
        }
    }

    public void a(String str, int i2) {
        if (TextUtils.isEmpty(str) || this.b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "authority_serial_id":
                this.b.authSerialIdStatus(i2);
                break;
            case "authority_all_info":
                this.b.a(i2);
                break;
            case "authority_device_id":
                this.b.authDeviceIdStatus(i2);
                break;
            case "authority_general_data":
                this.b.authGenDataStatus(i2);
                break;
            case "authority_other":
                this.b.authOtherDataStatus(i2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.g == null) {
                e eVar = new e(context);
                this.g = eVar;
                eVar.a(new C0162b());
            }
            k();
        } catch (Throwable th) {
            o0.b("SDKAuthorityController", th.getMessage());
        }
    }
}

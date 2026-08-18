package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f1499a;
    protected String b;
    protected Context d;
    protected WindVaneWebView e;
    protected final int c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.e, str);
        if (aVarA != null) {
            aVarA.b = this.e;
            return aVarA;
        }
        Matcher matcher = this.f1499a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.d = matcher.group(1);
                aVar.g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.e = com.mbridge.msdk.mbsignalcommon.base.e.k.get(aVar.e);
                }
                aVar.b = this.e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C0196b c0196b = aVar.f1494a;
                if (c0196b != null && obj != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = aVar;
                    objArr[1] = TextUtils.isEmpty(aVar.f) ? "{}" : aVar.f;
                    c0196b.a(obj, objArr);
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C0196b c0196bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
            c0196bA.a();
            if (jsObject instanceof g) {
                aVar.f1494a = c0196bA;
                aVar.c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(int i, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = aVar;
        this.f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f1499a = pattern;
    }
}

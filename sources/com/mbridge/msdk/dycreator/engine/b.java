package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.dycreator.utils.g;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private static volatile b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, c>> f1083a;
    private SoftReference<HashMap<String, String>> b;
    private SoftReference<HashMap<String, c>> c;
    private String d;
    private String e;
    private Context f;

    private b() {
    }

    public static b a() {
        if (g == null) {
            synchronized (b.class) {
                try {
                    if (g == null) {
                        g = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public HashMap b() {
        SoftReference<HashMap<String, c>> softReference = this.f1083a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", c.layout_width);
            map.put("layout_height", c.layout_height);
            map.put(AdUnitActivity.EXTRA_ORIENTATION, c.orientation);
            map.put("layout_centerHorizontal", c.layout_centerHorizontal);
            map.put("layout_centerVertical", c.layout_centerVertical);
            c cVar = c.layout_marginLeft;
            map.put("layout_marginLeft", cVar);
            c cVar2 = c.layout_marginRight;
            map.put("layout_marginRight", cVar2);
            map.put("layout_margin", c.layout_margin);
            map.put("layout_gravity", c.layout_gravity);
            map.put("layout_alignParentRight", c.layout_alignParentRight);
            map.put("layout_weight", c.layout_weight);
            map.put("contentDescription", c.contentDescription);
            map.put("gravity", c.gravity);
            map.put("id", c.id);
            map.put("layout_below", c.layout_below);
            map.put("layout_above", c.layout_above);
            map.put("layout_toLeftOf", c.layout_toLeftOf);
            map.put("layout_toRightOf", c.layout_toRightOf);
            map.put("layout_toEndOf", c.layout_toEndOf);
            map.put("background", c.background);
            map.put("layout_marginTop", c.layout_marginTop);
            map.put("layout_marginBottom", c.layout_marginBottom);
            map.put("layout_marginLeft", cVar);
            map.put("layout_marginRight", cVar2);
            map.put("layout_alignParentBottom", c.layout_alignParentBottom);
            map.put("layout_alignParentTop", c.layout_alignParentTop);
            map.put("layout_alignParentLeft", c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", c.layout_alignTop);
            map.put("layout_alignBottom", c.layout_alignBottom);
            map.put("layout_alignLeft", c.layout_alignLeft);
            map.put("layout_alignRight", c.layout_alignRight);
            map.put("layout_centerInParent", c.layout_centerInParent);
            map.put("layout_alignParentEnd", c.layout_alignParentEnd);
            this.f1083a = new SoftReference<>(map);
        }
        return this.f1083a.get();
    }

    public HashMap<String, c> c() {
        SoftReference<HashMap<String, c>> softReference = this.c;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(55);
            map.put("id", c.id);
            map.put(MimeTypes.BASE_TYPE_TEXT, c.text);
            map.put("ellipsize", c.ellipsize);
            map.put("singleLine", c.singleLine);
            map.put("lines", c.lines);
            map.put("maxLength", c.maxLength);
            map.put("drawableLeft", c.drawableLeft);
            map.put("drawablePadding", c.drawablePadding);
            map.put("fadingEdge", c.fadingEdge);
            map.put("scrollHorizontally", c.scrollHorizontally);
            map.put("textColor", c.textColor);
            map.put("textSize", c.textSize);
            map.put("visibility", c.visibility);
            c cVar = c.background;
            map.put("background", cVar);
            map.put("textStyle", c.textStyle);
            map.put(TtmlNode.TAG_STYLE, c.style);
            map.put("layout_width", c.layout_width);
            map.put("layout_height", c.layout_height);
            map.put("layout_below", c.layout_below);
            map.put("layout_centerInParent", c.layout_centerInParent);
            map.put("contentDescription", c.contentDescription);
            map.put("src", c.src);
            map.put("gravity", c.gravity);
            map.put(AdUnitActivity.EXTRA_ORIENTATION, c.orientation);
            map.put("numColumns", c.numColumns);
            map.put("verticalSpacing", c.verticalSpacing);
            map.put("horizontalSpacing", c.horizontalSpacing);
            map.put("background", cVar);
            map.put("layout_marginBottom", c.layout_marginBottom);
            map.put("scaleType", c.scaleType);
            map.put("tag", c.tag);
            map.put("layout_gravity", c.layout_gravity);
            map.put("parent_view", c.parent_view);
            map.put("padding", c.padding);
            map.put("paddingTop", c.paddingTop);
            map.put("paddingBottom", c.paddingBottom);
            map.put("paddingLeft", c.paddingLeft);
            map.put("paddingRight", c.paddingRight);
            map.put("divider", c.divider);
            map.put("scrollbars", c.scrollbars);
            map.put("listSelector", c.listSelector);
            this.c = new SoftReference<>(map);
        }
        return this.c.get();
    }

    public int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (!str.startsWith("#")) {
            if (str.startsWith("@color/")) {
                return Build.VERSION.SDK_INT >= 23 ? com.mbridge.msdk.foundation.controller.c.n().d().getColor(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str.substring(7), "color")) : ViewCompat.MEASURED_STATE_MASK;
            }
            return ViewCompat.MEASURED_STATE_MASK;
        }
        int length = str.length();
        if (length == 7) {
            return (int) Long.decode(str.replace("#", "#FF")).longValue();
        }
        if (length == 9) {
            return (int) Long.decode(str).longValue();
        }
        g.a("返回白色背景");
        return -1;
    }

    public View e(String str) {
        if (this.f != null) {
            try {
                a aVar = new a(this.f);
                new String();
                g.a(str.toString());
                return aVar.a(str, (ViewGroup) null);
            } catch (Exception e) {
                o0.b("MBResource", e.getMessage());
            }
        }
        return null;
    }

    public String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("@")) {
            return str;
        }
        SoftReference<HashMap<String, String>> softReference = this.b;
        if (softReference == null || softReference.get() == null) {
            this.b = new SoftReference<>(d());
        }
        String strSubstring = str.substring(8);
        if (this.b.get() == null || this.b.get().size() <= 0) {
            return null;
        }
        String str2 = this.b.get().get(strSubstring);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return com.mbridge.msdk.foundation.controller.c.n().d().getString(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), strSubstring, TypedValues.Custom.S_STRING));
        } catch (Exception e) {
            o0.b("MBResource", e.getMessage());
            return null;
        }
    }

    public void a(Context context, String str) {
        try {
            if (g.f1094a) {
                this.d = context.getFilesDir().toString();
            } else {
                this.d = str;
            }
            if (e.a(context).heightPixels <= 320 || g.f1094a) {
                this.e = "/drawable-mdpi/";
            } else {
                this.e = "/drawable-hdpi/";
            }
            this.f = context;
            com.mbridge.msdk.dycreator.utils.b.f1092a = a().d();
        } catch (Exception e) {
            o0.b("MBResource", e.getMessage());
        }
    }

    public HashMap<String, String> d() {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e) {
            e.printStackTrace();
            inputStreamOpen = null;
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(inputStreamOpen, "utf-8");
            HashMap<String, String> map = new HashMap<>();
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && TypedValues.Custom.S_STRING.equals(xmlPullParserNewPullParser.getName())) {
                    map.put(xmlPullParserNewPullParser.getAttributeValue(0), xmlPullParserNewPullParser.nextText());
                }
            }
            return map;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a(Context context) {
        try {
            if (e.a(context).heightPixels <= 320 || g.f1094a) {
                this.e = "/drawable-mdpi/";
            } else {
                this.e = "/drawable-hdpi/";
            }
            this.f = context;
            com.mbridge.msdk.dycreator.utils.b.f1092a = a().d();
        } catch (Exception e) {
            o0.b("MBResource", e.getMessage());
        }
    }

    public GradientDrawable a(String[] strArr) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
            gradientDrawable.setGradientType(0);
            return gradientDrawable;
        } catch (Exception e) {
            o0.b("MBResource", e.getMessage());
            return null;
        }
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
            int iIndexOf2 = str.indexOf(bc.aH);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                return e.a(this.f, i);
            }
            str.contains(bc.aH);
            return i;
        }
    }

    public int b(String str) {
        String[] strArrSplit = str.toUpperCase().split("\\|");
        int i = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String str2 : strArrSplit) {
                i = cls.getField(str2).getInt(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public void a(String str, ImageView imageView) {
        Context context;
        if (str == null || !str.startsWith("@drawable/") || (context = this.f) == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            String strH = com.mbridge.msdk.foundation.controller.c.n().h();
            if (TextUtils.isEmpty(strH)) {
                strH = this.f.getPackageName();
            }
            imageView.setImageResource(resources.getIdentifier(str, "drawable", strH));
        } catch (Exception e) {
            o0.b("MBResource", e.getMessage());
        }
    }

    public int c(String str) {
        if (this.f != null) {
            String strH = com.mbridge.msdk.foundation.controller.c.n().h();
            if (TextUtils.isEmpty(strH)) {
                strH = this.f.getPackageName();
            }
            StringBuilder sbQ = DM.q(strH, ".R$");
            String[] strArrSplit = str.split("\\.");
            sbQ.append(strArrSplit[1]);
            try {
                Class<?> cls = Class.forName(sbQ.toString());
                Object objNewInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(strArrSplit[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(objNewInstance)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}

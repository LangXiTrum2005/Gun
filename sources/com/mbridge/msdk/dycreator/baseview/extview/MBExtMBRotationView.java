package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MBExtMBRotationView extends MBRotationView implements InterBase {
    private Map<String, String> q;
    private Map<String, Boolean> r;
    private String s;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBRotationView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1031a;

        static {
            int[] iArr = new int[c.values().length];
            f1031a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1031a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1031a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1031a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1031a[c.layout_width.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1031a[c.layout_height.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1031a[c.layout_gravity.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1031a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1031a[c.layout_margin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public MBExtMBRotationView(Context context) {
        super(context);
        this.s = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.q;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.q.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.q;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.q.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.q;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.q.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.q;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.q.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.q;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.q.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.r;
        if (map != null && map.containsKey("mbridgeAttached") && this.r.get("mbridgeAttached").booleanValue()) {
            AbstractC3950lJ.m("mbridgeAttached").b(this.s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.r;
        if (map != null && map.containsKey("mbridgeDetached") && this.r.get("mbridgeDetached").booleanValue()) {
            AbstractC3950lJ.m("mbridgeDetached").b(this.s);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = AnonymousClass1.f1031a[cVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("#")) {
                        try {
                            strArrSplit = attributeValue2.split("-");
                        } catch (Exception unused) {
                            strArrSplit = null;
                        }
                        if (strArrSplit != null && strArrSplit.length <= 2) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                        } else if (strArrSplit == null || strArrSplit.length != 3) {
                            setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                        } else {
                            try {
                                GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                gradientDrawable.setGradientType(0);
                                setBackground(gradientDrawable);
                            } catch (Exception unused2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                            }
                        }
                    } else if (attributeValue2.startsWith("@color/")) {
                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i)));
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                    }
                } else if (i2 == 3) {
                    setContentDescription(attributeSet.getAttributeValue(i));
                } else if (i2 == 4) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.r = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.s = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap mapB = b.a().b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (AnonymousClass1.f1031a[cVar.ordinal()]) {
                    case 5:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 6:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                            layoutParams.width = -1;
                        } else if (attributeValue2.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 7:
                        layoutParams.gravity = b.a().b(attributeSet.getAttributeValue(i));
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i));
                        break;
                    case 9:
                        int iA = b.a().a(attributeSet.getAttributeValue(i));
                        layoutParams.setMargins(iA, iA, iA, iA);
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet) {
        super(context);
        this.s = "";
        try {
            this.q = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.q, this);
        } catch (Exception e) {
            o0.b("MBExtMBRotationView", e.getMessage());
        }
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = "";
    }
}

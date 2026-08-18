package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1269a = false;

    private static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    private static boolean a(View view, View view2, int i) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            return false;
        }
        int iMin = Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left);
        int iMin2 = Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top);
        if (i != 1) {
            if (iMin * iMin2 * 2 < view.getMeasuredWidth() * view.getMeasuredHeight()) {
                if (i == 1) {
                    return false;
                }
                if (iMin * iMin2 >= view.getMeasuredWidth() * view.getMeasuredHeight()) {
                    return false;
                }
            }
        } else {
            if (i == 1) {
                return false;
            }
            if (iMin * iMin2 >= view.getMeasuredWidth() * view.getMeasuredHeight()) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(View view, ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            o0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0 && a(view, childAt, i)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    o0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f1269a = true;
                }
                if (a(childAt)) {
                    o0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f1269a = true;
                }
                if (f1269a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, i);
                }
            }
        }
        return f1269a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6 A[SYNTHETIC] */
    public static boolean a(View view, int i) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            o0.b("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            o0.b("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            o0.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        boolean z = ((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > ((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i == 1 ? 0.0f : 0.5f);
        boolean z2 = globalVisibleRect && z;
        o0.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
        StringBuilder sb = new StringBuilder("View Judge : totalViewVisible is ");
        sb.append(z2);
        o0.b("ViewUtils", sb.toString());
        if (!z2) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int iA = a(view2, viewGroup) + 1; iA < viewGroup.getChildCount(); iA++) {
                View childAt = viewGroup.getChildAt(iA);
                if (childAt.getVisibility() == 0 && a(view, childAt, i)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            o0.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean zA = a(view, viewGroup2, i);
                            f1269a = false;
                            if (zA) {
                                return true;
                            }
                        } else if (a(childAt)) {
                            o0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else if (a(childAt)) {
                        o0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        o0.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    public static boolean a(View view) {
        return !(view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getBackground() != null && view.getBackground().getAlpha() > 127 && view.getAlpha() > 0.5f;
    }
}

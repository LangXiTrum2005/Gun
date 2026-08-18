package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MBAlertDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Button f2412a;
    private Button b;
    private TextView c;
    private com.mbridge.msdk.widget.dialog.b d;
    private TextView e;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f2413a;

        public a(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f2413a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f2413a;
            if (bVar != null) {
                bVar.b();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f2414a;

        public b(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f2414a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f2414a;
            if (bVar != null) {
                bVar.a();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    public MBAlertDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(g0.a(context, "mbridge_cm_alertview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.e = (TextView) viewInflate.findViewById(g0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                o0.a("MBAlertDialog", e.getMessage());
            }
            try {
                this.c = (TextView) viewInflate.findViewById(g0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.b = (Button) viewInflate.findViewById(g0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f2412a = (Button) viewInflate.findViewById(g0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                o0.a("MBAlertDialog", e2.getMessage());
            }
        }
        Button button = this.f2412a;
        if (button != null) {
            button.setOnClickListener(new a(bVar));
        }
        Button button2 = this.b;
        if (button2 != null) {
            button2.setOnClickListener(new b(bVar));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void a(int i) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle(i == com.mbridge.msdk.foundation.same.a.H ? "Confirm" : "Tips");
            setContent(i == com.mbridge.msdk.foundation.same.a.H ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
            setConfirmText(i == com.mbridge.msdk.foundation.same.a.H ? "Close" : "Cancel");
            setCancelText("Continue");
            return;
        }
        setTitle(i == com.mbridge.msdk.foundation.same.a.H ? "确认关闭？" : "提示");
        setContent(i == com.mbridge.msdk.foundation.same.a.H ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
        setConfirmText(i == com.mbridge.msdk.foundation.same.a.H ? "确认关闭" : "取消");
        setCancelText("继续");
    }

    private void b() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续观看");
    }

    public void clear() {
        if (this.d != null) {
            this.d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(4098);
            c1.a(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void makeDownloadAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.a(this, str);
    }

    public void makeIVAlertView(int i, String str) {
        try {
            String string = w0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = w0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = w0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = w0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                a(i);
            } else {
                a(string, string2, string3, string4);
            }
        } catch (Exception e) {
            o0.a("MBAlertDialog", e.getMessage());
        }
    }

    public void makeInsAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.b(this, str);
    }

    public void makePlayableAlertView() {
        g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF != null) {
            a(gVarF.s(), gVarF.q(), gVarF.r(), gVarF.o());
        } else {
            a();
        }
    }

    public void makeRVAlertView(String str) {
        try {
            String string = w0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = w0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = w0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = w0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarD = h.b().d(c.n().b());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    a(gVarD.s(), gVarD.q(), gVarD.r(), gVarD.p());
                    return;
                } else {
                    b();
                    return;
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (gVarD != null) {
                    string = gVarD.s();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (gVarD != null) {
                    string2 = gVarD.q();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    string4 = gVarD.r();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (gVarD != null) {
                    string3 = gVarD.p();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            a(string, string2, string4, string3);
        } catch (Exception e) {
            o0.a("MBAlertDialog", e.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f2412a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            o0.b("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    private void a() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }
}

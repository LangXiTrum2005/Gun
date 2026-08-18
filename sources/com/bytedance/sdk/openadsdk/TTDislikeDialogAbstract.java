package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.lk.nBu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements nBu.LD {
    private String JXs;
    protected List<FilterWord> LD;
    protected String Lxb;
    private View ZU;
    protected final nBu lk;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        nBu nbu = new nBu();
        this.lk = nbu;
        nbu.Lxb(this);
    }

    public void destroy() {
        nBu nbu = this.lk;
        if (nbu != null) {
            nbu.Lxb();
        }
    }

    public nBu getDislikeManager() {
        return this.lk;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.ZU = layoutView;
        if (layoutView == null) {
            sLN.LD("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.ZU;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        nBu nbu = this.lk;
        if (nbu != null) {
            nbu.lk(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.Lxb = str;
        this.LD = list;
        this.lk.Lxb(str);
        this.lk.Lxb(this.LD);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i, String str) {
        super(context, i);
        this.JXs = str;
        nBu nbu = new nBu();
        this.lk = nbu;
        nbu.Lxb(this);
    }
}

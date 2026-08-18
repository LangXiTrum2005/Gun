package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FilterWord {
    private String LD;
    private String Lxb;
    private List<FilterWord> ZU;
    private boolean lk;

    public FilterWord(String str, String str2) {
        this.Lxb = str;
        this.LD = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.ZU == null) {
            this.ZU = new ArrayList();
        }
        this.ZU.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.Lxb;
    }

    public boolean getIsSelected() {
        return this.lk;
    }

    public String getName() {
        return this.LD;
    }

    public List<FilterWord> getOptions() {
        return this.ZU;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.ZU;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.Lxb) || TextUtils.isEmpty(this.LD)) ? false : true;
    }

    public void setId(String str) {
        this.Lxb = str;
    }

    public void setIsSelected(boolean z) {
        this.lk = z;
    }

    public void setName(String str) {
        this.LD = str;
    }

    public FilterWord() {
    }
}

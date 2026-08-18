package com.google.ads.mediation.pangle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class PangleExtras {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f769a;

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString("user_data", this.f769a);
            return bundle;
        }

        public Builder setUserData(String str) {
            this.f769a = str;
            return this;
        }
    }
}

package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MintegralExtras {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f755a;

        @NonNull
        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("mute_audio", this.f755a);
            return bundle;
        }

        @NonNull
        public Builder setMuteAudio(boolean z) {
            this.f755a = z;
            return this;
        }
    }
}

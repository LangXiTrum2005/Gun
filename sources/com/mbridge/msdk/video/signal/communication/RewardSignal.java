package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.t0;

/* JADX INFO: loaded from: classes2.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {
    public static final /* synthetic */ int i = 0;
    private Handler h = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2278a;
        final /* synthetic */ String b;

        public a(Object obj, String str) {
            this.f2278a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f2278a, this.b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2279a;
        final /* synthetic */ String b;

        public b(Object obj, String str) {
            this.f2279a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f2279a, this.b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2280a;
        final /* synthetic */ String b;

        public c(Object obj, String str) {
            this.f2280a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f2280a, this.b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2281a;
        final /* synthetic */ String b;

        public d(Object obj, String str) {
            this.f2281a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f2281a, this.b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2282a;
        final /* synthetic */ String b;

        public e(Object obj, String str) {
            this.f2282a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f2282a, this.b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2283a;
        final /* synthetic */ String b;

        public f(Object obj, String str) {
            this.f2283a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f2283a, this.b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2284a;
        final /* synthetic */ String b;

        public g(Object obj, String str) {
            this.f2284a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f2284a, this.b);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2285a;
        final /* synthetic */ String b;

        public h(Object obj, String str) {
            this.f2285a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f2285a, this.b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (t0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (t0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (t0.h()) {
            super.install(obj, str);
        } else {
            this.h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (t0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (t0.h()) {
            super.openURL(obj, str);
        } else {
            this.h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (t0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (t0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (t0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.h.post(new e(obj, str));
        }
    }
}

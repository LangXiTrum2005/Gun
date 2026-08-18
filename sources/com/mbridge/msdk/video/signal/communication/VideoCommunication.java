package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class VideoCommunication extends BaseVideoCommunication {
    public static final /* synthetic */ int j = 0;
    private Handler i = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2286a;
        final /* synthetic */ String b;

        public a(Object obj, String str) {
            this.f2286a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f2286a, this.b);
        }
    }

    public class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2287a;
        final /* synthetic */ String b;

        public a0(Object obj, String str) {
            this.f2287a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewRect(this.f2287a, this.b);
        }
    }

    public class a1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2288a;
        final /* synthetic */ String b;

        public a1(Object obj, String str) {
            this.f2288a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUpdateFrame(this.f2288a, this.b);
        }
    }

    public class a2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2289a;
        final /* synthetic */ String b;

        public a2(Object obj, String str) {
            this.f2289a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f2289a, this.b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2290a;
        final /* synthetic */ String b;

        public b(Object obj, String str) {
            this.f2290a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f2290a, this.b);
        }
    }

    public class b0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2291a;
        final /* synthetic */ String b;

        public b0(Object obj, String str) {
            this.f2291a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeFromSuperView(this.f2291a, this.b);
        }
    }

    public class b1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2292a;
        final /* synthetic */ String b;

        public b1(Object obj, String str) {
            this.f2292a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerMute(this.f2292a, this.b);
        }
    }

    public class b2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2293a;
        final /* synthetic */ String b;

        public b2(Object obj, String str) {
            this.f2293a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f2293a, this.b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2294a;
        final /* synthetic */ String b;

        public c(Object obj, String str) {
            this.f2294a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f2294a, this.b);
        }
    }

    public class c0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2295a;
        final /* synthetic */ String b;

        public c0(Object obj, String str) {
            this.f2295a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendSubView(this.f2295a, this.b);
        }
    }

    public class c1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2296a;
        final /* synthetic */ String b;

        public c1(Object obj, String str) {
            this.f2296a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f2296a, this.b);
        }
    }

    public class c2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2297a;
        final /* synthetic */ String b;

        public c2(Object obj, String str) {
            this.f2297a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f2297a, this.b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2298a;
        final /* synthetic */ String b;

        public d(Object obj, String str) {
            this.f2298a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f2298a, this.b);
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2299a;
        final /* synthetic */ String b;

        public d0(Object obj, String str) {
            this.f2299a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendViewTo(this.f2299a, this.b);
        }
    }

    public class d1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2300a;
        final /* synthetic */ String b;

        public d1(Object obj, String str) {
            this.f2300a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUnmute(this.f2300a, this.b);
        }
    }

    public class d2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2301a;
        final /* synthetic */ String b;

        public d2(Object obj, String str) {
            this.f2301a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f2301a, this.b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2302a;
        final /* synthetic */ String b;

        public e(Object obj, String str) {
            this.f2302a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f2302a, this.b);
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2303a;
        final /* synthetic */ String b;

        public e0(Object obj, String str) {
            this.f2303a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendSubView(this.f2303a, this.b);
        }
    }

    public class e1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2304a;
        final /* synthetic */ String b;

        public e1(Object obj, String str) {
            this.f2304a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerGetMuteState(this.f2304a, this.b);
        }
    }

    public class e2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2305a;
        final /* synthetic */ String b;

        public e2(Object obj, String str) {
            this.f2305a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f2305a, this.b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2306a;
        final /* synthetic */ String b;

        public f(Object obj, String str) {
            this.f2306a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f2306a, this.b);
        }
    }

    public class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2307a;
        final /* synthetic */ String b;

        public f0(Object obj, String str) {
            this.f2307a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendViewTo(this.f2307a, this.b);
        }
    }

    public class f1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2308a;
        final /* synthetic */ String b;

        public f1(Object obj, String str) {
            this.f2308a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetSource(this.f2308a, this.b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2309a;
        final /* synthetic */ String b;

        public g(Object obj, String str) {
            this.f2309a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f2309a, this.b);
        }
    }

    public class g0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2310a;
        final /* synthetic */ String b;

        public g0(Object obj, String str) {
            this.f2310a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f2310a, this.b);
        }
    }

    public class g1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2311a;
        final /* synthetic */ String b;

        public g1(Object obj, String str) {
            this.f2311a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetRenderType(this.f2311a, this.b);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2312a;
        final /* synthetic */ String b;

        public h(Object obj, String str) {
            this.f2312a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f2312a, this.b);
        }
    }

    public class h0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2313a;
        final /* synthetic */ String b;

        public h0(Object obj, String str) {
            this.f2313a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.bringViewToFront(this.f2313a, this.b);
        }
    }

    public class h1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2314a;
        final /* synthetic */ String b;

        public h1(Object obj, String str) {
            this.f2314a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f2314a, this.b);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2315a;
        final /* synthetic */ String b;

        public i(Object obj, String str) {
            this.f2315a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f2315a, this.b);
        }
    }

    public class i0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2316a;
        final /* synthetic */ String b;

        public i0(Object obj, String str) {
            this.f2316a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.hideView(this.f2316a, this.b);
        }
    }

    public class i1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2317a;
        final /* synthetic */ String b;

        public i1(Object obj, String str) {
            this.f2317a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeAd(this.f2317a, this.b);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2318a;
        final /* synthetic */ String b;

        public j(Object obj, String str) {
            this.f2318a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f2318a, this.b);
        }
    }

    public class j0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2319a;
        final /* synthetic */ String b;

        public j0(Object obj, String str) {
            this.f2319a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showView(this.f2319a, this.b);
        }
    }

    public class j1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2320a;
        final /* synthetic */ String b;

        public j1(Object obj, String str) {
            this.f2320a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.broadcast(this.f2320a, this.b);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2321a;
        final /* synthetic */ String b;

        public k(Object obj, String str) {
            this.f2321a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f2321a, this.b);
        }
    }

    public class k0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2322a;
        final /* synthetic */ String b;

        public k0(Object obj, String str) {
            this.f2322a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewBgColor(this.f2322a, this.b);
        }
    }

    public class k1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2323a;
        final /* synthetic */ String b;

        public k1(Object obj, String str) {
            this.f2323a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f2323a, this.b);
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2324a;
        final /* synthetic */ String b;

        public l(Object obj, String str) {
            this.f2324a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f2324a, this.b);
        }
    }

    public class l0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2325a;
        final /* synthetic */ String b;

        public l0(Object obj, String str) {
            this.f2325a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewAlpha(this.f2325a, this.b);
        }
    }

    public class l1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2326a;
        final /* synthetic */ String b;

        public l1(Object obj, String str) {
            this.f2326a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f2326a, this.b);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2327a;
        final /* synthetic */ String b;

        public m(Object obj, String str) {
            this.f2327a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f2327a, this.b);
        }
    }

    public class m0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2328a;
        final /* synthetic */ String b;

        public m0(Object obj, String str) {
            this.f2328a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewScale(this.f2328a, this.b);
        }
    }

    public class m1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2329a;
        final /* synthetic */ String b;

        public m1(Object obj, String str) {
            this.f2329a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewFireEvent(this.f2329a, this.b);
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2330a;
        final /* synthetic */ String b;

        public n(Object obj, String str) {
            this.f2330a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f2330a, this.b);
        }
    }

    public class n0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2331a;
        final /* synthetic */ String b;

        public n0(Object obj, String str) {
            this.f2331a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewAbove(this.f2331a, this.b);
        }
    }

    public class n1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2332a;
        final /* synthetic */ String b;

        public n1(Object obj, String str) {
            this.f2332a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f2332a, this.b);
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2333a;
        final /* synthetic */ String b;

        public o(Object obj, String str) {
            this.f2333a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f2333a, this.b);
        }
    }

    public class o0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2334a;
        final /* synthetic */ String b;

        public o0(Object obj, String str) {
            this.f2334a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewBelow(this.f2334a, this.b);
        }
    }

    public class o1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2335a;
        final /* synthetic */ String b;

        public o1(Object obj, String str) {
            this.f2335a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.increaseOfferFrequence(this.f2335a, this.b);
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2336a;
        final /* synthetic */ String b;

        public p(Object obj, String str) {
            this.f2336a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getFileInfo(this.f2336a, this.b);
        }
    }

    public class p0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2337a;
        final /* synthetic */ String b;

        public p0(Object obj, String str) {
            this.f2337a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewAbove(this.f2337a, this.b);
        }
    }

    public class p1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2338a;
        final /* synthetic */ String b;

        public p1(Object obj, String str) {
            this.f2338a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handleNativeObject(this.f2338a, this.b);
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2339a;
        final /* synthetic */ String b;

        public q(Object obj, String str) {
            this.f2339a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f2339a, this.b);
        }
    }

    public class q0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2340a;
        final /* synthetic */ String b;

        public q0(Object obj, String str) {
            this.f2340a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewBelow(this.f2340a, this.b);
        }
    }

    public class q1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2341a;
        final /* synthetic */ String b;

        public q1(Object obj, String str) {
            this.f2341a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadingResourceStatus(this.f2341a, this.b);
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2342a;
        final /* synthetic */ String b;

        public r(Object obj, String str) {
            this.f2342a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f2342a, this.b);
        }
    }

    public class r0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2343a;
        final /* synthetic */ String b;

        public r0(Object obj, String str) {
            this.f2343a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f2343a, this.b);
        }
    }

    public class r1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2344a;
        final /* synthetic */ String b;

        public r1(Object obj, String str) {
            this.f2344a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createNativeEC(this.f2344a, this.b);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2345a;
        final /* synthetic */ String b;

        public s(Object obj, String str) {
            this.f2345a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f2345a, this.b);
        }
    }

    public class s0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2346a;
        final /* synthetic */ String b;

        public s0(Object obj, String str) {
            this.f2346a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewLoad(this.f2346a, this.b);
        }
    }

    public class s1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2347a;
        final /* synthetic */ String b;

        public s1(Object obj, String str) {
            this.f2347a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f2347a, this.b);
        }
    }

    public class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2348a;
        final /* synthetic */ String b;

        public t(Object obj, String str) {
            this.f2348a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createWebview(this.f2348a, this.b);
        }
    }

    public class t0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2349a;
        final /* synthetic */ String b;

        public t0(Object obj, String str) {
            this.f2349a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewReload(this.f2349a, this.b);
        }
    }

    public class t1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2350a;
        final /* synthetic */ String b;

        public t1(Object obj, String str) {
            this.f2350a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f2350a, this.b);
        }
    }

    public class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2351a;
        final /* synthetic */ String b;

        public u(Object obj, String str) {
            this.f2351a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createView(this.f2351a, this.b);
        }
    }

    public class u0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2352a;
        final /* synthetic */ String b;

        public u0(Object obj, String str) {
            this.f2352a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoBack(this.f2352a, this.b);
        }
    }

    public class u1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2353a;
        final /* synthetic */ String b;

        public u1(Object obj, String str) {
            this.f2353a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f2353a, this.b);
        }
    }

    public class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2354a;
        final /* synthetic */ String b;

        public v(Object obj, String str) {
            this.f2354a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f2354a, this.b);
        }
    }

    public class v0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2355a;
        final /* synthetic */ String b;

        public v0(Object obj, String str) {
            this.f2355a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoForward(this.f2355a, this.b);
        }
    }

    public class v1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2356a;
        final /* synthetic */ String b;

        public v1(Object obj, String str) {
            this.f2356a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f2356a, this.b);
        }
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2357a;
        final /* synthetic */ String b;

        public w(Object obj, String str) {
            this.f2357a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createPlayerView(this.f2357a, this.b);
        }
    }

    public class w0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2358a;
        final /* synthetic */ String b;

        public w0(Object obj, String str) {
            this.f2358a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPlay(this.f2358a, this.b);
        }
    }

    public class w1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2359a;
        final /* synthetic */ String b;

        public w1(Object obj, String str) {
            this.f2359a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f2359a, this.b);
        }
    }

    public class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2360a;
        final /* synthetic */ String b;

        public x(Object obj, String str) {
            this.f2360a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createSubPlayTemplateView(this.f2360a, this.b);
        }
    }

    public class x0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2361a;
        final /* synthetic */ String b;

        public x0(Object obj, String str) {
            this.f2361a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPause(this.f2361a, this.b);
        }
    }

    public class x1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2362a;
        final /* synthetic */ String b;

        public x1(Object obj, String str) {
            this.f2362a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f2362a, this.b);
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2363a;
        final /* synthetic */ String b;

        public y(Object obj, String str) {
            this.f2363a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.destroyComponent(this.f2363a, this.b);
        }
    }

    public class y0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2364a;
        final /* synthetic */ String b;

        public y0(Object obj, String str) {
            this.f2364a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerResume(this.f2364a, this.b);
        }
    }

    public class y1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2365a;
        final /* synthetic */ String b;

        public y1(Object obj, String str) {
            this.f2365a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f2365a, this.b);
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2366a;
        final /* synthetic */ String b;

        public z(Object obj, String str) {
            this.f2366a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getComponentOptions(this.f2366a, this.b);
        }
    }

    public class z0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2367a;
        final /* synthetic */ String b;

        public z0(Object obj, String str) {
            this.f2367a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerStop(this.f2367a, this.b);
        }
    }

    public class z1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2368a;
        final /* synthetic */ String b;

        public z1(Object obj, String str) {
            this.f2368a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f2368a, this.b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.broadcast(obj, str);
        } else {
            this.i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.click(obj, str);
        } else {
            this.i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.closeAd(obj, str);
        } else {
            this.i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.i.post(new n(obj, str));
        com.mbridge.msdk.foundation.tools.o0.b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.createView(obj, str);
        } else {
            this.i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.createWebview(obj, str);
        } else {
            this.i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getCutout(obj, str);
        } else {
            this.i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.hideView(obj, str);
        } else {
            this.i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.init(obj, str);
        } else {
            this.i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.loadads(obj, str);
        } else {
            this.i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.openURL(obj, str);
        } else {
            this.i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerMute(obj, str);
        } else {
            this.i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerPause(obj, str);
        } else {
            this.i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerResume(obj, str);
        } else {
            this.i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerStop(obj, str);
        } else {
            this.i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.o0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.showView(obj, str);
        } else {
            this.i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.statistics(obj, str);
        } else {
            this.i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.t0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.i.post(new t0(obj, str));
        }
    }
}

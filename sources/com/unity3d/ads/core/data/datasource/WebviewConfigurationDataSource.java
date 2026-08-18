package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2402Ev;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;

/* JADX INFO: loaded from: classes4.dex */
public final class WebviewConfigurationDataSource {
    private final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3655hx {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(3, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, Throwable th, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC2857Wj);
            anonymousClass2.L$0 = interfaceC4530rv;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof CorruptionException)) {
                    throw th;
                }
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                AbstractC2995aW.p(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (interfaceC4530rv.emit(defaultInstance, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C21882 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21882(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$data = webViewConfigurationStore;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C21882(this.$data, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21882) create(webViewConfigurationStore, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(DataStore<WebviewConfigurationStore.WebViewConfigurationStore> dataStore) {
        AbstractC2995aW.q(dataStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = dataStore;
    }

    public final Object get(InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC3375el.y(new C2402Ev(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), interfaceC2857Wj);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, InterfaceC2857Wj interfaceC2857Wj) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C21882(webViewConfigurationStore, null), interfaceC2857Wj);
        return objUpdateData == EnumC4602sk.f4993a ? objUpdateData : C5033xf0.f5238a;
    }
}

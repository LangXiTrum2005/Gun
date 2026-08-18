package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
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
public final class UniversalRequestDataSource {
    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {16}, m = "invokeSuspend")
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
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C21862 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21862(String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$key = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            C21862 c21862 = new C21862(this.$key, interfaceC2857Wj);
            c21862.L$0 = obj;
            return c21862;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21862) create(universalRequestStore, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            AbstractC2995aW.p(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C21872 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21872(String str, ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            C21872 c21872 = new C21872(this.$key, this.$data, interfaceC2857Wj);
            c21872.L$0 = obj;
            return c21872;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21872) create(universalRequestStore, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            AbstractC2995aW.p(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore) {
        AbstractC2995aW.q(dataStore, "universalRequestStore");
        this.universalRequestStore = dataStore;
    }

    public final Object get(InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC3375el.y(new C2402Ev(this.universalRequestStore.getData(), new AnonymousClass2(null)), interfaceC2857Wj);
    }

    public final Object remove(String str, InterfaceC2857Wj interfaceC2857Wj) {
        Object objUpdateData = this.universalRequestStore.updateData(new C21862(str, null), interfaceC2857Wj);
        return objUpdateData == EnumC4602sk.f4993a ? objUpdateData : C5033xf0.f5238a;
    }

    public final Object set(String str, ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        Object objUpdateData = this.universalRequestStore.updateData(new C21872(str, byteString, null), interfaceC2857Wj);
        return objUpdateData == EnumC4602sk.f4993a ? objUpdateData : C5033xf0.f5238a;
    }
}

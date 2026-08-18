package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
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
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
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
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                ByteString byteString = ByteString.EMPTY;
                AbstractC2995aW.p(byteString, "EMPTY");
                dsl_create.setData(byteString);
                ByteStringStoreOuterClass.ByteStringStore byteStringStore_build = dsl_create._build();
                this.L$0 = null;
                this.label = 1;
                if (interfaceC4530rv.emit(byteStringStore_build, this) == enumC4602sk) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C21842 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21842(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$data = byteString;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            C21842 c21842 = new C21842(this.$data, interfaceC2857Wj);
            c21842.L$0 = obj;
            return c21842;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21842) create(byteStringStore, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            AbstractC2995aW.p(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
            return byteStringStoreBuild;
        }
    }

    public AndroidByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC3375el.y(new C2402Ev(this.dataStore.getData(), new AnonymousClass2(null)), interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        Object objUpdateData = this.dataStore.updateData(new C21842(byteString, null), interfaceC2857Wj);
        return objUpdateData == EnumC4602sk.f4993a ? objUpdateData : C5033xf0.f5238a;
    }
}

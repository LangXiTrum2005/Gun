package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final InterfaceC4514rk scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final StoreMonitor storeMonitor;
    private final TransactionEventRepository transactionEventRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {123}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        Object L$0;
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return TransactionEventManager.this.new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    if (!TransactionEventManager.this.storeMonitor.isInitialized()) {
                        final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                        this.L$0 = transactionEventManager;
                        this.label = 1;
                        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(this));
                        c2798Uc.t();
                        transactionEventManager.storeMonitor.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                            private final void tryResume() {
                                if (c2798Uc.isActive()) {
                                    c2798Uc.resumeWith(C5033xf0.f5238a);
                                }
                            }

                            private final void tryResumeWithException(Exception exc) {
                                if (c2798Uc.isActive()) {
                                    c2798Uc.resumeWith(AbstractC3375el.v(exc));
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingServiceDisconnected() {
                                tryResumeWithException(new TransactionException("Billing service disconnected"));
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
                                AbstractC2995aW.q(billingResultBridge, "billingResult");
                                if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                                    tryResumeWithException(new TransactionException("Billing setup failed"));
                                } else {
                                    tryResume();
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                            public void onIsAlreadyInitialized() {
                                tryResume();
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                            public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
                                AbstractC2995aW.q(billingResultBridge, "billingResult");
                                transactionEventManager.onPurchasesReceived(billingResultBridge, list);
                            }
                        });
                        if (c2798Uc.s() == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    return C5033xf0.f5238a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                StoreMonitor storeMonitor = TransactionEventManager.this.storeMonitor;
                final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                storeMonitor.getPurchases(42, TransactionEventManager.INAPP, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.access$onPurchasesReceived(transactionEventManager2, billingResultBridge, list);
                    }
                });
            } catch (Exception unused) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, 30, null);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {92, 109, 112}, m = "invokeSuspend")
    public static final class C21951 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21951(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3$lambda$2(List list, int i, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge, BillingResultBridge billingResultBridge, List list3) throws IllegalAccessException, InvocationTargetException {
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (list3 == null || billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                ((C2854Wg) ((InterfaceC2828Vg) list.get(i))).S(c5033xf0);
                return;
            }
            List list4 = list3;
            ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list4));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(transactionEventManager.getTransactionData.invoke(purchaseBridge, (SkuDetailsBridge) it.next()));
            }
            list2.addAll(arrayList);
            ((C2854Wg) ((InterfaceC2828Vg) list.get(i))).S(c5033xf0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C21951(this.$purchases, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21951) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x009e  */
        /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:24:0x00da A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00db  */
        /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:29:0x0128  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00db -> B:12:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 496
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C21951.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventManager(InterfaceC4514rk interfaceC4514rk, StoreMonitor storeMonitor, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource byteStringDataSource, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        AbstractC2995aW.q(storeMonitor, "storeMonitor");
        AbstractC2995aW.q(getTransactionData, "getTransactionData");
        AbstractC2995aW.q(getTransactionRequest, "getTransactionRequest");
        AbstractC2995aW.q(transactionEventRepository, "transactionEventRepository");
        AbstractC2995aW.q(byteStringDataSource, "iapTransactionStore");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = interfaceC4514rk;
        this.storeMonitor = storeMonitor;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = byteStringDataSource;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ void access$onPurchasesReceived(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        List<? extends PurchaseBridge> list2;
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK || (list2 = list) == null || list2.isEmpty()) {
            return;
        }
        WD.D(this.scope, null, 0, new C21951(list, this, null), 3);
    }

    public final void invoke() {
        WD.D(this.scope, null, 0, new AnonymousClass1(null), 3);
    }
}

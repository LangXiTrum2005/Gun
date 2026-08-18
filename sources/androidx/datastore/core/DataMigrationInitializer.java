package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            C3086bY c3086bY;
            Iterator<T> it;
            Throwable th;
            InterfaceC2766Sw interfaceC2766Sw;
            if (interfaceC2857Wj instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) interfaceC2857Wj;
                int i = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, interfaceC2857Wj);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, interfaceC2857Wj);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    AbstractC3375el.b0(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                    c3086bY = (C3086bY) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    try {
                        AbstractC3375el.b0(obj);
                    } catch (Throwable th2) {
                        Object obj2 = c3086bY.f4172a;
                        if (obj2 == null) {
                            c3086bY.f4172a = th2;
                        } else {
                            AbstractC2995aW.n(obj2);
                            AbstractC2995aW.h((Throwable) c3086bY.f4172a, th2);
                        }
                    }
                }
                while (it.hasNext()) {
                    interfaceC2766Sw = (InterfaceC2766Sw) it.next();
                    dataMigrationInitializer$Companion$runMigrations$1.L$0 = c3086bY;
                    dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                    dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                    if (interfaceC2766Sw.invoke(dataMigrationInitializer$Companion$runMigrations$1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                th = (Throwable) c3086bY.f4172a;
                if (th == null) {
                    return C5033xf0.f5238a;
                }
                throw th;
            }
            AbstractC3375el.b0(obj);
            ArrayList arrayList = new ArrayList();
            DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
            dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
            dataMigrationInitializer$Companion$runMigrations$1.label = 1;
            if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == enumC4602sk) {
                return enumC4602sk;
            }
            list2 = arrayList;
            c3086bY = new C3086bY();
            it = list2.iterator();
            while (it.hasNext()) {
                interfaceC2766Sw = (InterfaceC2766Sw) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = c3086bY;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (interfaceC2766Sw.invoke(dataMigrationInitializer$Companion$runMigrations$1) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            th = (Throwable) c3086bY.f4172a;
            if (th == null) {
                return C5033xf0.f5238a;
            }
            throw th;
        }

        public final <T> InterfaceC3567gx getInitializer(List<? extends DataMigration<T>> list) {
            AbstractC2995aW.q(list, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(list, null);
        }
    }
}

package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final InterfaceC3655hx migrate;
    private final String name;
    private final InterfaceC3069bH sharedPrefs$delegate;
    private final InterfaceC3567gx shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(T t, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(t, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(T t, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(t, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass3(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass3(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(T t, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(t, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    public static final class AnonymousClass4 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            AbstractC2995aW.p(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @RequiresApi(24)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final boolean deleteSharedPreferences(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", l = {Input.Keys.NUMPAD_3}, m = "shouldMigrate")
    public static final class C03261 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03261(SharedPreferencesMigration<T> sharedPreferencesMigration, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, InterfaceC3655hx interfaceC3655hx) {
        this(context, str, null, null, interfaceC3655hx, 12, null);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, "sharedPreferencesName");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            if (!Api24Impl.deleteSharedPreferences(context, str)) {
                throw new IOException(AbstractC2995aW.v0(str, "Unable to delete SharedPreferences: "));
            }
        } else {
            File sharedPrefsFile = getSharedPrefsFile(context, str);
            File sharedPrefsBackup = getSharedPrefsBackup(sharedPrefsFile);
            sharedPrefsFile.delete();
            sharedPrefsBackup.delete();
        }
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(AbstractC2995aW.v0(".bak", file.getPath()));
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), AbstractC2995aW.v0(".xml", str));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        C5033xf0 c5033xf0;
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        C5033xf0 c5033xf1 = C5033xf0.f5238a;
        if (set2 == null) {
            c5033xf0 = null;
        } else {
            set2.clear();
            c5033xf0 = c5033xf1;
        }
        return c5033xf0 == EnumC4602sk.f4993a ? c5033xf0 : c5033xf1;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, InterfaceC2857Wj interfaceC2857Wj) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(T t, InterfaceC2857Wj interfaceC2857Wj) {
        C03261 c03261;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (interfaceC2857Wj instanceof C03261) {
            c03261 = (C03261) interfaceC2857Wj;
            int i = c03261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03261.label = i - Integer.MIN_VALUE;
            } else {
                c03261 = new C03261(this, interfaceC2857Wj);
            }
        } else {
            c03261 = new C03261(this, interfaceC2857Wj);
        }
        Object objInvoke = c03261.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03261.label;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            InterfaceC3567gx interfaceC3567gx = this.shouldRunMigration;
            c03261.L$0 = this;
            c03261.label = 1;
            objInvoke = interfaceC3567gx.invoke(t, c03261);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (SharedPreferencesMigration) c03261.L$0;
            AbstractC3375el.b0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            Map<String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
            AbstractC2995aW.p(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPrefs.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx) {
        this(new AnonymousClass4(context, str), set, interfaceC3567gx, interfaceC3655hx, context, str);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, "sharedPreferencesName");
        AbstractC2995aW.q(set, "keysToMigrate");
        AbstractC2995aW.q(interfaceC3567gx, "shouldRunMigration");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx, int i, AbstractC2471Hm abstractC2471Hm) {
        this(context, str, (i & 4) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new AnonymousClass3(null) : interfaceC3567gx, interfaceC3655hx);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, InterfaceC3655hx interfaceC3655hx) {
        this(context, str, set, null, interfaceC3655hx, 8, null);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, "sharedPreferencesName");
        AbstractC2995aW.q(set, "keysToMigrate");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, InterfaceC3655hx interfaceC3655hx) {
        this(interfaceC2714Qw, (Set) null, (InterfaceC3567gx) null, interfaceC3655hx, 6, (AbstractC2471Hm) null);
        AbstractC2995aW.q(interfaceC2714Qw, "produceSharedPreferences");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, Set<String> set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx) {
        this(interfaceC2714Qw, set, interfaceC3567gx, interfaceC3655hx, (Context) null, (String) null);
        AbstractC2995aW.q(interfaceC2714Qw, "produceSharedPreferences");
        AbstractC2995aW.q(set, "keysToMigrate");
        AbstractC2995aW.q(interfaceC3567gx, "shouldRunMigration");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, Set set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx, int i, AbstractC2471Hm abstractC2471Hm) {
        this(interfaceC2714Qw, (Set<String>) ((i & 2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new AnonymousClass2(null) : interfaceC3567gx, interfaceC3655hx);
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, Set set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx, Context context, String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this(interfaceC2714Qw, (Set<String>) set, (i & 4) != 0 ? new AnonymousClass1(null) : interfaceC3567gx, interfaceC3655hx, context, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, Set<String> set, InterfaceC3655hx interfaceC3655hx) {
        this(interfaceC2714Qw, set, (InterfaceC3567gx) null, interfaceC3655hx, 4, (AbstractC2471Hm) null);
        AbstractC2995aW.q(interfaceC2714Qw, "produceSharedPreferences");
        AbstractC2995aW.q(set, "keysToMigrate");
        AbstractC2995aW.q(interfaceC3655hx, "migrate");
    }

    private SharedPreferencesMigration(InterfaceC2714Qw interfaceC2714Qw, Set<String> set, InterfaceC3567gx interfaceC3567gx, InterfaceC3655hx interfaceC3655hx, Context context, String str) {
        this.shouldRunMigration = interfaceC3567gx;
        this.migrate = interfaceC3655hx;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = AbstractC2340Cl.I(interfaceC2714Qw);
        this.keySet = set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() ? null : AbstractC2853Wf.w0(set);
    }
}

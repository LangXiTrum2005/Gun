package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5163z50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandle {
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, InterfaceC4309pQ> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    AbstractC2995aW.p(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                AbstractC2995aW.n(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        AbstractC2995aW.q(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        final int i = 1;
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X20
            public final /* synthetic */ SavedStateHandle b;

            {
                this.b = this;
            }

            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                int i2 = i;
                SavedStateHandle savedStateHandle = this.b;
                switch (i2) {
                    case 0:
                        break;
                }
                return SavedStateHandle.savedStateProvider$lambda$0(savedStateHandle);
            }
        };
        linkedHashMap.putAll(map);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(savedStateHandle, "this$0");
        Map<String, SavedStateRegistry.SavedStateProvider> map = savedStateHandle.savedStateProviders;
        AbstractC2995aW.q(map, "<this>");
        int size = map.size();
        Map linkedHashMap = size != 0 ? size != 1 ? new LinkedHashMap(map) : AbstractC3375el.c0(map) : C2838Vq.f3896a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> setKeySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(savedStateHandle.regular.get(str));
        }
        return BundleKt.bundleOf(new C4839vT(KEYS, arrayList), new C4839vT(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(String str) {
        AbstractC2995aW.q(str, "key");
        this.savedStateProviders.remove(str);
    }

    @MainThread
    public final boolean contains(String str) {
        AbstractC2995aW.q(str, "key");
        return this.regular.containsKey(str);
    }

    @MainThread
    public final <T> T get(String str) {
        AbstractC2995aW.q(str, "key");
        try {
            return (T) this.regular.get(str);
        } catch (ClassCastException unused) {
            remove(str);
            return null;
        }
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str) {
        AbstractC2995aW.q(str, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(str, false, null);
        AbstractC2995aW.o(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> InterfaceC4731u90 getStateFlow(String str, T t) {
        AbstractC2995aW.q(str, "key");
        Map<String, InterfaceC4309pQ> map = this.flows;
        InterfaceC4309pQ interfaceC4309pQA = map.get(str);
        if (interfaceC4309pQA == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            interfaceC4309pQA = AbstractC4995x90.a(this.regular.get(str));
            this.flows.put(str, interfaceC4309pQA);
            map.put(str, interfaceC4309pQA);
        }
        return new CX(interfaceC4309pQA);
    }

    @MainThread
    public final Set<String> keys() {
        return AbstractC5163z50.G0(AbstractC5163z50.G0(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String str) {
        AbstractC2995aW.q(str, "key");
        T t = (T) this.regular.remove(str);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(str);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        this.flows.remove(str);
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String str, T t) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(str, "key");
        if (!Companion.validateValue(t)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            AbstractC2995aW.n(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t);
        } else {
            this.regular.put(str, t);
        }
        InterfaceC4309pQ interfaceC4309pQ = this.flows.get(str);
        if (interfaceC4309pQ == null) {
            return;
        }
        ((C4907w90) interfaceC4309pQ).i(t);
    }

    @MainThread
    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(savedStateProvider, f.M);
        this.savedStateProviders.put(str, savedStateProvider);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        AbstractC2995aW.q(str, "key");
        return getLiveDataInternal(str, true, t);
    }

    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            AbstractC2995aW.q(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) throws IllegalAccessException, InvocationTargetException {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                InterfaceC4309pQ interfaceC4309pQ = (InterfaceC4309pQ) savedStateHandle.flows.get(this.key);
                if (interfaceC4309pQ != null) {
                    ((C4907w90) interfaceC4309pQ).i(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            AbstractC2995aW.q(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        final int i = 0;
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X20
            public final /* synthetic */ SavedStateHandle b;

            {
                this.b = this;
            }

            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                int i2 = i;
                SavedStateHandle savedStateHandle = this.b;
                switch (i2) {
                    case 0:
                        break;
                }
                return SavedStateHandle.savedStateProvider$lambda$0(savedStateHandle);
            }
        };
    }
}

package androidx.datastore.migrations;

import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences sharedPreferences, Set<String> set) {
        AbstractC2995aW.q(sharedPreferences, "prefs");
        this.prefs = sharedPreferences;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(AbstractC2995aW.v0(str, "Can't access key outside migration: ").toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String str) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.contains(checkKey(str));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        AbstractC2995aW.p(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null || set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC3375el.N(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC2853Wf.x0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String str, boolean z) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.getBoolean(checkKey(str), z);
    }

    public final float getFloat(String str, float f) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.getFloat(checkKey(str), f);
    }

    public final int getInt(String str, int i) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.getInt(checkKey(str), i);
    }

    public final long getLong(String str, long j) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.getLong(checkKey(str), j);
    }

    public final String getString(String str, String str2) {
        AbstractC2995aW.q(str, "key");
        return this.prefs.getString(checkKey(str), str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        AbstractC2995aW.q(str, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(str), set);
        if (stringSet == null) {
            return null;
        }
        return AbstractC2853Wf.w0(stringSet);
    }
}

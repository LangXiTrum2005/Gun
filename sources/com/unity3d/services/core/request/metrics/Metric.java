package com.unity3d.services.core.request.metrics;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = metric.name;
        }
        if ((i & 2) != 0) {
            obj = metric.value;
        }
        if ((i & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> map) {
        AbstractC2995aW.q(map, "tags");
        return new Metric(str, obj, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return AbstractC2995aW.i(this.name, metric.name) && AbstractC2995aW.i(this.value, metric.value) && AbstractC2995aW.i(this.tags, metric.tags);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return this.tags.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final Map<String, Object> toMap() {
        C2985aM c2985aMW = AbstractC3375el.w();
        String str = this.name;
        if (str != null) {
            c2985aMW.put(METRIC_NAME, str);
        }
        Object obj = this.value;
        if (obj != null) {
            c2985aMW.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            c2985aMW.put("t", this.tags);
        }
        return AbstractC3375el.g(c2985aMW);
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? C2838Vq.f3896a : map);
    }

    public Metric(String str, Object obj, Map<String, String> map) {
        AbstractC2995aW.q(map, "tags");
        this.name = str;
        this.value = obj;
        this.tags = map;
    }
}

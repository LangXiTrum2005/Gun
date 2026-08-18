package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfxq implements Map, Serializable {

    @CheckForNull
    private transient zzfxs zza;

    @CheckForNull
    private transient zzfxs zzb;

    @CheckForNull
    private transient zzfxi zzc;

    public static zzfxq zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzfxp zzfxpVar = new zzfxp(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzfxpVar.zzb(setEntrySet);
        return zzfxpVar.zzc();
    }

    public static zzfxq zzd() {
        return zzfze.zza;
    }

    public static zzfxq zze(Object obj, Object obj2) {
        zzfwk.zzb("dialog_not_shown_reason", obj2);
        return zzfze.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfyk.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfzp.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwk.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfxi zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfxi values() {
        zzfxi zzfxiVar = this.zzc;
        if (zzfxiVar != null) {
            return zzfxiVar;
        }
        zzfxi zzfxiVarZza = zza();
        this.zzc = zzfxiVarZza;
        return zzfxiVarZza;
    }

    public abstract zzfxs zzf();

    public abstract zzfxs zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfxs entrySet() {
        zzfxs zzfxsVar = this.zza;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        zzfxs zzfxsVarZzf = zzf();
        this.zza = zzfxsVarZzf;
        return zzfxsVarZzf;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfxs keySet() {
        zzfxs zzfxsVar = this.zzb;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        zzfxs zzfxsVarZzg = zzg();
        this.zzb = zzfxsVarZzg;
        return zzfxsVarZzg;
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzfwg extends zzfwj implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfwg(Map map) {
        zzfun.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfwg zzfwgVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfwgVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwgVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Collection zzf() {
        return new zzfwi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Iterator zzg() {
        return new zzfvq(this);
    }

    public final List zzh(Object obj, List list, @CheckForNull zzfwd zzfwdVar) {
        return list instanceof RandomAccess ? new zzfvz(this, obj, list, zzfwdVar) : new zzfwf(this, obj, list, zzfwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfvx(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfwa(this, (SortedMap) map) : new zzfvt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfvy(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfwb(this, (SortedMap) map) : new zzfvw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj, com.google.android.gms.internal.ads.zzfyl
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}

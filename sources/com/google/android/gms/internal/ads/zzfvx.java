package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfvx extends zzfwa implements NavigableMap {
    final /* synthetic */ zzfwg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvx(zzfwg zzfwgVar, NavigableMap navigableMap) {
        super(zzfwgVar, navigableMap);
        this.zzc = zzfwgVar;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return zza(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfvx(this.zzc, ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return zza(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return zza(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return zza(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, com.google.android.gms.internal.ads.zzfvt, com.google.android.gms.internal.ads.zzfyj, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return zza(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return zza(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @CheckForNull
    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionZza = this.zzc.zza();
        collectionZza.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfxj(entry.getKey(), this.zzc.zzb(collectionZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzg() {
        return new zzfvy(this.zzc, (NavigableMap) ((SortedMap) ((zzfvt) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfvt) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    /* JADX INFO: renamed from: zzh */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzfvx(this.zzc, ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfvx(this.zzc, ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzfvx(this.zzc, ((NavigableMap) ((SortedMap) ((zzfvt) this).zza)).tailMap(obj, z));
    }
}

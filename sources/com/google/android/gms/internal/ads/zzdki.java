package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdki implements zzdin {

    @Nullable
    private final zzbpt zza;
    private final zzcwl zzb;
    private final zzcvr zzc;
    private final zzddq zzd;
    private final Context zze;
    private final zzfbo zzf;
    private final VersionInfoParcel zzg;
    private final zzfcj zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;

    @Nullable
    private final zzbpp zzl;

    @Nullable
    private final zzbpq zzm;

    public zzdki(@Nullable zzbpp zzbppVar, @Nullable zzbpq zzbpqVar, @Nullable zzbpt zzbptVar, zzcwl zzcwlVar, zzcvr zzcvrVar, zzddq zzddqVar, Context context, zzfbo zzfboVar, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar) {
        this.zzl = zzbppVar;
        this.zzm = zzbpqVar;
        this.zza = zzbptVar;
        this.zzb = zzcwlVar;
        this.zzc = zzcvrVar;
        this.zzd = zzddqVar;
        this.zze = context;
        this.zzf = zzfboVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfcjVar;
    }

    private final void zzb(View view) {
        try {
            zzbpt zzbptVar = this.zza;
            if (zzbptVar != null && !zzbptVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null && !zzbppVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar == null || zzbpqVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                this.zzd.zzdd();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzA(View view, @Nullable Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbpt zzbptVar = this.zza;
            if (zzbptVar != null) {
                zzbptVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null) {
                zzbppVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar != null) {
                zzbpqVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzk(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzl(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzn(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzp(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzL) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzr(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpt zzbptVar = this.zza;
                if (zzbptVar != null && !zzbptVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbpp zzbppVar = this.zzl;
                if (zzbppVar != null && !zzbppVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbpq zzbpqVar = this.zzm;
                if (zzbpqVar == null || zzbpqVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzt(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzu(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzv(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzy(zzbhq zzbhqVar) {
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d1 A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0047, blocks: (B:50:0x00b6, B:51:0x00cb, B:53:0x00d1), top: B:75:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00cb A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzz(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzn;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbF)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbG)).booleanValue() && next.equals("3010")) {
                                zzbpt zzbptVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbptVar != null) {
                                    try {
                                        iObjectWrapperZzn = zzbptVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpp zzbppVar = this.zzl;
                                    if (zzbppVar != null) {
                                        iObjectWrapperZzn = zzbppVar.zzk();
                                    } else {
                                        zzbpq zzbpqVar = this.zzm;
                                        iObjectWrapperZzn = zzbpqVar != null ? zzbpqVar.zzj() : null;
                                    }
                                }
                                if (iObjectWrapperZzn != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzn);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbs.zzc(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbs.zzc(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    classLoader = this.zze.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap mapZzc = zzc(map);
            HashMap mapZzc2 = zzc(map2);
            zzbpt zzbptVar2 = this.zza;
            if (zzbptVar2 != null) {
                zzbptVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                return;
            }
            zzbpp zzbppVar2 = this.zzl;
            if (zzbppVar2 != null) {
                zzbppVar2.zzv(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzl.zzu(iObjectWrapperWrap);
                return;
            }
            zzbpq zzbpqVar2 = this.zzm;
            if (zzbpqVar2 != null) {
                zzbpqVar2.zzt(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzc), ObjectWrapper.wrap(mapZzc2));
                this.zzm.zzs(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call trackView", e);
        }
    }
}

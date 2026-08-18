package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfar implements OnAdMetadataChangedListener, zzcxh, zzcvw, zzcvt, zzcwj, zzcye, zzezc, zzdds {
    private final zzfds zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfar zzi = null;

    public zzfar(zzfds zzfdsVar) {
        this.zza = zzfdsVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.onAdMetadataChanged();
        } else {
            zzeyt.zza(this.zzb, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfaf
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) {
                    ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zza();
            return;
        }
        this.zza.zza();
        zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbws) obj).zzg();
            }
        });
        zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfao
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbwc) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzb();
        } else {
            zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwc) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzc();
            return;
        }
        zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbws) obj).zzj();
            }
        });
        zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbwc) obj).zzj();
            }
        });
        zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbws) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdd();
        } else {
            zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbws) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(final zzbvw zzbvwVar, final String str, final String str2) {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdq(zzbvwVar, str, str2);
            return;
        }
        zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                zzbvw zzbvwVar2 = zzbvwVar;
                ((zzbws) obj).zzk(new zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()));
            }
        });
        zzeyt.zza(this.zzf, new zzeys() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                zzbvw zzbvwVar2 = zzbvwVar;
                ((zzbwx) obj).zze(new zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()), str, str2);
            }
        });
        zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbwc) obj).zze(zzbvwVar);
            }
        });
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbvx) obj).zze(zzbvwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzdz(zzeVar);
            return;
        }
        final int i = zzeVar.zza;
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbww) obj).zzf(zzeVar);
            }
        });
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbww) obj).zze(i);
            }
        });
        zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfam
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((zzbwc) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zze();
        } else {
            zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfaj
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwc) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzf();
        } else {
            zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzezv
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwc) obj).zzl();
                }
            });
        }
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzh(zzuVar);
        } else {
            zzeyt.zza(this.zzh, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfac
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
                }
            });
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzh.set(zzdrVar);
    }

    public final void zzj(zzbws zzbwsVar) {
        this.zzd.set(zzbwsVar);
    }

    public final void zzk(zzbww zzbwwVar) {
        this.zzc.set(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezc
    public final void zzl(zzezc zzezcVar) {
        this.zzi = (zzfar) zzezcVar;
    }

    @Deprecated
    public final void zzm(zzbwc zzbwcVar) {
        this.zze.set(zzbwcVar);
    }

    @Deprecated
    public final void zzn(zzbvx zzbvxVar) {
        this.zzg.set(zzbvxVar);
    }

    public final void zzo(zzbwx zzbwxVar) {
        this.zzf.set(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzq(zzeVar);
        } else {
            zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbws) obj).zzi(zzeVar);
                }
            });
            zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbws) obj).zzh(zzeVar.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzfar zzfarVar = this.zzi;
        if (zzfarVar != null) {
            zzfarVar.zzs();
        } else {
            zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfad
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbww) obj).zzg();
                }
            });
            zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzfae
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((zzbwc) obj).zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpe {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfol zze;
    private boolean zzf;

    public zzfpe(@NonNull Context context, @NonNull int i, @NonNull zzfol zzfolVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfolVar;
        this.zzf = z;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(@NonNull zzaxw zzaxwVar) {
        zzaxx zzaxxVarZzd = zzaxz.zzd();
        zzaxxVarZzd.zze(zzaxwVar.zzc().zzk());
        zzaxxVarZzd.zza(zzaxwVar.zzc().zzj());
        zzaxxVarZzd.zzb(zzaxwVar.zzc().zza());
        zzaxxVarZzd.zzd(zzaxwVar.zzc().zzc());
        zzaxxVarZzd.zzc(zzaxwVar.zzc().zzb());
        return Hex.bytesToStringLowercase(((zzaxz) zzaxxVarZzd.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        this.zze.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zze.zzb(i, j, str);
    }

    @Nullable
    private final zzaxz zzk(int i) {
        String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgwj zzgwjVar = zzgwj.zzb;
            return zzaxz.zzi(zzgwj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.zzf ? zzgxb.zza() : zzgxb.zzb());
        } catch (zzgyg unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzaxw zzaxwVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfoy.zze(new File(zze(zzaxwVar.zzc().zzk()), "pcbc"), zzaxwVar.zzd().zzA())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzf = zzf(zzaxwVar);
                SharedPreferences.Editor editorEdit = this.zzc.edit();
                editorEdit.putString(zzh(), strZzf);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(@NonNull zzaxw zzaxwVar, @Nullable zzfpd zzfpdVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxz zzaxzVarZzk = zzk(1);
                String strZzk = zzaxwVar.zzc().zzk();
                if (zzaxzVarZzk != null && zzaxzVarZzk.zzk().equals(strZzk)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZzk);
                if (fileZze.exists()) {
                    zzj(4023, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? "0" : "1") + ",f:" + (true != fileZze.isFile() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                } else if (!fileZze.mkdirs()) {
                    zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileZze2 = zze(strZzk);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfoy.zze(file, zzaxwVar.zzf().zzA())) {
                    zzi(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!zzfoy.zze(file2, zzaxwVar.zzd().zzA())) {
                    zzi(4017, jCurrentTimeMillis);
                    return false;
                }
                if (zzfpdVar != null && !zzfpdVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfoy.zzd(fileZze2);
                    return false;
                }
                String strZzf = zzf(zzaxwVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor editorEdit = this.zzc.edit();
                editorEdit.putString(zzh(), strZzf);
                if (string != null) {
                    editorEdit.putString(zzg(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaxz zzaxzVarZzk2 = zzk(1);
                if (zzaxzVarZzk2 != null) {
                    hashSet.add(zzaxzVarZzk2.zzk());
                }
                zzaxz zzaxzVarZzk3 = zzk(2);
                if (zzaxzVarZzk3 != null) {
                    hashSet.add(zzaxzVarZzk3.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfoy.zzd(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzfow zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxz zzaxzVarZzk = zzk(1);
                if (zzaxzVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzaxzVarZzk.zzk());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfow(zzaxzVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxz zzaxzVarZzk = zzk(1);
                if (zzaxzVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzaxzVarZzk.zzk());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

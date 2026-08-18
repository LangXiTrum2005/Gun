package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfob {
    private final Context zza;
    private final Executor zzb;
    private final zzfni zzc;
    private final zzfnk zzd;
    private final zzfoa zze;
    private final zzfoa zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    public zzfob(Context context, Executor executor, zzfni zzfniVar, zzfnk zzfnkVar, zzfny zzfnyVar, zzfnz zzfnzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfniVar;
        this.zzd = zzfnkVar;
        this.zze = zzfnyVar;
        this.zzf = zzfnzVar;
    }

    public static zzfob zze(@NonNull Context context, @NonNull Executor executor, @NonNull zzfni zzfniVar, @NonNull zzfnk zzfnkVar) {
        final zzfob zzfobVar = new zzfob(context, executor, zzfniVar, zzfnkVar, new zzfny(), new zzfnz());
        if (zzfobVar.zzd.zzh()) {
            zzfobVar.zzg = zzfobVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzfobVar.zzg = Tasks.forResult(zzfobVar.zze.zza());
        }
        zzfobVar.zzh = zzfobVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzfobVar;
    }

    private static zzasy zzg(@NonNull Task task, @NonNull zzasy zzasyVar) {
        return !task.isSuccessful() ? zzasyVar : (zzasy) task.getResult();
    }

    private final Task zzh(@NonNull Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfnx
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzasy zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzasy zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzasy zzc() throws Exception {
        zzasc zzascVarZza = zzasy.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zzascVarZza.zzs(id);
            zzascVarZza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zzascVarZza.zzab(6);
        }
        return (zzasy) zzascVarZza.zzbr();
    }

    public final /* synthetic */ zzasy zzd() throws Exception {
        Context context = this.zza;
        return zzfnq.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}

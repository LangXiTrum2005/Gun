package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zze {
    private final Executor zza;

    public zze(Executor executor) {
        this.zza = executor;
    }

    @AnyThread
    public final Executor zza() {
        return this.zza;
    }

    @AnyThread
    public final void zzb(@Nullable final String str, @Nullable final String str2, final zzd... zzdVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzc
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                zzd[] zzdVarArr2 = zzdVarArr;
                jSONObject.toString();
                for (final zzd zzdVar : zzdVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzdVar.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzdVar.zza().execute(futureTask);
                    try {
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    } catch (InterruptedException unused2) {
                    } catch (ExecutionException e) {
                        e.getCause();
                    }
                }
            }
        });
    }
}

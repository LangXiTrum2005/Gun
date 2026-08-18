package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes3.dex */
final class zzdu extends BroadcastReceiver {
    final /* synthetic */ zzdw zza;

    public /* synthetic */ zzdu(zzdw zzdwVar, zzdv zzdvVar) {
        this.zza = zzdwVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (zzei.zza >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 4;
                                break;
                            case 13:
                                i = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i = 6;
                                break;
                            case 18:
                                i = 2;
                                break;
                            case 20:
                                if (zzei.zza >= 29) {
                                    i = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i = type != 9 ? 8 : 7;
                    } else {
                        i = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (zzei.zza < 31 || i != 5) {
            zzdw.zzc(this.zza, i);
            return;
        }
        zzdw zzdwVar = this.zza;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zzdt zzdtVar = new zzdt(zzdwVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), zzdtVar);
            telephonyManager.unregisterTelephonyCallback(zzdtVar);
        } catch (RuntimeException unused2) {
            zzdw.zzc(zzdwVar, 5);
        }
    }
}

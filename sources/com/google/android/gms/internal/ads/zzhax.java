package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes3.dex */
final class zzhax implements zzgxx {
    static final zzgxx zza = new zzhax();

    private zzhax() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case PointerIconCompat.TYPE_HELP /* 1003 */:
                case 1004:
                case 1005:
                case PointerIconCompat.TYPE_CELL /* 1006 */:
                case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                case PointerIconCompat.TYPE_TEXT /* 1008 */:
                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}

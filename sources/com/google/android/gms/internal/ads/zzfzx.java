package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfzx extends zzfzz {
    private zzfzx(zzfzv zzfzvVar, @CheckForNull Character ch) {
        super(zzfzvVar, ch);
        zzfun.zze(zzfzvVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzfzy(AbstractC3950lJ.p("Invalid input length ", charSequenceZzg.length()));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            int i3 = i2 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZzg.charAt(i)) << 18) | (this.zzb.zzb(charSequenceZzg.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iZzb >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceZzg.length()) {
                int i5 = i + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzg.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iZzb2 >>> 8) & 255);
                if (i5 < charSequenceZzg.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzg.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final zzgaa zzb(zzfzv zzfzvVar, @CheckForNull Character ch) {
        return new zzfzx(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfun.zzk(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = ((bArr[i3 + 1] & 255) << 8) | (i5 << 16) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i6 >>> 18));
            appendable.append(this.zzb.zza((i6 >>> 12) & 63));
            appendable.append(this.zzb.zza((i6 >>> 6) & 63));
            appendable.append(this.zzb.zza(i6 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzh(appendable, bArr, i3, i2 - i3);
        }
    }

    public zzfzx(String str, String str2, @CheckForNull Character ch) {
        this(new zzfzv(str, str2.toCharArray()), ch);
    }
}

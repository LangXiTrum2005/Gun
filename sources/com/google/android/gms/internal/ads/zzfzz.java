package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
class zzfzz extends zzgaa {

    @CheckForNull
    private volatile zzgaa zza;
    final zzfzv zzb;

    @CheckForNull
    final Character zzc;

    public zzfzz(zzfzv zzfzvVar, @CheckForNull Character ch) {
        this.zzb = zzfzvVar;
        boolean z = true;
        if (ch != null && zzfzvVar.zze('=')) {
            z = false;
        }
        zzfun.zzi(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfzz) {
            zzfzz zzfzzVar = (zzfzz) obj;
            if (this.zzb.equals(zzfzzVar.zzb) && Objects.equals(this.zzc, zzfzzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        zzfzv zzfzvVar;
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzfzy(AbstractC3950lJ.p("Invalid input length ", charSequenceZzg.length()));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzg.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzfzvVar = this.zzb;
                if (i3 >= zzfzvVar.zzc) {
                    break;
                }
                jZzb <<= zzfzvVar.zzb;
                if (i + i3 < charSequenceZzg.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzg.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzfzvVar.zzd;
            int i6 = i4 * zzfzvVar.zzb;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zzb.zzc;
        }
        return i2;
    }

    public zzgaa zzb(zzfzv zzfzvVar, @CheckForNull Character ch) {
        return new zzfzz(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfun.zzk(0, i2, bArr.length);
        while (i3 < i2) {
            zzh(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final int zzd(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final int zze(int i) {
        zzfzv zzfzvVar = this.zzb;
        return zzfzvVar.zzc * zzgaj.zzb(i, zzfzvVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final zzgaa zzf() {
        zzgaa zzgaaVarZzb = this.zza;
        if (zzgaaVarZzb == null) {
            zzfzv zzfzvVar = this.zzb;
            zzfzv zzfzvVarZzc = zzfzvVar.zzc();
            zzgaaVarZzb = zzfzvVarZzc == zzfzvVar ? this : zzb(zzfzvVarZzc, this.zzc);
            this.zza = zzgaaVarZzb;
        }
        return zzgaaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzh(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfun.zzk(i, i + i2, bArr.length);
        int i3 = 0;
        zzfun.zze(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzfzv zzfzvVar = this.zzb;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzfzvVar.zzb) - i3);
            zzfzv zzfzvVar2 = this.zzb;
            appendable.append(zzfzvVar2.zza(zzfzvVar2.zza & ((int) j2)));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i3 += this.zzb.zzb;
            }
        }
    }

    public zzfzz(String str, String str2, @CheckForNull Character ch) {
        this(new zzfzv(str, str2.toCharArray()), ch);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzgxr;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzgxl<MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> extends zzgvr<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgxl(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzgzm.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ zzgvr zzaD(zzgvs zzgvsVar) {
        zzbi((zzgxr) zzgvsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgvr zzaW(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
        zzbk(zzgwpVar, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgvr zzaZ(byte[] bArr, int i, int i2) throws zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgvr zzba(byte[] bArr, int i, int i2, zzgxb zzgxbVar) throws zzgyg {
        zzbm(bArr, i, i2, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ zzgzb zzaW(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
        zzbk(zzgwpVar, zzgxbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ zzgzb zzaZ(byte[] bArr, int i, int i2) throws zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public /* bridge */ /* synthetic */ zzgzb zzba(byte[] bArr, int i, int i2, zzgxb zzgxbVar) throws zzgyg {
        zzbm(bArr, i, i2, zzgxbVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    /* JADX INFO: renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcX();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
        zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgwq.zzq(zzgwpVar), zzgxbVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws zzgyg {
        int i3 = zzgxb.zzb;
        int i4 = zzgzm.zza;
        zzbm(bArr, i, i2, zzgxb.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, zzgxb zzgxbVar) throws zzgyg {
        zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new zzgvx(zzgxbVar));
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzgvr.zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    /* JADX INFO: renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzgzb zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (this.zza.zzcd()) {
            return;
        }
        zzbv();
    }

    public void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return zzgxr.zzk(this.zza, false);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgvs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgvs<MessageType extends zzgvs<MessageType, BuilderType>, BuilderType extends zzgvr<MessageType, BuilderType>> implements zzgzc {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgvr.zzbd(iterable, list);
    }

    public static void zzaR(zzgwj zzgwjVar) throws IllegalArgumentException {
        if (!zzgwjVar.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdF(String str) {
        return AbstractC5044xl.n("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzgzv zzgzvVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public zzgwj zzaN() {
        try {
            int iZzaY = zzaY();
            zzgwj zzgwjVar = zzgwj.zzb;
            byte[] bArr = new byte[iZzaY];
            zzgws zzgwsVar = new zzgws(bArr, 0, iZzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return new zzgwg(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdF("ByteString"), e);
        }
    }

    public zzgzh zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhag zzaP() {
        return new zzhag(this);
    }

    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int iZzaY = zzaY();
        zzgwu zzgwuVar = new zzgwu(outputStream, zzgww.zzB(zzgww.zzD(iZzaY) + iZzaY));
        zzgwuVar.zzu(iZzaY);
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgwu zzgwuVar = new zzgwu(outputStream, zzgww.zzB(zzaY()));
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            zzgws zzgwsVar = new zzgws(bArr, 0, iZzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdF("byte array"), e);
        }
    }
}

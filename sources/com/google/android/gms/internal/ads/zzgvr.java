package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgvs;
import defpackage.BottomSpaceItemDecoration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgvr<MessageType extends zzgvs<MessageType, BuilderType>, BuilderType extends zzgvr<MessageType, BuilderType>> implements zzgzb {
    private String zza(String str) {
        return AbstractC5044xl.n("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzgzn) {
                ((zzgzn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            BottomSpaceItemDecoration bottomSpaceItemDecoration = (Object) list2.get(i);
            if (bottomSpaceItemDecoration == null) {
                zzc(list, size2);
            }
            list.add(bottomSpaceItemDecoration);
        }
    }

    public static zzhag zzbb(zzgzc zzgzcVar) {
        return new zzhag(zzgzcVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgye.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzgyo)) {
            if (iterable instanceof zzgzl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzgyo) iterable).zza();
        zzgyo zzgyoVar = (zzgyo) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                String strG = AbstractC5044xl.g("Element at index ", zzgyoVar.size() - size, " is null.");
                int size2 = zzgyoVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(strG);
                    }
                    zzgyoVar.remove(size2);
                }
            } else if (obj instanceof zzgwj) {
                zzgyoVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgwj.zzv(bArr2, 0, bArr2.length);
                zzgyoVar.zzb();
            } else {
                zzgyoVar.add((String) obj);
            }
        }
    }

    private static void zzc(List<?> list, int i) {
        String strG = AbstractC5044xl.g("Element at index ", list.size() - i, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strG);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgwj zzgwjVar) throws zzgyg {
        try {
            zzgwp zzgwpVarZzl = zzgwjVar.zzl();
            zzaR(zzgwpVarZzl);
            zzgwpVarZzl.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgwp zzgwpVar) throws IOException {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return (BuilderType) zzaW(zzgwpVar, zzgxb.zza);
    }

    /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzgzc zzgzcVar) {
        if (zzbt().getClass().isInstance(zzgzcVar)) {
            return (BuilderType) zzaD((zzgvs) zzgzcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgwp zzgwpVarZzG = zzgwp.zzG(inputStream, 4096);
        zzaR(zzgwpVarZzG);
        zzgwpVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzgyg {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        try {
            zzgwp zzgwpVarZzl = zzgwjVar.zzl();
            zzaW(zzgwpVarZzl, zzgxbVar);
            zzgwpVarZzl.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
        zzgwp zzgwpVarZzG = zzgwp.zzG(inputStream, 4096);
        zzaW(zzgwpVarZzG, zzgxbVar);
        zzgwpVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzgxbVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzgyg {
        try {
            zzgwp zzgwpVarZzH = zzgwp.zzH(bArr, i, i2, false);
            zzaR(zzgwpVarZzH);
            zzgwpVarZzH.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzgxb zzgxbVar) throws zzgyg {
        try {
            zzgwp zzgwpVarZzH = zzgwp.zzH(bArr, i, i2, false);
            zzaW(zzgwpVarZzH, zzgxbVar);
            zzgwpVarZzH.zzy(0);
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzgzb zzaQ(zzgwj zzgwjVar) throws zzgyg {
        zzaE(zzgwjVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaV(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        zzaJ(zzgwjVar, zzgxbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaX(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
        zzaL(inputStream, zzgxbVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return zzbf(inputStream, zzgxb.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new zzgvq(inputStream, zzgwp.zzE(i, inputStream)), zzgxbVar);
        return true;
    }
}

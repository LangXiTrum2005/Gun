package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzgxr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgxr<MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> extends zzgvs<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgxr<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhai zzt = zzhai.zzc();

    public static zzgxt zzbA() {
        return zzgvz.zzd();
    }

    public static zzgxt zzbB(zzgxt zzgxtVar) {
        int size = zzgxtVar.size();
        return zzgxtVar.zzf(size + size);
    }

    public static zzgxu zzbC() {
        return zzgwy.zze();
    }

    public static zzgxu zzbD(zzgxu zzgxuVar) {
        int size = zzgxuVar.size();
        return zzgxuVar.zzf(size + size);
    }

    public static zzgxy zzbE() {
        return zzgxi.zze();
    }

    public static zzgxy zzbF(zzgxy zzgxyVar) {
        int size = zzgxyVar.size();
        return zzgxyVar.zzf(size + size);
    }

    public static zzgxz zzbG() {
        return zzgxs.zzg();
    }

    public static zzgxz zzbH(zzgxz zzgxzVar) {
        int size = zzgxzVar.size();
        return zzgxzVar.zzf(size + size);
    }

    public static zzgyc zzbI() {
        return zzgyr.zzh();
    }

    public static zzgyc zzbJ(zzgyc zzgycVar) {
        int size = zzgycVar.size();
        return zzgycVar.zzf(size + size);
    }

    public static <E> zzgyd<E> zzbK() {
        return zzgzn.zzd();
    }

    public static <E> zzgyd<E> zzbL(zzgyd<E> zzgydVar) {
        int size = zzgydVar.size();
        return zzgydVar.zzf(size + size);
    }

    public static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbQ(zzgzc zzgzcVar, String str, Object[] objArr) {
        return new zzgzo(zzgzcVar, str, objArr);
    }

    public static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(AbstractC5044xl.n("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e);
        }
    }

    public static <T extends zzgxr> void zzbZ(Class<T> cls, T t) {
        t.zzbV();
        zzc.put(cls, t);
    }

    public static <ContainingType extends zzgzc, Type> zzgxp<ContainingType, Type> zzbe(ContainingType containingtype, zzgzc zzgzcVar, zzgxw zzgxwVar, int i, zzhau zzhauVar, boolean z, Class cls) {
        return new zzgxp<>(containingtype, zzgzn.zzd(), zzgzcVar, new zzgxo(zzgxwVar, i, zzhauVar, true, z), cls);
    }

    public static <ContainingType extends zzgzc, Type> zzgxp<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgzc zzgzcVar, zzgxw zzgxwVar, int i, zzhau zzhauVar, Class cls) {
        return new zzgxp<>(containingtype, type, zzgzcVar, new zzgxo(zzgxwVar, i, zzhauVar, false, false), cls);
    }

    public static <T extends zzgxr> T zzbh(Class<T> cls) {
        zzgxr<?, ?> zzgxrVarZzbt = zzc.get(cls);
        if (zzgxrVarZzbt == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgxrVarZzbt = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgxrVarZzbt == null) {
            zzgxrVarZzbt = ((zzgxr) zzhao.zzg(cls)).zzbt();
            if (zzgxrVarZzbt == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzgxrVarZzbt);
        }
        return zzgxrVarZzbt;
    }

    public static <T extends zzgxr<T, ?>> T zzbk(T t, InputStream inputStream) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T t2 = (T) zzg(t, inputStream, zzgxb.zza);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbl(T t, InputStream inputStream, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) zzg(t, inputStream, zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbm(T t, zzgwj zzgwjVar) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T t2 = (T) zzbr(t, zzgwjVar, zzgxb.zza);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbn(T t, zzgwp zzgwpVar) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return (T) zzbs(t, zzgwpVar, zzgxb.zza);
    }

    public static <T extends zzgxr<T, ?>> T zzbo(T t, InputStream inputStream) throws zzgyg {
        zzgwp zzgwpVarZzG = zzgwp.zzG(inputStream, 4096);
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T t2 = (T) zzbz(t, zzgwpVarZzG, zzgxb.zza);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return (T) zzbv(t, byteBuffer, zzgxb.zza);
    }

    public static <T extends zzgxr<T, ?>> T zzbq(T t, byte[] bArr) throws zzgyg {
        int length = bArr.length;
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        T t2 = (T) zzi(t, bArr, 0, length, zzgxb.zza);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbr(T t, zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) zzh(t, zzgwjVar, zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbs(T t, zzgwp zzgwpVar, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) zzbz(t, zzgwpVar, zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbu(T t, InputStream inputStream, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) zzbz(t, zzgwp.zzG(inputStream, 4096), zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
        zzgwp zzgwpVarZzH;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzgwpVarZzH = zzgwp.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhao.zzB()) {
            zzgwpVarZzH = new zzgwn(byteBuffer, z, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgwpVarZzH = zzgwp.zzH(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbs(t, zzgwpVarZzH, zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzbx(T t, byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgxbVar);
        zzf(t2);
        return t2;
    }

    public static <T extends zzgxr<T, ?>> T zzby(T t, zzgwp zzgwpVar) throws zzgyg {
        int i = zzgxb.zzb;
        int i2 = zzgzm.zza;
        return (T) zzbz(t, zzgwpVar, zzgxb.zza);
    }

    public static <T extends zzgxr<T, ?>> T zzbz(T t, zzgwp zzgwpVar, zzgxb zzgxbVar) throws zzgyg {
        T t2 = (T) t.zzbj();
        try {
            zzgzv zzgzvVarZzb = zzgzm.zza().zzb(t2.getClass());
            zzgzvVarZzb.zzh(t2, zzgwq.zzq(zzgwpVar), zzgxbVar);
            zzgzvVarZzb.zzf(t2);
            return t2;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg(e);
            }
            throw e;
        } catch (zzhag e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyg) {
                throw ((zzgyg) e3.getCause());
            }
            throw new zzgyg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgyg) {
                throw ((zzgyg) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzgzv<?> zzgzvVar) {
        if (zzgzvVar != null) {
            return zzgzvVar.zza(this);
        }
        return zzgzm.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgxn<MessageType, BuilderType>, BuilderType, T> zzgxp<MessageType, T> zzd(zzgwz<MessageType, T> zzgwzVar) {
        return (zzgxp) zzgwzVar;
    }

    private static <T extends zzgxr<T, ?>> T zzf(T t) throws zzgyg {
        if (t == null || t.zzbw()) {
            return t;
        }
        throw t.zzaP().zza();
    }

    private static <T extends zzgxr<T, ?>> T zzg(T t, InputStream inputStream, zzgxb zzgxbVar) throws zzgyg {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzgwp zzgwpVarZzG = zzgwp.zzG(new zzgvq(inputStream, zzgwp.zzE(i, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzgwpVarZzG, zzgxbVar);
            zzgwpVarZzG.zzy(0);
            return t2;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzgyg(e2);
        }
    }

    private static <T extends zzgxr<T, ?>> T zzh(T t, zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        zzgwp zzgwpVarZzl = zzgwjVar.zzl();
        T t2 = (T) zzbz(t, zzgwpVarZzl, zzgxbVar);
        zzgwpVarZzl.zzy(0);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgxr<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzgxb zzgxbVar) throws zzgyg {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbj();
        try {
            zzgzv zzgzvVarZzb = zzgzm.zza().zzb(t2.getClass());
            zzgzvVarZzb.zzi(t2, bArr, i, i + i2, new zzgvx(zzgxbVar));
            zzgzvVarZzb.zzf(t2);
            return t2;
        } catch (zzgyg e) {
            if (e.zzb()) {
                throw new zzgyg(e);
            }
            throw e;
        } catch (zzhag e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyg) {
                throw ((zzgyg) e3.getCause());
            }
            throw new zzgyg(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhai.zzc()) {
            this.zzt = zzhai.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzgxr<T, ?>> boolean zzk(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzdc(zzgxq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzgzm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzgxq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgzm.zza().zzb(getClass()).zzk(this, (zzgxr) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgze.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    public int zzaM(zzgzv zzgzvVar) {
        if (zzcd()) {
            int iZzc = zzc(zzgzvVar);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(AbstractC3950lJ.p("serialized size must be non-negative, was ", iZzc));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int iZzc2 = zzc(zzgzvVar);
        zzaS(iZzc2);
        return iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    public zzgzh zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvs
    public void zzaS(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC3950lJ.p("serialized size must be non-negative, was ", i));
        }
        this.zzd = i | (this.zzd & Integer.MIN_VALUE);
    }

    public int zzaW() {
        return zzgzm.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzdc(zzgxq.NEW_BUILDER, null, null);
    }

    public final zzgzk<MessageType> zzbN() {
        return (zzgzk) zzdc(zzgxq.GET_PARSER, null, null);
    }

    public Object zzbO() throws Exception {
        return zzdc(zzgxq.BUILD_MESSAGE_INFO, null, null);
    }

    public void zzbS() {
        this.zzq = 0;
    }

    public void zzbT() {
        zzaS(Integer.MAX_VALUE);
    }

    public void zzbU() {
        zzgzm.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    public void zzbV() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public void zzbW(int i, zzgwj zzgwjVar) {
        zzj();
        zzhai zzhaiVar = this.zzt;
        zzhaiVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhaiVar.zzj((i << 3) | 2, zzgwjVar);
    }

    public final void zzbX(zzhai zzhaiVar) {
        this.zzt = zzhai.zze(this.zzt, zzhaiVar);
    }

    public void zzbY(int i, int i2) {
        zzj();
        zzhai zzhaiVar = this.zzt;
        zzhaiVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhaiVar.zzj(i << 3, Long.valueOf(i2));
    }

    public final <MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) zzaZ();
        buildertype.zzbj(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcX() {
        return (BuilderType) zzdc(zzgxq.NEW_BUILDER, null, null);
    }

    /* JADX INFO: renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzdc(zzgxq.NEW_BUILDER, null, null);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    /* JADX INFO: renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzdc(zzgxq.GET_DEFAULT_INSTANCE, null, null);
    }

    public MessageType zzbj() {
        return (MessageType) zzdc(zzgxq.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final boolean zzbw() {
        return zzk(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public void zzcY(zzgww zzgwwVar) throws IOException {
        zzgzm.zza().zzb(getClass()).zzj(this, zzgwx.zza(zzgwwVar));
    }

    public void zzca(int i) {
        this.zzq = i;
    }

    public boolean zzcc() {
        return zzaX() == 0;
    }

    public boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean zzce(int i, zzgwp zzgwpVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgwpVar);
    }

    public abstract Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2);
}

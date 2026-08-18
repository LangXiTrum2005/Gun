package com.pgl.ssdk;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f2435a;
        private final o b;

        public a(long j, o oVar) {
            this.f2435a = j;
            this.b = oVar;
        }

        public o a() {
            return this.b;
        }

        public long b() {
            return this.f2435a;
        }
    }

    public static r a(o oVar) throws q, IOException {
        m<ByteBuffer, Long> mVarA = n.a(oVar);
        if (mVarA == null) {
            throw new q("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = mVarA.a();
        long jLongValue = mVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = n.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbP = DM.p("ZIP Central Directory start offset out of range: ", jC, ". ZIP End of Central Directory offset: ");
            sbP.append(jLongValue);
            throw new q(sbP.toString());
        }
        long jD = n.d(byteBufferA);
        long j = jC + jD;
        if (j <= jLongValue) {
            return new r(jC, jD, n.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbP2 = DM.p("ZIP Central Directory overlaps with End of Central Directory. CD end: ", j, ", EoCD start: ");
        sbP2.append(jLongValue);
        throw new q(sbP2.toString());
    }

    public static a a(o oVar, r rVar) throws b, IOException {
        long jA = rVar.a();
        long jC = rVar.c() + jA;
        long jE = rVar.e();
        if (jC != jE) {
            StringBuilder sbP = DM.p("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", jC, ", EoCD start: ");
            sbP.append(jE);
            throw new b(sbP.toString());
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = oVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j = byteBufferA.getLong(0);
                if (j < byteBufferA.capacity() || j > 2147483639) {
                    throw new b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                long j2 = (int) (8 + j);
                long j3 = jA - j2;
                if (j3 >= 0) {
                    ByteBuffer byteBufferA2 = oVar.a(j3, 8);
                    byteBufferA2.order(byteOrder);
                    long j4 = byteBufferA2.getLong(0);
                    if (j4 == j) {
                        return new a(j3, oVar.a(j3, j2));
                    }
                    StringBuilder sbP2 = DM.p("APK Signing Block sizes in header and footer do not match: ", j4, " vs ");
                    sbP2.append(j);
                    throw new b(sbP2.toString());
                }
                throw new b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}

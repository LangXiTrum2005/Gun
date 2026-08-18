package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f2015a;
    int b;
    int c;
    boolean d;
    boolean e;
    o f;
    o g;

    public o() {
        this.f2015a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final o a(o oVar) {
        oVar.g = this;
        oVar.f = this.f;
        this.f.g = oVar;
        this.f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.g;
        oVar3.f = oVar;
        this.f.g = oVar3;
        this.f = null;
        this.g = null;
        return oVar2;
    }

    public final o c() {
        this.d = true;
        return new o(this.f2015a, this.b, this.c, true, false);
    }

    public o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f2015a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final o a(int i) {
        o oVarA;
        if (i > 0 && i <= this.c - this.b) {
            if (i >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f2015a, this.b, oVarA.f2015a, 0, i);
            }
            oVarA.c = oVarA.b + i;
            this.b += i;
            this.g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.g;
        if (oVar != this) {
            if (oVar.e) {
                int i = this.c - this.b;
                if (i > (8192 - oVar.c) + (oVar.d ? 0 : oVar.b)) {
                    return;
                }
                a(oVar, i);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i) {
        if (oVar.e) {
            int i2 = oVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!oVar.d) {
                    int i4 = oVar.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = oVar.f2015a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        oVar.c -= oVar.b;
                        oVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f2015a, this.b, oVar.f2015a, oVar.c, i);
            oVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}

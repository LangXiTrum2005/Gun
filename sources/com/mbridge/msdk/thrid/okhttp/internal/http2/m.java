package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1967a;
    private final int[] b = new int[10];

    public void a() {
        this.f1967a = 0;
        Arrays.fill(this.b, 0);
    }

    public int b() {
        if ((this.f1967a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public int c(int i) {
        return (this.f1967a & 32) != 0 ? this.b[5] : i;
    }

    public boolean d(int i) {
        return ((1 << i) & this.f1967a) != 0;
    }

    public int b(int i) {
        return (this.f1967a & 16) != 0 ? this.b[4] : i;
    }

    public int c() {
        if ((this.f1967a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public int d() {
        return Integer.bitCount(this.f1967a);
    }

    public m a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.f1967a = (1 << i) | this.f1967a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public int a(int i) {
        return this.b[i];
    }

    public void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.d(i)) {
                a(i, mVar.a(i));
            }
        }
    }
}

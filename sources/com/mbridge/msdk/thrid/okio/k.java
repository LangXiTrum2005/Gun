package com.mbridge.msdk.thrid.okio;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f2008a;
    private final Inflater b;
    private int c;
    private boolean d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f2008a = eVar;
        this.b = inflater;
    }

    private void h() throws IOException {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.f2008a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j) throws IOException {
        boolean zD;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.h("byteCount < 0: ", j));
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.b.inflate(oVarB.f2015a, oVarB.c, (int) Math.min(j, 8192 - oVarB.c));
                if (iInflate > 0) {
                    oVarB.c += iInflate;
                    long j2 = iInflate;
                    cVar.b += j2;
                    return j2;
                }
                if (!this.b.finished() && !this.b.needsDictionary()) {
                }
                h();
                if (oVarB.b != oVarB.c) {
                    return -1L;
                }
                cVar.f2002a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.f2008a.close();
    }

    public final boolean d() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        h();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f2008a.f()) {
            return true;
        }
        o oVar = this.f2008a.a().f2002a;
        int i = oVar.c;
        int i2 = oVar.b;
        int i3 = i - i2;
        this.c = i3;
        this.b.setInput(oVar.f2015a, i2, i3);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f2008a.b();
    }
}

package com.mbridge.msdk.thrid.okio;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class t {
    public static final t d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2017a;
    private long b;
    private long c;

    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.h("timeout < 0: ", j));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public t b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f2017a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f2017a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2017a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.c;
    }

    public t a(long j) {
        this.f2017a = true;
        this.b = j;
        return this;
    }

    public t a() {
        this.f2017a = false;
        return this;
    }
}

package com.mbridge.msdk.tracker;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2079a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final p g;
    public final d h;
    public final w i;
    public final f j;

    public static final class b {
        private p d;
        private d h;
        private w i;
        private f j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2080a = 50;
        private int b = 15000;
        private int c = 1;
        private int e = 2;
        private int f = 50;
        private int g = 604800000;

        public b a(int i, p pVar) {
            this.c = i;
            this.d = pVar;
            return this;
        }

        public b b(int i) {
            if (i <= 0) {
                this.f2080a = 50;
            } else {
                this.f2080a = i;
            }
            return this;
        }

        public b c(int i) {
            if (i < 0) {
                this.b = 15000;
            } else {
                this.b = i;
            }
            return this;
        }

        public b d(int i) {
            if (i < 0) {
                this.f = 50;
            } else {
                this.f = i;
            }
            return this;
        }

        public b e(int i) {
            if (i <= 0) {
                this.e = 2;
            } else {
                this.e = i;
            }
            return this;
        }

        public b a(int i) {
            if (i < 0) {
                this.g = 604800000;
            } else {
                this.g = i;
            }
            return this;
        }

        public b a(d dVar) {
            this.h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.j = fVar;
            return this;
        }

        public x a() {
            y.b(this.h);
            y.b(this.i);
            if (!y.b(this.d)) {
                y.b(this.d.b());
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f2079a = bVar.f2080a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.e;
        this.e = bVar.f;
        this.f = bVar.g;
        this.g = bVar.d;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
    }
}

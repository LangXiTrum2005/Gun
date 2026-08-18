package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f322a;
    private final b b;
    private c c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0022a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f323a;
        private b b = b.f324a;

        public final C0022a a() {
            this.f323a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0022a a(b bVar) {
            if (bVar == null) {
                bVar = b.f324a;
            }
            this.b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0022a c0022a, byte b) {
        this(c0022a);
    }

    public final b a() {
        return this.b;
    }

    private a(C0022a c0022a) {
        this.f322a = c0022a.f323a;
        this.b = c0022a.b;
        this.c = null;
    }
}

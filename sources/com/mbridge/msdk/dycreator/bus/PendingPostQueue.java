package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes2.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f1077a;
    private PendingPost b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.b;
            if (pendingPost2 != null) {
                pendingPost2.c = pendingPost;
                this.b = pendingPost;
            } else {
                if (this.f1077a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.b = pendingPost;
                this.f1077a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f1077a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.c;
            this.f1077a = pendingPost2;
            if (pendingPost2 == null) {
                this.b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i) throws InterruptedException {
        try {
            if (this.f1077a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}

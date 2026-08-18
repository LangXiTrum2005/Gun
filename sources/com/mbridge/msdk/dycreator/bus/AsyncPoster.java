package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes2.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f1068a = new PendingPostQueue();
    private final EventBus b;

    public AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f1068a.a(PendingPost.a(subscription, obj));
        EventBus.n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f1068a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.a(pendingPostA);
    }
}

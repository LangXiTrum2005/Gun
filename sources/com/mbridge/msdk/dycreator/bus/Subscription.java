package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes2.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f1080a;
    final SubscriberMethod b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f1080a = obj;
        this.b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f1080a == subscription.f1080a && this.b.equals(subscription.b);
    }

    public int hashCode() {
        return this.b.d.hashCode() + this.f1080a.hashCode();
    }
}

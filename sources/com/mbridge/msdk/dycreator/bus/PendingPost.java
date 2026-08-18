package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class PendingPost {
    private static final List<PendingPost> d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f1076a;
    Subscription b;
    PendingPost c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f1076a = obj;
        this.b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f1076a = obj;
                pendingPostRemove.b = subscription;
                pendingPostRemove.c = null;
                return pendingPostRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f1076a = null;
        pendingPost.b = null;
        pendingPost.c = null;
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

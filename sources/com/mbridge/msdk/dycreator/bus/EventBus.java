package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class EventBus {
    private static volatile EventBus o;
    private boolean k;
    static ExecutorService n = Executors.newCachedThreadPool();
    public static String TAG = "Event";
    private static final Map<Class<?>, List<Class<?>>> p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f1070a = new HashMap();
    private final Map<Object, List<Class<?>>> b = new HashMap();
    private final Map<Class<?>, Object> c = new ConcurrentHashMap();
    private final ThreadLocal<List<Object>> d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };
    private final ThreadLocal<BooleanWrapper> e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };
    private String f = "onEvent";
    private final HandlerPoster g = new HandlerPoster(this, Looper.getMainLooper(), 10);
    private final BackgroundPoster h = new BackgroundPoster(this);
    private final AsyncPoster i = new AsyncPoster(this);
    private final SubscriberMethodFinder j = new SubscriberMethodFinder();
    private boolean l = true;
    private Map<String, Object> m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1073a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f1073a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1073a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1073a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1073a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class BooleanWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1074a;
    }

    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z) {
        Iterator<SubscriberMethod> it = this.j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (o == null) {
            synchronized (EventBus.class) {
                try {
                    if (o == null) {
                        o = new EventBus();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z) {
        if (this.k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.l = z;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.c) {
            obj = this.c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.e.get();
        if (booleanWrapper.f1074a) {
            return;
        }
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f1074a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z);
            } catch (Throwable th) {
                booleanWrapper.f1074a = false;
                throw th;
            }
        }
        booleanWrapper.f1074a = false;
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.c) {
            this.c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) {
        a(obj, this.f, false);
    }

    public void registerSticky(Object obj) {
        a(obj, this.f, true);
    }

    public void release() {
        if (o != null) {
            o = null;
            n = null;
            Map<Class<?>, List<Class<?>>> map = p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f1070a;
            if (map2 != null && map2.size() > 0) {
                this.f1070a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.b;
            if (map3 != null && map3.size() > 0) {
                this.b.clear();
            }
            Map<Class<?>, Object> map4 = this.c;
            if (map4 != null && map4.size() > 0) {
                this.c.clear();
            }
            Map<String, Object> map5 = this.m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.c) {
            objRemove = this.c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length == 0) {
                throw new IllegalArgumentException("Provide at least one event class");
            }
            List<Class<?>> list = this.b.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.b.remove(obj);
                }
            } else {
                obj.getClass().toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void register(String str, Object obj) {
        Map<String, Object> map = this.m;
        if (map != null && map.containsKey(str)) {
            unregister(this.m.get(str));
        }
        this.m.put(str, obj);
        a(obj, this.f, false);
    }

    public void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.c.get(cls))) {
                    return false;
                }
                this.c.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.j.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.c) {
                    a(obj, subscriberMethod, z);
                } else if (clsArr != null) {
                    for (Class<?> cls2 : clsArr) {
                        if (cls2 == subscriberMethod.c) {
                            a(obj, subscriberMethod, z);
                            break;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void register(Object obj, String str) {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.b.remove(obj);
            } else {
                obj.getClass().toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z) {
        Object obj2;
        this.k = true;
        Class<?> cls = subscriberMethod.c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f1070a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f1070a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f1078a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z) {
            synchronized (this.c) {
                obj2 = this.c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.m;
            if (map != null && map.containsKey(str)) {
                Object objRemove = this.m.remove(str);
                List<Class<?>> list = this.b.get(objRemove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(objRemove, it.next());
                    }
                    this.b.remove(objRemove);
                } else {
                    objRemove.getClass().toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f1070a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                if (copyOnWriteArrayList.get(i).f1080a == obj) {
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    private void a(Object obj, boolean z) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    Class<?> cls2 = listA.get(i);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f1070a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z);
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    return;
                }
                cls.toString();
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z) {
        int i = AnonymousClass3.f1073a[subscription.b.b.ordinal()];
        if (i == 1) {
            a(subscription, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                a(subscription, obj);
                return;
            } else {
                this.g.a(subscription, obj);
                return;
            }
        }
        if (i == 3) {
            if (z) {
                this.h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i == 4) {
            this.i.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.b.b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = p;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    p.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public void a(PendingPost pendingPost) {
        Object obj = pendingPost.f1076a;
        Subscription subscription = pendingPost.b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    public void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.b.f1078a.invoke(subscription.f1080a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                subscription.f1080a.getClass().toString();
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Objects.toString(subscriberExceptionEvent.causingEvent);
                Objects.toString(subscriberExceptionEvent.causingSubscriber);
                return;
            }
            if (this.l) {
                obj.getClass().toString();
                subscription.f1080a.getClass().toString();
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f1080a));
        }
    }
}

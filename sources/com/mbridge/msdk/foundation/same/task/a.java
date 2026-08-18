package com.mbridge.msdk.foundation.same.task;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Runnable {
    public static long id;
    public InterfaceC0174a mListener;
    public b mState = b.READY;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a$a, reason: collision with other inner class name */
    public interface InterfaceC0174a {
        void a(b bVar);
    }

    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public a() {
        id++;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC0174a interfaceC0174a = this.mListener;
        if (interfaceC0174a != null) {
            interfaceC0174a.a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return id;
    }

    public b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(InterfaceC0174a interfaceC0174a) {
        this.mListener = interfaceC0174a;
    }

    public final void setPause(boolean z) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z) {
            setState(bVar2);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z);
    }
}

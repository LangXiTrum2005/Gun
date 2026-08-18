package com.apm.insight.b;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.apm.insight.runtime.k;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MessageQueue f78a;
    private static Field b;
    private static Field c;

    public static MessageQueue a() {
        if (f78a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f78a = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f78a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f78a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return f78a;
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                b = declaredField;
                declaredField.setAccessible(true);
                return (Message) b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Message a(Message message) {
        Field field = c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                c = declaredField;
                declaredField.setAccessible(true);
                return (Message) c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static JSONObject a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONArray a(long j) {
        MessageQueue messageQueueA = a();
        JSONArray jSONArray = new JSONArray();
        if (messageQueueA == null) {
            return jSONArray;
        }
        try {
            synchronized (messageQueueA) {
                try {
                    Message messageA = a(messageQueueA);
                    if (messageA == null) {
                        return jSONArray;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (messageA != null && i < 100) {
                        i++;
                        i2++;
                        JSONObject jSONObjectA = a(messageA, j);
                        try {
                            jSONObjectA.put("id", i2);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(jSONObjectA);
                        messageA = a(messageA);
                    }
                    return jSONArray;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            k.a(th2, "NPTH_CATCH");
            return jSONArray;
        }
    }
}

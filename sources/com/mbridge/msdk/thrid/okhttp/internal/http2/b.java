package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1948a;

    b(int i) {
        this.f1948a = i;
    }

    public static b a(int i) {
        for (b bVar : values()) {
            if (bVar.f1948a == i) {
                return bVar;
            }
        }
        return null;
    }
}

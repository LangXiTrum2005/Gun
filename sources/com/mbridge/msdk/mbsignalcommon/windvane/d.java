package com.mbridge.msdk.mbsignalcommon.windvane;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1495a;
    private String b;

    d(String str, String str2) {
        this.f1495a = str;
        this.b = str2;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f1495a;
    }
}

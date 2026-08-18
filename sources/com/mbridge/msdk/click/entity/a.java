package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f954a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    public String a() {
        return "statusCode=" + this.f + ", location=" + this.f954a + ", contentType=" + this.b + ", contentLength=" + this.e + ", contentEncoding=" + this.c + ", referer=" + this.d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f954a);
        sb.append("', contentType='");
        sb.append(this.b);
        sb.append("', contentEncoding='");
        sb.append(this.c);
        sb.append("', referer='");
        sb.append(this.d);
        sb.append("', contentLength=");
        sb.append(this.e);
        sb.append(", statusCode=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', exception='");
        return DM.m(sb, this.h, "'}");
    }
}

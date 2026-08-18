package com.mbridge.msdk.click.entity;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f955a;
    private String b;
    private String c;
    private String d;
    private CampaignEx e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;

    public void a(Context context) {
        this.f955a = context;
    }

    public String b() {
        return this.c;
    }

    public Context c() {
        return this.f955a;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public int f() {
        return this.i;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.g;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void c(String str) {
        this.b = str;
    }

    public CampaignEx a() {
        return this.e;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void c(boolean z) {
        this.g = z;
    }

    public void a(CampaignEx campaignEx) {
        this.e = campaignEx;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void a(int i) {
        this.i = i;
    }
}

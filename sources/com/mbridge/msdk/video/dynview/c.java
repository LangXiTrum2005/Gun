package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2135a;
    private String b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private View h;
    private List<CampaignEx> i;
    private int j;
    private boolean k;
    private List<String> l;
    private int m;
    private String n;
    private int o;
    private int p;
    private String q;

    public static class b implements InterfaceC0256c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f2136a;
        private String b;
        private int c;
        private float d;
        private float e;
        private int f;
        private int g;
        private View h;
        private List<CampaignEx> i;
        private int j;
        private boolean k;
        private List<String> l;
        private int m;
        private String n;
        private int o;
        private int p = 1;
        private String q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c fileDirs(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c orientation(int i) {
            this.f = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(Context context) {
            this.f2136a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c b(int i) {
            this.c = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c d(int i) {
            this.m = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c e(int i) {
            this.p = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c f(int i) {
            this.o = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(float f) {
            this.e = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c b(float f) {
            this.d = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c c(int i) {
            this.g = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(View view) {
            this.h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c b(String str) {
            this.q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(List<CampaignEx> list) {
            this.i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(int i) {
            this.j = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0256c
        public InterfaceC0256c a(String str) {
            this.n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC0256c {
        InterfaceC0256c a(float f);

        InterfaceC0256c a(int i);

        InterfaceC0256c a(Context context);

        InterfaceC0256c a(View view);

        InterfaceC0256c a(String str);

        InterfaceC0256c a(List<CampaignEx> list);

        InterfaceC0256c a(boolean z);

        InterfaceC0256c b(float f);

        InterfaceC0256c b(int i);

        InterfaceC0256c b(String str);

        c build();

        InterfaceC0256c c(int i);

        InterfaceC0256c c(String str);

        InterfaceC0256c d(int i);

        InterfaceC0256c e(int i);

        InterfaceC0256c f(int i);

        InterfaceC0256c fileDirs(List<String> list);

        InterfaceC0256c orientation(int i);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.i;
    }

    public Context c() {
        return this.f2135a;
    }

    public List<String> d() {
        return this.l;
    }

    public int e() {
        return this.o;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.f;
    }

    public View i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public float k() {
        return this.d;
    }

    public int l() {
        return this.j;
    }

    public float m() {
        return this.e;
    }

    public String n() {
        return this.q;
    }

    public int o() {
        return this.p;
    }

    public boolean p() {
        return this.k;
    }

    private c(b bVar) {
        this.e = bVar.e;
        this.d = bVar.d;
        this.f = bVar.f;
        this.g = bVar.g;
        this.f2135a = bVar.f2136a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
    }
}

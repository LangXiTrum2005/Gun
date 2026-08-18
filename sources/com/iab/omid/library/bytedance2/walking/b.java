package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0146b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f885a;
    private final com.iab.omid.library.bytedance2.walking.async.c b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0146b
    @VisibleForTesting
    public JSONObject a() {
        return this.f885a;
    }

    public void b() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0146b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f885a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}

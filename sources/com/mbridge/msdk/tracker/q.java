package com.mbridge.msdk.tracker;

/* JADX INFO: loaded from: classes2.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f2072a;

    public q(g gVar) {
        this.f2072a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f2072a)) {
            return;
        }
        this.f2072a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f2072a)) {
            return;
        }
        try {
            h hVarE = eVar.e();
            if (y.a(hVarE)) {
                eVar.a(hVarE.a(eVar));
            }
            this.f2072a.b(eVar);
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f2072a)) {
            return new long[]{0, 0};
        }
        return this.f2072a.a();
    }
}

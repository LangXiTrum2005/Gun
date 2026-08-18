package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final e b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f177a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.f177a == null) {
                this.f177a = Header.b(com.apm.insight.e.g());
            }
            return this.f177a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f176a;

    public e() {
        this(b);
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.f176a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.f176a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f176a = eVar;
    }
}

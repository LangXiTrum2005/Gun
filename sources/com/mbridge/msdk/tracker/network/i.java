package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i<T> extends u<T> {
    protected static final String B = "i";
    private boolean A;
    private final long w;
    private Map<String, String> x;
    private Map<String, String> y;
    private z z;

    public i(int i, String str, int i2, String str2, long j) {
        super(i, str, i2, str2);
        this.A = false;
        if (j > 0) {
            this.w = j;
        } else {
            this.w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.x == null) {
            this.x = new HashMap();
        }
        try {
            this.x.putAll(map);
        } catch (Exception e) {
            AbstractC3888ke0.q(e, new StringBuilder("addParams error: "), B);
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.y == null) {
            this.y = new HashMap();
        }
        try {
            this.y.put(str, str2);
        } catch (Exception e) {
            AbstractC3888ke0.q(e, new StringBuilder("addHeader error: "), B);
        }
    }

    public void d(boolean z) {
        this.A = z;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> f() {
        if (this.y == null) {
            this.y = new HashMap();
        }
        this.y.put("Charset", C.UTF8_NAME);
        return this.y;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> i() {
        if (this.x == null) {
            this.x = new HashMap();
        }
        return this.x;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public z o() {
        if (this.z == null) {
            this.z = new e(30000, this.w, 3);
        }
        return this.z;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}

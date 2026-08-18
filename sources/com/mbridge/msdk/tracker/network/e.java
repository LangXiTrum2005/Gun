package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class e implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2041a;
    private long b;
    private int c;
    private final int d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public long a() {
        return this.b;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public int b() {
        return this.f2041a;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public int c() {
        return this.c;
    }

    public e(int i, int i2) {
        this(i, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i2);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public boolean a(d0 d0Var) {
        int i = this.c + 1;
        this.c = i;
        return i <= this.d;
    }

    public e(int i, long j, int i2) {
        this.b = j;
        this.f2041a = i;
        this.d = i2;
    }
}

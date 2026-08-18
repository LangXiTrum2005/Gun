package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class o extends k {
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    protected int t;
    private Map<Integer, String> u;
    private MBridgeVideoView.u v;
    private int w;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2275a;

        public a(Object obj) {
            this.f2275a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2275a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        this.s = false;
        this.t = 0;
        this.w = -1;
        if (this.f2268a) {
            this.u = campaignEx.getAdvImpList();
        }
        this.t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:18:0x0026, B:21:0x0031, B:23:0x0040, B:25:0x004b, B:24:0x0048, B:26:0x005c, B:82:0x0164, B:27:0x0064, B:29:0x0077, B:31:0x007b, B:33:0x0081, B:35:0x0086, B:37:0x008a, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00bf, B:46:0x00c8, B:48:0x00cc, B:53:0x00d4, B:54:0x00d8, B:55:0x00eb, B:58:0x00f1, B:60:0x00f5, B:62:0x00fe, B:64:0x0102, B:66:0x0114, B:68:0x0118, B:69:0x0128, B:71:0x012c, B:72:0x0136, B:74:0x0140, B:76:0x0144, B:77:0x014a, B:79:0x014e, B:81:0x0152), top: B:86:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014e A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:18:0x0026, B:21:0x0031, B:23:0x0040, B:25:0x004b, B:24:0x0048, B:26:0x005c, B:82:0x0164, B:27:0x0064, B:29:0x0077, B:31:0x007b, B:33:0x0081, B:35:0x0086, B:37:0x008a, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00bf, B:46:0x00c8, B:48:0x00cc, B:53:0x00d4, B:54:0x00d8, B:55:0x00eb, B:58:0x00f1, B:60:0x00f5, B:62:0x00fe, B:64:0x0102, B:66:0x0114, B:68:0x0118, B:69:0x0128, B:71:0x012c, B:72:0x0136, B:74:0x0140, B:76:0x0144, B:77:0x014a, B:79:0x014e, B:81:0x0152), top: B:86:0x0006 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        int i2;
        CampaignEx campaignEx;
        try {
            if (i != 2) {
                int videoLength = 0;
                if (i != 20) {
                    if (i != 130) {
                        if (i == 6) {
                            if (this.f2268a && !this.p) {
                                this.p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
                            }
                        } else if (i != 7) {
                            if (i == 15) {
                                j();
                                h();
                                i();
                                if (q0.a().a("i_l_s_t_r_i", false) && !this.q) {
                                    this.q = true;
                                    MBridgeVideoView.u uVar = this.v;
                                    if (uVar != null) {
                                        uVar.a();
                                    }
                                }
                                if (obj == null || !(obj instanceof MBridgeVideoView.v)) {
                                    i2 = 0;
                                } else {
                                    int i3 = ((MBridgeVideoView.v) obj).f2262a;
                                    videoLength = ((MBridgeVideoView.v) obj).b;
                                    i2 = i3;
                                }
                                if (videoLength == 0 && (campaignEx = this.b) != null) {
                                    videoLength = campaignEx.getVideoLength();
                                }
                                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, i2, videoLength, this.j);
                                com.mbridge.msdk.video.module.report.b.a(this.b, this.u, this.g, i2);
                                if (!this.r) {
                                    this.r = true;
                                    com.mbridge.msdk.video.module.report.b.a(this.b, this.g);
                                }
                                if (!this.s) {
                                    int i4 = this.t;
                                    if (i4 != 0) {
                                        videoLength = i4;
                                    }
                                    if (i2 >= videoLength) {
                                        this.s = true;
                                        i = 17;
                                    }
                                }
                                o0.b("NotifyListener", "onPlayProgress:" + i2);
                                this.w = i2;
                            } else if (i != 16) {
                                switch (i) {
                                    case 11:
                                        a();
                                        l();
                                        break;
                                    case 12:
                                        a aVar = new a(obj);
                                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
                                        } else {
                                            aVar.run();
                                        }
                                        l();
                                        c();
                                        b();
                                        e();
                                        a();
                                        break;
                                    case 13:
                                        c();
                                        b();
                                        break;
                                }
                            } else if (this.f2268a) {
                                this.p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
                            }
                        } else if (this.f2268a && obj != null && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == 2) {
                                if (!this.o) {
                                    this.o = true;
                                    com.mbridge.msdk.video.module.report.b.e(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
                                }
                            } else if (iIntValue == 1 && !this.n) {
                                this.n = true;
                                com.mbridge.msdk.video.module.report.b.f(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.t = ((Integer) obj).intValue();
                    }
                } else if (q0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                    this.v = (MBridgeVideoView.u) obj;
                }
            } else if (this.f2268a) {
                this.p = true;
                l();
                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.b);
            }
            this.i.a(i, obj);
        } catch (Throwable th) {
            o0.b("NotifyListener", th.getMessage(), th);
        }
    }
}

package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1770a;
    private final String b;
    private final boolean c;
    private final com.mbridge.msdk.videocommon.setting.c d;
    private final String e;

    public d(String str, String str2, boolean z, com.mbridge.msdk.videocommon.setting.c cVar, String str3) {
        this.f1770a = str;
        this.b = str2;
        this.c = z;
        this.d = cVar;
        this.e = str3;
    }

    public e a(boolean z, String str, int i, String str2, String str3, String str4, String str5, boolean z2, int i2) {
        int iE;
        int iB;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i3 = z ? 2 : 3;
        com.mbridge.msdk.videocommon.setting.c cVar = this.d;
        if (cVar != null) {
            iE = cVar.e();
            iB = this.d.b();
        } else {
            iE = 0;
            iB = 0;
        }
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.b, "reward");
        int i4 = this.c ? 287 : 94;
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
        if (!TextUtils.isEmpty(this.f1770a)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f1770a);
        }
        if (com.mbridge.msdk.util.b.a()) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ttc_ids", str4 == null ? "" : str4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "install_ids", str3 == null ? "" : str3);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", String.valueOf(i3));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", String.valueOf(iE));
        if (this.c) {
            iB = 1;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", String.valueOf(iB));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.h, str == null ? "" : str);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.i, str2 == null ? "" : str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", String.valueOf(i4));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, BidResponsed.KEY_TOKEN, str5);
        }
        if (this.c) {
            if (i2 == com.mbridge.msdk.foundation.same.a.I || i2 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "0");
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar2 = this.d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "u_stid", this.d.a());
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        if (aVarC != null && !TextUtils.isEmpty(aVarC.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "r_stid", aVarC.a());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "rw_plus", z2 ? "1" : "0");
        String strD = t0.d(this.b);
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "j", strD);
        }
        String str6 = this.e;
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str6 != null ? str6 : "");
        return eVar;
    }
}

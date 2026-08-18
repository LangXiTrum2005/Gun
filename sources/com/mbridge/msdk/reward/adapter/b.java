package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static ConcurrentHashMap<String, f> g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f1730a;
    private boolean b;
    private final String c;
    private final String d;
    private final String e;
    private volatile List<WindVaneWebView> f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f1731a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ n g;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i, String str2, String str3, n nVar) {
            this.f1731a = copyOnWriteArrayList;
            this.b = context;
            this.c = str;
            this.d = i;
            this.e = str2;
            this.f = str3;
            this.g = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0293  */
        /* JADX WARN: Code duplicated, block: B:130:0x0335  */
        /* JADX WARN: Code duplicated, block: B:138:0x034d  */
        /* JADX WARN: Code duplicated, block: B:173:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:177:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:183:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0150  */
        /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
        @Override // java.lang.Runnable
        public void run() {
            Iterator it;
            String str;
            String str2;
            CharSequence charSequence;
            CampaignEx.c cVar;
            String str3;
            boolean zIsDynamicView;
            String iconUrl;
            String imageUrl;
            String strC;
            CampaignEx campaignEx;
            List<CampaignEx.c.a> listA;
            List<String> list;
            int i;
            String str4;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1731a;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f1731a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.b, this.c, this.f1731a, this.d, new k(b.this.f1730a, this.e, this.c, this.f));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.c);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
            Iterator it2 = this.f1731a.iterator();
            while (it2.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it2.next();
                if (campaignEx2 != null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.e);
                        bundle.putString("request_id", this.f);
                        messageObtain.setData(bundle);
                        b.this.f1730a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String strE = rewardTemplateMode.e();
                        int iF = rewardTemplateMode.f();
                        if (campaignEx2.isDynamicView() && t0.a("dyview", strE)) {
                            b.this.a(1, campaignEx2, AbstractC3950lJ.n(iF, ""), strE);
                        } else if (!TextUtils.isEmpty(strE) && !strE.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = b.this.a(campaignEx2, 2);
                            if (strE.contains(".zip")) {
                                try {
                                    it = it2;
                                    try {
                                        try {
                                            cVar = rewardTemplateMode;
                                            str4 = "";
                                            str = "dyview";
                                            charSequence = ".zip";
                                            try {
                                                H5DownLoadManager.getInstance().downloadH5Res(cVarA, strE, new l(this.b, this.e, this.c, this.f, campaignEx2, 859, b.this.f1730a, this.g, this.f1731a));
                                            } catch (Exception e2) {
                                                e = e2;
                                                if (MBridgeConstans.DEBUG) {
                                                    o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = "dyview";
                                            charSequence = ".zip";
                                            cVar = rewardTemplateMode;
                                            str4 = "";
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str = "dyview";
                                        charSequence = ".zip";
                                        cVar = rewardTemplateMode;
                                        str4 = "";
                                        if (MBridgeConstans.DEBUG) {
                                            o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                        str2 = str4;
                                        str3 = campaignEx2.getendcard_url();
                                        zIsDynamicView = campaignEx2.isDynamicView();
                                        boolean zL = t0.l(str3);
                                        if (!TextUtils.isEmpty(str3)) {
                                            if (zIsDynamicView) {
                                                b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str3, this.g, (CopyOnWriteArrayList<CampaignEx>) this.f1731a);
                                            } else if (t0.a(str, str3)) {
                                                try {
                                                    i = Integer.parseInt(z0.a(str3, "ecid"));
                                                } catch (Throwable th) {
                                                    o0.b("RewardCampaignsResourceManager", th.getMessage());
                                                    i = 404;
                                                }
                                                b.this.a(2, campaignEx2, AbstractC3950lJ.n(i, str2), str3);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                            H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                                        }
                                        iconUrl = campaignEx2.getIconUrl();
                                        if (!TextUtils.isEmpty(iconUrl)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.b).a(iconUrl, new j(b.this.f1730a, 0, this.e, this.c, this.f, campaignEx2));
                                            } catch (Exception e5) {
                                                if (MBridgeConstans.DEBUG) {
                                                    o0.b("RewardCampaignsResourceManager", e5.getLocalizedMessage());
                                                }
                                            }
                                        }
                                        imageUrl = campaignEx2.getImageUrl();
                                        if (!TextUtils.isEmpty(imageUrl)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.b).a(imageUrl, new j(b.this.f1730a, 0, this.e, this.c, this.f, campaignEx2));
                                            } catch (Exception e6) {
                                                if (MBridgeConstans.DEBUG) {
                                                    o0.b("RewardCampaignsResourceManager", e6.getLocalizedMessage());
                                                }
                                            }
                                        }
                                        if (cVar != null) {
                                            strC = cVar.c();
                                            if (TextUtils.isEmpty(strC)) {
                                                campaignEx = campaignEx2;
                                            } else {
                                                campaignEx = campaignEx2;
                                            }
                                            listA = cVar.a();
                                            if (listA != null) {
                                                while (r3.hasNext()) {
                                                    if (aVar == null) {
                                                    }
                                                }
                                            }
                                        }
                                        it2 = it;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    it = it2;
                                }
                                str2 = str4;
                            } else {
                                it = it2;
                                str = "dyview";
                                charSequence = ".zip";
                                cVar = rewardTemplateMode;
                                o0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    str2 = "";
                                    try {
                                        H5DownLoadManager.getInstance().downloadH5Res(cVarA, strE, new i(859, this.e, this.c, this.f, campaignEx2, this.g, b.this.f1730a, this.f1731a));
                                    } catch (Exception e8) {
                                        e = e8;
                                        if (MBridgeConstans.DEBUG) {
                                            o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    str2 = "";
                                }
                            }
                        }
                        it = it2;
                        str = "dyview";
                        str2 = "";
                        charSequence = ".zip";
                        cVar = rewardTemplateMode;
                    } else {
                        it = it2;
                        str = "dyview";
                        str2 = "";
                        charSequence = ".zip";
                        cVar = rewardTemplateMode;
                    }
                    str3 = campaignEx2.getendcard_url();
                    zIsDynamicView = campaignEx2.isDynamicView();
                    boolean zL2 = t0.l(str3);
                    if (!TextUtils.isEmpty(str3)) {
                        if (zIsDynamicView || zL2) {
                            b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str3, this.g, (CopyOnWriteArrayList<CampaignEx>) this.f1731a);
                        } else if (t0.a(str, str3)) {
                            i = Integer.parseInt(z0.a(str3, "ecid"));
                            b.this.a(2, campaignEx2, AbstractC3950lJ.n(i, str2), str3);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                        com.mbridge.msdk.foundation.same.image.b.a(this.b).a(iconUrl, new j(b.this.f1730a, 0, this.e, this.c, this.f, campaignEx2));
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        com.mbridge.msdk.foundation.same.image.b.a(this.b).a(imageUrl, new j(b.this.f1730a, 0, this.e, this.c, this.f, campaignEx2));
                    }
                    if (cVar != null) {
                        strC = cVar.c();
                        if (TextUtils.isEmpty(strC) || campaignEx2.isDynamicView()) {
                            campaignEx = campaignEx2;
                        } else {
                            int i2 = campaignEx2.getAabEntity() != null ? campaignEx2.getAabEntity().h3c : 0;
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                            cVar2.f(i2);
                            if (strC.contains(charSequence)) {
                                o0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                try {
                                    campaignEx = campaignEx2;
                                    try {
                                        H5DownLoadManager.getInstance().downloadH5Res(cVar2, strC, new l(this.b, this.e, this.c, this.f, campaignEx2, 313, b.this.f1730a, this.g, this.f1731a));
                                    } catch (Exception e10) {
                                        e = e10;
                                        if (MBridgeConstans.DEBUG) {
                                            o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    campaignEx = campaignEx2;
                                }
                            } else {
                                campaignEx = campaignEx2;
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar2, strC, new i(313, this.e, this.c, this.f, campaignEx, this.g, b.this.f1730a, this.f1731a));
                                } catch (Exception e12) {
                                    if (MBridgeConstans.DEBUG) {
                                        o0.b("RewardCampaignsResourceManager", e12.getLocalizedMessage());
                                    }
                                }
                            }
                        }
                        listA = cVar.a();
                        if (listA != null && listA.size() > 0) {
                            for (CampaignEx.c.a aVar : listA) {
                                if (aVar == null && (list = aVar.f1151a) != null && list.size() > 0) {
                                    for (String str5 : aVar.f1151a) {
                                        if (!TextUtils.isEmpty(str5)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.b).a(str5, new j(b.this.f1730a, 1, this.e, this.c, this.f, campaignEx));
                                            } catch (Exception e13) {
                                                if (MBridgeConstans.DEBUG) {
                                                    o0.b("RewardCampaignsResourceManager", e13.getLocalizedMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it2 = it;
                }
            }
        }
    }

    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1733a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ n d;
        final /* synthetic */ Context e;
        final /* synthetic */ CampaignEx f;

        public c(String str, String str2, String str3, n nVar, Context context, CampaignEx campaignEx) {
            this.f1733a = str;
            this.b = str2;
            this.c = str3;
            this.d = nVar;
            this.e = context;
            this.f = campaignEx;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            Exception exc;
            String str3;
            String str4 = "RewardCampaignsResourceManager";
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f1733a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString("request_id", this.c);
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                b.this.f1730a.sendMessage(messageObtain);
                if (this.d != null) {
                    try {
                        this.d.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.f1733a, this.c), "", null, null));
                    } catch (Exception e) {
                        try {
                            o0.b("RewardCampaignsResourceManager", e.getMessage());
                        } catch (Exception e2) {
                            exc = e2;
                            str4 = "RewardCampaignsResourceManager";
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f1733a);
                            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                            bundle2.putString("request_id", this.c);
                            bundle2.putString("url", str2);
                            bundle2.putString(PglCryptUtils.KEY_MESSAGE, exc.getMessage());
                            messageObtain2.setData(bundle2);
                            b.this.f1730a.sendMessage(messageObtain2);
                            if (this.d != null) {
                                try {
                                    this.d.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.f1733a, this.c), "", exc, null));
                                } catch (Exception e3) {
                                    str3 = str4;
                                    o0.b(str3, e3.getMessage());
                                    o0.b(str3, exc.getLocalizedMessage());
                                }
                            }
                            str3 = str4;
                            o0.b(str3, exc.getLocalizedMessage());
                        }
                    }
                }
                try {
                    b.this.a(this.e, 3, this.f, str2, str, this.f1733a, "");
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = 105;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f1733a);
                    bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                    bundle3.putString("request_id", this.c);
                    bundle3.putString("url", str2);
                    bundle3.putString(PglCryptUtils.KEY_MESSAGE, exc.getMessage());
                    messageObtain3.setData(bundle3);
                    b.this.f1730a.sendMessage(messageObtain3);
                    if (this.d != null) {
                        this.d.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.f1733a, this.c), "", exc, null));
                    }
                    str3 = str4;
                    o0.b(str3, exc.getLocalizedMessage());
                }
            } catch (Exception e5) {
                e = e5;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            try {
                o0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f1733a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString("request_id", this.c);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f1730a.sendMessage(messageObtain);
                n nVar = this.d;
                if (nVar != null) {
                    nVar.a(this.b, this.f1733a, this.c, str);
                }
                if (z) {
                    return;
                }
                b.this.a(this.e, 1, this.f, str, "", this.f1733a, str2);
            } catch (Exception e) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f1733a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle2.putString("request_id", this.c);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                b.this.f1730a.sendMessage(messageObtain2);
                if (this.d != null) {
                    try {
                        this.d.a(str, this.c, b.b(880005, new MBridgeIds(this.b, this.f1733a, this.c), "", e, null));
                    } catch (Exception e2) {
                        o0.b("RewardCampaignsResourceManager", e2.getMessage());
                    }
                }
                b.this.a(this.e, 3, this.f, str, e.getLocalizedMessage(), this.f1733a, str2);
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1734a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        public d(CampaignEx campaignEx, Context context, int i, String str, String str2, String str3, String str4) {
            this.f1734a = campaignEx;
            this.b = context;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1734a == null || this.b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
                mVar.j("m_download_end");
                Context context = this.b;
                if (context != null) {
                    mVar.c(k0.s(context.getApplicationContext()));
                }
                mVar.d(this.c);
                CampaignEx campaignEx = this.f1734a;
                if (campaignEx != null) {
                    mVar.b(campaignEx.getId());
                    mVar.n(this.f1734a.getRequestId());
                    mVar.k(this.f1734a.getCurrentLocalRid());
                    mVar.o(this.f1734a.getRequestIdNotice());
                }
                mVar.b("url", this.d);
                mVar.t(this.d);
                mVar.m(this.e);
                mVar.u(this.f);
                if (!TextUtils.isEmpty(this.g)) {
                    mVar.q(this.g);
                }
                mVar.e(1);
                mVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, this.f1734a);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1735a;
        final /* synthetic */ WindVaneWebView b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ CopyOnWriteArrayList d;
        final /* synthetic */ String e;
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f;
        final /* synthetic */ String g;

        public e(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f1735a = z;
            this.b = windVaneWebView;
            this.c = campaignEx;
            this.d = copyOnWriteArrayList;
            this.e = str;
            this.f = cVar;
            this.g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f1735a, this.b, this.c.getRewardTemplateMode().e(), 0, this.c, (CopyOnWriteArrayList<CampaignEx>) this.d, H5DownLoadManager.getInstance().getH5ResAddress(this.c.getRewardTemplateMode().e()), this.e, this.f, this.g, b.this.b);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1736a;
        boolean b;
        int c;
        int d;
        String e;
        String f;
        int g;
        CopyOnWriteArrayList<CampaignEx> h;
        CopyOnWriteArrayList<CampaignEx> i;

        public f(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f1736a = z;
            this.b = z2;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = str2;
            this.g = i3;
            this.h = copyOnWriteArrayList;
            this.i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {
        private int b;
        private final String c;
        private final String d;
        private final String e;
        private CampaignEx f;
        private n g;
        private Handler h;
        private CopyOnWriteArrayList<CampaignEx> i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1738a = false;
        private final long j = System.currentTimeMillis();

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1739a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            public a(int i, long j, String str, String str2, String str3) {
                this.f1739a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("m_download_end", this.f1739a, this.b + "", this.c, i.this.f.getId(), i.this.d, this.d, "2");
                    mVar.n(i.this.f.getRequestId());
                    mVar.k(i.this.f.getCurrentLocalRid());
                    mVar.o(i.this.f.getRequestIdNotice());
                    mVar.b(i.this.f.getId());
                    mVar.a(i.this.f.getAdSpaceT());
                    mVar.b("scenes", "1");
                    mVar.b("url", this.c);
                    if (i.this.f.getAdType() == 287) {
                        mVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (i.this.f.getAdType() == 94) {
                        mVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.e)) {
                        mVar.q(this.e);
                    }
                    b.b(mVar, i.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, i.this.d, i.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = nVar;
            this.h = handler;
            this.i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i = this.b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f1738a) {
                    a(3, System.currentTimeMillis() - this.j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            if (this.g != null) {
                try {
                    this.g.a(str, this.e, b.b(880006, new MBridgeIds(this.c, this.d, this.e), str2, null, null));
                } catch (Exception e) {
                    o0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i = this.b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f1738a) {
                    a(1, System.currentTimeMillis() - this.j, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            n nVar = this.g;
            if (nVar != null) {
                nVar.a(this.c, this.d, this.e, str);
            }
        }

        public void a(boolean z) {
            this.f1738a = z;
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, j, str, str2, str3));
        }
    }

    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1740a;
        private int b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1741a;

            public a(String str) {
                this.f1741a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        o0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
                        mVar.j("2000044");
                        mVar.c(k0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        mVar.b(j.this.f.getId());
                        mVar.i(j.this.f.getImageUrl());
                        mVar.n(j.this.f.getRequestId());
                        mVar.k(j.this.f.getCurrentLocalRid());
                        mVar.o(j.this.f.getRequestIdNotice());
                        mVar.u(j.this.c);
                        mVar.m(this.f1741a);
                        mVar.b("scenes", "1");
                        nVarA.a(mVar);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f1740a = handler;
            this.b = i;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            messageObtain.setData(bundle);
            this.f1740a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            messageObtain.setData(bundle);
            this.f1740a.sendMessage(messageObtain);
        }
    }

    public static final class l implements H5DownLoadManager.ZipDownloadListener {
        private Context b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;
        private int g;
        private Handler h;
        private n i;
        private CopyOnWriteArrayList<CampaignEx> j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1743a = false;
        private long k = System.currentTimeMillis();

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1744a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;

            public a(int i, String str, String str2, String str3) {
                this.f1744a = i;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null || l.this.b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
                    mVar.j("m_download_end");
                    if (l.this.b != null) {
                        mVar.c(k0.s(l.this.b.getApplicationContext()));
                    }
                    mVar.d(this.f1744a);
                    if (l.this.f != null) {
                        mVar.b(l.this.f.getId());
                        mVar.n(l.this.f.getRequestId());
                        mVar.k(l.this.f.getCurrentLocalRid());
                        mVar.o(l.this.f.getRequestIdNotice());
                    }
                    mVar.t(this.b);
                    mVar.m(this.c);
                    mVar.u(l.this.c);
                    if (!TextUtils.isEmpty(this.d)) {
                        mVar.q(this.d);
                    }
                    mVar.e(2);
                    mVar.b("scenes", "1");
                    mVar.b("url", this.b);
                    b.b(mVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        public class RunnableC0221b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1745a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            public RunnableC0221b(int i, long j, String str, String str2, String str3) {
                this.f1745a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("m_download_end", this.f1745a, this.b + "", this.c, l.this.f.getId(), l.this.c, this.d, "1");
                    mVar.n(l.this.f.getRequestId());
                    mVar.k(l.this.f.getCurrentLocalRid());
                    mVar.o(l.this.f.getRequestIdNotice());
                    mVar.b(l.this.f.getId());
                    mVar.a(l.this.f.getAdSpaceT());
                    mVar.q(this.e);
                    mVar.b("scenes", "1");
                    if (l.this.f.getAdType() == 287) {
                        mVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (l.this.f.getAdType() == 94) {
                        mVar.a("1");
                    }
                    mVar.b("url", this.c);
                    mVar.e(3);
                    b.b(mVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, l.this.c, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = context;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = i;
            this.h = handler;
            this.i = nVar;
            this.j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str2);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f1743a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            bundle3.putString("url", str2);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            if (this.i != null) {
                try {
                    this.i.a(str2, this.e, b.b(880006, new MBridgeIds(this.d, this.c, this.e), "", null, null));
                } catch (Exception e) {
                    o0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
            a(3, str2, str, "");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.h.sendMessage(messageObtain2);
                if (this.f1743a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            messageObtain3.setData(bundle3);
            this.h.sendMessage(messageObtain3);
            n nVar = this.i;
            if (nVar != null) {
                nVar.a(this.d, this.c, this.e, str);
            }
            if (z) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z) {
            this.f1743a = z;
        }

        private void a(int i, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, str, str2, str3));
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0221b(i, j, str, str2, str3));
        }
    }

    public static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f1746a;
        private ConcurrentHashMap<String, h> b;
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> c;

        public m(Looper looper) {
            super(looper);
            this.b = new ConcurrentHashMap<>();
            this.c = new ConcurrentHashMap<>();
        }

        public void a(String str, String str2, String str3, h hVar) {
            this.b.put(str2 + "_" + str3, hVar);
        }

        /* JADX WARN: Code duplicated, block: B:169:0x0362 A[Catch: Exception -> 0x0355, TRY_LEAVE, TryCatch #9 {Exception -> 0x0355, blocks: (B:161:0x033b, B:169:0x0362), top: B:244:0x009e }] */
        /* JADX WARN: Code duplicated, block: B:174:0x039b A[Catch: Exception -> 0x03a5, TryCatch #8 {Exception -> 0x03a5, blocks: (B:172:0x0395, B:174:0x039b, B:178:0x03ac, B:180:0x03b2, B:182:0x03bc, B:190:0x03cb, B:193:0x03da, B:196:0x03e9, B:199:0x03f8, B:202:0x0408), top: B:242:0x0395 }] */
        /* JADX WARN: Code duplicated, block: B:177:0x03aa  */
        /* JADX WARN: Code duplicated, block: B:184:0x03c0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:185:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:187:0x03c6  */
        /* JADX WARN: Code duplicated, block: B:193:0x03da A[Catch: Exception -> 0x03a5, TryCatch #8 {Exception -> 0x03a5, blocks: (B:172:0x0395, B:174:0x039b, B:178:0x03ac, B:180:0x03b2, B:182:0x03bc, B:190:0x03cb, B:193:0x03da, B:196:0x03e9, B:199:0x03f8, B:202:0x0408), top: B:242:0x0395 }] */
        /* JADX WARN: Code duplicated, block: B:196:0x03e9 A[Catch: Exception -> 0x03a5, TryCatch #8 {Exception -> 0x03a5, blocks: (B:172:0x0395, B:174:0x039b, B:178:0x03ac, B:180:0x03b2, B:182:0x03bc, B:190:0x03cb, B:193:0x03da, B:196:0x03e9, B:199:0x03f8, B:202:0x0408), top: B:242:0x0395 }] */
        /* JADX WARN: Code duplicated, block: B:199:0x03f8 A[Catch: Exception -> 0x03a5, TryCatch #8 {Exception -> 0x03a5, blocks: (B:172:0x0395, B:174:0x039b, B:178:0x03ac, B:180:0x03b2, B:182:0x03bc, B:190:0x03cb, B:193:0x03da, B:196:0x03e9, B:199:0x03f8, B:202:0x0408), top: B:242:0x0395 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v25 */
        /* JADX WARN: Type inference failed for: r10v26 */
        /* JADX WARN: Type inference failed for: r10v27 */
        /* JADX WARN: Type inference failed for: r10v31 */
        /* JADX WARN: Type inference failed for: r10v35 */
        /* JADX WARN: Type inference failed for: r10v36 */
        /* JADX WARN: Type inference failed for: r10v37 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v42 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r14v1, types: [int] */
        /* JADX WARN: Type inference failed for: r14v10 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [int] */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ?? r6;
            ?? r10;
            com.mbridge.msdk.videocommon.download.b bVar;
            String str;
            boolean z;
            int i;
            boolean z2;
            int i2;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String strI = DM.i(string2, "_", string3);
            f fVar = (f) b.g.get(strI);
            h hVar = this.b.get(strI);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.c.get(strI);
            int i3 = message.what;
            ?? r15 = "RewardCampaignsResourceManager";
            switch (i3) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i3) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            if (fVar != null && hVar != null) {
                                String string4 = data.getString(PglCryptUtils.KEY_MESSAGE);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                ?? C = b.c(message.what);
                                String str2 = "resource download failed " + b.d(message.what) + " " + string4;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.h;
                                CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.h.get(0);
                                try {
                                    try {
                                        if (!fVar.f1736a) {
                                            bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                            str = fVar.e;
                                            z = fVar.b;
                                            i = fVar.d;
                                            z2 = fVar.f1736a;
                                            if (bVar.a(94, str, z, i, z2, fVar.c, copyOnWriteArrayList)) {
                                                hVar.a(string, string2, string3, fVar.h);
                                                r6 = C;
                                                r10 = 0;
                                            } else {
                                                if (campaignEx != null) {
                                                    i2 = message.what;
                                                    if (i2 != 200) {
                                                        if (i2 != 201) {
                                                            if (i2 != 203) {
                                                                if (i2 != 205) {
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    }
                                                }
                                                r6 = C;
                                                r10 = 0;
                                                r10 = 0;
                                                hVar.a(fVar.h, b.b(r6 == true ? 1 : 0, new MBridgeIds(string, string2, string3), str2, null, null));
                                                r6 = r6;
                                            }
                                            this.b.remove(strI);
                                            b.g.remove(strI);
                                            this.c.remove(strI);
                                            C = i;
                                            r15 = z2;
                                        } else {
                                            try {
                                                if (fVar.i != null) {
                                                    if (fVar.c != 1) {
                                                        String string5 = data.getString("url");
                                                        int i4 = message.what;
                                                        if (i4 == 200) {
                                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                                if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                                    o0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                                                }
                                                                break;
                                                            }
                                                            for (int i5 = 0; i5 < fVar.i.size(); i5++) {
                                                                if (fVar.i.get(i5).getVideoUrlEncode().equals(string5)) {
                                                                    fVar.i.remove(i5);
                                                                }
                                                            }
                                                            b.g.remove(strI);
                                                            b.g.put(strI, fVar);
                                                        } else if (i4 == 201) {
                                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                o0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                            } else {
                                                                for (int i6 = 0; i6 < fVar.i.size(); i6++) {
                                                                    CampaignEx campaignEx2 = fVar.i.get(i6);
                                                                    if (campaignEx2.getRewardTemplateMode() != null && campaignEx2.getRewardTemplateMode().c().equals(string5)) {
                                                                        fVar.i.remove(i6);
                                                                    }
                                                                    if (!TextUtils.isEmpty(campaignEx2.getendcard_url()) && campaignEx2.getendcard_url().equals(string5)) {
                                                                        fVar.i.remove(i6);
                                                                    }
                                                                }
                                                                b.g.remove(strI);
                                                                b.g.put(strI, fVar);
                                                            }
                                                        } else if (i4 == 203) {
                                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                o0.c("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                                            } else {
                                                                for (int i7 = 0; i7 < fVar.i.size(); i7++) {
                                                                    CampaignEx campaignEx3 = fVar.i.get(i7);
                                                                    if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().e().equals(string5)) {
                                                                        fVar.i.remove(i7);
                                                                    }
                                                                }
                                                                b.g.remove(strI);
                                                                b.g.put(strI, fVar);
                                                            }
                                                        } else if (i4 == 205) {
                                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                o0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                            } else {
                                                                fVar.i.clear();
                                                                b.g.remove(strI);
                                                                b.g.put(strI, fVar);
                                                            }
                                                        }
                                                        try {
                                                            if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.f1736a, fVar.c, copyOnWriteArrayList)) {
                                                                try {
                                                                    hVar.a(string, string2, string3, fVar.h);
                                                                    this.b.remove(strI);
                                                                    b.g.remove(strI);
                                                                    this.c.remove(strI);
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    r6 = C;
                                                                    r10 = 0;
                                                                    hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                                    return;
                                                                }
                                                            } else if (fVar.i.size() == 0) {
                                                                ?? r16 = C;
                                                                C = 0;
                                                                hVar.a(fVar.h, b.b(r16 == true ? 1 : 0, new MBridgeIds(string, string2, string3), str2, null, null));
                                                                this.b.remove(strI);
                                                                b.g.remove(strI);
                                                                this.c.remove(strI);
                                                                r15 = r16;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            r15 = C;
                                                        }
                                                        break;
                                                    } else {
                                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                            int i8 = message.what;
                                                            if (i8 != 200) {
                                                                if (i8 != 201) {
                                                                    if (i8 != 203) {
                                                                        if (i8 == 205) {
                                                                            if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.h;
                                                                                if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                                                    CampaignEx campaignEx4 = fVar.h.get(0);
                                                                                    if (campaignEx4.getCMPTEntryUrl().equals(campaignEx4.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                    }
                                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                            }
                                                        }
                                                        try {
                                                            r10 = 0;
                                                            try {
                                                                hVar.a(fVar.h, b.b(C, new MBridgeIds(string, string2, string3), str2, null, null));
                                                                this.b.remove(strI);
                                                                b.g.remove(strI);
                                                                this.c.remove(strI);
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                r6 = C;
                                                                hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                                return;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            r10 = 0;
                                                        }
                                                    }
                                                    C = 0;
                                                    r10 = C;
                                                    r6 = r15;
                                                    break;
                                                } else {
                                                    bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                                    str = fVar.e;
                                                    z = fVar.b;
                                                    try {
                                                        i = fVar.d;
                                                        z2 = fVar.f1736a;
                                                        try {
                                                            if (bVar.a(94, str, z, i, z2, fVar.c, copyOnWriteArrayList)) {
                                                                hVar.a(string, string2, string3, fVar.h);
                                                                r6 = C;
                                                                r10 = 0;
                                                            } else {
                                                                if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                                    i2 = message.what;
                                                                    if (i2 != 200) {
                                                                        if (i2 != 201) {
                                                                            if (i2 != 203) {
                                                                                if (i2 != 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                                }
                                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                            }
                                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                        }
                                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                                    }
                                                                }
                                                                r6 = C;
                                                                r10 = 0;
                                                                r10 = 0;
                                                                try {
                                                                    hVar.a(fVar.h, b.b(r6 == true ? 1 : 0, new MBridgeIds(string, string2, string3), str2, null, null));
                                                                    r6 = r6;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                }
                                                            }
                                                            this.b.remove(strI);
                                                            b.g.remove(strI);
                                                            this.c.remove(strI);
                                                            C = i;
                                                            r15 = z2;
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            r6 = C;
                                                            r10 = 0;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        r6 = C;
                                                    }
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                r15 = C;
                                            }
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    r6 = C;
                                }
                                hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str2, e, r10));
                                break;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                try {
                    if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.f1736a, fVar.c, copyOnWriteArrayList)) {
                        hVar.a(string, string2, string3, fVar.h);
                        this.b.remove(strI);
                        b.g.remove(strI);
                        this.c.remove(strI);
                    }
                } catch (Exception e11) {
                    e = e11;
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }

        public void a(Context context) {
            this.f1746a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.c.put(str, copyOnWriteArrayList);
        }
    }

    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    public interface o {
        void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a);
    }

    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1747a;
        private Runnable b;
        private final boolean c;
        private final boolean d;
        private String e;
        private final o f;
        private final WindVaneWebView g;
        private final String h;
        private final String i;
        private final String j;
        private final com.mbridge.msdk.videocommon.a.C0272a k;
        private final CampaignEx l;
        private CopyOnWriteArrayList<CampaignEx> m;
        private long n;
        private boolean o;
        private boolean p;
        private final Runnable q;
        private final Runnable r;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f1748a;
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0272a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            public a(o oVar, com.mbridge.msdk.videocommon.a.C0272a c0272a, String str, String str2, String str3, String str4) {
                this.f1748a = oVar;
                this.b = c0272a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0272a c0272a;
                if (this.f1748a != null && (c0272a = this.b) != null) {
                    c0272a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    o oVar = this.f1748a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("_");
                    sb.append(this.e);
                    oVar.a(sb.toString(), this.f, this.c, this.d, this.e, this.b);
                }
                com.mbridge.msdk.videocommon.a.C0272a c0272a2 = this.b;
                if (c0272a2 == null || (windVaneWebViewB = c0272a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        public class RunnableC0222b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f1749a;
            final /* synthetic */ com.mbridge.msdk.videocommon.a.C0272a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            public RunnableC0222b(o oVar, com.mbridge.msdk.videocommon.a.C0272a c0272a, String str, String str2, String str3, String str4) {
                this.f1749a = oVar;
                this.b = c0272a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0272a c0272a;
                if (this.f1749a != null && (c0272a = this.b) != null) {
                    c0272a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    o oVar = this.f1749a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("_");
                    sb.append(this.e);
                    oVar.a(sb.toString(), this.f, this.c, this.d, this.e, this.b);
                }
                com.mbridge.msdk.videocommon.a.C0272a c0272a2 = this.b;
                if (c0272a2 == null || (windVaneWebViewB = c0272a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z, boolean z2, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0272a c0272a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            this.f1747a = handler;
            this.b = runnable;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = oVar;
            this.g = windVaneWebView;
            this.h = str2;
            this.i = str4;
            this.j = str3;
            this.k = c0272a;
            this.l = campaignEx;
            this.m = copyOnWriteArrayList;
            this.n = j;
            a aVar = new a(oVar, c0272a, str4, str, str2, str3);
            this.r = aVar;
            this.q = new RunnableC0222b(oVar, c0272a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i);
            Handler handler2 = this.f1747a;
            if (handler2 != null && (runnable2 = this.q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f1747a;
            if (handler3 != null && (runnable = this.r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.l, eVar);
            } catch (Throwable th) {
                o0.b("WindVaneWebView", th.getMessage());
            }
            if (this.p) {
                return;
            }
            String str = this.i + "_" + this.h;
            if (i == 1) {
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f1747a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.k;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                if (this.c) {
                    if (this.d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str, this.j, this.i, this.e, this.h, this.k);
                }
            } else if (this.f != null) {
                this.f.a(str, this.e, this.h, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), AbstractC3950lJ.p("readyState:", i), null, this.l));
            }
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f1747a;
            if (handler2 != null && (runnable2 = this.r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f1747a;
                if (handler3 != null && (runnable = this.q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.i + "_" + this.h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f1747a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.k;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                if (this.c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str2, this.j, this.i, this.e, this.h, this.k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f1747a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f1747a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.i + "_" + this.h;
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.k;
                if (c0272a != null) {
                    c0272a.a(false);
                }
                if (this.f != null) {
                    this.f.a(str3, this.e, str2, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), i + "#" + str, null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f1747a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f1747a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.i + "_" + this.h;
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.k;
                if (c0272a != null) {
                    c0272a.a(false);
                }
                if (this.f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.j, this.i, this.e);
                    StringBuilder sb = new StringBuilder("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f.a(str, this.e, this.h, this.k, b.b(880009, mBridgeIds, sb.toString(), null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }
    }

    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1750a;
        private final boolean b;
        private final WindVaneWebView c;
        private final String d;
        private final String e;
        private final com.mbridge.msdk.videocommon.a.C0272a f;
        private final CampaignEx g;
        private boolean h;
        private String i;
        private boolean j;
        private boolean k;

        public q(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, CampaignEx campaignEx, boolean z2, String str4) {
            this.b = z;
            this.c = windVaneWebView;
            this.d = str2;
            this.e = str3;
            this.f = c0272a;
            this.g = campaignEx;
            this.f1750a = str;
            this.h = z2;
            this.i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.g, eVar);
            } catch (Throwable th) {
                o0.b("WindVaneWebView", th.getMessage());
            }
            if (this.k) {
                return;
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f1750a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
            String str = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
            if (i == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.f;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
                com.mbridge.msdk.videocommon.a.C0272a c0272a2 = this.f;
                if (c0272a2 != null) {
                    c0272a2.a(false);
                }
            }
            this.k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f1750a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.f;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                String str2 = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.g.getRequestIdNotice(), this.f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.g.getRequestIdNotice(), this.f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
            com.mbridge.msdk.videocommon.a.C0272a c0272a = this.f;
            if (c0272a != null) {
                c0272a.a(false);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f1750a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f1751a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2) {
        if (i2 == 200) {
            return 880004;
        }
        if (i2 == 201) {
            return 880007;
        }
        if (i2 != 203) {
            return i2 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String d(int i2) {
        if (i2 == 200) {
            return "video";
        }
        if (i2 == 201) {
            return "zip/html";
        }
        if (i2 != 203) {
            return i2 != 205 ? "unknown" : "tpl";
        }
        return "temp";
    }

    private b() {
        this.c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.d = "down_type";
        this.e = "h3c";
        this.f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f1730a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f1751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.m mVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarD != null) {
                mVar.s(cVarD.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                mVar.r(aVarC.f());
            }
        } catch (Exception e2) {
            o0.b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i2, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i2);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.d(str);
        bVar.a(campaignEx);
        return bVar;
    }

    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1742a;
        private final String b;
        private final String c;
        private final String d;

        public k(Handler handler, String str, String str2, String str3) {
            this.f1742a = handler;
            this.c = str;
            this.b = str2;
            this.d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f1742a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str2);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f1742a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z, int i2, boolean z2, int i3, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        String str4 = str2 + "_" + str3;
        g.put(str4, new f(z, z2, i2, copyOnWriteArrayList.size(), str2, str3, i3, copyOnWriteArrayList));
        this.f1730a.a(str, str2, str3, hVar);
        this.f1730a.a(context);
        this.f1730a.a(str4, copyOnWriteArrayList);
        this.f1730a.post(new a(copyOnWriteArrayList, context, str2, i3, str, str3, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, CampaignEx campaignEx, String str, String str2) {
        x.a(i2, str, str2, new C0220b(i2, campaignEx), campaignEx);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    public class C0220b implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1732a;
        final /* synthetic */ CampaignEx b;

        public C0220b(int i, CampaignEx campaignEx) {
            this.f1732a = i;
            this.b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.x.c
        public void a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
                int i = this.f1732a;
                if (i == 0) {
                    mVar.e(1);
                    mVar.d(1);
                    mVar.j("m_download_end");
                } else if (i == 1) {
                    mVar.e(2);
                    mVar.d(1);
                    mVar.j("m_download_end");
                } else if (i == 2) {
                    mVar.e(3);
                    mVar.d(1);
                    mVar.j("m_download_end");
                    mVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.m.N : com.mbridge.msdk.foundation.entity.m.O);
                    mVar.f("1");
                }
                mVar.o(this.b.getRequestIdNotice());
                mVar.b("url", str);
                mVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, this.b);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.x.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
            int i = this.f1732a;
            if (i == 0) {
                mVar.e(1);
                mVar.d(3);
                mVar.j("m_download_end");
            } else if (i == 1) {
                mVar.e(2);
                mVar.d(3);
                mVar.j("m_download_end");
            } else if (i == 2) {
                mVar.e(3);
                mVar.d(3);
                mVar.j("m_download_end");
                mVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.m.N : com.mbridge.msdk.foundation.entity.m.O);
                mVar.f("1");
            }
            b.b(mVar, this.b);
            mVar.o(this.b.getRequestIdNotice());
            mVar.m(message);
            mVar.b("scenes", "1");
            mVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f1730a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f1730a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
            }
        }
    }

    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f1737a;
        private final Runnable b;
        private final boolean c;
        private final boolean d;
        private int e;
        private String f;
        private String g;
        private String h;
        private String i;
        private com.mbridge.msdk.videocommon.a.C0272a j;
        private CampaignEx k;
        private CopyOnWriteArrayList<CampaignEx> l;
        private com.mbridge.msdk.videocommon.setting.c m;
        private final o n;
        private boolean o;
        private boolean p;
        private boolean q;
        private int r = 0;
        private boolean s;
        private long t;

        public g(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0272a c0272a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4, long j) {
            this.f1737a = handler;
            this.b = runnable;
            this.c = z2;
            this.d = z3;
            this.e = i;
            this.f = str;
            this.h = str2;
            this.g = str3;
            this.i = str4;
            this.j = c0272a;
            this.k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.m = cVar;
            this.n = oVar;
            this.o = z4;
            this.s = z;
            this.t = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.k, eVar);
            } catch (Throwable th) {
                o0.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.q) {
                return;
            }
            String str = this.g + "_" + this.f;
            if (i == 1) {
                if (this.o) {
                    com.mbridge.msdk.videocommon.a.d(this.g + "_" + this.i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.g + "_" + this.i);
                }
                com.mbridge.msdk.videocommon.a.a(this.g + "_" + this.i + "_" + this.f, this.j, true, this.o);
                Handler handler = this.f1737a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.j;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str, this.h, this.g, this.i, this.f, this.j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
                com.mbridge.msdk.videocommon.a.C0272a c0272a2 = this.j;
                if (c0272a2 != null) {
                    c0272a2.a(false);
                }
                if (this.n != null) {
                    this.n.a(str, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), AbstractC3950lJ.p("readyState:", i), null, this.k));
                }
            }
            this.q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.p) {
                return;
            }
            String str2 = this.g + "_" + this.f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                Handler handler = this.f1737a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.j;
                if (c0272a != null) {
                    c0272a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str2, this.h, this.g, this.i, this.f, this.j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
            if (this.n != null) {
                String str3 = this.g + "_" + this.f;
                com.mbridge.msdk.videocommon.a.C0272a c0272a = this.j;
                if (c0272a != null) {
                    c0272a.a(false);
                }
                this.n.a(str3, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "onReceivedError： " + i + "  " + str, null, this.k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.g, this.i);
                } catch (Throwable th) {
                    o0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.d(z);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i2, str2, true, 1));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RVWindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                    if (windVaneWebView != null) {
                        b.b().a(this.s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.r == 0 ? 3 : 6);
                        this.r++;
                    }
                } catch (Throwable th) {
                    o0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f1730a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (t0.a("dyview", cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f1730a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(campaignEx.getCurrentLocalRid());
                    if (cVarA == null) {
                        cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarA;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, nVar, context, campaignEx));
                } catch (Exception e2) {
                    o0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i2, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i2, str, str2, str3, str4));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01c4 A[Catch: all -> 0x003c, TryCatch #9 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:16:0x0047, B:26:0x008c, B:29:0x0092, B:31:0x0098, B:34:0x00a7, B:36:0x00dd, B:38:0x00f3, B:65:0x01c0, B:67:0x01c4, B:69:0x01cf, B:33:0x00a1, B:48:0x0118, B:50:0x0128, B:52:0x013a, B:62:0x0176), top: B:84:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:16:0x0047, B:26:0x008c, B:29:0x0092, B:31:0x0098, B:34:0x00a7, B:36:0x00dd, B:38:0x00f3, B:65:0x01c0, B:67:0x01c4, B:69:0x01cf, B:33:0x00a1, B:48:0x0118, B:50:0x0128, B:52:0x013a, B:62:0x0176), top: B:84:0x000b }] */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        com.mbridge.msdk.videocommon.a.C0272a c0272a;
        String str8;
        String str9;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str10 = str5;
        synchronized (this) {
            String str11 = str4 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (t0.i(str)) {
                    if (oVar != null) {
                        oVar.a(str11, str3, str4, str5, str, null);
                    }
                    return;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                com.mbridge.msdk.videocommon.a.C0272a c0272a2 = new com.mbridge.msdk.videocommon.a.C0272a();
                try {
                    try {
                        try {
                            try {
                                try {
                                    WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                                    if (campaignEx != null) {
                                        try {
                                            windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                                        } catch (Exception unused) {
                                            c0272a = c0272a2;
                                            str8 = str4;
                                            str9 = str;
                                            if (oVar != null) {
                                                c0272a.a(true);
                                                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str8 + "_" + str10 + "_" + str9, true);
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str8);
                                                sb.append("_");
                                                sb.append(str9);
                                                oVar.a(sb.toString(), str3, str4, str5, str, c0272a);
                                            }
                                            return;
                                        } catch (Throwable unused2) {
                                            if (oVar != null) {
                                                c0272a2.a(true);
                                                ResDownloadCheckManager resDownloadCheckManager = ResDownloadCheckManager.getInstance();
                                                StringBuilder sb2 = new StringBuilder();
                                                str7 = str4;
                                                try {
                                                    sb2.append(str7);
                                                    sb2.append("_");
                                                    sb2.append(str10);
                                                    sb2.append("_");
                                                    sb2.append(str);
                                                    resDownloadCheckManager.setTemplatePreLoadDone(sb2.toString(), true);
                                                    oVar.a(str7 + "_" + str, str3, str4, str5, str, c0272a2);
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    if (MBridgeConstans.DEBUG) {
                                                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                    }
                                                    if (oVar != null) {
                                                        oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str7, str10), "", e, campaignEx));
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                    }
                                    windVaneWebView2.setTempTypeForMetrics(2);
                                    try {
                                        c0272a2.a(windVaneWebView2);
                                        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                                        } else {
                                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                                        }
                                        com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                                        kVar2.g(i2);
                                        kVar2.setUnitId(str4);
                                        kVar2.setRewardUnitSetting(cVar);
                                        kVar2.d(z);
                                        try {
                                            windVaneWebView2.setWebViewListener(new p(handler, null, z2, z3, str5, oVar, windVaneWebView, str, str3, str4, c0272a2, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                            windVaneWebView2.setObject(kVar2);
                                            windVaneWebView2.loadUrl(str2);
                                            windVaneWebView2.setRid(str5);
                                        } catch (Exception e3) {
                                            e = e3;
                                            str10 = str5;
                                            str7 = str4;
                                            if (MBridgeConstans.DEBUG) {
                                                o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            if (oVar != null) {
                                                oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str7, str10), "", e, campaignEx));
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str10 = str10;
                                    }
                                } catch (Exception unused3) {
                                    c0272a = c0272a2;
                                    str9 = str;
                                    str8 = str4;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                if (MBridgeConstans.DEBUG) {
                                    o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                }
                                if (oVar != null) {
                                    oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str7, str10), "", e, campaignEx));
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                    } catch (Exception unused5) {
                        c0272a = c0272a2;
                        str8 = str4;
                        str9 = str;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                str10 = str10;
                str7 = str4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01db A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:13:0x004b, B:15:0x007e, B:18:0x008b, B:20:0x00a6, B:22:0x00ac, B:24:0x00b6, B:27:0x00bd, B:29:0x00c3, B:30:0x00cd, B:32:0x00d3, B:34:0x00e7, B:36:0x00f5, B:38:0x00fe, B:39:0x0102, B:42:0x0113, B:44:0x0161, B:46:0x0175, B:48:0x0195, B:57:0x01db, B:58:0x01fd, B:60:0x0201, B:41:0x010c), top: B:67:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0201 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:13:0x004b, B:15:0x007e, B:18:0x008b, B:20:0x00a6, B:22:0x00ac, B:24:0x00b6, B:27:0x00bd, B:29:0x00c3, B:30:0x00cd, B:32:0x00d3, B:34:0x00e7, B:36:0x00f5, B:38:0x00fe, B:39:0x0102, B:42:0x0113, B:44:0x0161, B:46:0x0175, B:48:0x0195, B:57:0x01db, B:58:0x01fd, B:60:0x0201, B:41:0x010c), top: B:67:0x000d }] */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4) {
        String str8;
        String str9;
        com.mbridge.msdk.video.signal.impl.k kVar;
        this.b = z4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str10 = str4 + "_" + str5;
        this.b = z4;
        if (t0.i(str5)) {
            if (oVar != null) {
                oVar.a(str10, str3, str4, str, str5, null);
            }
            return;
        }
        try {
            o0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 1);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0272a c0272a = new com.mbridge.msdk.videocommon.a.C0272a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c0272a.a(windVaneWebView);
            String strB = com.mbridge.msdk.video.bt.component.d.c().b();
            String strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
            c0272a.a(strB2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str4);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
            }
            com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
            kVar2.g(i2);
            kVar2.setUnitId(str7);
            kVar2.c(strB2);
            kVar2.d(strB);
            kVar2.c(true);
            kVar2.setRewardUnitSetting(cVar);
            kVar2.d(z);
            try {
                windVaneWebView.setWebViewListener(new g(z, handler, null, z2, z3, i2, str5, str3, str4, str, c0272a, campaignEx, copyOnWriteArrayList, cVar, oVar, z4, jCurrentTimeMillis));
                windVaneWebView.setObject(kVar2);
                windVaneWebView.loadUrl(str6);
                str9 = str;
                try {
                    windVaneWebView.setRid(str9);
                    MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                    mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    mBridgeBTRootLayout.setInstanceId(strB);
                    str8 = str4;
                    try {
                        mBridgeBTRootLayout.setUnitId(str8);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strB2);
                        mBridgeBTLayout.setUnitId(str8);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        AbstractMap abstractMapB = com.mbridge.msdk.video.bt.component.d.c().b(str8, str9);
                        abstractMapB.put(strB2, mBridgeBTLayout);
                        abstractMapB.put(strB, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e2) {
                        e = e2;
                        if (oVar != null) {
                            oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    str8 = str4;
                    if (oVar != null) {
                        oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                    }
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            } catch (Exception e4) {
                e = e4;
                str9 = str;
            }
        } catch (Exception e5) {
            e = e5;
            str8 = str4;
            str9 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e()) && campaignEx.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    o0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i2 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z2) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0272a c0272a = new com.mbridge.msdk.videocommon.a.C0272a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0272a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                requestId = requestId2;
            }
            kVar.g(i2);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0272a, campaignEx, z2, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th) {
                o0.b("RewardCampaignsResourceManager", th.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().a(campaignEx.getCurrentLocalRid()) : null;
        if (cVarA == null) {
            cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarA.a(campaignEx);
        cVarA.f(a(campaignEx));
        cVarA.e(i2);
        return cVarA;
    }
}

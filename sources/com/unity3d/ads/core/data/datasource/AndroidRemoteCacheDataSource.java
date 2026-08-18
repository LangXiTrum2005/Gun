package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClient httpClient;
    private final AbstractC3899kk ioDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", l = {34, 43}, m = "getFile")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRemoteCacheDataSource.this.getFile(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ File $file;
        final /* synthetic */ HttpResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file, HttpResponse httpResponse, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$file = file;
            this.$response = httpResponse;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$file, this.$response, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$file.createNewFile();
            File file = this.$file;
            Object body = this.$response.getBody();
            AbstractC2995aW.o(body, "null cannot be cast to non-null type kotlin.ByteArray");
            WD.Y(file, (byte[]) body);
            return C5033xf0.f5238a;
        }
    }

    public AndroidRemoteCacheDataSource(AbstractC3899kk abstractC3899kk, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClient httpClient) {
        AbstractC2995aW.q(abstractC3899kk, "ioDispatcher");
        AbstractC2995aW.q(createFile, "createFile");
        AbstractC2995aW.q(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        AbstractC2995aW.q(httpClient, "httpClient");
        this.ioDispatcher = abstractC3899kk;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadFile(String str, Integer num, InterfaceC2857Wj interfaceC2857Wj) {
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65534, null), interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        File file2;
        String str3;
        Object objDownloadFile;
        AndroidRemoteCacheDataSource androidRemoteCacheDataSource;
        String str4;
        File file3;
        String str5;
        HttpResponse httpResponse;
        Integer num2;
        String str6;
        int iIntValue;
        String str7 = str2;
        Integer num3 = num;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object obj = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    Integer num4 = (Integer) anonymousClass1.L$4;
                    String str8 = (String) anonymousClass1.L$3;
                    str3 = (String) anonymousClass1.L$2;
                    File file4 = (File) anonymousClass1.L$1;
                    androidRemoteCacheDataSource = (AndroidRemoteCacheDataSource) anonymousClass1.L$0;
                    AbstractC3375el.b0(obj);
                    num3 = num4;
                    str7 = str8;
                    objDownloadFile = obj;
                    file2 = file4;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    File file5 = (File) anonymousClass1.L$5;
                    str6 = (String) anonymousClass1.L$4;
                    httpResponse = (HttpResponse) anonymousClass1.L$3;
                    num2 = (Integer) anonymousClass1.L$2;
                    String str9 = (String) anonymousClass1.L$1;
                    String str10 = (String) anonymousClass1.L$0;
                    AbstractC3375el.b0(obj);
                    file3 = file5;
                    str5 = str10;
                    str4 = str9;
                }
                if (str6 == null) {
                    str6 = "";
                }
                String str11 = str6;
                long contentSize = httpResponse.getContentSize();
                String protocol = httpResponse.getProtocol();
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
                return new CacheResult.Success(new CachedFile("", str4, str5, file3, str11, contentSize, protocol, iIntValue), CacheSource.REMOTE);
            }
            AbstractC3375el.b0(obj);
            if (str7 == null) {
                return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE);
            }
            anonymousClass1.L$0 = this;
            file2 = file;
            anonymousClass1.L$1 = file2;
            str3 = str;
            anonymousClass1.L$2 = str3;
            anonymousClass1.L$3 = str7;
            anonymousClass1.L$4 = num3;
            anonymousClass1.label = 1;
            objDownloadFile = downloadFile(str7, num3, anonymousClass1);
            if (objDownloadFile == enumC4602sk) {
                return enumC4602sk;
            }
            androidRemoteCacheDataSource = this;
            HttpResponse httpResponse2 = (HttpResponse) objDownloadFile;
            String strInvoke = str7.length() == 0 ? null : androidRemoteCacheDataSource.getFileExtensionFromUrl.invoke(str7);
            if (!HttpResponseKt.isSuccessful(httpResponse2)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE);
            }
            File fileInvoke = androidRemoteCacheDataSource.createFile.invoke(file2, str3);
            AbstractC3899kk abstractC3899kk = androidRemoteCacheDataSource.ioDispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(fileInvoke, httpResponse2, null);
            anonymousClass1.L$0 = str3;
            anonymousClass1.L$1 = str7;
            anonymousClass1.L$2 = num3;
            anonymousClass1.L$3 = httpResponse2;
            anonymousClass1.L$4 = strInvoke;
            anonymousClass1.L$5 = fileInvoke;
            anonymousClass1.label = 2;
            if (WD.X(anonymousClass2, abstractC3899kk, anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
            str4 = str7;
            file3 = fileInvoke;
            str5 = str3;
            httpResponse = httpResponse2;
            num2 = num3;
            str6 = strInvoke;
            if (str6 == null) {
                str6 = "";
            }
            String str12 = str6;
            long contentSize2 = httpResponse.getContentSize();
            String protocol2 = httpResponse.getProtocol();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            return new CacheResult.Success(new CachedFile("", str4, str5, file3, str12, contentSize2, protocol2, iIntValue), CacheSource.REMOTE);
        } catch (Exception unused) {
            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE);
        }
    }
}

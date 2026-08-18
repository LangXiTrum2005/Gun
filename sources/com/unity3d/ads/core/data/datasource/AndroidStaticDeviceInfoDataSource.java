package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion(null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final StoreDataSource storeDataSource;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {Input.Keys.BUTTON_B}, m = "fetch")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.fetch(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {492}, m = "getGPUModel")
    public static final class C21851 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public C21851(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getGPUModel(this);
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource byteStringDataSource, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(byteStringDataSource, "glInfoStore");
        AbstractC2995aW.q(analyticsDataSource, "analyticsDataSource");
        AbstractC2995aW.q(storeDataSource, "storeDataSource");
        this.context = context;
        this.glInfoStore = byteStringDataSource;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setBundleId(getAppName());
        dsl_create.setBundleVersion(getAppVersion());
        dsl_create.setAppDebuggable(isAppDebuggable());
        dsl_create.setRooted(isRooted());
        dsl_create.setOsVersion(getOsVersion());
        dsl_create.setDeviceMake(getManufacturer());
        dsl_create.setDeviceModel(getModel());
        dsl_create.setWebviewUa(getWebViewUserAgent());
        dsl_create.setScreenDensity(getScreenDensity());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        dsl_create.setScreenSize(getScreenLayout());
        dsl_create.addAllStores(dsl_create.getStores(), getStores$default(this, null, 1, null));
        dsl_create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        dsl_create.setTotalRamMemory(getTotalMemory());
        dsl_create.setCpuModel(getCPUModel());
        dsl_create.setCpuCount(getCPUCount());
        dsl_create.setAndroid(fetchAndroidStaticDeviceInfo());
        this.staticDeviceInfo = dsl_create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setApiLevel(getApiLevel());
        dsl_create.setVersionCode(getVersionCode());
        dsl_create.setAndroidFingerprint(getFingerprint());
        dsl_create.setAppInstaller(getInstallerPackageName());
        dsl_create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        dsl_create.setBuildBoard(getBoard());
        dsl_create.setBuildBrand(getBrand());
        dsl_create.setBuildDevice(getDevice());
        dsl_create.setBuildDisplay(getDisplay());
        dsl_create.setBuildFingerprint(getFingerprint());
        dsl_create.setBuildHardware(getHardware());
        dsl_create.setBuildHost(getHost());
        dsl_create.setBuildBootloader(getBootloader());
        dsl_create.setBuildProduct(getProduct());
        dsl_create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            dsl_create.setBuildId(buildId);
        }
        dsl_create.setPhoneType(getPhoneType());
        dsl_create.setSimOperator(getSimOperator());
        return dsl_create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            AbstractC2995aW.p(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Error getting package info", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            AbstractC2995aW.p(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            return (String) AbstractC2853Wf.m0(WD.O(new File("/proc/cpuinfo")));
        } catch (FileNotFoundException e) {
            DeviceLog.exception("Error reading CPU model", e);
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (!(!(signatureArr.length == 0))) {
                return "";
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            AbstractC2995aW.o(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) certificateGenerateCertificate).getEncoded()));
            AbstractC2995aW.p(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (Exception e) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getGPUModel(InterfaceC2857Wj interfaceC2857Wj) {
        C21851 c21851;
        if (interfaceC2857Wj instanceof C21851) {
            c21851 = (C21851) interfaceC2857Wj;
            int i = c21851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21851.label = i - Integer.MIN_VALUE;
            } else {
                c21851 = new C21851(interfaceC2857Wj);
            }
        } else {
            c21851 = new C21851(interfaceC2857Wj);
        }
        Object obj = c21851.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21851.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            ByteStringDataSource byteStringDataSource = this.glInfoStore;
            c21851.label = 1;
            obj = byteStringDataSource.get(c21851);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(AbstractC2307Be.f2881a);
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        String line;
        FileNotFoundException e;
        int i = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new C3770jF(7, 0);
            }
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            line = null;
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    try {
                        line = randomAccessFile.readLine();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3375el.n(randomAccessFile, th);
                            throw th2;
                        }
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    DeviceLog.exception("Error reading memory info", e);
                    return getMemoryValueFromString(line);
                }
            }
            AbstractC3375el.n(randomAccessFile, null);
        } catch (FileNotFoundException e3) {
            line = null;
            e = e3;
        }
        return getMemoryValueFromString(line);
    }

    private final long getMemoryValueFromString(String str) {
        if (str == null) {
            return 0L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup != null) {
            return Long.parseLong(strGroup);
        }
        return -1L;
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC2995aW.p(strArr, "SUPPORTED_ABIS");
        arrayList.addAll(AbstractC2340Cl.K(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String str = Build.CPU_ABI;
        AbstractC2995aW.p(str, "CPU_ABI");
        arrayList.add(str);
        String str2 = Build.CPU_ABI2;
        AbstractC2995aW.p(str2, "CPU_ABI2");
        arrayList.add(str2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        AbstractC2995aW.p(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = C2812Uq.f3846a;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final int getVersionCode() {
        return 41301;
    }

    private final String getVersionName() {
        return "4.13.1";
    }

    private final String getWebViewUserAgent() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            AbstractC2995aW.p(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e) {
            DeviceLog.exception("Exception getting webview user agent", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        boolean zI;
        PackageManager packageManager = this.context.getPackageManager();
        AbstractC2995aW.p(packageManager, "context.packageManager");
        String packageName = this.context.getPackageName();
        AbstractC2995aW.p(packageName, "context.packageName");
        boolean z = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            AbstractC2995aW.p(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            z = false;
            zI = i != 0;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Could not find name", e);
        }
        if (z) {
            try {
                Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                AbstractC2995aW.p(signatureArr, "signatures");
                for (Signature signature : signatureArr) {
                    Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    AbstractC2995aW.o(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    zI = AbstractC2995aW.i(((X509Certificate) certificateGenerateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (zI) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                DeviceLog.exception("Could not find name", e2);
            } catch (CertificateException e3) {
                DeviceLog.exception("Certificate exception", e3);
            }
        }
        return zI;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        AbstractC2995aW.p(name, "codecInfo.name");
        Locale locale = Locale.ROOT;
        AbstractC2995aW.p(locale, "ROOT");
        String lowerCase = name.toLowerCase(locale);
        AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (AbstractC3089ba0.N0(lowerCase, "arc.", false)) {
            return false;
        }
        return AbstractC3089ba0.N0(lowerCase, "omx.google.", false) || AbstractC3089ba0.N0(lowerCase, "omx.ffmpeg.", false) || (AbstractC3089ba0.N0(lowerCase, "omx.sec.", false) && AbstractC3089ba0.l0(lowerCase, ".sw.")) || AbstractC2995aW.i(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || AbstractC3089ba0.N0(lowerCase, "c2.android.", false) || AbstractC3089ba0.N0(lowerCase, "c2.google.", false) || !(AbstractC3089ba0.N0(lowerCase, "omx.", false) || AbstractC3089ba0.N0(lowerCase, "c2.", false));
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final boolean searchPathForBinary(String str) {
        List listJ;
        Collection collectionS0;
        File[] fileArrListFiles;
        String str2 = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile(":");
            AbstractC2995aW.p(patternCompile, "compile(pattern)");
            AbstractC3089ba0.I0(0);
            Matcher matcher = patternCompile.matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                listJ = arrayList;
            } else {
                listJ = AbstractC2340Cl.J(str2.toString());
            }
            if (listJ.isEmpty()) {
                collectionS0 = C2812Uq.f3846a;
                break;
            }
            ListIterator listIterator = listJ.listIterator(listJ.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionS0 = C2812Uq.f3846a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionS0 = AbstractC2853Wf.s0(listIterator.nextIndex() + 1, listJ);
                    break;
                }
            }
            String[] strArr = (String[]) collectionS0.toArray(new String[0]);
            if (strArr != null) {
                for (String str3 : strArr) {
                    File file = new File(str3);
                    if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                        for (File file2 : fileArrListFiles) {
                            if (AbstractC2995aW.i(file2.getName(), str)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (AbstractC3089ba0.o0(str2, str) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object fetch(List<String> list, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource;
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
        Object gPUModel = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(gPUModel);
            String gpuModel = this.staticDeviceInfo.getGpuModel();
            if (gpuModel != null && gpuModel.length() != 0) {
                return this.staticDeviceInfo;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.label = 1;
            gPUModel = getGPUModel(anonymousClass1);
            if (gPUModel == enumC4602sk) {
                return enumC4602sk;
            }
            androidStaticDeviceInfoDataSource = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) anonymousClass1.L$1;
            androidStaticDeviceInfoDataSource = (AndroidStaticDeviceInfoDataSource) anonymousClass1.L$0;
            AbstractC3375el.b0(gPUModel);
        }
        String str = (String) gPUModel;
        if (str == null || str.length() == 0) {
            return androidStaticDeviceInfoDataSource.staticDeviceInfo;
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = androidStaticDeviceInfoDataSource.staticDeviceInfo;
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setGpuModel(str);
        dsl_create.clearStores(dsl_create.getStores());
        dsl_create.addAllStores(dsl_create.getStores(), androidStaticDeviceInfoDataSource.getStores(list));
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_build = dsl_create._build();
        androidStaticDeviceInfoDataSource.staticDeviceInfo = staticDeviceInfo_build;
        return staticDeviceInfo_build;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        AbstractC2995aW.p(packageName, "context.packageName");
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        AndroidPreferences.setString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI, string2);
        return string2;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService(bc.ac);
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        AbstractC2995aW.p(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / ((long) 1000);
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return AbstractC3375el.U(file.getTotalSpace() / ((long) 1024));
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}

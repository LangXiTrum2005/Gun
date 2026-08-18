package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticDeviceInfoKt {
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Android androidBuild = this._builder.build();
                AbstractC2995aW.p(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                AbstractC2995aW.p(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                AbstractC2995aW.p(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                AbstractC2995aW.p(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                AbstractC2995aW.p(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                AbstractC2995aW.p(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                AbstractC2995aW.p(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                AbstractC2995aW.p(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                AbstractC2995aW.p(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                AbstractC2995aW.p(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                AbstractC2995aW.p(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                AbstractC2995aW.p(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                AbstractC2995aW.p(buildId, "_builder.getBuildId()");
                return buildId;
            }

            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                AbstractC2995aW.p(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                AbstractC2995aW.p(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            public final void setAndroidFingerprint(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAndroidFingerprint(str);
            }

            public final void setApiLevel(int i) {
                this._builder.setApiLevel(i);
            }

            public final void setApkDeveloperSigningCertificateHash(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setApkDeveloperSigningCertificateHash(str);
            }

            public final void setAppInstaller(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAppInstaller(str);
            }

            public final void setBuildBoard(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildBoard(str);
            }

            public final void setBuildBootloader(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildBootloader(str);
            }

            public final void setBuildBrand(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildBrand(str);
            }

            public final void setBuildDevice(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildDevice(str);
            }

            public final void setBuildDisplay(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildDisplay(str);
            }

            public final void setBuildFingerprint(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildFingerprint(str);
            }

            public final void setBuildHardware(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildHardware(str);
            }

            public final void setBuildHost(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildHost(str);
            }

            public final void setBuildId(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildId(str);
            }

            public final void setBuildProduct(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuildProduct(str);
            }

            public final void setExtensionVersion(int i) {
                this._builder.setExtensionVersion(i);
            }

            public final void setPhoneType(int i) {
                this._builder.setPhoneType(i);
            }

            public final void setSimOperator(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setSimOperator(str);
            }

            public final void setVersionCode(int i) {
                this._builder.setVersionCode(i);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfoBuild = this._builder.build();
            AbstractC2995aW.p(staticDeviceInfoBuild, "_builder.build()");
            return staticDeviceInfoBuild;
        }

        public final /* synthetic */ void addAllStores(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllStores(iterable);
        }

        public final /* synthetic */ void addStores(DslList dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addStores(str);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final /* synthetic */ void clearStores(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            AbstractC2995aW.p(android2, "_builder.getAndroid()");
            return android2;
        }

        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            AbstractC2995aW.p(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            AbstractC2995aW.p(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            AbstractC2995aW.p(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            AbstractC2995aW.p(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            AbstractC2995aW.p(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            AbstractC2995aW.p(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            AbstractC2995aW.p(ios, "_builder.getIos()");
            return ios;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            AbstractC2995aW.p(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            AbstractC2995aW.p(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final DslList<String, StoresProxy> getStores() {
            List<String> storesList = this._builder.getStoresList();
            AbstractC2995aW.p(storesList, "_builder.getStoresList()");
            return new DslList<>(storesList);
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            AbstractC2995aW.p(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllStores(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addStores(dslList, str);
        }

        public final void setAndroid(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2) {
            AbstractC2995aW.q(android2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAndroid(android2);
        }

        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        public final void setBundleId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBundleId(str);
        }

        public final void setBundleVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBundleVersion(str);
        }

        public final void setCpuCount(long j) {
            this._builder.setCpuCount(j);
        }

        public final void setCpuModel(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCpuModel(str);
        }

        public final void setDeviceMake(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceModel(str);
        }

        public final void setGpuModel(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setGpuModel(str);
        }

        public final void setIos(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios) {
            AbstractC2995aW.q(ios, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setIos(ios);
        }

        public final void setOsVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOsVersion(str);
        }

        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        public final void setScreenDensity(int i) {
            this._builder.setScreenDensity(i);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenSize(int i) {
            this._builder.setScreenSize(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final /* synthetic */ void setStores(DslList dslList, int i, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStores(i, str);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setWebviewUa(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setWebviewUa(str);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios iosBuild = this._builder.build();
                AbstractC2995aW.p(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                this._builder.addAllSkadnetworkId(iterable);
            }

            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.addSkadnetworkId(str);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                AbstractC2995aW.q(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                AbstractC2995aW.p(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                AbstractC2995aW.p(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList<>(skadnetworkIdList);
            }

            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                AbstractC2995aW.p(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                AbstractC2995aW.p(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                AbstractC2995aW.p(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                addAllSkadnetworkId(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                addSkadnetworkId(dslList, str);
            }

            public final void setBuiltSdkVersion(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setBuiltSdkVersion(str);
            }

            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            public final void setScreenScale(int i) {
                this._builder.setScreenScale(i);
            }

            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setSkadnetworkId(i, str);
            }

            public final void setSystemBootTime(long j) {
                this._builder.setSystemBootTime(j);
            }

            public final void setXcodeBuildVersion(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setXcodeBuildVersion(str);
            }

            public final void setXcodeSdkBuildVersion(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setXcodeSdkBuildVersion(str);
            }

            public final void setXcodeVersion(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setXcodeVersion(str);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m145initializeandroid(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m146initializeios(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}

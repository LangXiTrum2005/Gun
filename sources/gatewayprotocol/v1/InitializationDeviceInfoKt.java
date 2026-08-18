package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationDeviceInfoKt {
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfoBuild = this._builder.build();
            AbstractC2995aW.p(initializationDeviceInfoBuild, "_builder.build()");
            return initializationDeviceInfoBuild;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            AbstractC2995aW.p(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getConnectionType() {
            String connectionType = this._builder.getConnectionType();
            AbstractC2995aW.p(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
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

        public final String getHashedDeviceName() {
            String hashedDeviceName = this._builder.getHashedDeviceName();
            AbstractC2995aW.p(hashedDeviceName, "_builder.getHashedDeviceName()");
            return hashedDeviceName;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            AbstractC2995aW.p(language, "_builder.getLanguage()");
            return language;
        }

        public final String getLocalList() {
            String localList = this._builder.getLocalList();
            AbstractC2995aW.p(localList, "_builder.getLocalList()");
            return localList;
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            AbstractC2995aW.p(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            AbstractC2995aW.p(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setBundleId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBundleId(str);
        }

        public final void setConnectionType(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setConnectionType(str);
        }

        public final void setCurrentUiTheme(long j) {
            this._builder.setCurrentUiTheme(j);
        }

        public final void setDeviceMake(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceModel(str);
        }

        public final void setHashedDeviceName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setHashedDeviceName(str);
        }

        public final void setLanguage(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLanguage(str);
        }

        public final void setLocalList(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLocalList(str);
        }

        public final void setNetworkOperator(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setNetworkOperator(str);
        }

        public final void setOsVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOsVersion(str);
        }

        public final void setSystemBootTime(long j) {
            this._builder.setSystemBootTime(j);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setTrackingAuthStatus(int i) {
            this._builder.setTrackingAuthStatus(i);
        }

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDeviceInfoKt() {
    }
}

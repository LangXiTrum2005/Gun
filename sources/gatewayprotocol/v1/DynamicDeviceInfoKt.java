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
public final class DynamicDeviceInfoKt {
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android androidBuild = this._builder.build();
                AbstractC2995aW.p(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                AbstractC2995aW.p(networkCapabilityTransports, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransports;
            }

            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            public final void setChargingType(int i) {
                this._builder.setChargingType(i);
            }

            public final void setDeviceElapsedRealtime(long j) {
                this._builder.setDeviceElapsedRealtime(j);
            }

            public final void setDeviceUpTime(long j) {
                this._builder.setDeviceUpTime(j);
            }

            public final void setMaxVolume(double d) {
                this._builder.setMaxVolume(d);
            }

            public final void setNetworkCapabilityTransports(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports) {
                AbstractC2995aW.q(networkCapabilityTransports, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setNetworkCapabilityTransports(networkCapabilityTransports);
            }

            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            public final void setNetworkType(int i) {
                this._builder.setNetworkType(i);
            }

            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            public final void setTelephonyManagerNetworkType(int i) {
                this._builder.setTelephonyManagerNetworkType(i);
            }

            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoBuild = this._builder.build();
            AbstractC2995aW.p(dynamicDeviceInfoBuild, "_builder.build()");
            return dynamicDeviceInfoBuild;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            AbstractC2995aW.p(android2, "_builder.getAndroid()");
            return android2;
        }

        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            AbstractC2995aW.p(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            AbstractC2995aW.p(ios, "_builder.getIos()");
            return ios;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            AbstractC2995aW.p(language, "_builder.getLanguage()");
            return language;
        }

        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            AbstractC2995aW.p(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            AbstractC2995aW.p(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            AbstractC2995aW.p(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            AbstractC2995aW.p(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        public final String getUserId() {
            String userId = this._builder.getUserId();
            AbstractC2995aW.p(userId, "_builder.getUserId()");
            return userId;
        }

        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        public final void setAndroid(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2) {
            AbstractC2995aW.q(android2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAndroid(android2);
        }

        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setConnectionType(DynamicDeviceInfoOuterClass.ConnectionType connectionType) {
            AbstractC2995aW.q(connectionType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setConnectionType(connectionType);
        }

        public final void setFreeDiskSpace(long j) {
            this._builder.setFreeDiskSpace(j);
        }

        public final void setFreeRamMemory(long j) {
            this._builder.setFreeRamMemory(j);
        }

        public final void setIos(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios) {
            AbstractC2995aW.q(ios, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setIos(ios);
        }

        public final void setLanguage(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLanguage(str);
        }

        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        public final void setNetworkOperator(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setNetworkOperator(str);
        }

        public final void setNetworkOperatorName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setNetworkOperatorName(str);
        }

        public final void setScreenHeight(int i) {
            this._builder.setScreenHeight(i);
        }

        public final void setScreenWidth(int i) {
            this._builder.setScreenWidth(i);
        }

        public final void setTimeZone(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTimeZone(str);
        }

        public final void setTimeZoneOffset(long j) {
            this._builder.setTimeZoneOffset(j);
        }

        public final void setUserId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setUserId(str);
        }

        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios iosBuild = this._builder.build();
                AbstractC2995aW.p(iosBuild, "_builder.build()");
                return iosBuild;
            }

            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                this._builder.addAllLocaleList(iterable);
            }

            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                this._builder.addAllNwPathInterfaces(iterable);
            }

            public final /* synthetic */ void addLocaleList(DslList dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.addLocaleList(str);
            }

            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.addNwPathInterfaces(str);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                AbstractC2995aW.q(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                AbstractC2995aW.q(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                AbstractC2995aW.p(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                AbstractC2995aW.p(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            public final DslList<String, LocaleListProxy> getLocaleList() {
                List<String> localeListList = this._builder.getLocaleListList();
                AbstractC2995aW.p(localeListList, "_builder.getLocaleListList()");
                return new DslList<>(localeListList);
            }

            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                List<String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                AbstractC2995aW.p(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new DslList<>(nwPathInterfacesList);
            }

            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            public final /* synthetic */ void plusAssignAllLocaleList(DslList<String, LocaleListProxy> dslList, Iterable<String> iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                addAllLocaleList(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, Iterable<String> iterable) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(iterable, "values");
                addAllNwPathInterfaces(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignLocaleList(DslList<String, LocaleListProxy> dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                addLocaleList(dslList, str);
            }

            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                addNwPathInterfaces(dslList, str);
            }

            public final void setCurrentRadioAccessTechnology(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setCurrentRadioAccessTechnology(str);
            }

            public final void setCurrentUiTheme(int i) {
                this._builder.setCurrentUiTheme(i);
            }

            public final void setDeviceName(String str) {
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setDeviceName(str);
            }

            public final void setDeviceUpTimeWithSleep(long j) {
                this._builder.setDeviceUpTimeWithSleep(j);
            }

            public final void setDeviceUpTimeWithoutSleep(long j) {
                this._builder.setDeviceUpTimeWithoutSleep(j);
            }

            public final /* synthetic */ void setLocaleList(DslList dslList, int i, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setLocaleList(i, str);
            }

            public final void setNetworkReachabilityFlags(int i) {
                this._builder.setNetworkReachabilityFlags(i);
            }

            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i, String str) {
                AbstractC2995aW.q(dslList, "<this>");
                AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setNwPathInterfaces(i, str);
            }

            public final void setTrackingAuthStatus(int i) {
                this._builder.setTrackingAuthStatus(i);
            }

            public final void setVolume(double d) {
                this._builder.setVolume(d);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private DynamicDeviceInfoKt() {
    }

    /* JADX INFO: renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m118initializeandroid(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m119initializeios(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}

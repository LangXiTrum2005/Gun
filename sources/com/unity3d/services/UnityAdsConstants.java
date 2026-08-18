package com.unity3d.services;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsConstants {
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 750;
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    public static final class Cache {
        public static final String CACHE_SCHEME = "unity-ads-cache";
        public static final String DATASTORE_PATH = "unityAdsDatastore/";
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    public static final class ClientInfo {
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41301;
        public static final String SDK_VERSION_NAME = "4.13.1";

        private ClientInfo() {
        }
    }

    public static final class DefaultUrls {
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&";
        public static final String CACHE_DIR_NAME = "UnityAdsCache";
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";
        public static final DefaultUrls INSTANCE = new DefaultUrls();
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";
        public static final String WEBVIEW_ASSET_PATH_LOCAL = "ad-viewer/";
        public static final String WEBVIEW_DOMAIN = "webview.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    public static final class ErrorHandler {
        public static final int ERROR_HANDLER_STACK_TRACE_LINES_MAX = 15;
        public static final ErrorHandler INSTANCE = new ErrorHandler();

        private ErrorHandler() {
        }
    }

    public static final class Messages {
        public static final Messages INSTANCE = new Messages();
        public static final String MSG_INTERNAL_ERROR = "Internal error";
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    public static final class OpenMeasurement {
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";
        public static final String OM_PARTNER_NAME = "Unity3d";
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    public static final class Preferences {
        public static final Preferences INSTANCE = new Preferences();
        public static final String PREF_KEY_AUID = "auid";
        public static final String PREF_KEY_IDFI = "unityads-idfi";
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        private Preferences() {
        }
    }

    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 30000;
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 30000;
        public static final int READ_TIMEOUT_MS = 30000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 120000;
        public static final int RETRY_MAX_INTERVAL = 2500;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 30000;

        private RequestPolicy() {
        }
    }

    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    public static final class Timeout {
        public static final long INIT_TIMEOUT_MS = 120000;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    private UnityAdsConstants() {
    }
}

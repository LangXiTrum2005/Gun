package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4294pB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap<>();
    private AbstractBinderC4294pB mBinder = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractBinderC4294pB {
        public AnonymousClass1() {
        }

        @Nullable
        private PendingIntent getSessionIdFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Nullable
        private Uri getTargetOriginFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) Api33Impl.getParcelable(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$newSessionInternal$0(CustomTabsSessionToken customTabsSessionToken) {
            CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        private boolean newSessionInternal(@NonNull InterfaceC4118nB interfaceC4118nB, @Nullable PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(interfaceC4118nB, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f15a.lambda$newSessionInternal$0(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    interfaceC4118nB.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(interfaceC4118nB.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean isEngagementSignalsApiAvailable(InterfaceC4118nB interfaceC4118nB, @NonNull Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean mayLaunchUrl(@Nullable InterfaceC4118nB interfaceC4118nB, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean newSession(@NonNull InterfaceC4118nB interfaceC4118nB) {
            return newSessionInternal(interfaceC4118nB, null);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean newSessionWithExtras(@NonNull InterfaceC4118nB interfaceC4118nB, @Nullable Bundle bundle) {
            return newSessionInternal(interfaceC4118nB, getSessionIdFromBundle(bundle));
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public int postMessage(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean receiveFile(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull Uri uri, int i, @Nullable Bundle bundle) {
            return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), uri, i, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean requestPostMessageChannel(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(interfaceC4118nB, null), uri, null, new Bundle());
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean requestPostMessageChannelWithExtras(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean setEngagementSignalsCallback(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull IBinder iBinder, @NonNull Bundle bundle) {
            return CustomTabsService.this.setEngagementSignalsCallback(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), EngagementSignalsCallbackRemote.fromBinder(iBinder), bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean updateVisuals(@NonNull InterfaceC4118nB interfaceC4118nB, @Nullable Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean validateRelationship(@NonNull InterfaceC4118nB interfaceC4118nB, int i, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(interfaceC4118nB, getSessionIdFromBundle(bundle)), i, uri, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean warmup(long j) {
            return CustomTabsService.this.warmup(j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public boolean cleanUpSession(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                    if (callbackBinder == null) {
                        return false;
                    }
                    callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                    this.mDeathRecipientMap.remove(callbackBinder);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @Nullable
    public abstract Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle);

    public boolean isEngagementSignalsApiAvailable(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean mayLaunchUrl(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    public abstract boolean newSession(@NonNull CustomTabsSessionToken customTabsSessionToken);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull String str, @Nullable Bundle bundle);

    public abstract boolean receiveFile(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, int i, @Nullable Bundle bundle);

    public abstract boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri);

    public boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }

    public boolean setEngagementSignalsCallback(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) {
        return false;
    }

    public abstract boolean updateVisuals(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Bundle bundle);

    public abstract boolean validateRelationship(@NonNull CustomTabsSessionToken customTabsSessionToken, int i, @NonNull Uri uri, @Nullable Bundle bundle);

    public abstract boolean warmup(long j);
}

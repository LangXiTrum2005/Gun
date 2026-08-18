package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4294pB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4557sB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final InterfaceC4118nB mCallback;
    private final ComponentName mComponentName;

    @Nullable
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final InterfaceC4382qB mService;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractBinderC4557sB {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        public AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
            this.mHandler.post(new c(this.val$callback, i, bundle, 0));
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onSessionEnded(boolean z, Bundle bundle) {
            this.mHandler.post(new b(this.val$callback, z, bundle, 0));
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            this.mHandler.post(new b(this.val$callback, z, bundle, 1));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractBinderC4557sB {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        public AnonymousClass2(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle) {
            engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new c(this.val$callback, i, bundle, 1));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onSessionEnded(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new b(this.val$callback, z, bundle, 3));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new b(this.val$callback, z, bundle, 2));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static class MockSession extends AbstractBinderC4294pB {
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean isEngagementSignalsApiAvailable(InterfaceC4118nB interfaceC4118nB, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean mayLaunchUrl(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean newSession(InterfaceC4118nB interfaceC4118nB) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean newSessionWithExtras(InterfaceC4118nB interfaceC4118nB, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public int postMessage(InterfaceC4118nB interfaceC4118nB, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean receiveFile(InterfaceC4118nB interfaceC4118nB, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean requestPostMessageChannel(InterfaceC4118nB interfaceC4118nB, Uri uri) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean requestPostMessageChannelWithExtras(InterfaceC4118nB interfaceC4118nB, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean setEngagementSignalsCallback(InterfaceC4118nB interfaceC4118nB, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean updateVisuals(InterfaceC4118nB interfaceC4118nB, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean validateRelationship(InterfaceC4118nB interfaceC4118nB, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4382qB
        public boolean warmup(long j) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class PendingSession {

        @Nullable
        private final CustomTabsCallback mCallback;

        @Nullable
        private final PendingIntent mId;

        public PendingSession(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        @Nullable
        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        @Nullable
        public PendingIntent getId() {
            return this.mId;
        }
    }

    public CustomTabsSession(InterfaceC4382qB interfaceC4382qB, InterfaceC4118nB interfaceC4118nB, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.mService = interfaceC4382qB;
        this.mCallback = interfaceC4118nB;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private AbstractBinderC4557sB createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback) {
        return new AnonymousClass1(engagementSignalsCallback);
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    @Nullable
    private Bundle createPostMessageExtraBundle(@Nullable Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Nullable
    public PendingIntent getId() {
        return this.mId;
    }

    public boolean isEngagementSignalsApiAvailable(@NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int iPostMessage;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i, @Nullable Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    private AbstractBinderC4557sB createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Executor executor) {
        return new AnonymousClass2(executor, engagementSignalsCallback);
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        try {
            Bundle bundleCreatePostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (bundleCreatePostMessageExtraBundle == null) {
                return this.mService.requestPostMessageChannel(this.mCallback, uri);
            }
            bundle.putAll(bundleCreatePostMessageExtraBundle);
            return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull Executor executor, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}

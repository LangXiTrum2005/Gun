package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4030mB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsSessionToken {
    private static final String TAG = "CustomTabsSessionToken";

    @Nullable
    private final CustomTabsCallback mCallback;

    @Nullable
    final InterfaceC4118nB mCallbackBinder;

    @Nullable
    private final PendingIntent mSessionId;

    public static class MockCallback extends AbstractBinderC4030mB {
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4030mB, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, @NonNull Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onActivityResized(int i, int i2, Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onMinimized(@NonNull Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onUnminimized(@NonNull Bundle bundle) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB
        public void onWarmupCompleted(Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(@Nullable InterfaceC4118nB interfaceC4118nB, @Nullable PendingIntent pendingIntent) {
        if (interfaceC4118nB == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = interfaceC4118nB;
        this.mSessionId = pendingIntent;
        this.mCallback = interfaceC4118nB == null ? null : new CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            @NonNull
            public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
                try {
                    return CustomTabsSessionToken.this.mCallbackBinder.extraCallbackWithResult(str, bundle);
                } catch (RemoteException unused) {
                    return null;
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, @NonNull Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onActivityLayout(i, i2, i3, i4, i5, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityResized(int i, int i2, @NonNull Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onActivityResized(i, i2, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMessageChannelReady(@Nullable Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMinimized(@NonNull Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onMinimized(bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onNavigationEvent(int i, @Nullable Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onRelationshipValidationResult(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(i, uri, z, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onUnminimized(@NonNull Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onUnminimized(bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onWarmupCompleted(@NonNull Bundle bundle) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    @NonNull
    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new MockCallback(), null);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        InterfaceC4118nB interfaceC4118nB = this.mCallbackBinder;
        if (interfaceC4118nB != null) {
            return interfaceC4118nB.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @Nullable
    public static CustomTabsSessionToken getSessionTokenFromIntent(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new CustomTabsSessionToken(binder != null ? AbstractBinderC4030mB.asInterface(binder) : null, pendingIntent);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent id = customTabsSessionToken.getId();
        PendingIntent pendingIntent = this.mSessionId;
        if ((pendingIntent == null) != (id == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(id) : getCallbackBinderAssertNotNull().equals(customTabsSessionToken.getCallbackBinderAssertNotNull());
    }

    @Nullable
    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    @Nullable
    public IBinder getCallbackBinder() {
        InterfaceC4118nB interfaceC4118nB = this.mCallbackBinder;
        if (interfaceC4118nB == null) {
            return null;
        }
        return interfaceC4118nB.asBinder();
    }

    @Nullable
    public PendingIntent getId() {
        return this.mSessionId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasCallback() {
        return this.mCallbackBinder != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasId() {
        return this.mSessionId != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(@NonNull CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }
}

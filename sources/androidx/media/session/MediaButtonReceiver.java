package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.media.MediaBrowserServiceCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4922wO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3778jN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZM;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static class MediaButtonConnectionCallback extends WM {
        private final Context mContext;
        private final Intent mIntent;
        private C3778jN mMediaBrowser;
        private final BroadcastReceiver.PendingResult mPendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        private void finish() {
            Messenger messenger;
            ZM zm = this.mMediaBrowser.f4551a;
            C3692iN c3692iN = zm.f;
            if (c3692iN != null && (messenger = zm.g) != null) {
                try {
                    c3692iN.N(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            zm.b.disconnect();
            this.mPendingResult.finish();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WM
        public void onConnected() {
            Context context = this.mContext;
            ZM zm = this.mMediaBrowser.f4551a;
            if (zm.h == null) {
                zm.h = MediaSessionCompat$Token.b(zm.b.getSessionToken(), null);
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = zm.h;
            new ConcurrentHashMap();
            if (mediaSessionCompat$Token == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            a aVar = new a(context, mediaSessionCompat$Token);
            KeyEvent keyEvent = (KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            aVar.f6a.dispatchMediaButtonEvent(keyEvent);
            finish();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WM
        public void onConnectionFailed() {
            finish();
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WM
        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(C3778jN c3778jN) {
            this.mMediaBrowser = c3778jN;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbU = AbstractC3950lJ.u("Expected 1 service that handles ", str, ", found ");
        sbU.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbU.toString());
    }

    public static KeyEvent handleIntent(AbstractC4922wO abstractC4922wO, Intent intent) {
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            ContextCompat.startForegroundService(context, intent);
            return;
        }
        ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
        if (serviceComponentByAction2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, pendingResultGoAsync);
        C3778jN c3778jN = new C3778jN(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback);
        mediaButtonConnectionCallback.setMediaBrowser(c3778jN);
        c3778jN.f4551a.b.connect();
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j) {
        int i;
        if (componentName == null) {
            return null;
        }
        if (j == 4) {
            i = EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
        } else if (j == 2) {
            i = EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        } else if (j == 32) {
            i = 87;
        } else if (j == 16) {
            i = 88;
        } else if (j == 1) {
            i = 86;
        } else if (j == 64) {
            i = 90;
        } else if (j == 8) {
            i = 89;
        } else {
            i = j == 512 ? 85 : 0;
        }
        if (i == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        int i2 = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, i, intent, i2 >= 31 ? 33554432 : 0);
    }
}

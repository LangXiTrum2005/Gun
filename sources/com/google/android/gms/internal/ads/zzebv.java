package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.hjq.permissions.Permission;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebv extends zzbsw {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdrw zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzebk zze;
    private String zzf;
    private String zzg;

    @VisibleForTesting
    public zzebv(Context context, zzebk zzebkVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdrw zzdrwVar) {
        this.zzb = context;
        this.zzc = zzdrwVar;
        this.zzd = zzuVar;
        this.zze = zzebkVar;
    }

    public static void zzc(Context context, zzdrw zzdrwVar, zzebk zzebkVar, String str, String str2) {
        zzd(context, zzdrwVar, zzebkVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdrw zzdrwVar, zzebk zzebkVar, String str, String str2, Map map) {
        String strZze;
        String str3 = true != com.google.android.gms.ads.internal.zzv.zzp().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdrwVar != null) {
            zzdrv zzdrvVarZza = zzdrwVar.zza();
            zzdrvVarZza.zzb("gqi", str);
            zzdrvVarZza.zzb(a.w, str2);
            zzdrvVarZza.zzb("device_connectivity", str3);
            zzdrvVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdrvVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdrvVarZza.zze();
        } else {
            strZze = "";
        }
        zzebkVar.zzd(new zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), str, strZze, 2));
    }

    @VisibleForTesting
    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfrk.zzb(context, 0, intent, zzfrk.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfrk.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzL(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzt = zzt(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzt, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzu = zzu();
            if (!TextUtils.isEmpty(strZzu)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            zzebc zzebcVar = (zzebc) this.zza.get(this.zzf);
            Drawable drawableZza = zzebcVar != null ? zzebcVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    @Nullable
    private static XmlResourceParser zzt(int i) {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            return null;
        }
        try {
            return resourcesZze.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    private final String zzu() {
        zzebc zzebcVar = (zzebc) this.zza.get(this.zzf);
        return zzebcVar == null ? "" : zzebcVar.zzb();
    }

    private static String zzv(int i, String str) {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            return str;
        }
        try {
            return resourcesZze.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private final void zzx() {
        boolean zZzg;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzbr zzbrVarZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzebc zzebcVar = (zzebc) this.zza.get(str2);
            zZzg = zzbrVarZzA.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzebcVar == null ? "" : zzebcVar.zzc()));
            if (!zZzg) {
                try {
                    zZzg = zzbrVarZzA.zzf(ObjectWrapper.wrap(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.zze.zzc(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", zzfxq.zzd());
    }

    private final void zzy(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzx();
            zzz(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{Permission.POST_NOTIFICATIONS}, 12345);
                zzw(this.zzf, "asnpdi", zzfxq.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(activity);
            builderZzL.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, HttpResponseHeader.Allow), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebo
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzk(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzl(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebq
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzm(zzmVar, dialogInterface);
                }
            });
            builderZzL.create().show();
            zzw(this.zzf, "rtsdi", zzfxq.zzd());
        }
    }

    private final void zzz(Activity activity, @Nullable com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogZzs = zzs(activity, zzmVar);
        alertDialogZzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzebu(this, alertDialogZzs, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zzb);
            HashMap map = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzw(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzebk.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(Permission.POST_NOTIFICATIONS)) {
                zzebx zzebxVar = (zzebx) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzebxVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzebxVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzx();
                    zzz(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzebx zzebxVar = (zzebx) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzebxVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzebxVar.zzb();
        this.zzf = zzebxVar.zzc();
        this.zzg = zzebxVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzip)).booleanValue()) {
            zzy(activityZza, zzmVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzfxq.zzd());
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(activityZza);
        builderZzL.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzn(activityZza, zzmVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzo(zzmVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzp(zzmVarZzb, dialogInterface);
            }
        });
        builderZzL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) throws Exception {
                zzebk.zzb(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzu = zzu();
        com.google.android.gms.ads.internal.zzv.zzr().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzu)) {
            builder.setContentTitle(zzv(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzv(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzu));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentZzr2).setContentIntent(pendingIntentZzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziq)).intValue());
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzis)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final /* synthetic */ void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzw(this.zzf, "rtsdc", AbstractC3950lJ.v("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzv.zzr().zzf(activity));
        zzx();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzw(this.zzf, "dialog_click", AbstractC3950lJ.v("dialog_action", "confirm"));
        zzy(activity, zzmVar);
    }

    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(String str, zzdif zzdifVar) {
        String strZzx = zzdifVar.zzx();
        String strZzB = zzdifVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzx)) {
            strZzx = strZzB != null ? strZzB : "";
        }
        zzbfw zzbfwVarZzm = zzdifVar.zzm();
        if (zzbfwVarZzm != null) {
            try {
                string = zzbfwVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfw zzbfwVarZzn = zzdifVar.zzn();
        Drawable drawable = null;
        if (zzbfwVarZzn != null) {
            try {
                IObjectWrapper iObjectWrapperZzf = zzbfwVarZzn.zzf();
                if (iObjectWrapperZzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeay(strZzx, string, drawable));
    }
}

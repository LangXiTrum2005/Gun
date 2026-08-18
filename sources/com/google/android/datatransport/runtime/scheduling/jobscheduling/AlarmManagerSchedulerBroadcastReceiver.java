package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4201o8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4289p8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5123yg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC4683tg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wd0;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f799a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        Wd0.b(context);
        C4201o8 c4201o8A = Sd0.a();
        c4201o8A.b(queryParameter);
        c4201o8A.c(JV.b(iIntValue));
        if (queryParameter2 != null) {
            c4201o8A.b = Base64.decode(queryParameter2, 0);
        }
        C5123yg0 c5123yg0 = Wd0.a().d;
        C4289p8 c4289p8A = c4201o8A.a();
        B80 b80 = new B80(1);
        c5123yg0.getClass();
        c5123yg0.e.execute(new RunnableC4683tg0(c5123yg0, c4289p8A, i, b80));
    }
}

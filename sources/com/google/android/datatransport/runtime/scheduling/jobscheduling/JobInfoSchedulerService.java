package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4201o8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4289p8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5123yg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC3976le0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC4683tg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wd0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f800a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Wd0.b(getApplicationContext());
        C4201o8 c4201o8A = Sd0.a();
        c4201o8A.b(string);
        c4201o8A.c(JV.b(i));
        if (string2 != null) {
            c4201o8A.b = Base64.decode(string2, 0);
        }
        C5123yg0 c5123yg0 = Wd0.a().d;
        C4289p8 c4289p8A = c4201o8A.a();
        RunnableC3976le0 runnableC3976le0 = new RunnableC3976le0(8, this, jobParameters);
        c5123yg0.getClass();
        c5123yg0.e.execute(new RunnableC4683tg0(c5123yg0, c4289p8A, i2, runnableC3976le0));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

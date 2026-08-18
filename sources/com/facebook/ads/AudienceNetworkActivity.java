package com.facebook.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@SuppressLint({"MissingSuperCall"})
public class AudienceNetworkActivity extends Activity {
    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new b(this);

    @Override // android.app.Activity
    public void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        this.mAudienceNetworkActivityApi.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mAudienceNetworkActivityApi.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        AudienceNetworkActivityApi audienceNetworkActivityApiCreateAudienceNetworkActivity = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = audienceNetworkActivityApiCreateAudienceNetworkActivity;
        audienceNetworkActivityApiCreateAudienceNetworkActivity.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }
}

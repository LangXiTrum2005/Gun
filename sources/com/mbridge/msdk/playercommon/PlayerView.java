package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.b;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3203cn0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VN;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerView extends LinearLayout {
    public static final String TAG = "PlayerView";
    private boolean hadOMPause;
    private boolean isBTVideo;
    private boolean isBTVideoPlaying;
    private boolean mHasReportedData;
    private boolean mInitState;
    private boolean mIsCovered;
    private boolean mIsFirstCreateHolder;
    private boolean mIsNeedToRepeatPrepare;
    private boolean mIsSurfaceHolderDestoryed;
    private LinearLayout mLlSurContainer;
    private LinearLayout mLoadingView;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private VideoFeedsPlayer mVideoFeedsPlayer;
    private OnPlayerViewVisibleListener onPlayerViewVisibleListener;
    protected int orientation;
    private VN videoEvents;
    protected float xInScreen;
    protected float yInScreen;

    public class MySurfaceHoldeCallback implements SurfaceHolder.Callback {
        private MySurfaceHoldeCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            try {
                o0.c(PlayerView.TAG, "surfaceChanged");
                if (PlayerView.this.mIsSurfaceHolderDestoryed && !PlayerView.this.mIsCovered && !PlayerView.this.isComplete() && !PlayerView.this.isBTVideo && !b.f) {
                    if (PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                        o0.c(PlayerView.TAG, "surfaceChanged  start====");
                        PlayerView.this.resumeStart();
                    } else {
                        o0.c(PlayerView.TAG, "surfaceChanged  PLAY====");
                        PlayerView.this.playVideo(0);
                        PlayerView.this.resumeOMSDK();
                    }
                    if (PlayerView.this.isBTVideo) {
                        if (PlayerView.this.isBTVideoPlaying) {
                            if (!PlayerView.this.mVideoFeedsPlayer.hasPrepare()) {
                                PlayerView.this.mVideoFeedsPlayer.prepare();
                            }
                            PlayerView.this.mVideoFeedsPlayer.start(false);
                            PlayerView.this.resumeOMSDK();
                        } else {
                            PlayerView.this.pause();
                        }
                    }
                }
                PlayerView.this.mIsSurfaceHolderDestoryed = false;
            } catch (Exception e) {
                o0.b(PlayerView.TAG, e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                o0.c(PlayerView.TAG, "surfaceCreated");
                if (PlayerView.this.mVideoFeedsPlayer == null || surfaceHolder == null) {
                    return;
                }
                PlayerView.this.mSurfaceHolder = surfaceHolder;
                PlayerView.this.mVideoFeedsPlayer.setDisplay(surfaceHolder);
            } catch (Exception e) {
                o0.b(PlayerView.TAG, e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                o0.c(PlayerView.TAG, "surfaceDestroyed ");
                PlayerView.this.mIsSurfaceHolderDestoryed = true;
                PlayerView.this.mIsNeedToRepeatPrepare = true;
                PlayerView.this.mVideoFeedsPlayer.pause();
                PlayerView.this.pauseOmsdk();
            } catch (Exception e) {
                o0.b(PlayerView.TAG, e.getMessage());
            }
        }
    }

    public interface OnPlayerViewVisibleListener {
        void playerViewVisibleCallback();
    }

    public PlayerView(Context context) {
        super(context);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        this.mHasReportedData = false;
        this.hadOMPause = false;
        init();
    }

    private void init() {
        try {
            initView();
            initPlayer();
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    private void initPlayer() {
        this.mVideoFeedsPlayer = new VideoFeedsPlayer();
    }

    private void initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(g0.a(getContext(), "mbridge_playercommon_player_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        if (viewInflate != null) {
            this.mLlSurContainer = (LinearLayout) viewInflate.findViewById(g0.a(getContext(), "mbridge_playercommon_ll_sur_container", "id"));
            this.mLoadingView = (LinearLayout) viewInflate.findViewById(g0.a(getContext(), "mbridge_playercommon_ll_loading", "id"));
            addSurfaceView();
            addView(viewInflate, -1, -1);
        }
    }

    public void addSurfaceView() {
        try {
            o0.c(TAG, "addSurfaceView");
            SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
            SurfaceHolder holder = surfaceView.getHolder();
            this.mSurfaceHolder = holder;
            holder.setType(3);
            this.mSurfaceHolder.setKeepScreenOn(true);
            this.mSurfaceHolder.addCallback(new MySurfaceHoldeCallback());
            this.mLlSurContainer.addView(surfaceView, -1, -1);
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public JSONObject buildH5JsonObject(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.h, t0.b(c.n().d(), this.xInScreen));
                jSONObject2.put(a.i, t0.b(c.n().d(), this.yInScreen));
                jSONObject2.put(a.m, i);
                try {
                    this.orientation = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(a.k, this.orientation);
                jSONObject2.put(a.l, t0.d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public void closeSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.closeSound();
        }
    }

    public void coverUnlockResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null) {
                o0.c(TAG, "coverUnlockResume========");
                if (!this.mVideoFeedsPlayer.hasPrepare() || this.mIsNeedToRepeatPrepare) {
                    playVideo(0);
                } else {
                    start(true);
                }
            }
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public int getCurPosition() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.getCurPosition();
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
        return 0;
    }

    public int getDuration() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getDuration();
        }
        return 0;
    }

    public VN getVideoEvents() {
        return this.videoEvents;
    }

    public float getVolume() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            return videoFeedsPlayer.getVolume();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.initBufferIngParam(i);
        }
    }

    public boolean initVFPData(String str, String str2, VideoPlayerStatusListener videoPlayerStatusListener) {
        if (TextUtils.isEmpty(str)) {
            o0.c(TAG, "playUrl==null");
            return false;
        }
        this.mPlayUrl = str;
        this.mVideoFeedsPlayer.initPlayer(getContext(), this.mLoadingView, str, videoPlayerStatusListener);
        this.mInitState = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            return videoFeedsPlayer != null && videoFeedsPlayer.isComplete();
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage(), th);
            return false;
        }
    }

    public boolean isPlayIng() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                return videoFeedsPlayer.isPlayIng();
            }
            return false;
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
            return false;
        }
    }

    public boolean isSilent() {
        return this.mVideoFeedsPlayer.isSilent();
    }

    public void justSeekTo(int i) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.justSeekTo(i);
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.xInScreen = motionEvent.getRawX();
        this.yInScreen = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.setIsFrontDesk(false);
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void onResume() {
        try {
            this.mVideoFeedsPlayer.setIsFrontDesk(true);
            if (this.mVideoFeedsPlayer != null && !this.mIsSurfaceHolderDestoryed && !isComplete() && !this.mIsCovered) {
                o0.c(TAG, "onresume========");
                if (this.mVideoFeedsPlayer.hasPrepare()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        try {
            if (q0.a().a("i_l_s_t_r_i", false) && i == 0 && !this.mHasReportedData) {
                this.mHasReportedData = true;
                OnPlayerViewVisibleListener onPlayerViewVisibleListener = this.onPlayerViewVisibleListener;
                if (onPlayerViewVisibleListener != null) {
                    onPlayerViewVisibleListener.playerViewVisibleCallback();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openSound() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.openSound();
        }
    }

    public void pause() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.pause();
            }
            pauseOmsdk();
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.videoEvents == null || this.hadOMPause) {
                return;
            }
            o0.a("omsdk", "play view:  pause");
            this.hadOMPause = true;
            C3203cn0 c3203cn0 = this.videoEvents.f3869a;
            AbstractC2995aW.c(c3203cn0);
            c3203cn0.e.c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean playVideo(int i) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null) {
                o0.c(TAG, "player init error 播放失败");
                return false;
            }
            if (!this.mInitState) {
                o0.c(TAG, "vfp init failed 播放失败");
                return false;
            }
            videoFeedsPlayer.play(this.mPlayUrl, i);
            this.mIsNeedToRepeatPrepare = false;
            return true;
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.prepare();
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void release() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.releasePlayer();
            }
            if (this.mSurfaceHolder != null) {
                o0.b(TAG, "mSurfaceHolder release");
                this.mSurfaceHolder.getSurface().release();
            }
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public void removeSurface() {
        try {
            o0.c(TAG, "removeSurface");
            this.mLlSurContainer.removeAllViews();
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            VN vn = this.videoEvents;
            if (vn != null) {
                this.hadOMPause = false;
                vn.h();
                o0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void resumeStart() {
        try {
            start(true);
            resumeOMSDK();
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void seekTo(int i) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.seekTo(i);
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void seekToEndFrame() {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.seekToEndFrame();
        }
    }

    public void setDataSource() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.showLoading();
                this.mVideoFeedsPlayer.setDataSource();
                this.mIsNeedToRepeatPrepare = false;
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void setDesk(boolean z) {
        this.mVideoFeedsPlayer.setIsFrontDesk(z);
    }

    public void setIsBTVideo(boolean z) {
        this.isBTVideo = z;
    }

    public void setIsBTVideoPlaying(boolean z) {
        this.isBTVideoPlaying = z;
    }

    public void setIsCovered(boolean z) {
        try {
            this.mIsCovered = z;
            o0.b(TAG, "mIsCovered:" + z);
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void setNotifyListener(OnPlayerViewVisibleListener onPlayerViewVisibleListener) {
        this.onPlayerViewVisibleListener = onPlayerViewVisibleListener;
    }

    public void setPlaybackParams(float f) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setPlaybackParams(f);
        }
    }

    public void setVideoEvents(VN vn) {
        this.videoEvents = vn;
    }

    public void setVolume(float f, float f2) {
        VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
        if (videoFeedsPlayer != null) {
            videoFeedsPlayer.setVolume(f, f2);
        }
    }

    public void start(boolean z) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer == null || this.mIsCovered) {
                return;
            }
            videoFeedsPlayer.start(z);
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void stop() {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.stop();
            }
            if (this.videoEvents != null) {
                this.videoEvents = null;
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public void start(int i) {
        try {
            VideoFeedsPlayer videoFeedsPlayer = this.mVideoFeedsPlayer;
            if (videoFeedsPlayer != null) {
                videoFeedsPlayer.start(i);
            }
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitState = false;
        this.mIsFirstCreateHolder = true;
        this.mIsSurfaceHolderDestoryed = false;
        this.mIsCovered = false;
        this.mIsNeedToRepeatPrepare = false;
        this.isBTVideo = false;
        this.isBTVideoPlaying = false;
        this.orientation = 1;
        this.mHasReportedData = false;
        this.hadOMPause = false;
        init();
    }
}

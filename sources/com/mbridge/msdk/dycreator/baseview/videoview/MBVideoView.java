package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1051a;
    private final int b;
    private ExoPlayer c;
    private final long d;
    private String[] e;
    private VideoViewEventListener f;
    private final SurfaceHolder.Callback g;
    private final Runnable h;
    private final Runnable i;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBVideoView f1052a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1052a.f != null) {
                this.f1052a.f.onBufferingFail("Buffering timeout");
            }
        }
    }

    public MBVideoView(@NonNull Context context) {
        super(context);
        this.f1051a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    o0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    o0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    o0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        o0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        if (exoPlaybackException == null) {
            message = "Play error and ExoPlayer have not message.";
        } else {
            int i = exoPlaybackException.type;
            if (i == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i == 1) {
                message = "Play error, because have a RendererException.";
            } else if (i != 2) {
                message = "Play error and ExoPlayer have not message.";
            } else {
                message = "Play error, because have a UnexpectedException.";
            }
        }
        if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
            message = exoPlaybackException.getCause().getMessage();
        }
        AbstractC5044xl.s("onPlayerError : ", message, "MBVideoView");
        VideoViewEventListener videoViewEventListener = this.f;
        if (videoViewEventListener != null) {
            videoViewEventListener.onPlayerError(exoPlaybackException.type, message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z, int i) {
        o0.b("MBVideoView", "onPlaybackStateChanged : " + i);
        if (i == 1) {
            o0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i == 2) {
            o0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i == 3) {
            o0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i != 4) {
                return;
            }
            o0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
        this.c.getCurrentWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f = videoViewEventListener;
    }

    public void stop() {
    }

    private void a() {
        try {
            this.c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.c.setRepeatMode(0);
            this.c.prepare(concatenatingMediaSource);
            this.c.addListener(this);
        } catch (Throwable th) {
            o0.b("MBVideoView", th.getMessage());
            th.toString();
        }
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1051a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    o0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    o0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    o0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1051a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    o0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    o0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    o0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }

    @RequiresApi(api = 21)
    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1051a = "MBVideoView";
        this.b = 1000;
        this.d = 5000L;
        this.g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th) {
                    o0.b("MBVideoView", th.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f != null) {
                    MBVideoView.this.f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.c.getCurrentPosition();
                    long duration = MBVideoView.this.c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    o0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f != null) {
                        MBVideoView.this.f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e) {
                    o0.b("MBVideoView", e.getMessage());
                }
            }
        };
    }
}

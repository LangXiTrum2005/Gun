package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcaw extends zzcay implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcbs zzd;
    private final zzcbt zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcbq zzn;
    private final boolean zzo;
    private int zzp;
    private zzcax zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_FROM), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(TypedValues.TransitionType.TYPE_TO), "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(Integer.valueOf(TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcaw(Context context, zzcbs zzcbsVar, boolean z, boolean z2, zzcbr zzcbrVar, zzcbt zzcbtVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcbsVar;
        this.zze = zzcbtVar;
        this.zzo = z;
        this.zzf = z2;
        zzcbtVar.zza(this);
    }

    private final void zzD() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzv.zzl();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                zzcbq zzcbqVar = new zzcbq(getContext());
                this.zzn = zzcbqVar;
                zzcbqVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                SurfaceTexture surfaceTextureZzb = this.zzn.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            com.google.android.gms.ads.internal.zzv.zzm();
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzF(1);
        } catch (IOException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean zzH() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    public static /* bridge */ /* synthetic */ zzcax zzi(zzcaw zzcawVar) {
        return zzcawVar.zzq;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzcaw zzcawVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() || zzcawVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcawVar.zzs = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put(bc.z, format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcawVar.zzd.zzd("onMetadataEvent", map);
            }
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcap(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        com.google.android.gms.ads.internal.util.client.zzo.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcaq(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = View.getDefaultSize(this.zzk, i);
        int defaultSize2 = View.getDefaultSize(this.zzl, i2);
        if (this.zzk > 0 && this.zzl > 0 && this.zzn == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i3 = this.zzk;
                        i4 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.zzk;
                int i8 = i7 * size2;
                int i9 = this.zzl;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.zzl * size) / this.zzk;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.zzk * size2) / this.zzl;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i3 = this.zzk;
                        i4 = this.zzl;
                        if (mode2 == Integer.MIN_VALUE) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = i3;
                            size2 = i4;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcao(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzp;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcar(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcat(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzp;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcas(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcan
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return DM.i(zzcaw.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * ((long) this.zzm)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        if (this.zzs != null) {
            return ((long) zzc()) * ((long) this.zzs.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    public final /* synthetic */ void zzm(int i) {
        zzcax zzcaxVar = this.zzq;
        if (zzcaxVar != null) {
            zzcaxVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcav(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcau(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (!zzH()) {
            this.zzp = i;
        } else {
            this.zzi.seekTo(i);
            this.zzp = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcaxVar) {
        this.zzq = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String str) {
        Uri uri = Uri.parse(str);
        zzbav zzbavVarZza = zzbav.zza(uri);
        if (zzbavVarZza == null || zzbavVarZza.zza != null) {
            if (zzbavVarZza != null) {
                uri = Uri.parse(zzbavVarZza.zza);
            }
            this.zzj = uri;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
        zzcbq zzcbqVar = this.zzn;
        if (zzcbqVar != null) {
            zzcbqVar.zzf(f, f2);
        }
    }
}

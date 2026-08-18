package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.badlogic.gdx.graphics.GL20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbq extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcbo {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcbp zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcbq(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzcbp zzcbpVar = new zzcbp(context);
        this.zzb = zzcbpVar;
        zzcbpVar.zzb(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        GLES20.glGetError();
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        float f26 = f9 * f24;
        fArr[7] = f26 + (f22 * fArr3[4]) + (f19 * f25);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    private static final void zzj(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static final void zzk(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        zzh("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, GL20.GL_COMPILE_STATUS, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.zzp == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("SphericalVideoProcessor started with no output texture.");
            this.zzu.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.zzw = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.zzx = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            z = false;
        } else {
            if (this.zzw.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig == null) {
                    z = false;
                } else {
                    EGL10 egl11 = this.zzw;
                    EGLDisplay eGLDisplay = this.zzx;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.zzy = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                        z = false;
                    } else {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                        this.zzz = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.zzw.eglMakeCurrent(this.zzx, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.zzy)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                }
            } else {
                z = false;
            }
        }
        zzbcc zzbccVar = zzbcl.zzbs;
        int iZzl = zzl(GL20.GL_VERTEX_SHADER, !((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).equals(zzbccVar.zzk()) ? (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iZzl == 0) {
            iGlCreateProgram = 0;
        } else {
            zzbcc zzbccVar2 = zzbcl.zzbt;
            int iZzl2 = zzl(GL20.GL_FRAGMENT_SHADER, !((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2)).equals(zzbccVar2.zzk()) ? (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iZzl2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                zzh("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, iZzl);
                    zzh("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iZzl2);
                    zzh("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    zzh("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, GL20.GL_LINK_STATUS, iArr2, 0);
                    zzh("getProgramiv");
                    if (iArr2[0] != 1) {
                        GLES20.glGetProgramInfoLog(iGlCreateProgram);
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        zzh("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        zzh("validateProgram");
                    }
                }
            }
        }
        this.zzq = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        zzh("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.zzq, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, GL20.GL_FLOAT, false, 12, (Buffer) this.zzt);
        zzh("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        zzh("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        zzh("genTextures");
        int i = iArr3[0];
        GLES20.glBindTexture(36197, i);
        zzh("bindTextures");
        GLES20.glTexParameteri(36197, 10240, GL20.GL_LINEAR);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, GL20.GL_TEXTURE_MIN_FILTER, GL20.GL_LINEAR);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, GL20.GL_TEXTURE_WRAP_S, GL20.GL_CLAMP_TO_EDGE);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, GL20.GL_TEXTURE_WRAP_T, GL20.GL_CLAMP_TO_EDGE);
        zzh("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.zzq, "uVMat");
        this.zzr = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.zzq;
        if (!z || i2 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError())));
            com.google.android.gms.ads.internal.util.client.zzo.zzg(strConcat);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new Throwable(strConcat), "SphericalVideoProcessor.run.1");
            zzg();
            this.zzu.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.zzo = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.zzu.countDown();
        this.zzb.zzc();
        try {
            try {
                this.zzA = true;
                while (!this.zzB) {
                    while (this.zzs > 0) {
                        this.zzo.updateTexImage();
                        this.zzs--;
                    }
                    if (this.zzb.zze(this.zzc)) {
                        if (Float.isNaN(this.zzj)) {
                            float[] fArr = this.zzc;
                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                            float f = fArr[0];
                            float f2 = fArr2[0];
                            float f3 = fArr[1];
                            float f4 = fArr2[1];
                            float f5 = (fArr[2] * 0.0f) + (f3 * f4) + (f * f2);
                            float f6 = (fArr[5] * 0.0f) + (fArr[3] * f2) + (fArr[4] * f4);
                            float f7 = fArr[6];
                            float f8 = fArr[7];
                            float f9 = fArr[8];
                            this.zzj = -(((float) Math.atan2(f6, f5)) - 1.5707964f);
                        }
                        zzk(this.zzh, this.zzj + this.zzk);
                    } else {
                        zzj(this.zzc, -1.5707964f);
                        zzk(this.zzh, this.zzk);
                    }
                    zzj(this.zzd, 1.5707964f);
                    zzi(this.zze, this.zzh, this.zzd);
                    zzi(this.zzf, this.zzc, this.zze);
                    zzj(this.zzg, this.zzl);
                    zzi(this.zzi, this.zzg, this.zzf);
                    GLES20.glUniformMatrix3fv(this.zzr, 1, false, this.zzi, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    zzh("drawArrays");
                    GLES20.glFinish();
                    this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                    if (this.zzA) {
                        GLES20.glViewport(0, 0, this.zzn, this.zzm);
                        zzh("viewport");
                        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                        int i3 = this.zzn;
                        int i4 = this.zzm;
                        if (i3 > i4) {
                            GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            GLES20.glUniform1f(iGlGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                        } else {
                            GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                            GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.zzA = false;
                    }
                    try {
                        synchronized (this.zzv) {
                            try {
                                if (!this.zzB && !this.zzA && this.zzs == 0) {
                                    this.zzv.wait();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (IllegalStateException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("SphericalVideoProcessor halted unexpectedly.");
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("SphericalVideoProcessor died.", th2);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "SphericalVideoProcessor.run.2");
            }
            this.zzb.zzd();
            this.zzo.setOnFrameAvailableListener(null);
            this.zzo = null;
            zzg();
        } catch (Throwable th3) {
            this.zzb.zzd();
            this.zzo.setOnFrameAvailableListener(null);
            this.zzo = null;
            zzg();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    @Nullable
    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i, int i2) {
        synchronized (this.zzv) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f, float f2) {
        int i = this.zzn;
        int i2 = this.zzm;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.zzk -= (f * 1.7453293f) / f3;
        float f4 = this.zzl - ((f2 * 1.7453293f) / f3);
        this.zzl = f4;
        if (f4 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    @VisibleForTesting
    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            zEglDestroyContext |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.zzw.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.zzx = null;
        return zEglTerminate;
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzp extends zzsn implements zzaak {
    private static final int[] zzb = {1920, 1600, 1440, GL20.GL_INVALID_ENUM, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzcd zzD;

    @Nullable
    private zzcd zzE;
    private int zzF;
    private int zzG;

    @Nullable
    private zzaai zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzabb zzg;
    private final boolean zzh;
    private final zzaal zzi;
    private final zzaaj zzj;
    private zzzo zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabh zzn;
    private boolean zzo;
    private List zzp;

    @Nullable
    private Surface zzq;

    @Nullable
    private zzzs zzr;
    private zzdz zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    public zzzp(Context context, zzsb zzsbVar, zzsp zzspVar, long j, boolean z, @Nullable Handler handler, @Nullable zzabc zzabcVar, int i, float f) {
        super(2, zzsbVar, zzspVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new zzabb(handler, zzabcVar);
        this.zzf = true;
        this.zzi = new zzaal(applicationContext, this, 0L);
        this.zzj = new zzaaj();
        this.zzh = "NVIDIA".equals(zzei.zzc);
        this.zzs = zzdz.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzcd.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = C.TIME_UNSET;
        this.zzJ = C.TIME_UNSET;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:162:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0267  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0273  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x029b  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:212:0x0303  */
    /* JADX WARN: Code duplicated, block: B:213:0x0307  */
    /* JADX WARN: Code duplicated, block: B:215:0x030f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0313  */
    /* JADX WARN: Code duplicated, block: B:218:0x031b  */
    /* JADX WARN: Code duplicated, block: B:219:0x031f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0327  */
    /* JADX WARN: Code duplicated, block: B:222:0x032b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0333  */
    /* JADX WARN: Code duplicated, block: B:225:0x0337  */
    /* JADX WARN: Code duplicated, block: B:227:0x033f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0343  */
    /* JADX WARN: Code duplicated, block: B:230:0x034b  */
    /* JADX WARN: Code duplicated, block: B:231:0x034f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0357  */
    /* JADX WARN: Code duplicated, block: B:234:0x035b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0363  */
    /* JADX WARN: Code duplicated, block: B:237:0x0367  */
    /* JADX WARN: Code duplicated, block: B:239:0x036f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0373  */
    /* JADX WARN: Code duplicated, block: B:242:0x037b  */
    /* JADX WARN: Code duplicated, block: B:243:0x037f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0387  */
    /* JADX WARN: Code duplicated, block: B:246:0x038b  */
    /* JADX WARN: Code duplicated, block: B:248:0x0393  */
    /* JADX WARN: Code duplicated, block: B:249:0x0397  */
    /* JADX WARN: Code duplicated, block: B:251:0x039f  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:255:0x03af  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:258:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:267:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:276:0x0400  */
    /* JADX WARN: Code duplicated, block: B:278:0x0408  */
    /* JADX WARN: Code duplicated, block: B:279:0x040c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0414  */
    /* JADX WARN: Code duplicated, block: B:282:0x0418  */
    /* JADX WARN: Code duplicated, block: B:284:0x0420  */
    /* JADX WARN: Code duplicated, block: B:285:0x0424  */
    /* JADX WARN: Code duplicated, block: B:287:0x042c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0430  */
    /* JADX WARN: Code duplicated, block: B:290:0x0438  */
    /* JADX WARN: Code duplicated, block: B:291:0x043c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0444  */
    /* JADX WARN: Code duplicated, block: B:294:0x0448  */
    /* JADX WARN: Code duplicated, block: B:296:0x0450  */
    /* JADX WARN: Code duplicated, block: B:297:0x0454  */
    /* JADX WARN: Code duplicated, block: B:299:0x045c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0460  */
    /* JADX WARN: Code duplicated, block: B:302:0x0468  */
    /* JADX WARN: Code duplicated, block: B:303:0x046c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0474  */
    /* JADX WARN: Code duplicated, block: B:306:0x0478  */
    /* JADX WARN: Code duplicated, block: B:308:0x0480  */
    /* JADX WARN: Code duplicated, block: B:309:0x0484  */
    /* JADX WARN: Code duplicated, block: B:311:0x048c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0490  */
    /* JADX WARN: Code duplicated, block: B:314:0x0498  */
    /* JADX WARN: Code duplicated, block: B:315:0x049b  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:329:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:332:0x04db  */
    /* JADX WARN: Code duplicated, block: B:333:0x04df  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:336:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:341:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:342:0x0503  */
    /* JADX WARN: Code duplicated, block: B:344:0x050b  */
    /* JADX WARN: Code duplicated, block: B:345:0x050f  */
    /* JADX WARN: Code duplicated, block: B:347:0x0517  */
    /* JADX WARN: Code duplicated, block: B:348:0x051b  */
    /* JADX WARN: Code duplicated, block: B:350:0x0523  */
    /* JADX WARN: Code duplicated, block: B:351:0x0527  */
    /* JADX WARN: Code duplicated, block: B:353:0x052f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0533  */
    /* JADX WARN: Code duplicated, block: B:356:0x053b  */
    /* JADX WARN: Code duplicated, block: B:357:0x053f  */
    /* JADX WARN: Code duplicated, block: B:359:0x0547  */
    /* JADX WARN: Code duplicated, block: B:360:0x054b  */
    /* JADX WARN: Code duplicated, block: B:362:0x0553  */
    /* JADX WARN: Code duplicated, block: B:363:0x0557  */
    /* JADX WARN: Code duplicated, block: B:365:0x055f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0563  */
    /* JADX WARN: Code duplicated, block: B:368:0x056b  */
    /* JADX WARN: Code duplicated, block: B:369:0x056f  */
    /* JADX WARN: Code duplicated, block: B:371:0x0577  */
    /* JADX WARN: Code duplicated, block: B:372:0x057b  */
    /* JADX WARN: Code duplicated, block: B:374:0x0583  */
    /* JADX WARN: Code duplicated, block: B:375:0x0587  */
    /* JADX WARN: Code duplicated, block: B:377:0x058f  */
    /* JADX WARN: Code duplicated, block: B:378:0x0593  */
    /* JADX WARN: Code duplicated, block: B:380:0x059b  */
    /* JADX WARN: Code duplicated, block: B:381:0x059f  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:384:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:389:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:392:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:393:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:396:0x05db  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:404:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:405:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:407:0x0607  */
    /* JADX WARN: Code duplicated, block: B:408:0x060b  */
    /* JADX WARN: Code duplicated, block: B:410:0x0613  */
    /* JADX WARN: Code duplicated, block: B:411:0x0617  */
    /* JADX WARN: Code duplicated, block: B:413:0x061f  */
    /* JADX WARN: Code duplicated, block: B:414:0x0623  */
    /* JADX WARN: Code duplicated, block: B:416:0x062b  */
    /* JADX WARN: Code duplicated, block: B:417:0x062f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0637  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x063b  */
    /* JADX WARN: Code duplicated, block: B:422:0x0643  */
    /* JADX WARN: Code duplicated, block: B:423:0x0647  */
    /* JADX WARN: Code duplicated, block: B:425:0x064f  */
    /* JADX WARN: Code duplicated, block: B:426:0x0653  */
    /* JADX WARN: Code duplicated, block: B:428:0x065b  */
    /* JADX WARN: Code duplicated, block: B:429:0x065e  */
    /* JADX WARN: Code duplicated, block: B:431:0x0666  */
    /* JADX WARN: Code duplicated, block: B:432:0x0669  */
    /* JADX WARN: Code duplicated, block: B:434:0x0671  */
    /* JADX WARN: Code duplicated, block: B:435:0x0675  */
    /* JADX WARN: Code duplicated, block: B:437:0x067d  */
    /* JADX WARN: Code duplicated, block: B:438:0x0681  */
    /* JADX WARN: Code duplicated, block: B:440:0x0689  */
    /* JADX WARN: Code duplicated, block: B:441:0x068d  */
    /* JADX WARN: Code duplicated, block: B:443:0x0695  */
    /* JADX WARN: Code duplicated, block: B:444:0x0699  */
    /* JADX WARN: Code duplicated, block: B:446:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:449:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:450:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:453:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:458:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:461:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:462:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:470:0x0701  */
    /* JADX WARN: Code duplicated, block: B:471:0x0705  */
    /* JADX WARN: Code duplicated, block: B:473:0x070d  */
    /* JADX WARN: Code duplicated, block: B:474:0x0711  */
    /* JADX WARN: Code duplicated, block: B:476:0x0719  */
    /* JADX WARN: Code duplicated, block: B:477:0x071d  */
    /* JADX WARN: Code duplicated, block: B:479:0x0725  */
    /* JADX WARN: Code duplicated, block: B:480:0x0729  */
    /* JADX WARN: Code duplicated, block: B:482:0x0731  */
    /* JADX WARN: Code duplicated, block: B:483:0x0734  */
    /* JADX WARN: Code duplicated, block: B:485:0x073c  */
    /* JADX WARN: Code duplicated, block: B:486:0x073f  */
    /* JADX WARN: Code duplicated, block: B:488:0x0747  */
    /* JADX WARN: Code duplicated, block: B:489:0x074a  */
    /* JADX WARN: Code duplicated, block: B:491:0x0752  */
    /* JADX WARN: Code duplicated, block: B:492:0x0755  */
    /* JADX WARN: Code duplicated, block: B:494:0x075d  */
    /* JADX WARN: Code duplicated, block: B:495:0x0760  */
    /* JADX WARN: Code duplicated, block: B:497:0x0768  */
    /* JADX WARN: Code duplicated, block: B:498:0x076b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a4, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x0790, B:517:0x07a8), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:500:0x0773  */
    /* JADX WARN: Code duplicated, block: B:501:0x0776  */
    /* JADX WARN: Code duplicated, block: B:503:0x077e  */
    /* JADX WARN: Code duplicated, block: B:504:0x0781  */
    /* JADX WARN: Code duplicated, block: B:506:0x0789  */
    /* JADX WARN: Code duplicated, block: B:507:0x078c  */
    /* JADX WARN: Code duplicated, block: B:509:0x0790 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a4, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x0790, B:517:0x07a8), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:513:0x079a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a4, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x0790, B:517:0x07a8), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean zzaU(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzzp.class) {
            if (!zzc) {
                int i = zzei.zza;
                byte b3 = 28;
                if (i <= 28) {
                    String str4 = zzei.zzb;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            if (!str4.equals("dangal")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -1220081023:
                            if (!str4.equals("dangalFHD")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case -1220066608:
                            if (!str4.equals("dangalUHD")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -1012436106:
                            if (!str4.equals("oneday")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case -760312546:
                            if (!str4.equals("aquaman")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case -64886864:
                            if (!str4.equals("magnolia")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 3415681:
                            if (!str4.equals("once")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 825323514:
                            if (!str4.equals("machuca")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i <= 27 || !"HWEML".equals(zzei.zzb)) {
                                str2 = zzei.zzd;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = -1;
                                        } else {
                                            b = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = -1;
                                        } else {
                                            b = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = -1;
                                        } else {
                                            b = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = -1;
                                        } else {
                                            b = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = -1;
                                        } else {
                                            b = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = -1;
                                        } else {
                                            b = 5;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (i <= 26) {
                                            str3 = zzei.zzb;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = cw.k;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = cw.n;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = cw.m;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = cw.l;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case Input.Keys.PERIOD /* 56 */:
                                                case Input.Keys.ALT_LEFT /* 57 */:
                                                case Input.Keys.ALT_RIGHT /* 58 */:
                                                case Input.Keys.SHIFT_LEFT /* 59 */:
                                                case 60:
                                                case Input.Keys.TAB /* 61 */:
                                                case Input.Keys.SPACE /* 62 */:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case Input.Keys.GRAVE /* 68 */:
                                                case Input.Keys.MINUS /* 69 */:
                                                case Input.Keys.EQUALS /* 70 */:
                                                case Input.Keys.LEFT_BRACKET /* 71 */:
                                                case Input.Keys.RIGHT_BRACKET /* 72 */:
                                                case Input.Keys.BACKSLASH /* 73 */:
                                                case Input.Keys.SEMICOLON /* 74 */:
                                                case Input.Keys.APOSTROPHE /* 75 */:
                                                case Input.Keys.SLASH /* 76 */:
                                                case Input.Keys.AT /* 77 */:
                                                case Input.Keys.NUM /* 78 */:
                                                case Input.Keys.HEADSETHOOK /* 79 */:
                                                case Input.Keys.FOCUS /* 80 */:
                                                case Input.Keys.PLUS /* 81 */:
                                                case Input.Keys.MENU /* 82 */:
                                                case Input.Keys.NOTIFICATION /* 83 */:
                                                case Input.Keys.SEARCH /* 84 */:
                                                case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
                                                case Input.Keys.MEDIA_STOP /* 86 */:
                                                case Input.Keys.MEDIA_NEXT /* 87 */:
                                                case Input.Keys.MEDIA_PREVIOUS /* 88 */:
                                                case 89:
                                                case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
                                                case Input.Keys.MUTE /* 91 */:
                                                case 92:
                                                case Input.Keys.PAGE_DOWN /* 93 */:
                                                case 94:
                                                case Input.Keys.SWITCH_CHARSET /* 95 */:
                                                case Input.Keys.BUTTON_A /* 96 */:
                                                case Input.Keys.BUTTON_B /* 97 */:
                                                case Input.Keys.BUTTON_C /* 98 */:
                                                case Input.Keys.BUTTON_X /* 99 */:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                case JSON_ENCODE_ERROR_VALUE:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                                case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case Input.Keys.F9 /* 139 */:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (i <= 27) {
                    str2 = zzei.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = zzei.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.k;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.n;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.m;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.l;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case Input.Keys.PERIOD /* 56 */:
                                    case Input.Keys.ALT_LEFT /* 57 */:
                                    case Input.Keys.ALT_RIGHT /* 58 */:
                                    case Input.Keys.SHIFT_LEFT /* 59 */:
                                    case 60:
                                    case Input.Keys.TAB /* 61 */:
                                    case Input.Keys.SPACE /* 62 */:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case Input.Keys.GRAVE /* 68 */:
                                    case Input.Keys.MINUS /* 69 */:
                                    case Input.Keys.EQUALS /* 70 */:
                                    case Input.Keys.LEFT_BRACKET /* 71 */:
                                    case Input.Keys.RIGHT_BRACKET /* 72 */:
                                    case Input.Keys.BACKSLASH /* 73 */:
                                    case Input.Keys.SEMICOLON /* 74 */:
                                    case Input.Keys.APOSTROPHE /* 75 */:
                                    case Input.Keys.SLASH /* 76 */:
                                    case Input.Keys.AT /* 77 */:
                                    case Input.Keys.NUM /* 78 */:
                                    case Input.Keys.HEADSETHOOK /* 79 */:
                                    case Input.Keys.FOCUS /* 80 */:
                                    case Input.Keys.PLUS /* 81 */:
                                    case Input.Keys.MENU /* 82 */:
                                    case Input.Keys.NOTIFICATION /* 83 */:
                                    case Input.Keys.SEARCH /* 84 */:
                                    case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
                                    case Input.Keys.MEDIA_STOP /* 86 */:
                                    case Input.Keys.MEDIA_NEXT /* 87 */:
                                    case Input.Keys.MEDIA_PREVIOUS /* 88 */:
                                    case 89:
                                    case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
                                    case Input.Keys.MUTE /* 91 */:
                                    case 92:
                                    case Input.Keys.PAGE_DOWN /* 93 */:
                                    case 94:
                                    case Input.Keys.SWITCH_CHARSET /* 95 */:
                                    case Input.Keys.BUTTON_A /* 96 */:
                                    case Input.Keys.BUTTON_B /* 97 */:
                                    case Input.Keys.BUTTON_C /* 98 */:
                                    case Input.Keys.BUTTON_X /* 99 */:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    case JSON_ENCODE_ERROR_VALUE:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case Input.Keys.F9 /* 139 */:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = zzei.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (i <= 26) {
                                str3 = zzei.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.k;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.n;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.m;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = cw.l;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case Input.Keys.PERIOD /* 56 */:
                                    case Input.Keys.ALT_LEFT /* 57 */:
                                    case Input.Keys.ALT_RIGHT /* 58 */:
                                    case Input.Keys.SHIFT_LEFT /* 59 */:
                                    case 60:
                                    case Input.Keys.TAB /* 61 */:
                                    case Input.Keys.SPACE /* 62 */:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case Input.Keys.GRAVE /* 68 */:
                                    case Input.Keys.MINUS /* 69 */:
                                    case Input.Keys.EQUALS /* 70 */:
                                    case Input.Keys.LEFT_BRACKET /* 71 */:
                                    case Input.Keys.RIGHT_BRACKET /* 72 */:
                                    case Input.Keys.BACKSLASH /* 73 */:
                                    case Input.Keys.SEMICOLON /* 74 */:
                                    case Input.Keys.APOSTROPHE /* 75 */:
                                    case Input.Keys.SLASH /* 76 */:
                                    case Input.Keys.AT /* 77 */:
                                    case Input.Keys.NUM /* 78 */:
                                    case Input.Keys.HEADSETHOOK /* 79 */:
                                    case Input.Keys.FOCUS /* 80 */:
                                    case Input.Keys.PLUS /* 81 */:
                                    case Input.Keys.MENU /* 82 */:
                                    case Input.Keys.NOTIFICATION /* 83 */:
                                    case Input.Keys.SEARCH /* 84 */:
                                    case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
                                    case Input.Keys.MEDIA_STOP /* 86 */:
                                    case Input.Keys.MEDIA_NEXT /* 87 */:
                                    case Input.Keys.MEDIA_PREVIOUS /* 88 */:
                                    case 89:
                                    case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
                                    case Input.Keys.MUTE /* 91 */:
                                    case 92:
                                    case Input.Keys.PAGE_DOWN /* 93 */:
                                    case 94:
                                    case Input.Keys.SWITCH_CHARSET /* 95 */:
                                    case Input.Keys.BUTTON_A /* 96 */:
                                    case Input.Keys.BUTTON_B /* 97 */:
                                    case Input.Keys.BUTTON_C /* 98 */:
                                    case Input.Keys.BUTTON_X /* 99 */:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    case JSON_ENCODE_ERROR_VALUE:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case Input.Keys.F9 /* 139 */:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    public static final boolean zzaV(zzsg zzsgVar) {
        return zzei.zza >= 35 && zzsgVar.zzh;
    }

    @Nullable
    private final Surface zzaW(zzsg zzsgVar) {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            return zzabhVar.zza();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzsgVar)) {
            return null;
        }
        zzcw.zzf(zzbc(zzsgVar));
        zzzs zzzsVar = this.zzr;
        if (zzzsVar != null) {
            if (zzzsVar.zza != zzsgVar.zzf) {
                zzba();
            }
        }
        if (this.zzr == null) {
            this.zzr = zzzs.zza(this.zze, zzsgVar.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context, zzsp zzspVar, zzab zzabVar, boolean z, boolean z2) throws zzsu {
        String str = zzabVar.zzo;
        if (str == null) {
            return zzfxn.zzn();
        }
        if (zzei.zza >= 26 && "video/dolby-vision".equals(str) && !zzzn.zza(context)) {
            List listZzc = zzta.zzc(zzspVar, zzabVar, z, z2);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zzta.zze(zzspVar, zzabVar, z, z2);
    }

    private final void zzaY() {
        zzcd zzcdVar = this.zzE;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    public static int zzad(zzsg zzsgVar, zzab zzabVar) {
        int iIntValue;
        int i = zzabVar.zzv;
        int i2 = zzabVar.zzw;
        if (i != -1 && i2 != -1) {
            String str = zzabVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i3 = zzta.zza;
                Pair pairZza = zzcy.zza(zzabVar);
                str = (pairZza == null || !((iIntValue = ((Integer) pairZza.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i4 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / i4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = zzei.zzd;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(zzei.zzc) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzsgVar.zzf)))) {
                        return ((((i2 + 15) / 16) * ((i + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i4 = 8;
                    return ((i * i2) * 3) / i4;
            }
        }
        return -1;
    }

    public static int zzae(zzsg zzsgVar, zzab zzabVar) {
        if (zzabVar.zzp == -1) {
            return zzad(zzsgVar, zzabVar);
        }
        int size = zzabVar.zzr.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzabVar.zzr.get(i)).length;
        }
        return zzabVar.zzp + length;
    }

    private final void zzba() {
        zzzs zzzsVar = this.zzr;
        if (zzzsVar != null) {
            zzzsVar.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(zzsg zzsgVar) {
        Surface surface = this.zzq;
        return (surface != null && surface.isValid()) || zzaV(zzsgVar) || zzbc(zzsgVar);
    }

    private final boolean zzbc(zzsg zzsgVar) {
        if (zzei.zza < 23 || zzaU(zzsgVar.zza)) {
            return false;
        }
        return !zzsgVar.zzf || zzzs.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzA() {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || !this.zzf) {
            return;
        }
        zzabhVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = C.TIME_UNSET;
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzj();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzE() {
        if (this.zzx > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzd(this.zzx, jZzb - this.zzw);
            this.zzx = 0;
            this.zzw = jZzb;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzk();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzF(zzab[] zzabVarArr, long j, long j2, zzug zzugVar) throws zzib {
        super.zzF(zzabVarArr, j, j2, zzugVar);
        if (this.zzI == C.TIME_UNSET) {
            this.zzI = j;
        }
        zzbq zzbqVarZzh = zzh();
        if (zzbqVarZzh.zzo()) {
            this.zzJ = C.TIME_UNSET;
        } else {
            this.zzJ = zzbqVarZzh.zzn(zzugVar.zza, new zzbo()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public final void zzM(float f, float f2) throws zzib {
        super.zzM(f, f2);
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzq(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    @CallSuper
    public final void zzV(long j, long j2) throws zzib {
        super.zzV(j, j2);
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            try {
                zzabhVar.zzm(j, j2);
            } catch (zzabg e) {
                throw zzcW(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            return true;
        }
        zzabhVar.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            return zzabhVar.zzx(zZzX);
        }
        if (zZzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zZzX);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final float zzZ(float f, zzab zzabVar, zzab[] zzabVarArr) {
        float fMax = -1.0f;
        for (zzab zzabVar2 : zzabVarArr) {
            float f2 = zzabVar2.zzx;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final zzsf zzaA(Throwable th, @Nullable zzsg zzsgVar) {
        return new zzzk(th, zzsgVar, this.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    public final void zzaD(long j) {
        super.zzaD(j);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    public final void zzaE(zzhh zzhhVar) throws zzib {
        this.zzz++;
        int i = zzei.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    public final void zzaF(zzab zzabVar) throws zzib {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || zzabhVar.zzw()) {
            return;
        }
        try {
            zzabhVar.zze(zzabVar);
        } catch (zzabg e) {
            throw zzcW(e, zzabVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzaN(zzsg zzsgVar) {
        return zzbb(zzsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzaO(zzhh zzhhVar) {
        if (zzhhVar.zzi() && !zzQ() && !zzhhVar.zzh() && this.zzJ != C.TIME_UNSET) {
            if (this.zzJ - (zzhhVar.zze - zzav()) > 100000 && !zzhhVar.zzl() && zzhhVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    public final void zzaQ(zzsd zzsdVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsdVar.zzo(i, false);
        Trace.endSection();
        ((zzsn) this).zza.zzf++;
    }

    public final void zzaR(int i, int i2) {
        zzhs zzhsVar = ((zzsn) this).zza;
        zzhsVar.zzh += i;
        int i3 = i + i2;
        zzhsVar.zzg += i3;
        this.zzx += i3;
        int i4 = this.zzy + i3;
        this.zzy = i4;
        zzhsVar.zzi = Math.max(i4, zzhsVar.zzi);
    }

    public final void zzaS(long j) {
        zzhs zzhsVar = ((zzsn) this).zza;
        zzhsVar.zzk += j;
        zzhsVar.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    public final boolean zzaT(long j, boolean z) throws zzib {
        int iZzd = zzd(j);
        if (iZzd == 0) {
            return false;
        }
        if (z) {
            zzhs zzhsVar = ((zzsn) this).zza;
            zzhsVar.zzd += iZzd;
            zzhsVar.zzf += this.zzz;
        } else {
            ((zzsn) this).zza.zzj++;
            zzaR(iZzd, this.zzz);
        }
        zzaJ();
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzd(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzaa(zzsp zzspVar, zzab zzabVar) throws zzsu {
        boolean z;
        if (!zzbb.zzi(zzabVar.zzo)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzabVar.zzs != null;
        List listZzaX = zzaX(context, zzspVar, zzabVar, z2, false);
        if (z2 && listZzaX.isEmpty()) {
            listZzaX = zzaX(context, zzspVar, zzabVar, false, false);
        }
        if (listZzaX.isEmpty()) {
            return 129;
        }
        if (!zzsn.zzaP(zzabVar)) {
            return 130;
        }
        zzsg zzsgVar = (zzsg) listZzaX.get(0);
        boolean zZze = zzsgVar.zze(zzabVar);
        if (!zZze) {
            int i2 = 1;
            while (true) {
                if (i2 >= listZzaX.size()) {
                    z = true;
                    break;
                }
                zzsg zzsgVar2 = (zzsg) listZzaX.get(i2);
                if (zzsgVar2.zze(zzabVar)) {
                    zzsgVar = zzsgVar2;
                    z = false;
                    zZze = true;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zZze ? 3 : 4;
        int i4 = true != zzsgVar.zzf(zzabVar) ? 8 : 16;
        int i5 = true != zzsgVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (zzei.zza >= 26 && "video/dolby-vision".equals(zzabVar.zzo) && !zzzn.zza(context)) {
            i6 = 256;
        }
        if (zZze) {
            List listZzaX2 = zzaX(context, zzspVar, zzabVar, z2, true);
            if (!listZzaX2.isEmpty()) {
                zzsg zzsgVar3 = (zzsg) zzta.zzf(listZzaX2, zzabVar).get(0);
                if (zzsgVar3.zze(zzabVar) && zzsgVar3.zzf(zzabVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final zzht zzab(zzsg zzsgVar, zzab zzabVar, zzab zzabVar2) {
        int i;
        int i2;
        zzht zzhtVarZzb = zzsgVar.zzb(zzabVar, zzabVar2);
        int i3 = zzhtVarZzb.zze;
        zzzo zzzoVar = this.zzk;
        zzzoVar.getClass();
        if (zzabVar2.zzv > zzzoVar.zza || zzabVar2.zzw > zzzoVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zzsgVar, zzabVar2) > zzzoVar.zzc) {
            i3 |= 64;
        }
        String str = zzsgVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhtVarZzb.zzd;
            i2 = 0;
        }
        return new zzht(str, zzabVar, zzabVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @Nullable
    public final zzht zzac(zzke zzkeVar) throws zzib {
        zzht zzhtVarZzac = super.zzac(zzkeVar);
        zzab zzabVar = zzkeVar.zza;
        zzabVar.getClass();
        this.zzg.zzf(zzabVar, zzhtVarZzac);
        return zzhtVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final zzsa zzaf(zzsg zzsgVar, zzab zzabVar, @Nullable MediaCrypto mediaCrypto, float f) {
        Point pointZza;
        int i;
        int i2;
        int iZzad;
        zzab[] zzabVarArrZzT = zzT();
        int length = zzabVarArrZzT.length;
        int iZzae = zzae(zzsgVar, zzabVar);
        int iMax = zzabVar.zzv;
        int iMax2 = zzabVar.zzw;
        if (length != 1) {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                zzab zzabVarZzag = zzabVarArrZzT[i3];
                if (zzabVar.zzC != null && zzabVarZzag.zzC == null) {
                    zzz zzzVarZzb = zzabVarZzag.zzb();
                    zzzVarZzb.zzB(zzabVar.zzC);
                    zzabVarZzag = zzzVarZzb.zzag();
                }
                if (zzsgVar.zzb(zzabVar, zzabVarZzag).zzd != 0) {
                    int i4 = zzabVarZzag.zzv;
                    z |= i4 == -1 || zzabVarZzag.zzw == -1;
                    iMax = Math.max(iMax, i4);
                    iMax2 = Math.max(iMax2, zzabVarZzag.zzw);
                    iZzae = Math.max(iZzae, zzae(zzsgVar, zzabVarZzag));
                }
            }
            if (z) {
                zzdo.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i5 = zzabVar.zzw;
                int i6 = zzabVar.zzv;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (true == z2) {
                    i5 = i6;
                }
                int[] iArr = zzb;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        float f2 = i5;
                        float f3 = i7;
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        float f4 = i9;
                        if (i9 > i7 && (i = (int) ((f2 / f3) * f4)) > i5) {
                            int i10 = true != z2 ? i9 : i;
                            if (true != z2) {
                                i9 = i;
                            }
                            pointZza = zzsgVar.zza(i10, i9);
                            float f5 = zzabVar.zzx;
                            if (pointZza != null) {
                                if (zzsgVar.zzg(pointZza.x, pointZza.y, f5)) {
                                    break;
                                }
                            }
                            i8++;
                            z2 = z2;
                            iArr = iArr2;
                            i5 = i5;
                        }
                    }
                    pointZza = null;
                    break;
                }
                if (pointZza != null) {
                    iMax = Math.max(iMax, pointZza.x);
                    iMax2 = Math.max(iMax2, pointZza.y);
                    zzz zzzVarZzb2 = zzabVar.zzb();
                    zzzVarZzb2.zzaf(iMax);
                    zzzVarZzb2.zzK(iMax2);
                    iZzae = Math.max(iZzae, zzad(zzsgVar, zzzVarZzb2.zzag()));
                    zzdo.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iZzae != -1 && (iZzad = zzad(zzsgVar, zzabVar)) != -1) {
            iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
        }
        String str = zzsgVar.zzc;
        zzzo zzzoVar = new zzzo(iMax, iMax2, iZzae);
        this.zzk = zzzoVar;
        boolean z3 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzabVar.zzv);
        mediaFormat.setInteger("height", zzabVar.zzw);
        zzdr.zzb(mediaFormat, zzabVar.zzr);
        float f6 = zzabVar.zzx;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzdr.zza(mediaFormat, "rotation-degrees", zzabVar.zzy);
        zzk zzkVar = zzabVar.zzC;
        if (zzkVar != null) {
            zzdr.zza(mediaFormat, "color-transfer", zzkVar.zzd);
            zzdr.zza(mediaFormat, "color-standard", zzkVar.zzb);
            zzdr.zza(mediaFormat, "color-range", zzkVar.zzc);
            byte[] bArr = zzkVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzabVar.zzo)) {
            int i11 = zzta.zza;
            Pair pairZza = zzcy.zza(zzabVar);
            if (pairZza != null) {
                zzdr.zza(mediaFormat, Scopes.PROFILE, ((Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzzoVar.zza);
        mediaFormat.setInteger("max-height", zzzoVar.zzb);
        zzdr.zza(mediaFormat, "max-input-size", zzzoVar.zzc);
        int i12 = zzei.zza;
        if (i12 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            i2 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i2 = 0;
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i2, -this.zzF));
        }
        Surface surfaceZzaW = zzaW(zzsgVar);
        if (this.zzn != null && !zzei.zzK(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsa.zzb(zzsgVar, mediaFormat, zzabVar, surfaceZzaW, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final List zzag(zzsp zzspVar, zzab zzabVar, boolean z) throws zzsu {
        return zzta.zzf(zzaX(this.zze, zzspVar, zzabVar, false, false), zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @TargetApi(29)
    public final void zzaj(zzhh zzhhVar) throws zzib {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhhVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsd zzsdVarZzaz = zzaz();
                        zzsdVarZzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsdVarZzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzak(Exception exc) {
        zzdo.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzal(String str, zzsa zzsaVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaU(str);
        zzsg zzsgVarZzaB = zzaB();
        zzsgVarZzaB.getClass();
        boolean z = false;
        if (zzei.zza >= 29 && MimeTypes.VIDEO_VP9.equals(zzsgVarZzaB.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzsgVarZzaB.zzh()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzan(zzab zzabVar, @Nullable MediaFormat mediaFormat) {
        zzsd zzsdVarZzaz = zzaz();
        if (zzsdVarZzaz != null) {
            zzsdVarZzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = zzabVar.zzz;
        if (zzei.zza >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = zzabVar.zzy;
        if (i == 90 || i == 270) {
            integer3 = 1.0f / integer3;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzD = new zzcd(integer, integer2, integer3);
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || !this.zzK) {
            this.zzi.zzl(zzabVar.zzx);
        } else {
            zzz zzzVarZzb = zzabVar.zzb();
            zzzVarZzb.zzaf(integer);
            zzzVarZzb.zzK(integer2);
            zzzVarZzb.zzW(integer3);
            zzabhVar.zzg(1, zzzVarZzb.zzag());
        }
        this.zzK = false;
    }

    public final void zzao(zzsd zzsdVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsdVar.zzn(i, j2);
        Trace.endSection();
        ((zzsn) this).zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzcd zzcdVar = this.zzD;
            if (!zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzE)) {
                this.zzE = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzp() || this.zzq == null) {
                return;
            }
            zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzap() {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzr(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzar(long j, long j2, @Nullable zzsd zzsdVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzabVar) throws zzib {
        boolean z3;
        zzsdVar.getClass();
        long jZzav = j3 - zzav();
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            int iZza = this.zzi.zza(j3, j, j2, zzaw(), z2, this.zzj);
            if (iZza == 4) {
                return false;
            }
            if (z && !z2) {
                zzaQ(zzsdVar, i, jZzav);
                return true;
            }
            if (this.zzq == null) {
                if (this.zzj.zzc() >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    return false;
                }
                zzaQ(zzsdVar, i, jZzav);
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza == 0) {
                zzao(zzsdVar, i, jZzav, zzi().zzc());
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza == 1) {
                zzaaj zzaajVar = this.zzj;
                long jZzd = zzaajVar.zzd();
                long jZzc = zzaajVar.zzc();
                if (jZzd == this.zzC) {
                    zzaQ(zzsdVar, i, jZzav);
                } else {
                    zzao(zzsdVar, i, jZzav, jZzd);
                }
                zzaS(jZzc);
                this.zzC = jZzd;
                return true;
            }
            if (iZza == 2) {
                Trace.beginSection("dropVideoBuffer");
                zzsdVar.zzo(i, false);
                Trace.endSection();
                zzaR(0, 1);
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza != 3) {
                if (iZza == 5) {
                    return false;
                }
                throw new IllegalStateException(String.valueOf(iZza));
            }
            zzaQ(zzsdVar, i, jZzav);
            zzaS(this.zzj.zzc());
            return true;
        }
        try {
            z3 = false;
            try {
                return zzabhVar.zzu(j3 + (-this.zzI), z2, j, j2, new zzzm(this, zzsdVar, i, jZzav));
            } catch (zzabg e) {
                e = e;
                throw zzcW(e, e.zza, z3, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        } catch (zzabg e2) {
            e = e2;
            z3 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzau(zzhh zzhhVar) {
        int i = zzei.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public final void zzt() {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzc();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public final void zzu(int i, @Nullable Object obj) throws zzib {
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.zzq == surface) {
                if (surface != null) {
                    zzaY();
                    Surface surface2 = this.zzq;
                    if (surface2 == null || !this.zzt) {
                        return;
                    }
                    this.zzg.zzq(surface2);
                    return;
                }
                return;
            }
            this.zzq = surface;
            if (this.zzn == null) {
                this.zzi.zzm(surface);
            }
            this.zzt = false;
            int iZzcT = zzcT();
            zzsd zzsdVarZzaz = zzaz();
            if (zzsdVarZzaz != null && this.zzn == null) {
                zzsg zzsgVarZzaB = zzaB();
                zzsgVarZzaB.getClass();
                boolean zZzbb = zzbb(zzsgVarZzaB);
                int i2 = zzei.zza;
                if (i2 < 23 || !zZzbb || this.zzl) {
                    zzaG();
                    zzaC();
                } else {
                    Surface surfaceZzaW = zzaW(zzsgVarZzaB);
                    if (i2 >= 23 && surfaceZzaW != null) {
                        zzsdVarZzaz.zzp(surfaceZzaW);
                    } else {
                        if (i2 < 35) {
                            throw new IllegalStateException();
                        }
                        zzsdVarZzaz.zzi();
                    }
                }
            }
            if (surface == null) {
                this.zzE = null;
                zzabh zzabhVar = this.zzn;
                if (zzabhVar != null) {
                    zzabhVar.zzb();
                    return;
                }
                return;
            }
            zzaY();
            if (iZzcT == 2) {
                zzabh zzabhVar2 = this.zzn;
                if (zzabhVar2 != null) {
                    zzabhVar2.zzf(true);
                    return;
                } else {
                    this.zzi.zzc(true);
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaai zzaaiVar = (zzaai) obj;
            this.zzH = zzaaiVar;
            zzabh zzabhVar3 = this.zzn;
            if (zzabhVar3 != null) {
                zzabhVar3.zzt(zzaaiVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzG != iIntValue) {
                this.zzG = iIntValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzF = ((Integer) obj).intValue();
            zzsd zzsdVarZzaz2 = zzaz();
            if (zzsdVarZzaz2 == null || zzei.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzF));
            zzsdVarZzaz2.zzq(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzu = iIntValue2;
            zzsd zzsdVarZzaz3 = zzaz();
            if (zzsdVarZzaz3 != null) {
                zzsdVarZzaz3.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzv = iIntValue3;
            zzabh zzabhVar4 = this.zzn;
            if (zzabhVar4 != null) {
                zzabhVar4.zzn(iIntValue3);
                return;
            } else {
                this.zzi.zzj(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzp = list;
            zzabh zzabhVar5 = this.zzn;
            if (zzabhVar5 != null) {
                zzabhVar5.zzs(list);
                return;
            }
            return;
        }
        if (i != 14) {
            super.zzu(i, obj);
            return;
        }
        obj.getClass();
        zzdz zzdzVar = (zzdz) obj;
        if (zzdzVar.zzb() == 0 || zzdzVar.zza() == 0) {
            return;
        }
        this.zzs = zzdzVar;
        zzabh zzabhVar6 = this.zzn;
        if (zzabhVar6 != null) {
            Surface surface3 = this.zzq;
            zzcw.zzb(surface3);
            zzabhVar6.zzp(surface3, zzdzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzx() {
        this.zzE = null;
        this.zzJ = C.TIME_UNSET;
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzh();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(((zzsn) this).zza);
            this.zzg.zzt(zzcd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzy(boolean z, boolean z2) throws zzib {
        super.zzy(z, z2);
        zzn();
        this.zzg.zze(((zzsn) this).zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzw zzzwVar = new zzzw(this.zze, this.zzi);
                zzzwVar.zzd(zzi());
                this.zzn = zzzwVar.zze().zzh();
            }
            this.zzo = true;
        }
        zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z2);
            return;
        }
        zzabhVar.zzo(new zzzl(this), zzgcz.zzc());
        zzaai zzaaiVar = this.zzH;
        if (zzaaiVar != null) {
            this.zzn.zzt(zzaaiVar);
        }
        if (this.zzq != null && !this.zzs.equals(zzdz.zza)) {
            this.zzn.zzp(this.zzq, this.zzs);
        }
        this.zzn.zzn(this.zzv);
        this.zzn.zzq(zzat());
        List list = this.zzp;
        if (list != null) {
            this.zzn.zzs(list);
        }
        this.zzn.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    public final void zzz(long j, boolean z) throws zzib {
        zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzd(true);
            this.zzn.zzr(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j, z);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z) {
            zzabh zzabhVar2 = this.zzn;
            if (zzabhVar2 != null) {
                zzabhVar2.zzf(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }
}

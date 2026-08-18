package com.unity3d.services.core.domain.task;

import com.badlogic.gdx.Input;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ResultExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z90;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, Input.Keys.ALT_RIGHT, 60, 65, 67, Input.Keys.LEFT_BRACKET, Input.Keys.SEMICOLON, 89, 92, 100, 103, 106}, m = "invokeSuspend")
public final class InitializeSDK$doWork$2 extends Ea0 implements InterfaceC3567gx {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = initializeSDK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, interfaceC2857Wj);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeSDK$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025c A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0267 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0271 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b3 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x02d3 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0303 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0315 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x0332 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x0339 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:139:0x034f  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x020b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x022c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0231 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0249 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0250 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x0333, B:13:0x002b, B:129:0x0316, B:16:0x0036, B:124:0x02ff, B:126:0x0303, B:19:0x0047, B:117:0x02c8, B:120:0x02d9, B:22:0x0052, B:112:0x02af, B:114:0x02b3, B:25:0x0060, B:97:0x024a, B:99:0x0250, B:100:0x025b, B:28:0x0078, B:92:0x022d, B:94:0x0231, B:101:0x025c, B:103:0x0267, B:105:0x0271, B:107:0x0277, B:108:0x028c, B:118:0x02d3, B:133:0x0339, B:134:0x0344, B:31:0x0092, B:89:0x020c, B:34:0x00a3, B:84:0x01f2, B:86:0x01f6, B:37:0x00b2, B:76:0x01c4, B:78:0x01ca, B:79:0x01d5, B:40:0x00c8, B:71:0x01aa, B:73:0x01ae, B:80:0x01d6, B:43:0x00dc, B:62:0x016b, B:64:0x0171, B:65:0x0184, B:68:0x018e, B:46:0x00ed, B:58:0x014d, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0171, please report this as an issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objV;
        Throwable thA;
        InterfaceC4514rk interfaceC4514rk;
        InitializeSDK initializeSDK;
        InitializeSDK initializeSDK2;
        Object objMo81invokegIAlus;
        InitializeSDK initializeSDK3;
        Object obj2;
        Throwable thA2;
        Configuration configuration;
        Configuration configuration2;
        Object objMo81invokegIAlus2;
        Configuration configuration3;
        Object obj3;
        Object objMo81invokegIAlus3;
        InterfaceC4514rk interfaceC4514rk2;
        InitializeSDK initializeSDK4;
        Configuration configuration4;
        ErrorState errorState;
        Throwable thA3;
        Throwable thA4;
        InitializationException initializationExceptionOrThrow;
        Object objMo81invokegIAlus4;
        Object obj4;
        Object obj5;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        String webViewData;
        Object objMo81invokegIAlus5;
        Object obj6;
        ErrorState errorState2;
        Throwable thA5;
        Throwable thA6;
        InitializationException initializationExceptionOrThrow2;
        Object objMo81invokegIAlus6;
        InitializeSDK initializeSDK5;
        Object obj7;
        Object obj8;
        InitializationException initializationExceptionOrThrow3;
        Object objMo81invokegIAlus7;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        try {
            switch (this.label) {
                case 0:
                    AbstractC3375el.b0(obj);
                    interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                    initializeSDK = this.this$0;
                    SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                    SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                    InitializeEventsMetricSender.getInstance().didInitStart();
                    String gameId = ClientProperties.getGameId();
                    if (gameId == null || Z90.i0(gameId) == null) {
                        InitializationException initializationException = new InitializationException(ErrorState.InvalidGameId, new Exception("gameId \"" + gameId + "\" should be a number."), new Configuration());
                        this.L$0 = interfaceC4514rk;
                        this.L$1 = initializeSDK;
                        this.label = 1;
                        if (initializeSDK.handleInitializationException(initializationException, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        initializeSDK2 = initializeSDK;
                        initializeSDK = initializeSDK2;
                    }
                    DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    ConfigFileFromLocalStorage configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                    ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK;
                    this.label = 2;
                    objMo81invokegIAlus = configFileFromLocalStorage.mo81invokegIAlus(params, this);
                    if (objMo81invokegIAlus == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK3 = initializeSDK;
                    obj2 = objMo81invokegIAlus;
                    thA2 = IZ.a(obj2);
                    if (thA2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thA2.getMessage());
                    }
                    configuration = new Configuration();
                    if (obj2 instanceof HZ) {
                        obj2 = configuration;
                    }
                    configuration2 = (Configuration) obj2;
                    InitializeStateReset initializeStateReset = initializeSDK3.initializeStateReset;
                    InitializeStateReset.Params params2 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo81invokegIAlus2 = initializeStateReset.mo81invokegIAlus(params2, this);
                    if (objMo81invokegIAlus2 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    configuration3 = configuration2;
                    obj3 = objMo81invokegIAlus2;
                    if (obj3 instanceof HZ) {
                        errorState = ErrorState.ResetWebApp;
                        thA3 = IZ.a(obj3);
                        this.L$0 = obj3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (initializeSDK3.m85executeErrorStateBWLJW6A(errorState, thA3, configuration3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA4 = IZ.a(obj3);
                        if (thA4 == null) {
                            throw new Exception(ErrorState.ResetWebApp.toString());
                        }
                        throw thA4;
                    }
                    InitializeStateConfig initializeStateConfig = initializeSDK3.initializeStateConfig;
                    InitializeStateConfig.Params params3 = new InitializeStateConfig.Params(configuration3);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration3;
                    this.label = 5;
                    objMo81invokegIAlus3 = initializeStateConfig.mo81invokegIAlus(params3, this);
                    if (objMo81invokegIAlus3 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    interfaceC4514rk2 = interfaceC4514rk;
                    initializeSDK4 = initializeSDK3;
                    configuration4 = configuration3;
                    if (objMo81invokegIAlus3 instanceof HZ) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus3);
                        this.L$0 = interfaceC4514rk2;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration4;
                        this.L$3 = objMo81invokegIAlus3;
                        this.label = 6;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params4 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache.mo81invokegIAlus(params4, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj9 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj9;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    } else if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled() || loadCacheResult.getWebViewData() == null) {
                        InitializeStateLoadWeb initializeStateLoadWeb = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params5 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb.mo81invokegIAlus(params5, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                    } else {
                        WD.D(interfaceC4514rk2, new C4251ok("LaunchLoadWeb"), 0, new InitializeSDK$doWork$2$1$webViewData$1(initializeSDK4, obj5, null), 2);
                        webViewData = loadCacheResult.getWebViewData();
                    }
                    InitializeStateCreate initializeStateCreate = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params6 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate.mo81invokegIAlus(params6, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params7 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete.mo81invokegIAlus(params7, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ)) && (thA = IZ.a(objV)) != null) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 1:
                    initializeSDK2 = (InitializeSDK) this.L$1;
                    interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    initializeSDK = initializeSDK2;
                    DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    ConfigFileFromLocalStorage configFileFromLocalStorage2 = initializeSDK.configFileFromLocalStorage;
                    ConfigFileFromLocalStorage.Params params8 = new ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK;
                    this.label = 2;
                    objMo81invokegIAlus = configFileFromLocalStorage2.mo81invokegIAlus(params8, this);
                    if (objMo81invokegIAlus == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK3 = initializeSDK;
                    obj2 = objMo81invokegIAlus;
                    thA2 = IZ.a(obj2);
                    if (thA2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thA2.getMessage());
                    }
                    configuration = new Configuration();
                    if (obj2 instanceof HZ) {
                        obj2 = configuration;
                    }
                    configuration2 = (Configuration) obj2;
                    InitializeStateReset initializeStateReset2 = initializeSDK3.initializeStateReset;
                    InitializeStateReset.Params params9 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo81invokegIAlus2 = initializeStateReset2.mo81invokegIAlus(params9, this);
                    if (objMo81invokegIAlus2 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    configuration3 = configuration2;
                    obj3 = objMo81invokegIAlus2;
                    if (obj3 instanceof HZ) {
                        errorState = ErrorState.ResetWebApp;
                        thA3 = IZ.a(obj3);
                        this.L$0 = obj3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (initializeSDK3.m85executeErrorStateBWLJW6A(errorState, thA3, configuration3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA4 = IZ.a(obj3);
                        if (thA4 == null) {
                            throw new Exception(ErrorState.ResetWebApp.toString());
                        }
                        throw thA4;
                    }
                    InitializeStateConfig initializeStateConfig2 = initializeSDK3.initializeStateConfig;
                    InitializeStateConfig.Params params10 = new InitializeStateConfig.Params(configuration3);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration3;
                    this.label = 5;
                    objMo81invokegIAlus3 = initializeStateConfig2.mo81invokegIAlus(params10, this);
                    if (objMo81invokegIAlus3 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    interfaceC4514rk2 = interfaceC4514rk;
                    initializeSDK4 = initializeSDK3;
                    configuration4 = configuration3;
                    if (objMo81invokegIAlus3 instanceof HZ) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus3);
                        this.L$0 = interfaceC4514rk2;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration4;
                        this.L$3 = objMo81invokegIAlus3;
                        this.label = 6;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache2 = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params11 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache2.mo81invokegIAlus(params11, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj10 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj10;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb2 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params12 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb2.mo81invokegIAlus(params12, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate2 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params13 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate2.mo81invokegIAlus(params13, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete2 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params14 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete2.mo81invokegIAlus(params14, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 2:
                    initializeSDK3 = (InitializeSDK) this.L$1;
                    interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    obj2 = ((IZ) obj).f3222a;
                    thA2 = IZ.a(obj2);
                    if (thA2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thA2.getMessage());
                    }
                    configuration = new Configuration();
                    if (obj2 instanceof HZ) {
                        obj2 = configuration;
                    }
                    configuration2 = (Configuration) obj2;
                    InitializeStateReset initializeStateReset3 = initializeSDK3.initializeStateReset;
                    InitializeStateReset.Params params15 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo81invokegIAlus2 = initializeStateReset3.mo81invokegIAlus(params15, this);
                    if (objMo81invokegIAlus2 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    configuration3 = configuration2;
                    obj3 = objMo81invokegIAlus2;
                    if (obj3 instanceof HZ) {
                        errorState = ErrorState.ResetWebApp;
                        thA3 = IZ.a(obj3);
                        this.L$0 = obj3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (initializeSDK3.m85executeErrorStateBWLJW6A(errorState, thA3, configuration3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA4 = IZ.a(obj3);
                        if (thA4 == null) {
                            throw new Exception(ErrorState.ResetWebApp.toString());
                        }
                        throw thA4;
                    }
                    InitializeStateConfig initializeStateConfig3 = initializeSDK3.initializeStateConfig;
                    InitializeStateConfig.Params params16 = new InitializeStateConfig.Params(configuration3);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration3;
                    this.label = 5;
                    objMo81invokegIAlus3 = initializeStateConfig3.mo81invokegIAlus(params16, this);
                    if (objMo81invokegIAlus3 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    interfaceC4514rk2 = interfaceC4514rk;
                    initializeSDK4 = initializeSDK3;
                    configuration4 = configuration3;
                    if (objMo81invokegIAlus3 instanceof HZ) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus3);
                        this.L$0 = interfaceC4514rk2;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration4;
                        this.L$3 = objMo81invokegIAlus3;
                        this.label = 6;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache3 = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params17 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache3.mo81invokegIAlus(params17, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj11 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj11;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb3 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params18 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb3.mo81invokegIAlus(params18, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate3 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params19 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate3.mo81invokegIAlus(params19, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete3 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params110 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete3.mo81invokegIAlus(params110, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 3:
                    configuration2 = (Configuration) this.L$2;
                    initializeSDK3 = (InitializeSDK) this.L$1;
                    interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    objMo81invokegIAlus2 = ((IZ) obj).f3222a;
                    configuration3 = configuration2;
                    obj3 = objMo81invokegIAlus2;
                    if (obj3 instanceof HZ) {
                        errorState = ErrorState.ResetWebApp;
                        thA3 = IZ.a(obj3);
                        this.L$0 = obj3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (initializeSDK3.m85executeErrorStateBWLJW6A(errorState, thA3, configuration3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA4 = IZ.a(obj3);
                        if (thA4 == null) {
                            throw new Exception(ErrorState.ResetWebApp.toString());
                        }
                        throw thA4;
                    }
                    InitializeStateConfig initializeStateConfig4 = initializeSDK3.initializeStateConfig;
                    InitializeStateConfig.Params params111 = new InitializeStateConfig.Params(configuration3);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = initializeSDK3;
                    this.L$2 = configuration3;
                    this.label = 5;
                    objMo81invokegIAlus3 = initializeStateConfig4.mo81invokegIAlus(params111, this);
                    if (objMo81invokegIAlus3 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    interfaceC4514rk2 = interfaceC4514rk;
                    initializeSDK4 = initializeSDK3;
                    configuration4 = configuration3;
                    if (objMo81invokegIAlus3 instanceof HZ) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus3);
                        this.L$0 = interfaceC4514rk2;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration4;
                        this.L$3 = objMo81invokegIAlus3;
                        this.label = 6;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache4 = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params112 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache4.mo81invokegIAlus(params112, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj12 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj12;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb4 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params113 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb4.mo81invokegIAlus(params113, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate4 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params114 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate4.mo81invokegIAlus(params114, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete4 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params115 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete4.mo81invokegIAlus(params115, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 4:
                    obj3 = this.L$0;
                    AbstractC3375el.b0(obj);
                    ((IZ) obj).getClass();
                    thA4 = IZ.a(obj3);
                    if (thA4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thA4;
                case 5:
                    Configuration configuration5 = (Configuration) this.L$2;
                    InitializeSDK initializeSDK6 = (InitializeSDK) this.L$1;
                    InterfaceC4514rk interfaceC4514rk3 = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    interfaceC4514rk2 = interfaceC4514rk3;
                    initializeSDK4 = initializeSDK6;
                    configuration4 = configuration5;
                    objMo81invokegIAlus3 = ((IZ) obj).f3222a;
                    if (objMo81invokegIAlus3 instanceof HZ) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus3);
                        this.L$0 = interfaceC4514rk2;
                        this.L$1 = initializeSDK4;
                        this.L$2 = configuration4;
                        this.L$3 = objMo81invokegIAlus3;
                        this.label = 6;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache5 = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params116 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache5.mo81invokegIAlus(params116, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj13 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj13;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb5 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params117 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb5.mo81invokegIAlus(params117, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate5 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params118 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate5.mo81invokegIAlus(params118, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete5 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params119 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete5.mo81invokegIAlus(params119, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 6:
                    objMo81invokegIAlus3 = this.L$3;
                    configuration4 = (Configuration) this.L$2;
                    initializeSDK4 = (InitializeSDK) this.L$1;
                    interfaceC4514rk2 = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    InitializeStateLoadCache initializeStateLoadCache6 = initializeSDK4.initializeStateLoadCache;
                    AbstractC3375el.b0(objMo81invokegIAlus3);
                    InitializeStateLoadCache.Params params1110 = new InitializeStateLoadCache.Params((Configuration) objMo81invokegIAlus3);
                    this.L$0 = interfaceC4514rk2;
                    this.L$1 = initializeSDK4;
                    this.L$2 = configuration4;
                    this.L$3 = objMo81invokegIAlus3;
                    this.label = 7;
                    objMo81invokegIAlus4 = initializeStateLoadCache6.mo81invokegIAlus(params1110, this);
                    if (objMo81invokegIAlus4 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object obj14 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj14;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb6 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params1111 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb6.mo81invokegIAlus(params1111, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate6 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params1112 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate6.mo81invokegIAlus(params1112, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete6 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params1113 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete6.mo81invokegIAlus(params1113, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 7:
                    objMo81invokegIAlus3 = this.L$3;
                    configuration4 = (Configuration) this.L$2;
                    initializeSDK4 = (InitializeSDK) this.L$1;
                    interfaceC4514rk2 = (InterfaceC4514rk) this.L$0;
                    AbstractC3375el.b0(obj);
                    objMo81invokegIAlus4 = ((IZ) obj).f3222a;
                    Object obj15 = objMo81invokegIAlus3;
                    obj4 = objMo81invokegIAlus4;
                    obj5 = obj15;
                    if (obj4 instanceof HZ) {
                        errorState2 = ErrorState.LoadCache;
                        thA5 = IZ.a(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK4.m85executeErrorStateBWLJW6A(errorState2, thA5, configuration4, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        thA6 = IZ.a(obj4);
                        if (thA6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thA6;
                    }
                    AbstractC3375el.b0(obj4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (!loadCacheResult.getHasHashMismatch()) {
                        if (configuration4.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb7 = initializeSDK4.initializeStateLoadWeb;
                        AbstractC3375el.b0(obj5);
                        InitializeStateLoadWeb.Params params1114 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo81invokegIAlus5 = initializeStateLoadWeb7.mo81invokegIAlus(params1114, this);
                        if (objMo81invokegIAlus5 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        obj6 = obj5;
                        if (objMo81invokegIAlus5 instanceof HZ) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.L$2 = objMo81invokegIAlus5;
                            this.label = 10;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                        obj5 = obj6;
                        AbstractC3375el.b0(objMo81invokegIAlus5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate7 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params1115 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate7.mo81invokegIAlus(params1115, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete7 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params1116 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete7.mo81invokegIAlus(params1116, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 8:
                    obj4 = this.L$0;
                    AbstractC3375el.b0(obj);
                    ((IZ) obj).getClass();
                    thA6 = IZ.a(obj4);
                    if (thA6 == null) {
                        throw new Exception(ErrorState.LoadCache.toString());
                    }
                    throw thA6;
                case 9:
                    Object obj16 = this.L$1;
                    InitializeSDK initializeSDK7 = (InitializeSDK) this.L$0;
                    AbstractC3375el.b0(obj);
                    initializeSDK4 = initializeSDK7;
                    obj6 = obj16;
                    objMo81invokegIAlus5 = ((IZ) obj).f3222a;
                    if (objMo81invokegIAlus5 instanceof HZ) {
                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo81invokegIAlus5);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.L$2 = objMo81invokegIAlus5;
                        this.label = 10;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow2, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    obj5 = obj6;
                    AbstractC3375el.b0(objMo81invokegIAlus5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate8 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params1117 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate8.mo81invokegIAlus(params1117, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete8 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params1118 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete8.mo81invokegIAlus(params1118, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 10:
                    objMo81invokegIAlus5 = this.L$2;
                    obj6 = this.L$1;
                    initializeSDK4 = (InitializeSDK) this.L$0;
                    AbstractC3375el.b0(obj);
                    obj5 = obj6;
                    AbstractC3375el.b0(objMo81invokegIAlus5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) objMo81invokegIAlus5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate9 = initializeSDK4.initializeStateCreate;
                    AbstractC3375el.b0(obj5);
                    InitializeStateCreate.Params params1119 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK4;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo81invokegIAlus6 = initializeStateCreate9.mo81invokegIAlus(params1119, this);
                    if (objMo81invokegIAlus6 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeSDK5 = initializeSDK4;
                    obj7 = obj5;
                    obj8 = objMo81invokegIAlus6;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete9 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params11110 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete9.mo81invokegIAlus(params11110, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 11:
                    obj7 = this.L$1;
                    initializeSDK5 = (InitializeSDK) this.L$0;
                    AbstractC3375el.b0(obj);
                    obj8 = ((IZ) obj).f3222a;
                    if (obj8 instanceof HZ) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj8);
                        this.L$0 = initializeSDK5;
                        this.L$1 = obj7;
                        this.label = 12;
                        if (initializeSDK5.handleInitializationException(initializationExceptionOrThrow3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    InitializeStateComplete initializeStateComplete10 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params11111 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete10.mo81invokegIAlus(params11111, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 12:
                    obj7 = this.L$1;
                    initializeSDK5 = (InitializeSDK) this.L$0;
                    AbstractC3375el.b0(obj);
                    InitializeStateComplete initializeStateComplete11 = initializeSDK5.initializeStateComplete;
                    AbstractC3375el.b0(obj7);
                    InitializeStateComplete.Params params11112 = new InitializeStateComplete.Params((Configuration) obj7);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo81invokegIAlus7 = initializeStateComplete11.mo81invokegIAlus(params11112, this);
                    if (objMo81invokegIAlus7 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                case 13:
                    AbstractC3375el.b0(obj);
                    objMo81invokegIAlus7 = ((IZ) obj).f3222a;
                    AbstractC3375el.b0(objMo81invokegIAlus7);
                    objV = C5033xf0.f5238a;
                    if (!(!(objV instanceof HZ))) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
    }
}

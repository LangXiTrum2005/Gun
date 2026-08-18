package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3157cH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3981lh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2588Ma;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3890kf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4301pI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RW;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3157cH f843a = new C3157cH(new C3981lh(2));
    public static final C3157cH b = new C3157cH(new C3981lh(3));
    public static final C3157cH c = new C3157cH(new C3981lh(4));
    public static final C3157cH d = new C3157cH(new C3981lh(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        RW rw = new RW(D8.class, ScheduledExecutorService.class);
        RW[] rwArr = {new RW(D8.class, ExecutorService.class), new RW(D8.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rw);
        for (RW rw2 : rwArr) {
            AbstractC3375el.l(rw2, "Null interface");
        }
        Collections.addAll(hashSet, rwArr);
        C3190ch c3190ch = new C3190ch(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C2953a0(i4), hashSet3);
        RW rw3 = new RW(InterfaceC2588Ma.class, ScheduledExecutorService.class);
        RW[] rwArr2 = {new RW(InterfaceC2588Ma.class, ExecutorService.class), new RW(InterfaceC2588Ma.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rw3);
        for (RW rw4 : rwArr2) {
            AbstractC3375el.l(rw4, "Null interface");
        }
        Collections.addAll(hashSet4, rwArr2);
        C3190ch c3190ch2 = new C3190ch(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C2953a0(i3), hashSet6);
        RW rw5 = new RW(InterfaceC4301pI.class, ScheduledExecutorService.class);
        RW[] rwArr3 = {new RW(InterfaceC4301pI.class, ExecutorService.class), new RW(InterfaceC4301pI.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rw5);
        for (RW rw6 : rwArr3) {
            AbstractC3375el.l(rw6, "Null interface");
        }
        Collections.addAll(hashSet7, rwArr3);
        C3190ch c3190ch3 = new C3190ch(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C2953a0(i2), hashSet9);
        RW rw7 = new RW(InterfaceC3890kf0.class, Executor.class);
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(rw7);
        Collections.addAll(hashSet10, new RW[0]);
        return Arrays.asList(c3190ch, c3190ch2, c3190ch3, new C3190ch(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new C2953a0(i), hashSet12));
    }
}

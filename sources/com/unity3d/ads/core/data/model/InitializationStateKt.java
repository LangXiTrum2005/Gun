package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationStateKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final InitializationState toBold(SdkProperties.InitializationState initializationState) {
        AbstractC2995aW.q(initializationState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i == 1) {
            return InitializationState.NOT_INITIALIZED;
        }
        if (i == 2) {
            return InitializationState.INITIALIZING;
        }
        if (i == 3) {
            return InitializationState.INITIALIZED;
        }
        if (i == 4) {
            return InitializationState.FAILED;
        }
        throw new C3770jF(7, 0);
    }

    public static final SdkProperties.InitializationState toLegacy(InitializationState initializationState) {
        AbstractC2995aW.q(initializationState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i == 1) {
            return SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i == 2) {
            return SdkProperties.InitializationState.INITIALIZING;
        }
        if (i == 3) {
            return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i == 4) {
            return SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new C3770jF(7, 0);
    }
}

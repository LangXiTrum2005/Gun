package com.unity3d.ads.core.data.datasource;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VolumeSettingsChange {

    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z) {
            super(null);
            this.isMuted = z;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = muteChange.isMuted;
            }
            return muteChange.copy(z);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean z) {
            return new MuteChange(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z = this.isMuted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d) {
            super(null);
            this.volume = d;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = volumeChange.volume;
            }
            return volumeChange.copy(d);
        }

        public final double component1() {
            return this.volume;
        }

        public final VolumeChange copy(double d) {
            return new VolumeChange(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            long jDoubleToLongBits = Double.doubleToLongBits(this.volume);
            return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    private VolumeSettingsChange() {
    }

    public /* synthetic */ VolumeSettingsChange(AbstractC2471Hm abstractC2471Hm) {
        this();
    }
}

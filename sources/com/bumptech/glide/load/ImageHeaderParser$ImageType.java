package com.bumptech.glide.load;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3855kC;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f215a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f215a = z;
    }

    public boolean hasAlpha() {
        return this.f215a;
    }

    public boolean isWebp() {
        int i = AbstractC3855kC.f4592a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}

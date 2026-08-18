package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTcfRepository implements TcfRepository {
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(TcfDataSource tcfDataSource) {
        AbstractC2995aW.q(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}

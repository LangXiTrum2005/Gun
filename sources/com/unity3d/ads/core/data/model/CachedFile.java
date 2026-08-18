package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, AbstractC2471Hm abstractC2471Hm) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : file, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? Integer.MAX_VALUE : i);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String str, String str2, String str3, File file, String str4, long j, String str5, int i) {
        AbstractC2995aW.q(str, "objectId");
        AbstractC2995aW.q(str2, "url");
        AbstractC2995aW.q(str3, "name");
        AbstractC2995aW.q(str5, "protocol");
        return new CachedFile(str, str2, str3, file, str4, j, str5, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return AbstractC2995aW.i(this.objectId, cachedFile.objectId) && AbstractC2995aW.i(this.url, cachedFile.url) && AbstractC2995aW.i(this.name, cachedFile.name) && AbstractC2995aW.i(this.file, cachedFile.file) && AbstractC2995aW.i(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && AbstractC2995aW.i(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iD = DM.d(this.name, DM.d(this.url, this.objectId.hashCode() * 31, 31), 31);
        File file = this.file;
        int iHashCode = (iD + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.contentLength;
        return DM.d(this.protocol, (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31) + this.priority;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedFile(objectId=");
        sb.append(this.objectId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", extension=");
        sb.append(this.extension);
        sb.append(", contentLength=");
        sb.append(this.contentLength);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", priority=");
        return DM.k(sb, this.priority, ')');
    }

    public CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i) {
        AbstractC2995aW.q(str, "objectId");
        AbstractC2995aW.q(str2, "url");
        AbstractC2995aW.q(str3, "name");
        AbstractC2995aW.q(str5, "protocol");
        this.objectId = str;
        this.url = str2;
        this.name = str3;
        this.file = file;
        this.extension = str4;
        this.contentLength = j;
        this.protocol = str5;
        this.priority = i;
    }
}

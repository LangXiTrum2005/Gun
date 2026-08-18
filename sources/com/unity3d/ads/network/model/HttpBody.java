package com.unity3d.ads.network.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpBody {

    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] bArr) {
            AbstractC2995aW.q(bArr, "content");
            this.content = bArr;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String str) {
            AbstractC2995aW.q(str, "content");
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }
}

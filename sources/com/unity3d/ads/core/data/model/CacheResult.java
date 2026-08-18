package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CacheResult {

    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CachedFile cachedFile, CacheSource cacheSource) {
            super(null);
            AbstractC2995aW.q(cachedFile, "cachedFile");
            AbstractC2995aW.q(cacheSource, "source");
            this.cachedFile = cachedFile;
            this.source = cacheSource;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile, CacheSource cacheSource) {
            AbstractC2995aW.q(cachedFile, "cachedFile");
            AbstractC2995aW.q(cacheSource, "source");
            return new Success(cachedFile, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return AbstractC2995aW.i(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cachedFile.hashCode() * 31);
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final CacheSource source;

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, int i, AbstractC2471Hm abstractC2471Hm) {
            this(cacheError, (i & 2) != 0 ? CacheSource.LOCAL : cacheSource);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            return failure.copy(cacheError, cacheSource);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Failure copy(CacheError cacheError, CacheSource cacheSource) {
            AbstractC2995aW.q(cacheError, "error");
            AbstractC2995aW.q(cacheSource, "source");
            return new Failure(cacheError, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source;
        }

        public final CacheError getError() {
            return this.error;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(CacheError cacheError, CacheSource cacheSource) {
            super(null);
            AbstractC2995aW.q(cacheError, "error");
            AbstractC2995aW.q(cacheSource, "source");
            this.error = cacheError;
            this.source = cacheSource;
        }
    }
}

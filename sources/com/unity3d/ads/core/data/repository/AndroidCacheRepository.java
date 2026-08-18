package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.extensions.FileExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final ConcurrentHashMap<String, CachedFile> cachedFiles;
    private final Context context;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final ConcurrentHashMap<String, Set<String>> neededFiles;
    private final CacheDataSource remoteCacheDataSource;
    private final InterfaceC4514rk scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidCacheRepository.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C21962 extends Ea0 implements InterfaceC3567gx {
        int label;

        public C21962(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidCacheRepository.this.new C21962(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21962) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return new Long(FileExtensionsKt.getDirectorySize(AndroidCacheRepository.this.cacheDir));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2", f = "AndroidCacheRepository.kt", l = {51, Input.Keys.SHIFT_LEFT}, m = "invokeSuspend")
    public static final class C21972 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $objectId;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21972(String str, int i, String str2, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$url = str;
            this.$priority = i;
            this.$objectId = str2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidCacheRepository.this.new C21972(this.$url, this.$priority, this.$objectId, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21972) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009b  */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            String filename;
            CacheResult cacheResult;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    filename = (String) this.L$0;
                    AbstractC3375el.b0(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    CachedFile cachedFile = ((CacheResult.Success) cacheResult).getCachedFile();
                    AndroidCacheRepository.this.addFileToCache(cachedFile.copy((254 & 1) != 0 ? cachedFile.objectId : this.$objectId, (254 & 2) != 0 ? cachedFile.url : null, (254 & 4) != 0 ? cachedFile.name : null, (254 & 8) != 0 ? cachedFile.file : null, (254 & 16) != 0 ? cachedFile.extension : null, (254 & 32) != 0 ? cachedFile.contentLength : 0L, (254 & 64) != 0 ? cachedFile.protocol : null, (254 & 128) != 0 ? cachedFile.priority : 0));
                }
                return cacheResult;
            }
            AbstractC3375el.b0(obj);
            filename = AndroidCacheRepository.this.getFilename(this.$url);
            CacheDataSource cacheDataSource = AndroidCacheRepository.this.localCacheDataSource;
            File file = AndroidCacheRepository.this.cacheDir;
            String str = this.$url;
            Integer num = new Integer(this.$priority);
            this.L$0 = filename;
            this.label = 1;
            obj = cacheDataSource.getFile(file, filename, str, num, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
            String str2 = filename;
            CacheResult cacheResult2 = (CacheResult) obj;
            if (cacheResult2 instanceof CacheResult.Success) {
                CachedFile cachedFile2 = ((CacheResult.Success) cacheResult2).getCachedFile();
                AndroidCacheRepository.this.addFileToCache(cachedFile2.copy((254 & 1) != 0 ? cachedFile2.objectId : this.$objectId, (254 & 2) != 0 ? cachedFile2.url : null, (254 & 4) != 0 ? cachedFile2.name : null, (254 & 8) != 0 ? cachedFile2.file : null, (254 & 16) != 0 ? cachedFile2.extension : null, (254 & 32) != 0 ? cachedFile2.contentLength : 0L, (254 & 64) != 0 ? cachedFile2.protocol : null, (254 & 128) != 0 ? cachedFile2.priority : 0));
                return cacheResult2;
            }
            CacheDataSource cacheDataSource2 = AndroidCacheRepository.this.remoteCacheDataSource;
            File file2 = AndroidCacheRepository.this.cacheDir;
            String str3 = this.$url;
            Integer num2 = new Integer(this.$priority);
            this.L$0 = null;
            this.label = 2;
            obj = cacheDataSource2.getFile(file2, str2, str3, num2, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
            cacheResult = (CacheResult) obj;
            if (cacheResult instanceof CacheResult.Success) {
                CachedFile cachedFile3 = ((CacheResult.Success) cacheResult).getCachedFile();
                AndroidCacheRepository.this.addFileToCache(cachedFile3.copy((254 & 1) != 0 ? cachedFile3.objectId : this.$objectId, (254 & 2) != 0 ? cachedFile3.url : null, (254 & 4) != 0 ? cachedFile3.name : null, (254 & 8) != 0 ? cachedFile3.file : null, (254 & 16) != 0 ? cachedFile3.extension : null, (254 & 32) != 0 ? cachedFile3.contentLength : 0L, (254 & 64) != 0 ? cachedFile3.protocol : null, (254 & 128) != 0 ? cachedFile3.priority : 0));
            }
            return cacheResult;
        }
    }

    public AndroidCacheRepository(AbstractC3899kk abstractC3899kk, GetCacheDirectory getCacheDirectory, CacheDataSource cacheDataSource, CacheDataSource cacheDataSource2, Context context) {
        AbstractC2995aW.q(abstractC3899kk, "ioDispatcher");
        AbstractC2995aW.q(getCacheDirectory, "getCacheDirectory");
        AbstractC2995aW.q(cacheDataSource, "localCacheDataSource");
        AbstractC2995aW.q(cacheDataSource2, "remoteCacheDataSource");
        AbstractC2995aW.q(context, f.X);
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context;
        this.scope = WD.L(WD.L(WD.a(abstractC3899kk), new C4251ok("CacheRepository")), MR.f3404a);
        this.cachedFiles = new ConcurrentHashMap<>();
        this.neededFiles = new ConcurrentHashMap<>();
        this.cacheDir = initCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(CachedFile cachedFile) {
        this.cachedFiles.put(cachedFile.getName(), cachedFile);
        Set<String> linkedHashSet = this.neededFiles.get(cachedFile.getName());
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        linkedHashSet.add(cachedFile.getObjectId());
        this.neededFiles.put(cachedFile.getName(), linkedHashSet);
    }

    private final File getCacheDirBase() {
        File cacheDir = this.context.getCacheDir();
        AbstractC2995aW.p(cacheDir, "context.cacheDir");
        return cacheDir;
    }

    private final String getCacheDirPath() {
        return UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME;
    }

    private final File initCacheDir() {
        File fileInvoke = this.getCacheDirectory.invoke(getCacheDirBase(), getCacheDirPath());
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(null), this.scope.getCoroutineContext(), interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object doesFileExist(String str, InterfaceC2857Wj interfaceC2857Wj) {
        return Boolean.valueOf(this.cachedFiles.containsKey(str));
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C21962(null), this.scope.getCoroutineContext(), interfaceC2857Wj);
    }

    public final ConcurrentHashMap<String, CachedFile> getCachedFiles() {
        return this.cachedFiles;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, String str2, JSONArray jSONArray, int i, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C21972(str, i, str2, null), this.scope.getCoroutineContext(), interfaceC2857Wj);
    }

    public final String getFilename(String str) {
        AbstractC2995aW.q(str, "url");
        return StringExtensionsKt.getSHA256Hash(str);
    }

    public final ConcurrentHashMap<String, Set<String>> getNeededFiles() {
        return this.neededFiles;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        AbstractC2995aW.q(cachedFile, "cachedFile");
        this.cachedFiles.remove(cachedFile.getName());
        Set<String> set = this.neededFiles.get(cachedFile.getName());
        if (set != null) {
            set.remove(cachedFile.getObjectId());
        }
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public CacheResult retrieveFile(String str) {
        AbstractC2995aW.q(str, "fileName");
        CachedFile cachedFile = this.cachedFiles.get(str);
        return cachedFile != null ? new CacheResult.Success(cachedFile, CacheSource.LOCAL) : new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }
}

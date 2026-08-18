package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context) {
        AbstractC2995aW.q(cacheRepository, "cacheRepository");
        AbstractC2995aW.q(context, f.X);
        this.cacheRepository = cacheRepository;
        this.context = context;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strQ0 = AbstractC3089ba0.Q0(String.valueOf(uri.getPath()), "/");
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strQ0);
            AbstractC2995aW.p(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strQ0), null, inputStreamOpen);
        } catch (Exception unused) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        String string = uri.toString();
        AbstractC2995aW.p(string, "uri.toString()");
        CacheResult cacheResultRetrieveFile = this.cacheRepository.retrieveFile(AbstractC3089ba0.U0(AbstractC3089ba0.R0(string), "."));
        if (!(cacheResultRetrieveFile instanceof CacheResult.Success)) {
            return null;
        }
        CacheResult.Success success = (CacheResult.Success) cacheResultRetrieveFile;
        File file = success.getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(file.getAbsolutePath() + '.' + success.getCachedFile().getExtension()), null, new FileInputStream(file));
    }

    public final WebResourceResponse invoke(Uri uri) {
        AbstractC2995aW.q(uri, "uri");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return null;
    }
}

package com.unity3d.scar.adapter.v2100.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2100.requests.AdRequestFactory;

/* JADX INFO: loaded from: classes4.dex */
public class ScarRewardedAd extends ScarAdBase<RewardedAd> implements IScarFullScreenAd {
    public ScarRewardedAd(Context context, AdRequestFactory adRequestFactory, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, adRequestFactory, iAdsErrorHandler);
        this._scarAdListener = new ScarRewardedAdListener(iScarRewardedAdListenerWrapper, this);
    }

    @Override // com.unity3d.scar.adapter.v2100.scarads.ScarAdBase
    public void loadAdInternal(AdRequest adRequest, IScarLoadListener iScarLoadListener) {
        RewardedAd.load(this._context, this._scarAdMetadata.getAdUnitId(), adRequest, ((ScarRewardedAdListener) this._scarAdListener).getAdLoadListener());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd
    public void show(Activity activity) {
        T t = this._adObj;
        if (t != 0) {
            ((RewardedAd) t).show(activity, ((ScarRewardedAdListener) this._scarAdListener).getOnUserEarnedRewardListener());
        } else {
            this._adsErrorHandler.handleError(GMAAdsError.AdNotLoadedError(this._scarAdMetadata));
        }
    }
}

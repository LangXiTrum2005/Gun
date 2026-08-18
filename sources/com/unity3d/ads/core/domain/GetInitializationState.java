package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;

/* JADX INFO: loaded from: classes4.dex */
public interface GetInitializationState {

    public static final class DefaultImpls {
        public static /* synthetic */ InitializationState invoke$default(GetInitializationState getInitializationState, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return getInitializationState.invoke(z);
        }
    }

    InitializationState invoke(boolean z);
}

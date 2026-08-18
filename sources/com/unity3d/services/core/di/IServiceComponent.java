package com.unity3d.services.core.di;

/* JADX INFO: loaded from: classes4.dex */
public interface IServiceComponent {

    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    IServiceProvider getServiceProvider();
}

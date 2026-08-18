package com.unity3d.services.core.properties;

/* JADX INFO: loaded from: classes4.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();
        private static final String id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return id;
        }
    }

    String getId();
}

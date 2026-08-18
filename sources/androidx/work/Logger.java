package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG_PREFIX = "WM-";
    private static Logger sLogger;

    public static class LogcatLogger extends Logger {
        private int mLoggingLevel;

        public LogcatLogger(int i) {
            super(i);
            this.mLoggingLevel = i;
        }

        @Override // androidx.work.Logger
        public void debug(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.Logger
        public void error(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.Logger
        public void info(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.Logger
        public void verbose(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // androidx.work.Logger
        public void warning(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public Logger(int i) {
    }

    public static synchronized Logger get() {
        try {
            if (sLogger == null) {
                sLogger = new LogcatLogger(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sLogger;
    }

    public static synchronized void setLogger(Logger logger) {
        sLogger = logger;
    }

    public static String tagWithPrefix(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(TAG_PREFIX);
        int i = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void debug(String str, String str2, Throwable... thArr);

    public abstract void error(String str, String str2, Throwable... thArr);

    public abstract void info(String str, String str2, Throwable... thArr);

    public abstract void verbose(String str, String str2, Throwable... thArr);

    public abstract void warning(String str, String str2, Throwable... thArr);
}

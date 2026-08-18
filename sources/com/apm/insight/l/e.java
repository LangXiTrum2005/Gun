package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e extends PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f141a;
    private Charset b;
    private a c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(@NonNull OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.b = null;
        this.f141a = messageDigest;
        this.c = aVar;
        if (messageDigest != null) {
            this.b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f141a;
        if (messageDigest != null) {
            messageDigest.update(this.b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f141a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(@NonNull String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f141a != null) {
            a aVar = this.c;
            if (aVar == null || aVar.a(str)) {
                this.f141a.update(this.b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }
}

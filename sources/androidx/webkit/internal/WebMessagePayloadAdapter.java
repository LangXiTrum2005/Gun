package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {

    @Nullable
    private final byte[] mArrayBuffer;

    @Nullable
    private final String mString;
    private final int mType;

    public WebMessagePayloadAdapter(@Nullable String str) {
        this.mType = 0;
        this.mString = str;
        this.mArrayBuffer = null;
    }

    private void checkType(int i) {
        if (this.mType == i) {
            return;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Expected ", i, ", but type is ");
        sbQ.append(this.mType);
        throw new IllegalStateException(sbQ.toString());
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @NonNull
    public byte[] getAsArrayBuffer() {
        checkType(1);
        byte[] bArr = this.mArrayBuffer;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @Nullable
    public String getAsString() {
        checkType(0);
        return this.mString;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.mType;
    }

    public WebMessagePayloadAdapter(@NonNull byte[] bArr) {
        this.mType = 1;
        this.mString = null;
        this.mArrayBuffer = bArr;
    }
}

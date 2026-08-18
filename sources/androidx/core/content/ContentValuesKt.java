package androidx.core.content;

import android.content.ContentValues;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;

/* JADX INFO: loaded from: classes.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(C4839vT... c4839vTArr) {
        ContentValues contentValues = new ContentValues(c4839vTArr.length);
        for (C4839vT c4839vT : c4839vTArr) {
            String str = (String) c4839vT.f5132a;
            Object obj = c4839vT.b;
            if (obj == null) {
                contentValues.putNull(str);
            } else if (obj instanceof String) {
                contentValues.put(str, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) obj);
            }
        }
        return contentValues;
    }
}

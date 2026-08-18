package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.badlogic.gdx.Input;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PR implements InterfaceC1508ej {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C1507ei> A02 = new SparseArray<>();
    public final InterfaceC1027Sb A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{72, -107, -42, -47, -115, -74, -69, -63, -78, -76, -78, -65, -115, -67, -65, -74, -70, -82, -65, -58, -115, -72, -78, -58, -115, -69, -68, -63, -115, -69, -62, -71, -71, -103, -40, -46, -26, -115, -63, -78, -59, -63, -115, -69, -68, -63, -115, -69, -62, -71, -71, -103, -38, -46, -31, -50, -47, -50, -31, -50, -115, -81, -71, -68, -81, -115, -69, -68, -63, -115, -69, -62, -71, -71, -106, 97, 112, 99, 95, 114, 99, 62, 114, 95, 96, 106, 99, 62, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -59, -8, -17, -48, -20, -31, -7, -27, -14, -61, -31, -29, -24, -27, -55, -18, -28, -27, -8, -46, -51, -13, -18, -86, -57, -86, -55, -64, -70, -50, -114, -122, -107, -126, -123, -126, -107, -126};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AAh(HashMap<String, C1507ei> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC1517es.A08(this.A02.size() == 0);
        try {
            if (AbstractC1029Sd.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC1517es.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    C1507ei c1507ei = new C1507ei(cursorA00.getInt(0), (String) AbstractC1517es.A01(cursorA00.getString(1)), C1509ek.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c1507ei.A02, c1507ei);
                    sparseArray.put(c1507ei.A01, c1507ei.A02);
                } catch (Throwable th2) {
                    if (cursorA00 != null) {
                        try {
                            cursorA00.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C1026Sa(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AJO(HashMap<String, C1507ei> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    C1507ei c1507eiValueAt = this.A02.valueAt(i);
                    if (c1507eiValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, c1507eiValueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 90), A01(136, 3, 70), A01(Input.Keys.F9, 8, 18)};
    }

    public PR(InterfaceC1027Sb interfaceC1027Sb) {
        this.A03 = interfaceC1027Sb;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC1517es.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 113) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C1026Sa {
        AbstractC1029Sd.A04(sQLiteDatabase, 1, (String) AbstractC1517es.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC1517es.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 15) + this.A01 + A01(0, 1, 25) + A01(1, 74, 94));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) AbstractC1517es.A01(this.A01), A01(130, 6, 123), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C1507ei c1507ei) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1509ek.A08(c1507ei.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 90), Integer.valueOf(c1507ei.A01));
        contentValues.put(A01(136, 3, 70), c1507ei.A02);
        contentValues.put(A01(Input.Keys.F9, 8, 18), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC1517es.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 78) + str);
    }

    public static void A08(InterfaceC1027Sb interfaceC1027Sb, String str) throws C1026Sa {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC1027Sb.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC1029Sd.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void A5f() throws C1026Sa {
        A08(this.A03, (String) AbstractC1517es.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final boolean A6I() throws C1026Sa {
        try {
            return AbstractC1029Sd.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC1517es.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AA5(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AEn(C1507ei c1507ei, boolean z) {
        if (z) {
            this.A02.delete(c1507ei.A01);
        } else {
            this.A02.put(c1507ei.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AFS(C1507ei c1507ei) {
        this.A02.put(c1507ei.A01, c1507ei);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AJN(HashMap<String, C1507ei> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C1507ei> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }
}

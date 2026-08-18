package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qb0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Qb0();

    @Nullable
    public final String description;

    @Deprecated
    public final String value;
    public final AC values;

    public /* synthetic */ TextInformationFrame(Parcel parcel, Qb0 qb0) {
        this(parcel);
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void a(C3867kO c3867kO) {
        String str = this.id;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = cw.k;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = cw.l;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = cw.m;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = cw.n;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 21;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    c3867kO.c((CharSequence) this.values.get(0));
                    break;
                case 1:
                case 11:
                    c3867kO.e((CharSequence) this.values.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = (String) this.values.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    c3867kO.h(Integer.valueOf(i));
                    c3867kO.g(Integer.valueOf(i2));
                    break;
                case 3:
                case 17:
                    c3867kO.d((CharSequence) this.values.get(0));
                    break;
                case 4:
                case 18:
                    c3867kO.b((CharSequence) this.values.get(0));
                    break;
                case 5:
                case 19:
                    c3867kO.f((CharSequence) this.values.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrT = Ug0.T((String) this.values.get(0), "/");
                    int i3 = Integer.parseInt(strArrT[0]);
                    Integer numValueOf = strArrT.length > 1 ? Integer.valueOf(Integer.parseInt(strArrT[1])) : null;
                    c3867kO.o(Integer.valueOf(i3));
                    c3867kO.n(numValueOf);
                    break;
                case 7:
                case 16:
                    c3867kO.m((CharSequence) this.values.get(0));
                    break;
                case 8:
                case 15:
                    c3867kO.p((CharSequence) this.values.get(0));
                    break;
                case 9:
                case 21:
                    c3867kO.i(Integer.valueOf(Integer.parseInt((String) this.values.get(0))));
                    break;
                case 13:
                    ArrayList arrayListB = b((String) this.values.get(0));
                    int size = arrayListB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c3867kO.g((Integer) arrayListB.get(2));
                            }
                        }
                        c3867kO.h((Integer) arrayListB.get(1));
                    }
                    c3867kO.i((Integer) arrayListB.get(0));
                    break;
                case 14:
                    ArrayList arrayListB2 = b((String) this.values.get(0));
                    int size2 = arrayListB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c3867kO.j((Integer) arrayListB2.get(2));
                            }
                        }
                        c3867kO.k((Integer) arrayListB2.get(1));
                    }
                    c3867kO.l((Integer) arrayListB2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return Ug0.a(this.id, textInformationFrame.id) && Ug0.a(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values);
    }

    public final int hashCode() {
        int iD = DM.d(this.id, 527, 31);
        String str = this.description;
        return this.values.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeStringArray((String[]) this.values.toArray(new String[0]));
    }

    public TextInformationFrame(String str, @Nullable String str2, List<String> list) {
        super(str);
        FW.h(!list.isEmpty());
        this.description = str2;
        AC acJ = AC.j(list);
        this.values = acJ;
        this.value = (String) acJ.get(0);
    }

    @Deprecated
    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        this(str, str2, AC.p(str3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        this(string, string2, AC.k(strArrCreateStringArray));
    }
}

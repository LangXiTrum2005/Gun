package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1223a;
    private long b;
    private String c;

    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i) {
            return new BatchReportMessage[i];
        }
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.c = str;
        this.f1223a = str2;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f1223a;
    }

    public long getTimestamp() {
        return this.b;
    }

    public String getUuid() {
        return this.c;
    }

    public void setReportMessage(String str) {
        this.f1223a = str;
    }

    public void setTimestamp(long j) {
        this.b = j;
    }

    public void setUuid(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.f1223a);
        parcel.writeLong(this.b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.c = parcel.readString();
        this.f1223a = parcel.readString();
        this.b = parcel.readLong();
    }
}

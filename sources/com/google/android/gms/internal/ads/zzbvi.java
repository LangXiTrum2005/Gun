package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
public final class zzbvi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvi> CREATOR = new zzbvj();

    @SafeParcelable.Field(id = 2)
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzbvi(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvh
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<zzbvi> creator = zzbvi.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.closeQuietly(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.2");
                        IOUtils.closeQuietly(autoCloseOutputStream);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not read from parcel file descriptor", e);
                    IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}

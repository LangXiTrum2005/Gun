package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultContracts {

    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            AbstractC2995aW.p(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @RequiresApi(19)
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        private final String mimeType;

        public CreateDocument(String str) {
            AbstractC2995aW.q(str, "mimeType");
            this.mimeType = str;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", str);
            AbstractC2995aW.p(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this("*/*");
        }
    }

    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            AbstractC2995aW.p(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(18)
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        public static final Companion Companion = new Companion(null);

        @RequiresApi(18)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final List<Uri> getClipDataUris$activity_release(Intent intent) {
                AbstractC2995aW.q(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return C2812Uq.f3846a;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            AbstractC2995aW.p(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) ? C2812Uq.f3846a : clipDataUris$activity_release;
        }
    }

    @RequiresApi(19)
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            AbstractC2995aW.p(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(21)
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            AbstractC2995aW.p(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? C2812Uq.f3846a : clipDataUris$activity_release;
        }
    }

    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r2) {
            AbstractC2995aW.q(context, f.X);
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            AbstractC2995aW.p(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(pickVisualMediaRequest, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i, int i2, AbstractC2471Hm abstractC2471Hm) {
            this((i2 & 1) != 0 ? Companion.getMaxItems$activity_release() : i);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(pickVisualMediaRequest, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                if (this.maxItems > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                intent2.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                return intent2;
            }
            if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                Intent intent3 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? C2812Uq.f3846a : clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i) {
            this.maxItems = i;
            if (i <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    @RequiresApi(19)
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }

            public final ResolveInfo getGmsPicker$activity_release(Context context) {
                AbstractC2995aW.q(context, f.X);
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
            }

            public final ResolveInfo getSystemFallbackPicker$activity_release(Context context) {
                AbstractC2995aW.q(context, f.X);
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            public final String getVisualMimeType$activity_release(VisualMediaType visualMediaType) {
                AbstractC2995aW.q(visualMediaType, "input");
                if (visualMediaType instanceof ImageOnly) {
                    return "image/*";
                }
                if (visualMediaType instanceof VideoOnly) {
                    return "video/*";
                }
                if (visualMediaType instanceof SingleMimeType) {
                    return ((SingleMimeType) visualMediaType).getMimeType();
                }
                if (visualMediaType instanceof ImageAndVideo) {
                    return null;
                }
                throw new C3770jF(7, 0);
            }

            public final boolean isGmsPickerAvailable$activity_release(Context context) {
                AbstractC2995aW.q(context, f.X);
                return getGmsPicker$activity_release(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            public final boolean isSystemFallbackPickerAvailable$activity_release(Context context) {
                AbstractC2995aW.q(context, f.X);
                return getSystemFallbackPicker$activity_release(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(Context context) {
                AbstractC2995aW.q(context, f.X);
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }
        }

        public static final class ImageAndVideo implements VisualMediaType {
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        public static final class ImageOnly implements VisualMediaType {
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        public static final class SingleMimeType implements VisualMediaType {
            private final String mimeType;

            public SingleMimeType(String str) {
                AbstractC2995aW.q(str, "mimeType");
                this.mimeType = str;
            }

            public final String getMimeType() {
                return this.mimeType;
            }
        }

        public static final class VideoOnly implements VisualMediaType {
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        public interface VisualMediaType {
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(pickVisualMediaRequest, "input");
            return null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intent intent;
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(pickVisualMediaRequest, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                return intent2;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                intent = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
            } else {
                if (!companion.isGmsPickerAvailable$activity_release(context)) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                intent = new Intent(GMS_ACTION_PICK_IMAGES);
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(companion.getVisualMimeType$activity_release(pickVisualMediaRequest.getMediaType()));
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) AbstractC2853Wf.i0(GetMultipleContents.Companion.getClipDataUris$activity_release(intent));
            }
            return data;
        }
    }

    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final Intent createIntent$activity_release(String[] strArr) {
                AbstractC2995aW.q(strArr, "input");
                Intent intentPutExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr);
                AbstractC2995aW.p(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            return Companion.createIntent$activity_release(strArr);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(strArr, "input");
            if (strArr.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(C2838Vq.f3896a);
            }
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            int iN = AbstractC3375el.N(strArr.length);
            if (iN < 16) {
                iN = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
            for (String str2 : strArr) {
                linkedHashMap.put(str2, Boolean.TRUE);
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Map<String, Boolean> parseResult(int i, Intent intent) {
            C2838Vq c2838Vq = C2838Vq.f3896a;
            if (i != -1 || intent == null) {
                return c2838Vq;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return c2838Vq;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            ArrayList arrayListN0 = U5.n0(stringArrayExtra);
            Iterator it = arrayListN0.iterator();
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(AbstractC2749Sf.Y(10, arrayListN0), AbstractC2749Sf.Y(10, arrayList)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(new C4839vT(it.next(), it2.next()));
            }
            return U5.A0(arrayList2);
        }
    }

    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{str});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, "input");
            if (ContextCompat.checkSelfPermission(context, str) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Boolean parseResult(int i, Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            boolean z = false;
            if (intArrayExtra != null) {
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Intent intent) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(intent, "input");
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(intentSenderRequest, "input");
            Intent intentPutExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            AbstractC2995aW.p(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            AbstractC2995aW.p(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r2) {
            AbstractC2995aW.q(context, f.X);
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Void r2) {
            AbstractC2995aW.q(context, f.X);
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            AbstractC2995aW.p(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}

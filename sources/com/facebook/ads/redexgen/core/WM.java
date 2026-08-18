package com.facebook.ads.redexgen.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.extractor.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.extractor.metadata.mp4.MdtaMetadataEntry;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class WM {
    public static byte[] A00;
    public static String[] A01 = {"zFEf0PlABObr0bPPx3qxFcVQeT6PkbEO", "qOCK30LlZXZLCZALYc1phHHqdW5srGcQ", "4CVLPMqOvCCzqjk3EQle3VyGWUb0vtgb", "G2B2PPifkqXqtmsLb0jNQFmvJfvcz4R4", "Yz1P6P", "K7Svx2cDBXdpO59MwiArecen7ZYHsACB", "LBxS5UvQZGNYfz", "Sl3MXJ"};
    public static final String[] A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{121, 61, 92, 31, 29, 12, 25, cw.n, cw.n, 29, 97, 66, 83, 84, 82, 65, 67, 84, 18, 48, 58, 55, 18, 48, 58, 55, 115, 25, 50, 41, 41, 81, 115, 121, 116, 48, 64, 101, 126, 123, 28, 62, 50, 40, 46, 41, 52, 62, 30, 57, 45, 48, 114, cw.m, 42, 49, 52, 90, 119, 111, 126, 105, 117, 73, 116, 120, 112, 38, 11, 19, 2, 21, 9, 6, 19, cw.l, 17, 2, 75, 103, 104, 99, 111, 100, 126, 41, 6, 1, 5, cw.k, 87, 100, 98, 54, 68, 121, 117, 125, 94, 106, 123, 118, 112, 63, 107, 119, 122, 126, 107, 109, 122, 58, cw.l, 31, 18, 20, 25, 20, 20, cw.n, 89, 110, 121, 118, 108, 127, 121, 106, 124, 125, 59, 24, 21, 21, 24, 29, 50, 17, 2, 31, 1, 5, 21, 81, 114, 96, 96, 50, 21, 17, 4, 31, 56, 63, 50, 63, 106, 64, 73, 70, 79, 90, 73, 119, 92, 82, 21, 119, 84, 91, 81, 108, 71, 73, cw.l, 76, 75, 79, 90, 82, 124, 113, 115, 123, 48, 93, 117, 100, 113, 124, 41, 7, 30, cw.l, 12, 25, 10, 24, 24, 58, 20, cw.k, 29, 11, 3, 46, 46, 53, 56, 97, 3, 32, 50, 50, 57, 9, 30, 26, cw.n, 25, 30, 26, cw.m, 63, cw.m, 20, 9, 45, 18, cw.k, 125, 95, 92, 95, 76, 91, 74, 47, 9, 0, 24, 5, cw.m, 102, 77, 68, 72, 71, 64, 87, 5, 104, 80, 86, 76, 70, 111, 68, 77, 66, 95, 67, 66, 52, 31, 30, 27, 27, 24, 2, 3, 116, 95, 88, 69, 66, 68, 1, 42, 48, 43, 49, 54, 43, 35, 44, 98, 5, 35, 44, 37, 49, 54, 35, 98, cw.n, 35, 50, 68, 111, 117, 110, 116, 115, 110, 102, 105, 39, 85, 102, 119, 67, 104, 114, 105, 115, 116, 105, 97, 110, 32, 82, 111, 99, 107, 89, 118, 123, 105, 105, 115, 121, 58, 72, 117, 121, 113, 12, 35, 46, 60, 60, 38, 44, 46, 35, 89, 118, 111, 120, 90, 117, 108, 123, 52, 81, 118, 108, 106, 124, 29, 49, 51, 59, 58, 39, 91, 119, 118, 108, 125, 117, 104, 119, 106, 121, 106, 97, 56, 91, 112, 106, 113, 107, 108, 113, 121, 118, 120, 84, 78, 85, 79, 73, 66, 72, 121, 100, 120, 120, 100, 125, 110, 121, 3, 53, 44, 52, 7, 34, 45, 32, 38, 61, 24, 23, 26, 28, 89, 49, 24, 21, 21, 85, 112, 99, 122, 102, 112, 103, 116, 48, 17, 21, 0, 28, 84, 57, 17, 0, 21, 24, 37, 8, 18, 2, cw.l, 90, 113, 105, 112, 106, 123, 115, 110, 113, 83, 101, 114, 118, 122, 121, 79, 72, 80, 29, 27, 29, 127, 92, 78, 78, 20, 34, 37, 61, 112, 3, 63, 60, 63, 67, 114, 101, 84, 101, 114, 99, 100, 117, 96, 19, 34, 50, 35, cw.k, 10, 5, 86, 114, 96, 106, 51, 95, 122, 96, 103, 118, 125, 122, 125, 116, 47, 9, 6, cw.m, 9, 30, 3, 9, 48, 25, cw.n, 22, 1, 7, 26, 111, 70, 79, 73, 94, 88, 69, 73, 70, 75, 89, 66, 85, 124, 117, 115, 100, 98, 127, 126, 121, 115, 107, 67, 65, 119, 70, 90, 92, 91, 81, 4, 52, 51, 46, 108, 9, 46, 52, 50, 36, 40, 24, 31, 2, 64, 57, 8, cw.l, 5, 3, 2, 61, cw.k, 10, 23, 28, 25, 22, 27, 29, 10, 55, 63, 42, 61, 38, 34, 42, 33, 59, 46, 35, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 77, 92, 79, 78, 88, 29, 94, 82, 80, 80, 88, 83, 73, 29, 92, 73, 73, 79, 84, 95, 72, 73, 88, 7, 29, 10, 45, 37, 32, 41, 40, 108, 56, 35, 108, 60, 45, 62, 63, 41, 108, 47, 35, 58, 41, 62, 108, 45, 62, 56, 108, 45, 56, 56, 62, 37, 46, 57, 56, 41, 21, 50, 58, 63, 54, 55, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 58, 61, 55, 54, 43, 124, 48, 60, 38, 61, 39, 115, 50, 39, 39, 33, 58, 49, 38, 39, 54, 105, 115, 105, 78, 70, 67, 74, 75, cw.m, 91, 64, cw.m, 95, 78, 93, 92, 74, cw.m, 92, 91, 78, 65, 75, 78, 93, 75, cw.m, 72, 74, 65, 93, 74, cw.m, 76, 64, 75, 74, 113, 86, 94, 91, 82, 83, 23, 67, 88, 23, 71, 86, 69, 68, 82, 23, 67, 82, 79, 67, 23, 86, 67, 67, 69, 94, 85, 66, 67, 82, cw.k, 23, 110, 73, 65, 68, 77, 76, 8, 92, 71, 8, 88, 73, 90, 91, 77, 8, 93, 65, 70, 92, cw.n, 8, 73, 92, 92, 90, 65, 74, 93, 92, 77, 8, 94, 73, 68, 93, 77, 49, 22, 30, 27, 18, 19, 87, 3, 24, 87, 7, 22, 5, 4, 18, 87, 2, 30, 25, 3, 79, 87, 22, 3, 3, 5, 30, 21, 2, 3, 18, 77, 87, 102, 65, 83, 84, 0, 102, 85, 83, 73, 79, 78, 125, 84, 87, 80, 99, 74, 73, 78, 8, 119, 74, 70, 78, 19, 58, 57, 62, 57, 58, 39, 48, 116, 64, 87, 87, 65, 70, 75, 94, 87, 109, 94, 69, 64, 54, 5, 3, 25, 31, 30, cw.n, 122, 17, 34, 57, 60, 115, 85, 89, 81, 74, 108, 99, 106, 126, 121, 108, 57, 31, 12, 31, 25, 27, 126, 88, 75, 88, 94, 92, 25, 107, 86, 90, 82, 11, 32, 35, 46, 45, 32, 64, 104, 102, 84, 124, 96, 99, 118, 127, 84, 124, 103, 123, 122, 112, 38, cw.l, 21, 9, 8, 2, 65, 51, cw.l, 2, 10, 103, 82, 85, 78, 71, 69, cw.m, 38, 53, 35, 103, 21, 40, 36, 44, 102, 79, 92, 74, 77, 65, 92, 75, 63, 18, 22, 1, cw.l, 87, 58, 18, 3, 22, 27, 9, 40, 49, 
        108, 9, 46, 49, 108, 75, 81, 87, 65, 109, 80, 72, 74, 80, 87, 63, 50, 59, 66, 95, 94, 69, 78, 88, 74, 79, 93, 66, 88, 68, 89, 82, 82, 79, 78, 85, 94, 72, 92, 90, 75, 87, 94, 72, 72, 39, 2, 2, 12, 7, 11, 0, 26, 66, 101, 111, 98, 110, 126, 89, 83, 94, 82, 26, 101, 88, 84, 92, 126, 89, 83, 66, 68, 67, 69, 94, 86, 91, 28, 59, 49, 32, 38, 33, 39, 58, 120, 18, 58, 33, 61, 100, 67, 94, 89, 95, 88, 64, 72, 67, 89, 76, 65, 19, 52, 41, 46, 40, 47, 55, 63, 52, 46, 59, 54, 122, 10, 53, 42, 28, 59, 38, 33, 39, 32, 56, 48, 59, 33, 52, 57, 117, 7, 58, 54, 62, 27, 48, 60, 113, 19, 48, 63, 53, 107, 64, 91, 91, 66, 105, 114, 114, 35, 78, 125, 102, 99, 123, 65, 94, 65, 126, 65, 90, 83, 88, 81, 77, 116, 103, 115, 114, 116, 105, 101, 109, 92, 113, 100, 121, 126, 63, 22, 21, 7, 21, 26, 22, 31, 23, 36, 7, 69, 46, 1, 123, 88, 66, 89, 80, 82, cw.k, 33, 52, 40, 96, 18, 47, 35, 43, 6, 46, 47, 34, 63, 42, 63, 34, 61, 46, 97, 73, 94, 73, 66, 75, 89, 73, 123, 83, 66, 87, 82, 87, 66, 87, 99, 66, 95, 90, 109, 69, 84, 65, 76, 23, 47, 41, 51, 57, 59, 54, 56, 23, 2, 31, 25, 24, 23, 26, 86, 48, 25, 26, 29, 44, 3, 22, 11, 20, 7, 66, 35, cw.m, 7, cw.n, 11, 1, 3, 12, 52, 31, 21, 25, 22, 27, 9, 9, 19, 25, 27, 22, 35, 8, 24, 8, 77, 41, 8, 24, 25, 30, cw.l, 5, 8, 77, 58, 8, 1, 1, 8, 32, 11, 25, 78, 47, 9, 11, 11, 32, 50, 101, 23, 42, 40, 36, 43, 49, 44, 38, 79, 100, 118, 33, 86, 96, 119, 100, 3, 34, 36, 62, 40, 65, 122, 34, 77, 125, 106, 110, 100, 117, 2, 33, 41, 36, 40, 62, 116, 75, 94, 73, 90, 109, 86, 74, 71, 80, 29, 34, 41, 46, 44, 62, 57, 116, 75, 72, 79, 69, 107, 84, 87, 72, 80, 27, 107, 78, 85, 80, 28, 35, 60, 88, 103, 120, 37, 78, 103, 100, 99, 63, 0, 31, 64, 41, 26, 1, 4, 77, 114, 111, 115, 61, 90, 111, 114, 114, 107, 120, 85, 106, 118, 113, 40, 85, 112, 107, 110, 111, 80, 76, 75, 18, 109, 80, 92, 84, 111, 80, 72, 90, 77, 31, 125, 94, 83, 83, 94, 91, 74, 104, 123, 116, 113, 105, 89, 123, 96, 100, 124, 122, 30, 60, 33, 41, 60, 43, 61, 61, 39, 56, 43, 110, 28, 33, 45, 37, 59, 24, 18, 9, 2, cw.l, 5, 31, 1, 34, 40, 50, 57, 48, 53, 52, 61, 56, 50, 8, 43, 33, 59, 48, 61, 60, 61, 52, 49, 59, 120, 10, 55, 59, 51, 75, 104, 98, 111, 105, 122, 117, 120, 126, 46, 11, cw.n, 21, 24, 61, 38, 35, 104, 26, 39, 43, 35, 102, 18, 118, 105, 90, 75, 120, 75, 92, 79, 48, 7, 5, 5, 3, 7, 35, 20, 5, 3, 30, 105, 94, 77, 82, 77, 90, 87, 37, 31, cw.l, 3, 31, 26, 30, 20, 87, 36, 24, 2, 27, 53, 8, 4, 12, 72, 117, 121, 113, 58, 60, 58, 72, 117, 118, 118, 101, 87, 90, 69, 87, 68, 118, 122, 117, 118, 113, 67, 86, 75, 80, 71, 49, 10, cw.k, 7, 5, 3, 24, 7, 64, 123, 124, 100, 103, 102, 125, 118, 96, 73, 113, 123, 80, 104, 106, 115, 115, 102, 103, 35, 118, 109, 104, 109, 108, 116, 109, 35, 110, 102, 119, 98, 103, 98, 119, 98, 35, 102, 109, 119, 113, 122, 57, 35, 19, 44, 47, 55, 96, 10, 33, 45, 126, 65, 66, 90, cw.k, 127, 66, 78, 70, 115, 79, 78, 65, 84, 65, 39, 27, 1, 24, 18, 46, 52, 47, 37, 97, 2, 45, 40, 49, 85, 105, 115, 104, 98, 114, 116, 103, 101, 109, 62, 2, 24, 25, 5, 8, 31, 3, 77, 63, 2, cw.l, 6, 98, 65, 80, 82, 84, 1, 34, 51, 49, 55, 114, 0, 61, 49, 57, 45, cw.l, 27, 27, 29, 22, 29, 57, 39, 32, 41, 35, 9, 29, 0, 24, 31, 30, 25, 19, 80, 34, 31, 19, 27, 24, 50, 38, 59, 35, 36, 37, 50, 61, 23, 0, 26, 6, 30, 1, 30, 67, 86, 91, 85, cw.k, 27, 9, 20, cw.n, 7, 9, 20, 95, 72, 68, 70, 46, 57, 53, 52, 125, 109, 123, 106, 102, 123, 102, 3, 67, 94, 67, 37, 1, 5, cw.n, 100, 120, 124, 105, 30, 92, 88, 71, 91, 119, 113, 96, 104, 113, 118, 106, 23, 69, 66, 94, 80, 91, 92, 64, 76, 93, 90, 70, 89, 73, 78, 82, 73, 98, 101, 101, 115, 63, 61, 56, 35, 36, 60, 115, 113, 116, 111, 104, 112, 116, 104, 117, 115, 108, 89, 86, 95, 87, 64, 113, 119, 124, 122, 123, 86, 103, 97, 106, 108, 109, 47, 75, 108, 102, 119, 113, 118, 112, 107, 99, 110, 48, 1, 22, 22, 11, 22, 79, 115, 105, 122, 104, 115, 59, 86, 126, 111, 122, 119, 18, 41, 54, 102, 114, 118, 48, 22, 5, cw.k, 8, 1, 22, 82, 116, 103, 104, 101, 99, 75, 109, 118, 125, 126, 115, 61, 27, 0, 25, 68, 33, 6, 25, 25, 63, 34, 61, 109, 31, 34, 46, 38, 89, 95, 64, 88, 106, 81, 77, 90, 92, 80, 88, 81, 86, 69, 90, 91, 31, 92, 80, 73, 90, 77, 31, 94, 77, 75, 31, 89, 83, 94, 88, 76, 5, 31, cw.l, 55, 59, 57, 52, 51, 11, 22, 8, 0, 68, 41, 17, 23, cw.k, 
        7, 65, 77, 79, 12, 67, 76, 70, 80, 77, 75, 70, 12, 65, 67, 82, 86, 87, 80, 71, 12, 68, 82, 81, 76, 72, 68, 66, 64, 10, 79, 85, 64, 66, 97, 101, 105, 111, 109, 39, 120, 102, 111, 106, 113, 123};
    }

    static {
        A0B();
        A02 = new String[]{A0A(199, 5, 22), A0A(325, 12, 116), A0A(388, 7, 85), A0A(408, 5, 45), A0A(442, 5, 15), A0A(887, 4, 69), A0A(963, 6, 78), A0A(997, 7, 47), A0A(1144, 4, 79), A0A(1240, 5, 78), A0A(1311, 7, 0), A0A(1352, 6, 35), A0A(1363, 5, 76), A0A(1390, 3, 34), A0A(1535, 3, 90), A0A(1538, 3, 85), A0A(1545, 6, 12), A0A(1576, 4, 9), A0A(1868, 6, 122), A0A(1068, 10, 89), A0A(67, 11, 9), A0A(1624, 3, 116), A0A(431, 11, 26), A0A(1450, 6, 116), A0A(1696, 10, 104), A0A(568, 11, 3), A0A(78, 7, 100), A0A(1934, 8, 7), A0A(1985, 5, 54), A0A(1148, 9, 102), A0A(891, 6, 30), A0A(1922, 6, 104), A0A(337, 9, 33), A0A(1091, 12, 67), A0A(18, 4, 61), A0A(1004, 5, 74), A0A(TypedValues.Custom.TYPE_STRING, 4, 90), A0A(1686, 10, 47), A0A(940, 6, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A0A(1338, 5, 35), A0A(57, 10, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A0A(Input.Keys.NUM_LOCK, 4, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A0A(1682, 4, 26), A0A(1522, 4, 16), A0A(1719, 5, 95), A0A(1210, 10, 37), A0A(1103, 16, 52), A0A(1119, 17, 59), A0A(552, 6, 92), A0A(946, 6, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A0A(423, 8, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), A0A(1874, 17, 108), A0A(539, 10, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A0A(1393, 8, 102), A0A(579, 9, 22), A0A(456, 5, 121), A0A(1706, 13, 3), A0A(360, 6, 48), A0A(404, 4, 46), A0A(907, 7, 99), A0A(1909, 6, 40), A0A(298, 13, 105), A0A(1401, 8, 1), A0A(1161, 6, 90), A0A(1265, 15, 12), A0A(230, 7, 80), A0A(1330, 8, 111), A0A(1486, 11, 63), A0A(1541, 4, 68), A0A(1615, 9, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A0A(1915, 7, 10), A0A(1190, 5, 6), A0A(1928, 6, 113), A0A(31, 9, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A0A(22, 9, 61), A0A(1375, 5, 74), A0A(1551, 5, 31), A0A(1245, 7, 52), A0A(1580, 11, 116), A0A(969, 9, 41), A0A(857, 4, 85), A0A(861, 9, 75), A0A(1252, 13, 24), A0A(1740, 5, 32), A0A(846, 11, 78), A0A(Input.Keys.NUMPAD_7, 5, 51), A0A(1176, 5, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A0A(1556, 7, 85), A0A(237, 6, 2), A0A(Input.Keys.F20, 9, 5), A0A(120, 10, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), A0A(952, 11, 15), A0A(1462, 16, 32), A0A(1497, 16, 54), A0A(1745, 14, 30), A0A(1667, 9, 67), A0A(Input.Keys.NUMPAD_RIGHT_PAREN, 8, 91), A0A(271, 6, 89), A0A(498, 14, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), A0A(40, 8, 51), A0A(PointerIconCompat.TYPE_VERTICAL_TEXT, 6, 75), A0A(1734, 6, 16), A0A(256, 7, 66), A0A(1358, 5, 85), A0A(Input.Keys.COLON, 13, 75), A0A(1676, 6, 78), A0A(1759, 8, 37), A0A(204, 10, 47), A0A(1456, 6, 103), A0A(1409, 11, 115), A0A(1601, 6, 76), A0A(1659, 8, 46), A0A(346, 4, 116), A0A(1863, 5, 86), A0A(1596, 5, 121), A0A(870, 8, 59), A0A(130, 6, 23), A0A(1438, 12, 81), A0A(1563, 13, 25), A0A(878, 9, 92), A0A(491, 4, 57), A0A(1526, 9, 38), A0A(472, 9, 62), A0A(1, 9, 18), A0A(558, 10, 47), A0A(413, 10, 23), A0A(937, 3, 105), A0A(461, 11, 83), A0A(350, 10, EnumC4719u30.JSON_ENCODE_ERROR_VALUE), A0A(978, 8, 64), A0A(1891, 6, 10), A0A(1053, 5, 101), A0A(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 7, 19), A0A(48, 9, 49), A0A(1380, 10, 85), A0A(Input.Keys.NUMPAD_3, 4, 30), A0A(277, 21, 44), A0A(986, 11, 25), A0A(179, 11, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A0A(395, 9, 101), A0A(366, 22, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), A0A(311, 14, 110), A0A(1220, 8, 66), A0A(1591, 5, 88), A0A(1897, 12, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A0A(85, 5, 6), A0A(1157, 4, 95), A0A(1767, 8, 0), A0A(10, 8, 78), A0A(90, 8, 120), A0A(136, 7, 30), A0A(Input.Keys.NUMPAD_SUBTRACT, 7, 70), A0A(171, 8, 64), A0A(EnumC4719u30.INVALID_GZIP_BID_PAYLOAD_VALUE, 9, 21), A0A(263, 8, 25), A0A(447, 9, 112), A0A(481, 3, 105), A0A(495, 3, 38), A0A(512, 8, 4), A0A(520, 7, 27), A0A(527, 12, 68), A0A(549, 3, 64), A0A(588, 12, 33), A0A(914, 6, 16), A0A(931, 6, 34), A0A(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 3, 24), A0A(1045, 8, 0), A0A(1078, 13, 59), A0A(1136, 8, 63), A0A(1167, 9, 104), A0A(1181, 9, 29), A0A(1195, 6, 89), A0A(1201, 9, 46), A0A(1318, 12, 43), A0A(1343, 9, 97), A0A(1420, 9, 107), A0A(1429, 9, 81), A0A(1513, 9, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A0A(1607, 8, 12), A0A(1724, 10, 60), A0A(1942, 9, 35), A0A(1990, 11, 10), A0A(GL20.GL_INVALID_ENUM, 12, 20), A0A(111, 9, 21), A0A(98, 13, 113), A0A(1292, 19, 3), A0A(1368, 7, 35), A0A(1058, 10, 89), A0A(897, 6, 57), A0A(484, 7, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), A0A(920, 11, 87), A0A(1478, 8, 5)};
    }

    public static int A00(C1576fq c1576fq) {
        c1576fq.A0g(4);
        if (c1576fq.A0C() == 1684108385) {
            c1576fq.A0g(8);
            int atomType = c1576fq.A0I();
            return atomType;
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(GL20.GL_SRC_ALPHA_SATURATE, 37, 70));
        return -1;
    }

    public static ApicFrame A01(C1576fq c1576fq) {
        String strA0A;
        int iA0C = c1576fq.A0C();
        int iA0C2 = c1576fq.A0C();
        String strA0A2 = A0A(1228, 12, 88);
        if (iA0C2 == 1684108385) {
            int atomSize = c1576fq.A0C();
            int iA02 = W5.A02(atomSize);
            if (iA02 == 13) {
                strA0A = A0A(2024, 10, 75);
            } else {
                strA0A = iA02 == 14 ? A0A(2034, 9, 102) : null;
            }
            if (strA0A == null) {
                AbstractC1561fb.A07(strA0A2, A0A(1955, 30, 81) + iA02);
                return null;
            }
            c1576fq.A0g(4);
            int atomSize2 = iA0C - 16;
            byte[] bArr = new byte[atomSize2];
            int atomSize3 = bArr.length;
            c1576fq.A0k(bArr, 0, atomSize3);
            return new ApicFrame(strA0A, null, 3, bArr);
        }
        AbstractC1561fb.A07(strA0A2, A0A(635, 35, 34));
        return null;
    }

    public static CommentFrame A02(int i, C1576fq c1576fq) {
        int iA0C = c1576fq.A0C();
        int atomType = c1576fq.A0C();
        if (atomType == 1684108385) {
            c1576fq.A0g(8);
            int atomSize = iA0C - 16;
            String strA0V = c1576fq.A0V(atomSize);
            return new CommentFrame(A0A(2043, 3, 113), strA0V, strA0V);
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(600, 35, 83) + W5.A04(i));
        return null;
    }

    @MetaExoPlayerCustomization("Replace ImmutableList with MetaExoPlayerCustomizedCollections")
    public static Id3Frame A03(int i, String str, C1576fq c1576fq, boolean z, boolean z2) {
        int iA00 = A00(c1576fq);
        if (z2) {
            iA00 = Math.min(1, iA00);
        }
        if (iA00 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, MetaExoPlayerCustomizedCollections.A03(Integer.toString(iA00)));
            }
            return new CommentFrame(A0A(2043, 3, 113), str, Integer.toString(iA00));
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(813, 33, 25) + W5.A04(i));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01eb, code lost:
    
        r0 = A03(r3, A0A(1779, 4, 55), r8, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f8, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fc, code lost:
    
        r0 = A03(r3, A0A(1783, 4, 42), r8, r5, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0209, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020d, code lost:
    
        r0 = A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0211, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0214, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0215, code lost:
    
        r0 = A07(r3, A0A(1811, 4, 66), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0222, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0225, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        r3 = A07(r3, A0A(1839, 4, 115), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0233, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0241, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[6].length() == 21) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0243, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[2] = "Lyv27MpMNPFi8cp132FydBmMLOuK7y76";
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0250, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0251, code lost:
    
        r0 = A07(r3, A0A(1823, 4, 75), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025e, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0261, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0265, code lost:
    
        if (r3 != 1936679282) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0267, code lost:
    
        r3 = A07(r3, A0A(1827, 4, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0274, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0284, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[5].charAt(21) == 74) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0286, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[5] = "RBr6CqZNHRzikbOUZeWf7njfqRzGwg7G";
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028e, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[6] = "C";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0295, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0299, code lost:
    
        if (r3 != 1936679265) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029b, code lost:
    
        r0 = A07(r3, A0A(1835, 4, 103), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ab, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bb, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[1].charAt(6) == 82) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02bd, code lost:
    
        r2 = com.facebook.ads.redexgen.core.WM.A01;
        r2[7] = "y4jZJ3";
        r2[4] = "ZreAUC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c9, code lost:
    
        if (r3 != 1936679791) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cc, code lost:
    
        if (r3 != 1936679791) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ce, code lost:
    
        r0 = A07(r3, A0A(1831, 4, 97), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02db, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02de, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e2, code lost:
    
        if (r3 != 1920233063) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e4, code lost:
    
        r0 = A03(r3, A0A(androidx.core.view.PointerIconCompat.TYPE_ZOOM_IN, 14, 101), r8, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f2, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0306, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[0].charAt(30) == 122) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0308, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[2] = "M9cDXMm6bd2SbLtu3uL7sJFlHmLTcyhf";
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030f, code lost:
    
        if (r3 != 1885823344) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0312, code lost:
    
        if (r3 != 1885823344) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0314, code lost:
    
        r0 = A03(r3, A0A(com.badlogic.gdx.graphics.GL20.GL_FRONT_AND_BACK, 13, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), r8, false, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0322, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0325, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0336, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[5].charAt(21) == 74) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0338, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[2] = "umC1qMMBesJoclv213EYFG5JgEs1Thwd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x033f, code lost:
    
        if (r3 != 1936683886) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0342, code lost:
    
        if (r3 != 1936683886) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0344, code lost:
    
        r0 = A07(r3, A0A(1853, 10, 73), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0352, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0355, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0359, code lost:
    
        if (r3 != 1953919848) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x035b, code lost:
    
        r0 = A07(r3, A0A(1847, 6, 5), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0367, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x036a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x036e, code lost:
    
        if (r3 != 757935405) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0370, code lost:
    
        r0 = A05(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0374, code lost:
    
        r8.A0f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0377, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r3 == 1953329263) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r3 == 1953329263) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (r3 != 1668311404) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r3 != 1668249202) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (r3 != 1631670868) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (r3 != 1936682605) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        if (com.facebook.ads.redexgen.core.WM.A01[1].charAt(6) == 82) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
    
        com.facebook.ads.redexgen.core.WM.A01[5] = "cn91XtyHNYXI2BHIX29tkVWpdLovxI2K";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
    
        if (r3 != 1936679276) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame A04(com.facebook.ads.redexgen.core.C1576fq r8) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.WM.A04(com.facebook.ads.redexgen.X.fq):com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame");
    }

    public static InternalFrame A05(C1576fq c1576fq, int i) {
        String value = null;
        String strA0V = null;
        int atomSize = -1;
        int i2 = -1;
        while (c1576fq.A09() < i) {
            int dataAtomPosition = c1576fq.A09();
            int atomType = c1576fq.A0C();
            int iA0C = c1576fq.A0C();
            c1576fq.A0g(4);
            if (iA0C == 1835360622) {
                value = c1576fq.A0V(atomType - 12);
            } else if (iA0C == 1851878757) {
                strA0V = c1576fq.A0V(atomType - 12);
            } else {
                if (iA0C == 1684108385) {
                    atomSize = dataAtomPosition;
                    String name = A01[3];
                    if (name.charAt(17) == 'r') {
                        throw new RuntimeException();
                    }
                    A01[6] = "lfYXLriDnctiDl";
                    i2 = atomType;
                }
                c1576fq.A0g(atomType - 12);
            }
        }
        if (value == null || strA0V == null || atomSize == -1) {
            return null;
        }
        c1576fq.A0f(atomSize);
        c1576fq.A0g(16);
        String name2 = c1576fq.A0V(i2 - 16);
        return new InternalFrame(value, strA0V, name2);
    }

    @MetaExoPlayerCustomization("Replace ImmutableList with MetaExoPlayerCustomizedCollections")
    public static TextInformationFrame A06(int i, String str, C1576fq c1576fq) {
        int iA0C = c1576fq.A0C();
        int atomType = c1576fq.A0C();
        if (atomType == 1684108385 && iA0C >= 22) {
            c1576fq.A0g(10);
            int iA0M = c1576fq.A0M();
            int atomType2 = A01[1].charAt(6);
            if (atomType2 == 82) {
                throw new RuntimeException();
            }
            A01[2] = "KZaFaMKxPklIDia9yiFtbc4gLeAhlgoX";
            if (iA0M > 0) {
                String str2 = A0A(0, 0, 33) + iA0M;
                int count = c1576fq.A0M();
                if (count > 0) {
                    str2 = str2 + A0A(0, 1, 56) + count;
                }
                return new TextInformationFrame(str, null, MetaExoPlayerCustomizedCollections.A03(str2));
            }
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(670, 39, 61) + W5.A04(i));
        return null;
    }

    @MetaExoPlayerCustomization("Replace ImmutableList with MetaExoPlayerCustomizedCollections")
    public static TextInformationFrame A07(int i, String str, C1576fq c1576fq) {
        int iA0C = c1576fq.A0C();
        int atomType = c1576fq.A0C();
        if (atomType == 1684108385) {
            c1576fq.A0g(8);
            int atomSize = iA0C - 16;
            return new TextInformationFrame(str, null, MetaExoPlayerCustomizedCollections.A03(c1576fq.A0V(atomSize)));
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(744, 32, 89) + W5.A04(i));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @MetaExoPlayerCustomization("Replace ImmutableList with MetaExoPlayerCustomizedCollections")
    public static TextInformationFrame A08(C1576fq c1576fq) {
        String str;
        int iA00 = A00(c1576fq);
        if (iA00 > 0) {
            int genreCode = A02.length;
            if (iA00 <= genreCode) {
                int genreCode2 = iA00 - 1;
                str = A02[genreCode2];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame(A0A(1791, 4, 20), null, MetaExoPlayerCustomizedCollections.A03(str));
        }
        AbstractC1561fb.A07(A0A(1228, 12, 88), A0A(709, 35, 65));
        return null;
    }

    public static MdtaMetadataEntry A09(C1576fq c1576fq, int i, String str) {
        while (true) {
            int typeIndicator = c1576fq.A09();
            if (typeIndicator < i) {
                int atomType = c1576fq.A0C();
                int atomPosition = c1576fq.A0C();
                if (atomPosition == 1684108385) {
                    int localeIndicator = c1576fq.A0C();
                    int typeIndicator2 = c1576fq.A0C();
                    int atomType2 = atomType - 16;
                    byte[] bArr = new byte[atomType2];
                    c1576fq.A0k(bArr, 0, atomType2);
                    return new MdtaMetadataEntry(str, bArr, typeIndicator2, localeIndicator);
                }
                c1576fq.A0f(typeIndicator + atomType);
            } else {
                return null;
            }
        }
    }

    public static void A0C(int i, Metadata metadata, Metadata metadata2, P5 p5, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i == 1) {
            if (metadata != null) {
                metadata3 = metadata;
            }
        } else if (i == 2 && metadata2 != null) {
            for (int i2 = 0; i2 < metadata2.A02(); i2++) {
                Metadata.Entry entry = metadata2.A03(i2);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (A0A(2001, 23, 76).equals(mdtaMetadataEntry.A02)) {
                        metadata3 = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
            }
        }
        for (Metadata formatMetadata : metadataArr) {
            metadata3 = metadata3.A04(formatMetadata);
        }
        if (metadata3.A02() > 0) {
            p5.A0v(metadata3);
        }
    }

    public static void A0D(int i, UV uv, P5 p5) {
        if (i == 1) {
            boolean zA03 = uv.A03();
            if (A01[1].charAt(6) == 'R') {
                throw new RuntimeException();
            }
            A01[2] = "WDi7oMzkajr9K72XKCOYW1JfgAXzzOu3";
            if (zA03) {
                p5.A0d(uv.A00).A0e(uv.A01);
            }
        }
    }
}

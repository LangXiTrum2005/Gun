package androidx.webkit.internal;

import com.badlogic.gdx.graphics.GL30;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
class MimeUtil {
    public static String getMimeFromFileName(String str) {
        if (str == null) {
            return null;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName != null ? strGuessContentTypeFromName : guessHardcodedMime(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private static String guessHardcodedMime(String str) {
        byte b = 46;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case GL30.GL_UNPACK_SKIP_ROWS /* 3315 */:
                if (!lowerCase.equals("gz")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3401:
                if (!lowerCase.equals("js")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 97669:
                if (!lowerCase.equals("bmp")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 98819:
                if (!lowerCase.equals("css")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 102340:
                if (!lowerCase.equals("gif")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 103649:
                if (!lowerCase.equals("htm")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 104085:
                if (!lowerCase.equals("ico")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 105441:
                if (!lowerCase.equals("jpg")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 106458:
                if (!lowerCase.equals("m4a")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 106479:
                if (!lowerCase.equals("m4v")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 108089:
                if (!lowerCase.equals("mht")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 108150:
                if (!lowerCase.equals("mjs")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 108272:
                if (!lowerCase.equals("mp3")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 108273:
                if (!lowerCase.equals("mp4")) {
                    b = -1;
                } else {
                    b = cw.k;
                }
                break;
            case 108324:
                if (!lowerCase.equals("mpg")) {
                    b = -1;
                } else {
                    b = cw.l;
                }
                break;
            case 109961:
                if (!lowerCase.equals("oga")) {
                    b = -1;
                } else {
                    b = cw.m;
                }
                break;
            case 109967:
                if (!lowerCase.equals("ogg")) {
                    b = -1;
                } else {
                    b = cw.n;
                }
                break;
            case 109973:
                if (!lowerCase.equals("ogm")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 109982:
                if (!lowerCase.equals("ogv")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 110834:
                if (!lowerCase.equals("pdf")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 111030:
                if (!lowerCase.equals("pjp")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 111145:
                if (!lowerCase.equals("png")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 114276:
                if (!lowerCase.equals("svg")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 114791:
                if (!lowerCase.equals("tgz")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 114833:
                if (!lowerCase.equals("tif")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 117484:
                if (!lowerCase.equals("wav")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case 118660:
                if (!lowerCase.equals("xht")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 118807:
                if (!lowerCase.equals("xml")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 120609:
                if (!lowerCase.equals("zip")) {
                    b = -1;
                } else {
                    b = 28;
                }
                break;
            case 3000872:
                if (!lowerCase.equals("apng")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 3145576:
                if (!lowerCase.equals("flac")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 3213227:
                if (!lowerCase.equals("html")) {
                    b = -1;
                } else {
                    b = 31;
                }
                break;
            case 3259225:
                if (!lowerCase.equals("jfif")) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case 3268712:
                if (!lowerCase.equals("jpeg")) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case 3271912:
                if (!lowerCase.equals("json")) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case 3358085:
                if (!lowerCase.equals("mpeg")) {
                    b = -1;
                } else {
                    b = 35;
                }
                break;
            case 3418175:
                if (!lowerCase.equals("opus")) {
                    b = -1;
                } else {
                    b = 36;
                }
                break;
            case 3529614:
                if (!lowerCase.equals("shtm")) {
                    b = -1;
                } else {
                    b = 37;
                }
                break;
            case 3542678:
                if (!lowerCase.equals("svgz")) {
                    b = -1;
                } else {
                    b = 38;
                }
                break;
            case 3559925:
                if (!lowerCase.equals("tiff")) {
                    b = -1;
                } else {
                    b = 39;
                }
                break;
            case 3642020:
                if (!lowerCase.equals("wasm")) {
                    b = -1;
                } else {
                    b = 40;
                }
                break;
            case 3645337:
                if (!lowerCase.equals("webm")) {
                    b = -1;
                } else {
                    b = 41;
                }
                break;
            case 3645340:
                if (!lowerCase.equals("webp")) {
                    b = -1;
                } else {
                    b = 42;
                }
                break;
            case 3655064:
                if (!lowerCase.equals("woff")) {
                    b = -1;
                } else {
                    b = 43;
                }
                break;
            case 3678569:
                if (!lowerCase.equals("xhtm")) {
                    b = -1;
                } else {
                    b = 44;
                }
                break;
            case 96488848:
                if (!lowerCase.equals("ehtml")) {
                    b = -1;
                } else {
                    b = 45;
                }
                break;
            case 103877016:
                if (!lowerCase.equals("mhtml")) {
                    b = -1;
                }
                break;
            case 106703064:
                if (!lowerCase.equals("pjpeg")) {
                    b = -1;
                } else {
                    b = 47;
                }
                break;
            case 109418142:
                if (!lowerCase.equals("shtml")) {
                    b = -1;
                } else {
                    b = 48;
                }
                break;
            case 114035747:
                if (!lowerCase.equals("xhtml")) {
                    b = -1;
                } else {
                    b = 49;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 23:
                return "application/gzip";
            case 1:
            case 11:
                return "application/javascript";
            case 2:
                return "image/bmp";
            case 3:
                return "text/css";
            case 4:
                return "image/gif";
            case 5:
            case 31:
            case 37:
            case 45:
            case 48:
                return "text/html";
            case 6:
                return "image/x-icon";
            case 7:
            case 20:
            case 32:
            case 33:
            case 47:
                return "image/jpeg";
            case 8:
                return "audio/x-m4a";
            case 9:
            case 13:
                return MimeTypes.VIDEO_MP4;
            case 10:
            case 46:
                return "multipart/related";
            case 12:
                return MimeTypes.AUDIO_MPEG;
            case 14:
            case 35:
                return MimeTypes.VIDEO_MPEG;
            case 15:
            case 16:
            case 36:
                return "audio/ogg";
            case 17:
            case 18:
                return "video/ogg";
            case 19:
                return "application/pdf";
            case 21:
                return "image/png";
            case 22:
            case 38:
                return "image/svg+xml";
            case 24:
            case 39:
                return "image/tiff";
            case 25:
                return "audio/wav";
            case 26:
            case 44:
            case 49:
                return "application/xhtml+xml";
            case 27:
                return "text/xml";
            case 28:
                return "application/zip";
            case 29:
                return "image/apng";
            case 30:
                return MimeTypes.AUDIO_FLAC;
            case 34:
                return "application/json";
            case 40:
                return "application/wasm";
            case 41:
                return "video/webm";
            case 42:
                return "image/webp";
            case 43:
                return "application/font-woff";
            default:
                return null;
        }
    }
}

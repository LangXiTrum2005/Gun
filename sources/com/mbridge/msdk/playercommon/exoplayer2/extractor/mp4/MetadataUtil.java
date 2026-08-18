package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes2.dex */
final class MetadataUtil {
    private static final String LANGUAGE_UNDEFINED = "und";
    private static final String TAG = "MetadataUtil";
    private static final int SHORT_TYPE_NAME_1 = Util.getIntegerCodeForString("nam");
    private static final int SHORT_TYPE_NAME_2 = Util.getIntegerCodeForString("trk");
    private static final int SHORT_TYPE_COMMENT = Util.getIntegerCodeForString("cmt");
    private static final int SHORT_TYPE_YEAR = Util.getIntegerCodeForString("day");
    private static final int SHORT_TYPE_ARTIST = Util.getIntegerCodeForString("ART");
    private static final int SHORT_TYPE_ENCODER = Util.getIntegerCodeForString("too");
    private static final int SHORT_TYPE_ALBUM = Util.getIntegerCodeForString("alb");
    private static final int SHORT_TYPE_COMPOSER_1 = Util.getIntegerCodeForString("com");
    private static final int SHORT_TYPE_COMPOSER_2 = Util.getIntegerCodeForString("wrt");
    private static final int SHORT_TYPE_LYRICS = Util.getIntegerCodeForString("lyr");
    private static final int SHORT_TYPE_GENRE = Util.getIntegerCodeForString("gen");
    private static final int TYPE_COVER_ART = Util.getIntegerCodeForString("covr");
    private static final int TYPE_GENRE = Util.getIntegerCodeForString("gnre");
    private static final int TYPE_GROUPING = Util.getIntegerCodeForString("grp");
    private static final int TYPE_DISK_NUMBER = Util.getIntegerCodeForString("disk");
    private static final int TYPE_TRACK_NUMBER = Util.getIntegerCodeForString("trkn");
    private static final int TYPE_TEMPO = Util.getIntegerCodeForString("tmpo");
    private static final int TYPE_COMPILATION = Util.getIntegerCodeForString("cpil");
    private static final int TYPE_ALBUM_ARTIST = Util.getIntegerCodeForString("aART");
    private static final int TYPE_SORT_TRACK_NAME = Util.getIntegerCodeForString("sonm");
    private static final int TYPE_SORT_ALBUM = Util.getIntegerCodeForString("soal");
    private static final int TYPE_SORT_ARTIST = Util.getIntegerCodeForString("soar");
    private static final int TYPE_SORT_ALBUM_ARTIST = Util.getIntegerCodeForString("soaa");
    private static final int TYPE_SORT_COMPOSER = Util.getIntegerCodeForString("soco");
    private static final int TYPE_RATING = Util.getIntegerCodeForString("rtng");
    private static final int TYPE_GAPLESS_ALBUM = Util.getIntegerCodeForString("pgap");
    private static final int TYPE_TV_SORT_SHOW = Util.getIntegerCodeForString("sosn");
    private static final int TYPE_TV_SHOW = Util.getIntegerCodeForString("tvsh");
    private static final int TYPE_INTERNAL = Util.getIntegerCodeForString("----");
    private static final String[] STANDARD_GENRES = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpResponseHeader.Trailer, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private MetadataUtil() {
    }

    private static CommentFrame parseCommentAttribute(int i, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != Atom.TYPE_data) {
            Atom.getAtomTypeString(i);
            return null;
        }
        parsableByteArray.skipBytes(8);
        String nullTerminatedString = parsableByteArray.readNullTerminatedString(i2 - 16);
        return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != Atom.TYPE_data) {
            return null;
        }
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if (fullAtomFlags == 13) {
            str = "image/jpeg";
        } else {
            str = fullAtomFlags == 14 ? "image/png" : null;
        }
        if (str == null) {
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i2 = i - 16;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int i2 = parsableByteArray.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == 169 || i3 == 65533) {
                int i4 = 16777215 & i2;
                if (i4 == SHORT_TYPE_COMMENT) {
                    CommentFrame commentAttribute = parseCommentAttribute(i2, parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return commentAttribute;
                }
                if (i4 != SHORT_TYPE_NAME_1 && i4 != SHORT_TYPE_NAME_2) {
                    if (i4 != SHORT_TYPE_COMPOSER_1 && i4 != SHORT_TYPE_COMPOSER_2) {
                        if (i4 == SHORT_TYPE_YEAR) {
                            TextInformationFrame textAttribute = parseTextAttribute(i2, "TDRC", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute;
                        }
                        if (i4 == SHORT_TYPE_ARTIST) {
                            TextInformationFrame textAttribute2 = parseTextAttribute(i2, "TPE1", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute2;
                        }
                        if (i4 == SHORT_TYPE_ENCODER) {
                            TextInformationFrame textAttribute3 = parseTextAttribute(i2, "TSSE", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute3;
                        }
                        if (i4 == SHORT_TYPE_ALBUM) {
                            TextInformationFrame textAttribute4 = parseTextAttribute(i2, "TALB", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute4;
                        }
                        if (i4 == SHORT_TYPE_LYRICS) {
                            TextInformationFrame textAttribute5 = parseTextAttribute(i2, "USLT", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute5;
                        }
                        if (i4 == SHORT_TYPE_GENRE) {
                            TextInformationFrame textAttribute6 = parseTextAttribute(i2, "TCON", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute6;
                        }
                        if (i4 == TYPE_GROUPING) {
                            TextInformationFrame textAttribute7 = parseTextAttribute(i2, "TIT1", parsableByteArray);
                            parsableByteArray.setPosition(i);
                            return textAttribute7;
                        }
                    }
                    TextInformationFrame textAttribute8 = parseTextAttribute(i2, "TCOM", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute8;
                }
                TextInformationFrame textAttribute9 = parseTextAttribute(i2, "TIT2", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute9;
            }
            if (i2 == TYPE_GENRE) {
                TextInformationFrame standardGenreAttribute = parseStandardGenreAttribute(parsableByteArray);
                parsableByteArray.setPosition(i);
                return standardGenreAttribute;
            }
            if (i2 == TYPE_DISK_NUMBER) {
                TextInformationFrame indexAndCountAttribute = parseIndexAndCountAttribute(i2, "TPOS", parsableByteArray);
                parsableByteArray.setPosition(i);
                return indexAndCountAttribute;
            }
            if (i2 == TYPE_TRACK_NUMBER) {
                TextInformationFrame indexAndCountAttribute2 = parseIndexAndCountAttribute(i2, "TRCK", parsableByteArray);
                parsableByteArray.setPosition(i);
                return indexAndCountAttribute2;
            }
            if (i2 == TYPE_TEMPO) {
                Id3Frame uint8Attribute = parseUint8Attribute(i2, "TBPM", parsableByteArray, true, false);
                parsableByteArray.setPosition(i);
                return uint8Attribute;
            }
            if (i2 == TYPE_COMPILATION) {
                Id3Frame uint8Attribute2 = parseUint8Attribute(i2, "TCMP", parsableByteArray, true, true);
                parsableByteArray.setPosition(i);
                return uint8Attribute2;
            }
            if (i2 == TYPE_COVER_ART) {
                ApicFrame coverArt = parseCoverArt(parsableByteArray);
                parsableByteArray.setPosition(i);
                return coverArt;
            }
            if (i2 == TYPE_ALBUM_ARTIST) {
                TextInformationFrame textAttribute10 = parseTextAttribute(i2, "TPE2", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute10;
            }
            if (i2 == TYPE_SORT_TRACK_NAME) {
                TextInformationFrame textAttribute11 = parseTextAttribute(i2, "TSOT", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute11;
            }
            if (i2 == TYPE_SORT_ALBUM) {
                TextInformationFrame textAttribute12 = parseTextAttribute(i2, "TSO2", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute12;
            }
            if (i2 == TYPE_SORT_ARTIST) {
                TextInformationFrame textAttribute13 = parseTextAttribute(i2, "TSOA", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute13;
            }
            if (i2 == TYPE_SORT_ALBUM_ARTIST) {
                TextInformationFrame textAttribute14 = parseTextAttribute(i2, "TSOP", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute14;
            }
            if (i2 == TYPE_SORT_COMPOSER) {
                TextInformationFrame textAttribute15 = parseTextAttribute(i2, "TSOC", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute15;
            }
            if (i2 == TYPE_RATING) {
                Id3Frame uint8Attribute3 = parseUint8Attribute(i2, "ITUNESADVISORY", parsableByteArray, false, false);
                parsableByteArray.setPosition(i);
                return uint8Attribute3;
            }
            if (i2 == TYPE_GAPLESS_ALBUM) {
                Id3Frame uint8Attribute4 = parseUint8Attribute(i2, "ITUNESGAPLESS", parsableByteArray, false, true);
                parsableByteArray.setPosition(i);
                return uint8Attribute4;
            }
            if (i2 == TYPE_TV_SORT_SHOW) {
                TextInformationFrame textAttribute16 = parseTextAttribute(i2, "TVSHOWSORT", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute16;
            }
            if (i2 == TYPE_TV_SHOW) {
                TextInformationFrame textAttribute17 = parseTextAttribute(i2, "TVSHOW", parsableByteArray);
                parsableByteArray.setPosition(i);
                return textAttribute17;
            }
            if (i2 == TYPE_INTERNAL) {
                Id3Frame internalAttribute = parseInternalAttribute(parsableByteArray, i);
                parsableByteArray.setPosition(i);
                return internalAttribute;
            }
            Atom.getAtomTypeString(i2);
            parsableByteArray.setPosition(i);
            return null;
        } catch (Throwable th) {
            parsableByteArray.setPosition(i);
            throw th;
        }
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data && i2 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String strP = AbstractC3950lJ.p("", unsignedShort);
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strP = strP + "/" + unsignedShort2;
                }
                return new TextInformationFrame(str, null, strP);
            }
        }
        Atom.getAtomTypeString(i);
        return null;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i4 = parsableByteArray.readInt();
            int i5 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i5 == Atom.TYPE_mean) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else if (i5 == Atom.TYPE_name) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == Atom.TYPE_data) {
                    i2 = position;
                    i3 = i4;
                }
                parsableByteArray.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i2);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i3 - 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String str;
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (uint8AttributeValue > 0) {
            String[] strArr = STANDARD_GENRES;
            if (uint8AttributeValue <= strArr.length) {
                str = strArr[uint8AttributeValue - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        return null;
    }

    private static TextInformationFrame parseTextAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(i2 - 16));
        }
        Atom.getAtomTypeString(i);
        return null;
    }

    private static Id3Frame parseUint8Attribute(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int uint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z2) {
            uint8AttributeValue = Math.min(1, uint8AttributeValue);
        }
        if (uint8AttributeValue >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(uint8AttributeValue)) : new CommentFrame("und", str, Integer.toString(uint8AttributeValue));
        }
        Atom.getAtomTypeString(i);
        return null;
    }

    private static int parseUint8AttributeValue(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != Atom.TYPE_data) {
            return -1;
        }
        parsableByteArray.skipBytes(8);
        return parsableByteArray.readUnsignedByte();
    }
}

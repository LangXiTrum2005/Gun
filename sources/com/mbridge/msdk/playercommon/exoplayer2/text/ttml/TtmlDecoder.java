package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ColorParser;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.util.XmlPullParserUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    public static final class CellResolution {
        final int columns;
        final int rows;

        public CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals(TtmlNode.TAG_SMPTE_IMAGE) || str.equals(TtmlNode.TAG_SMPTE_DATA) || str.equals(TtmlNode.TAG_SMPTE_INFORMATION);
    }

    private CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            return cellResolution;
        }
        try {
            int i = Integer.parseInt(matcher.group(1));
            int i2 = Integer.parseInt(matcher.group(2));
            if (i != 0 && i2 != 0) {
                return new CellResolution(i, i2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i + " " + i2);
        } catch (NumberFormatException unused) {
            return cellResolution;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(AbstractC5044xl.o(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(DM.B("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException(DM.B("Invalid unit for fontSize: '", strGroup, "'."));
        }
        ttmlStyle.setFontSize(Float.valueOf(matcher.group(1)).floatValue());
    }

    private FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, " ");
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i2 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i * f, i2, i3);
    }

    private Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, CellResolution cellResolution) throws XmlPullParserException, SubtitleDecoderException, IOException {
        TtmlRegion regionAttributes;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                if (styleAttributes.getId() != null) {
                    map.put(styleAttributes.getId(), styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region") && (regionAttributes = parseRegionAttributes(xmlPullParser, cellResolution)) != null) {
                map2.put(regionAttributes.id, regionAttributes);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    private TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        long timeExpression = -9223372036854775807L;
        long timeExpression2 = -9223372036854775807L;
        long timeExpression3 = -9223372036854775807L;
        String str = "";
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j2 = ttmlNode.startTimeUs;
            if (j2 != C.TIME_UNSET) {
                if (timeExpression != C.TIME_UNSET) {
                    timeExpression += j2;
                }
                if (timeExpression2 != C.TIME_UNSET) {
                    timeExpression2 += j2;
                }
            }
        }
        if (timeExpression2 != C.TIME_UNSET) {
            j = timeExpression2;
        } else if (timeExpression3 != C.TIME_UNSET) {
            j = timeExpression + timeExpression3;
        } else if (ttmlNode != null) {
            long j3 = ttmlNode.endTimeUs;
            if (j3 != C.TIME_UNSET) {
                j = j3;
            } else {
                j = timeExpression2;
            }
        } else {
            j = timeExpression2;
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), timeExpression, j, styleAttributes, strArr, str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    private TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution) {
        String attributeValue;
        float f;
        int i;
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue2 != null && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin")) != null) {
            Pattern pattern = PERCENTAGE_COORDINATES;
            Matcher matcher = pattern.matcher(attributeValue);
            if (matcher.matches()) {
                try {
                    float f2 = Float.parseFloat(matcher.group(1)) / 100.0f;
                    float f3 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                    if (attributeValue3 != null) {
                        Matcher matcher2 = pattern.matcher(attributeValue3);
                        if (matcher2.matches()) {
                            float f4 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                            float f5 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                            String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                            if (attributeValue4 != null) {
                                String lowerInvariant = Util.toLowerInvariant(attributeValue4);
                                lowerInvariant.getClass();
                                if (lowerInvariant.equals(TtmlNode.CENTER)) {
                                    f = (f5 / 2.0f) + f3;
                                    i = 1;
                                } else if (lowerInvariant.equals("after")) {
                                    f = f3 + f5;
                                    i = 2;
                                } else {
                                    f = f3;
                                    i = 0;
                                }
                            } else {
                                f = f3;
                                i = 0;
                            }
                            return new TtmlRegion(attributeValue2, f2, f, 0, i, f4, 1, 1.0f / cellResolution.rows);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    private TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    String lowerInvariant = Util.toLowerInvariant(attributeValue);
                    lowerInvariant.getClass();
                    switch (lowerInvariant) {
                        case "center":
                            ttmlStyle = createIfNull(ttmlStyle).setTextAlign(Layout.Alignment.ALIGN_CENTER);
                            break;
                        case "end":
                            ttmlStyle = createIfNull(ttmlStyle).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "left":
                            ttmlStyle = createIfNull(ttmlStyle).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
                            break;
                        case "right":
                            ttmlStyle = createIfNull(ttmlStyle).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "start":
                            ttmlStyle = createIfNull(ttmlStyle).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
                            break;
                    }
                    break;
                case "textDecoration":
                    String lowerInvariant2 = Util.toLowerInvariant(attributeValue);
                    lowerInvariant2.getClass();
                    switch (lowerInvariant2) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                    break;
                case "fontSize":
                    ttmlStyle = createIfNull(ttmlStyle);
                    parseFontSize(attributeValue, ttmlStyle);
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (SubtitleDecoderException | IllegalArgumentException unused) {
                        break;
                    }
                    break;
            }
        }
        return ttmlStyle;
    }

    private String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(AbstractC3888ke0.i("Malformed time expression: ", str));
        }
        double d6 = Double.parseDouble(matcher2.group(1));
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        strGroup4.hashCode();
        switch (strGroup4) {
            case "f":
                d = frameAndTickRate.effectiveFrameRate;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = frameAndTickRate.tickRate;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            default:
                return (long) (d6 * 1000000.0d);
        }
        d6 *= d2;
        return (long) (d6 * 1000000.0d);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public TtmlSubtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            Map<String, TtmlStyle> map = new HashMap<>();
            HashMap map2 = new HashMap();
            TtmlSubtitle ttmlSubtitle = null;
            map2.put("", new TtmlRegion(null));
            int i2 = 0;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellResolution = parseCellResolution(xmlPullParserNewPullParser, DEFAULT_CELL_RESOLUTION);
                        }
                        if (!isSupportedTag(name)) {
                            xmlPullParserNewPullParser.getName();
                        } else if (TtmlNode.TAG_HEAD.equals(name)) {
                            parseHeader(xmlPullParserNewPullParser, map, map2, cellResolution);
                        } else {
                            try {
                                TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRates);
                                arrayDeque.push(node);
                                if (ttmlNode != null) {
                                    ttmlNode.addChild(node);
                                }
                            } catch (SubtitleDecoderException unused) {
                                i2++;
                            }
                        }
                        i2++;
                    } else if (eventType == 4) {
                        ttmlNode.addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) arrayDeque.peek(), map, map2);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            return ttmlSubtitle;
        } catch (IOException e) {
            throw new IllegalStateException("Unexpected error when reading input.", e);
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        }
    }
}

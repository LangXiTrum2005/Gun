package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.BuildConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    private Map<String, String> c(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.b(str);
    }

    private Map<String, String> d(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a("duration", Long.valueOf(cVar.a("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> mapD;
        HashMap map = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.i(str);
            Map<String, String> mapB = b(str, cVar);
            if (mapB != null) {
                map.putAll(mapB);
            }
            Map<String, String> mapA = a(str, cVar.x(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(b.d).contains(str) && (mapD = d(str, cVar)) != null) {
                map.putAll(mapD);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            if (!map.containsKey("lrid") || TextUtils.isEmpty((CharSequence) map.get("lrid"))) {
                map.put("lrid", cVar.o());
            }
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            String str2 = "1";
            if (cVar.c() == null || !cVar.c().equals("1") || !Arrays.asList(b.b).contains(str) || cVar.a() == 296) {
                if (Arrays.asList(b.m).contains(str)) {
                    map.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str2 = "0";
                    }
                    map.put("local_dns_available", str2);
                }
                com.mbridge.msdk.tracker.e eVarA = a(str, map);
                if (mVar != null && eVarA != null) {
                    mVar.d(eVarA);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            cVar.i(str);
            Map<String, String> mapA = a(str, cVar.x(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapA2 = a(str, cVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            Map<String, String> mapC = c(str, cVar);
            if (mapC != null) {
                map.putAll(mapC);
            }
            com.mbridge.msdk.tracker.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.d(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:267:0x0675 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0684 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0687 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:286:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:40:0x00a5, B:42:0x00ab, B:49:0x00c7, B:51:0x00cd, B:53:0x00d2, B:54:0x00d6, B:56:0x00dc, B:59:0x00e5, B:62:0x00f1, B:64:0x0106, B:65:0x010f, B:67:0x0120, B:69:0x012f, B:70:0x013c, B:73:0x0144, B:75:0x014a, B:77:0x0150, B:78:0x016e, B:79:0x0179, B:81:0x0183, B:83:0x0189, B:84:0x01a7, B:85:0x01b2, B:87:0x01ba, B:89:0x01c0, B:90:0x01de, B:91:0x01e9, B:93:0x01f1, B:95:0x01f7, B:96:0x0215, B:97:0x0220, B:99:0x0228, B:101:0x022e, B:102:0x024c, B:103:0x0257, B:106:0x026e, B:108:0x0278, B:109:0x027e, B:110:0x0283, B:113:0x028f, B:115:0x029d, B:118:0x02af, B:120:0x02b5, B:127:0x02fb, B:129:0x0305, B:132:0x0311, B:134:0x0317, B:135:0x032e, B:136:0x0332, B:138:0x0338, B:139:0x034f, B:140:0x0352, B:142:0x035c, B:144:0x036b, B:145:0x038b, B:146:0x0394, B:149:0x039d, B:151:0x03a3, B:157:0x03de, B:161:0x03e9, B:163:0x03ff, B:165:0x0424, B:167:0x042a, B:169:0x044f, B:171:0x0453, B:173:0x0463, B:174:0x0468, B:176:0x0472, B:177:0x047b, B:179:0x0481, B:180:0x048e, B:182:0x04ae, B:184:0x04b5, B:185:0x04c2, B:187:0x04cc, B:188:0x04d5, B:190:0x04dd, B:192:0x04e4, B:193:0x04f1, B:195:0x04fb, B:196:0x0504, B:197:0x0511, B:199:0x0519, B:203:0x052e, B:206:0x053c, B:208:0x0562, B:210:0x0568, B:212:0x056d, B:211:0x056b, B:213:0x0574, B:215:0x057c, B:217:0x0582, B:219:0x0587, B:218:0x0585, B:220:0x058e, B:223:0x0598, B:225:0x05a0, B:226:0x05a8, B:228:0x05b4, B:230:0x05ba, B:232:0x05bf, B:234:0x05ce, B:236:0x05d4, B:238:0x05d9, B:242:0x05e9, B:246:0x0607, B:248:0x0610, B:249:0x061a, B:245:0x0603, B:237:0x05d7, B:231:0x05bd, B:250:0x0627, B:252:0x0633, B:257:0x0640, B:259:0x064c, B:261:0x0656, B:266:0x066b, B:268:0x067e, B:270:0x0684, B:272:0x0689, B:271:0x0687, B:267:0x0675, B:262:0x065f, B:264:0x0665, B:282:0x06c4, B:273:0x0691, B:275:0x069f, B:277:0x06b2, B:279:0x06b8, B:281:0x06bd, B:280:0x06bb, B:276:0x06a9, B:168:0x0448, B:164:0x041d, B:152:0x03ba, B:153:0x03be, B:155:0x03c4, B:156:0x03db, B:121:0x02ce, B:122:0x02d4, B:124:0x02dc, B:125:0x02f3, B:66:0x0117, B:43:0x00b3, B:45:0x00b9, B:48:0x00c4, B:46:0x00be, B:37:0x009d), top: B:292:0x003d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.mbridge.msdk.foundation.same.report.metrics.e] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    private Map<String, String> b(String str, c cVar) {
        String str2;
        String str3;
        boolean zContains;
        int i;
        List<CampaignEx> listG;
        String str4 = CampaignEx.JSON_KEY_EC_TEMP_ID;
        String str5 = "endcard_crid";
        String str6 = "video_crid";
        ?? eVar = new e();
        try {
            if (Arrays.asList(b.g).contains(str)) {
                return eVar.a();
            }
            if (cVar == null) {
                eVar.a("metrics_data_reason", "metrics 上报时意外为空");
                return eVar.a();
            }
            try {
                ?? arrayList = new ArrayList();
                try {
                    if (cVar.i() == null || cVar.i().getAdType() != 295) {
                        if (Arrays.asList(b.f).contains(str)) {
                            if (!"m_download_start".equals(str) && !"m_download_end".equals(str)) {
                                List<CampaignEx> listJ = cVar.j() != null ? cVar.j() : cVar.g();
                                if (listJ != null && listJ.size() > 0) {
                                    arrayList.addAll(listJ);
                                }
                            } else {
                                arrayList = a(cVar, str);
                            }
                        } else if (cVar.i() != null) {
                            arrayList.add(cVar.i());
                        } else {
                            if (cVar.j() != null) {
                                listG = cVar.j();
                            } else {
                                listG = cVar.g();
                            }
                            if (listG != null) {
                                arrayList.addAll(listG);
                            }
                        }
                    } else if (cVar.i() != null) {
                        arrayList.add(cVar.i());
                    } else {
                        if (cVar.j() != null) {
                            listG = cVar.j();
                        } else {
                            listG = cVar.g();
                        }
                        if (listG != null) {
                            arrayList.addAll(listG);
                        }
                    }
                } catch (Throwable th) {
                    o0.b("SameMetricsReport", th.getMessage());
                }
                if (arrayList.isEmpty()) {
                    return eVar.a();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx = (CampaignEx) it.next();
                    if (campaignEx != null) {
                        if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                            eVar.a("n_lrid", campaignEx.getNLRid());
                            if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                                eVar.a("n_rid", campaignEx.getNRid());
                            }
                            eVar.a("lrid", campaignEx.getLocalRequestId());
                        } else {
                            eVar.a("lrid", campaignEx.getLocalRequestId());
                        }
                        eVar.a("rid", campaignEx.getRequestId());
                        if (campaignEx.getMof_tplid() != 0) {
                            eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                        }
                        CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                        if (rewardTemplateMode != null && rewardTemplateMode.f() != 0) {
                            if (eVar.a("vtid")) {
                                eVar.a("vtid", eVar.b("vtid") + "," + rewardTemplateMode.f());
                            } else {
                                eVar.a("vtid", Integer.valueOf(rewardTemplateMode.f()));
                            }
                        }
                        if (campaignEx.getCreativeId() != 0) {
                            if (eVar.a("crid")) {
                                eVar.a("crid", eVar.b("crid") + "," + campaignEx.getCreativeId());
                            } else {
                                eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                            }
                        }
                        if (campaignEx.getVidCrtvId() != 0) {
                            if (eVar.a(str6)) {
                                eVar.a(str6, eVar.b(str6) + "," + campaignEx.getVidCrtvId());
                            } else {
                                eVar.a(str6, Long.valueOf(campaignEx.getVidCrtvId()));
                            }
                        }
                        if (campaignEx.getEcCrtvId() != 0) {
                            if (eVar.a(str5)) {
                                eVar.a(str5, eVar.b(str5) + "," + campaignEx.getEcCrtvId());
                            } else {
                                eVar.a(str5, Long.valueOf(campaignEx.getEcCrtvId()));
                            }
                        }
                        if (campaignEx.getEcTemplateId() != 0) {
                            if (eVar.a(str4)) {
                                eVar.a(str4, eVar.b(str4) + "," + campaignEx.getEcTemplateId());
                            } else {
                                eVar.a(str4, Long.valueOf(campaignEx.getEcTemplateId()));
                            }
                        }
                        eVar.a("bid_tk", campaignEx.getBidToken());
                        String str7 = "1";
                        if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                            if (t0.i(campaignEx.getMof_template_url())) {
                                eVar.a("sdyv", "1");
                            } else {
                                eVar.a("sdyv", "2");
                            }
                        }
                        String str8 = str4;
                        if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                            str2 = str5;
                            str3 = str6;
                        } else {
                            str2 = str5;
                            if (t0.i(campaignEx.getRewardTemplateMode().e())) {
                                if (eVar.a("vdyv")) {
                                    StringBuilder sb = new StringBuilder();
                                    str3 = str6;
                                    sb.append(eVar.b("vdyv"));
                                    sb.append(",1");
                                    eVar.a("vdyv", sb.toString());
                                } else {
                                    str3 = str6;
                                    eVar.a("vdyv", "1");
                                }
                            } else {
                                str3 = str6;
                                if (eVar.a("vdyv")) {
                                    eVar.a("vdyv", eVar.b("vdyv") + ",2");
                                } else {
                                    eVar.a("vdyv", "2");
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                            if (t0.i(campaignEx.getendcard_url())) {
                                if (eVar.a("edyv")) {
                                    eVar.a("edyv", eVar.b("edyv") + ",1");
                                } else {
                                    eVar.a("edyv", "1");
                                }
                            } else if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",2");
                            } else {
                                eVar.a("edyv", "2");
                            }
                        }
                        if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
                            JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                            if (eVar.a("dspid")) {
                                eVar.a("dspid", eVar.b("dspid") + "," + jSONObject.optString("par_dspid"));
                            } else {
                                eVar.a("dspid", jSONObject.optString("par_dspid"));
                            }
                        }
                        if (campaignEx.getPlayable_ads_without_video() == 2) {
                            if (eVar.a("only_ec")) {
                                eVar.a("only_ec", eVar.b("only_ec") + ",2");
                            } else {
                                eVar.a("only_ec", "2");
                            }
                        } else if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",1");
                        } else {
                            eVar.a("only_ec", "1");
                        }
                        if (!campaignEx.isBidCampaign()) {
                            str7 = "0";
                        }
                        eVar.a(CampaignEx.JSON_KEY_HB, str7);
                        eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                        if (eVar.a(BidResponsedEx.KEY_CID)) {
                            eVar.a(BidResponsedEx.KEY_CID, eVar.b(BidResponsedEx.KEY_CID) + "," + campaignEx.getId());
                        } else {
                            eVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
                        }
                        if (!eVar.a("rid_n")) {
                            eVar.a("rid_n", campaignEx.getRequestIdNotice());
                        } else {
                            eVar.a("rid_n", eVar.b("rid_n") + "," + campaignEx.getRequestIdNotice());
                        }
                        HashMap<String, String> map = com.mbridge.msdk.foundation.controller.a.s;
                        if (map != null) {
                            String str9 = map.get(campaignEx.getCampaignUnitId());
                            if (!TextUtils.isEmpty(str9)) {
                                eVar.a("u_stid", str9);
                            }
                        }
                        if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                        }
                        if (campaignEx.getAdType() != 0) {
                            eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                        }
                        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                        eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                        if ("2000047".contains(str)) {
                            if (campaignEx.getTyped() != -1) {
                                eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                            }
                            if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                                eVar.a("reason_d", campaignEx.getReasond());
                            }
                        }
                        if ("2000048".contains(str)) {
                            if (campaignEx.getTyped() != -1) {
                                eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                            }
                            if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                                eVar.a("reason", campaignEx.getReasond());
                            }
                            eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                        }
                        if (campaignEx.getAdType() == 94 || campaignEx.getAdType() == 287) {
                            if (Arrays.asList(b.j).contains(str)) {
                                eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                                eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                                if (Arrays.asList(b.l).contains(str)) {
                                    eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                                }
                                if (str.equals("2000147")) {
                                    eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                                }
                            }
                            if (TextUtils.equals(str, "2000130")) {
                                String strE = "";
                                if (campaignEx.getRewardTemplateMode() != null) {
                                    strE = campaignEx.getRewardTemplateMode().e();
                                }
                                String str10 = campaignEx.getendcard_url();
                                eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str10) || !str10.contains("alecfc=1")) ? a.k : a.j));
                                eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(strE) || !strE.contains("alecfc=1")) ? a.k : a.j));
                                boolean z = campaignEx.getPlayable_ads_without_video() == 2;
                                com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.x());
                                eVar.a("video_skip_result", Integer.valueOf(cVarD == null ? 2 : cVarD.E()));
                                if (z) {
                                    eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                                } else {
                                    eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                                }
                            }
                            if (Arrays.asList(b.k).contains(str)) {
                                int clickTempSource = campaignEx.getClickTempSource();
                                if (clickTempSource == 1) {
                                    if (campaignEx.getRewardTemplateMode().e().contains("alecfc=1")) {
                                        eVar.a("full_screen_click", Integer.valueOf(a.j));
                                    } else {
                                        eVar.a("full_screen_click", Integer.valueOf(a.k));
                                    }
                                    eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                                } else if (clickTempSource == 2) {
                                    String str11 = campaignEx.getendcard_url();
                                    if (campaignEx.getMof_tplid() == 501 && !TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                                        zContains = campaignEx.getMof_template_url().contains("alecfc=1");
                                    } else {
                                        if (!TextUtils.isEmpty(str11)) {
                                            zContains = str11.contains("alecfc=1");
                                        } else {
                                            eVar.a("full_screen_click", Integer.valueOf(a.k));
                                        }
                                        if (campaignEx.isECTemplateRenderSucc()) {
                                            i = a.e;
                                        } else {
                                            i = a.f;
                                        }
                                        eVar.a("temp_display_type", Integer.valueOf(i));
                                    }
                                    if (zContains) {
                                        eVar.a("full_screen_click", Integer.valueOf(a.j));
                                    } else {
                                        eVar.a("full_screen_click", Integer.valueOf(a.k));
                                    }
                                    if (campaignEx.isECTemplateRenderSucc()) {
                                        i = a.e;
                                    } else {
                                        i = a.f;
                                    }
                                    eVar.a("temp_display_type", Integer.valueOf(i));
                                }
                                eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                                eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                                eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                            }
                        }
                        it = it;
                        str4 = str8;
                        str5 = str2;
                        str6 = str3;
                    }
                }
                return eVar.a();
            } catch (Exception e) {
                e = e;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (MBridgeConstans.DEBUG) {
            e.printStackTrace();
        }
        return eVar.a();
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolA = com.mbridge.msdk.foundation.same.b.b().a();
            if (boolA != null) {
                jSONObject.put("r_v_r", boolA.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            if (!TextUtils.isEmpty(gVarD.k0())) {
                eVar.a("as_rid", gVarD.k0());
            }
            String strJ = gVarD.J();
            JSONArray jSONArrayI = gVarD.I();
            if (jSONArrayI != null) {
                for (int i = 0; i < jSONArrayI.length(); i++) {
                    if (str.equals(jSONArrayI.getString(i))) {
                        strJ = BuildConfig.VERSION_NAME;
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("log_rate", strJ);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                l lVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (lVarD != null && !TextUtils.isEmpty(lVarD.I())) {
                    eVar.a("us_rid", lVarD.I());
                }
                if (lVarD != null && !TextUtils.isEmpty(lVarD.a())) {
                    eVar.a("u_stid", lVarD.a());
                }
                e eVarB = d.b().b(str2);
                if (eVarB != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", eVarB.b("r_stid"));
                            eVarB.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(eVarB);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0007, B:6:0x0020, B:8:0x0026, B:10:0x0036, B:20:0x004e, B:22:0x0054, B:25:0x005f, B:27:0x0065, B:23:0x0059, B:15:0x0041, B:17:0x0045, B:28:0x0069, B:30:0x006d, B:31:0x0070, B:33:0x0076, B:34:0x007e, B:36:0x0084, B:39:0x008f, B:41:0x0095, B:37:0x0089), top: B:47:0x0007, inners: #1 }] */
    private List<CampaignEx> a(c cVar, String str) {
        List<CampaignEx> listG;
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.o() + str;
                Map<String, Map<String, String>> mapR = cVar.r();
                if (mapR != null && mapR.containsKey(str2)) {
                    try {
                        Object obj = mapR.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            iIntValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else if (cVar.i() != null) {
                            arrayList.add(cVar.i());
                        } else {
                            if (cVar.j() != null) {
                                listG = cVar.j();
                            } else {
                                listG = cVar.g();
                            }
                            if (listG != null) {
                                arrayList.addAll(listG);
                            }
                        }
                        if (iIntValue == 1) {
                            List<CampaignEx> listJ = cVar.j() != null ? cVar.j() : cVar.g();
                            if (listJ != null && listJ.size() > 0) {
                                arrayList.addAll(listJ);
                            }
                        } else if (cVar.i() != null) {
                            arrayList.add(cVar.i());
                        } else {
                            if (cVar.j() != null) {
                                listG = cVar.j();
                            } else {
                                listG = cVar.g();
                            }
                            if (listG != null) {
                                arrayList.addAll(listG);
                            }
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                } else if (cVar.i() != null) {
                    arrayList.add(cVar.i());
                } else {
                    if (cVar.j() != null) {
                        listG = cVar.j();
                    } else {
                        listG = cVar.g();
                    }
                    if (listG != null && listG.size() > 0) {
                        arrayList.addAll(listG);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(b.e).contains(str)) {
                String strC = "";
                if (cVar != null) {
                    strC = cVar.c();
                }
                map.put("auto_load", strC);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> mapR = cVar.r();
                String str2 = cVar.o() + str;
                if (mapR.containsKey(str2) && mapR.get(str2) != null) {
                    map.putAll(mapR.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapQ = cVar.q();
                    String str3 = cVar.o() + "_" + cVar.l() + "_" + str;
                    if (mapQ.containsKey(str3) && mapQ.get(str3) != null) {
                        map.putAll(mapQ.get(str3));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return map;
    }
}

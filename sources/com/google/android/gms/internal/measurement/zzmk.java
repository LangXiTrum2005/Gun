package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzmk {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzmi zzmiVar, String str) {
        StringBuilder sbQ = DM.q("# ", str);
        zzd(zzmiVar, sbQ, 0);
        return sbQ.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzni.zza(new zzjx(((String) obj).getBytes(zzlj.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzka) {
            sb.append(": \"");
            sb.append(zzni.zza((zzka) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzlb) {
            sb.append(" {");
            zzd((zzlb) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzmi zzmiVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzlb.zzbK(method2, zzmiVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzlb.zzbK(method, zzmiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbK = zzlb.zzbK(method4, zzmiVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbK instanceof Boolean) {
                            if (((Boolean) objZzbK).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzbK);
                            }
                        } else if (objZzbK instanceof Integer) {
                            if (((Integer) objZzbK).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzbK);
                            }
                        } else if (objZzbK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbK).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzbK);
                            }
                        } else if (!(objZzbK instanceof Double)) {
                            if (objZzbK instanceof String) {
                                zEquals = objZzbK.equals("");
                            } else if (objZzbK instanceof zzka) {
                                zEquals = objZzbK.equals(zzka.zzb);
                            } else if (objZzbK instanceof zzmi) {
                                if (objZzbK != ((zzmi) objZzbK).zzbV()) {
                                    zzb(sb, i, strSubstring, objZzbK);
                                }
                            } else if (!(objZzbK instanceof Enum) || ((Enum) objZzbK).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzbK);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzbK);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbK).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzbK);
                        }
                    } else if (((Boolean) zzlb.zzbK(method5, zzmiVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzbK);
                    }
                }
            }
            i2 = 3;
        }
        if (zzmiVar instanceof zzky) {
            throw null;
        }
        zznl zznlVar = ((zzlb) zzmiVar).zzc;
        if (zznlVar != null) {
            zznlVar.zzi(sb, i);
        }
    }
}

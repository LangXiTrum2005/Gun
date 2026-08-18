package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.umeng.analytics.pro.cw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f1282a;
    private static Map<Character, Character> b;
    private static byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, cw.k, cw.l, cw.m, cw.n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f1282a = map;
        map.put('v', 'A');
        f1282a.put('S', 'B');
        f1282a.put('o', 'C');
        f1282a.put('a', 'D');
        f1282a.put('j', 'E');
        f1282a.put('c', 'F');
        f1282a.put('7', 'G');
        f1282a.put('d', 'H');
        f1282a.put('R', 'I');
        f1282a.put('z', 'J');
        f1282a.put('p', 'K');
        f1282a.put('W', 'L');
        f1282a.put('i', 'M');
        f1282a.put('f', 'N');
        f1282a.put('G', 'O');
        f1282a.put('y', 'P');
        f1282a.put('N', 'Q');
        f1282a.put('x', 'R');
        f1282a.put('Z', 'S');
        f1282a.put('n', 'T');
        f1282a.put('V', 'U');
        f1282a.put('5', 'V');
        f1282a.put('k', 'W');
        f1282a.put('+', 'X');
        f1282a.put('D', 'Y');
        f1282a.put('H', 'Z');
        f1282a.put('L', 'a');
        f1282a.put('Y', 'b');
        f1282a.put('h', 'c');
        f1282a.put('J', 'd');
        f1282a.put('4', 'e');
        f1282a.put('6', 'f');
        f1282a.put('l', 'g');
        f1282a.put('t', 'h');
        f1282a.put('0', 'i');
        f1282a.put('U', 'j');
        f1282a.put('3', 'k');
        f1282a.put('Q', 'l');
        f1282a.put('r', 'm');
        f1282a.put('g', 'n');
        f1282a.put('E', 'o');
        f1282a.put('u', 'p');
        f1282a.put('q', 'q');
        f1282a.put('8', 'r');
        f1282a.put('s', 's');
        f1282a.put('w', 't');
        f1282a.put('/', 'u');
        f1282a.put('X', 'v');
        f1282a.put('M', 'w');
        f1282a.put('e', 'x');
        f1282a.put('B', 'y');
        f1282a.put('A', 'z');
        f1282a.put('T', '0');
        f1282a.put('2', '1');
        f1282a.put('F', '2');
        f1282a.put('b', '3');
        f1282a.put('9', '4');
        f1282a.put('P', '5');
        f1282a.put('1', '6');
        f1282a.put('O', '7');
        f1282a.put('I', '8');
        f1282a.put('K', '9');
        f1282a.put('m', '+');
        f1282a.put('C', '/');
        HashMap map2 = new HashMap();
        b = map2;
        map2.put('A', 'v');
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', 'd');
        b.put('I', 'R');
        b.put('J', 'z');
        b.put('K', 'p');
        b.put('L', 'W');
        b.put('M', 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put('R', 'x');
        b.put('S', 'Z');
        b.put('T', 'n');
        b.put('U', 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put('Y', 'D');
        b.put('Z', 'H');
        b.put('a', 'L');
        b.put('b', 'Y');
        b.put('c', 'h');
        b.put('d', 'J');
        b.put('e', '4');
        b.put('f', '6');
        b.put('g', 'l');
        b.put('h', 't');
        b.put('i', '0');
        b.put('j', 'U');
        b.put('k', '3');
        b.put('l', 'Q');
        b.put('m', 'r');
        b.put('n', 'g');
        b.put('o', 'E');
        b.put('p', 'u');
        b.put('q', 'q');
        b.put('r', '8');
        b.put('s', 's');
        b.put('t', 'w');
        b.put('u', '/');
        b.put('v', 'X');
        b.put('w', 'M');
        b.put('x', 'e');
        b.put('y', 'B');
        b.put('z', 'A');
        b.put('0', 'T');
        b.put('1', '2');
        b.put('2', 'F');
        b.put('3', 'b');
        b.put('4', '9');
        b.put('5', 'P');
        b.put('6', '1');
        b.put('7', 'O');
        b.put('8', 'I');
        b.put('9', 'K');
        b.put('+', 'm');
        b.put('/', 'C');
    }

    public static String a(String str) {
        return p0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : p0.c(str);
    }
}

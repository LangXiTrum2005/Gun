package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class B0 {
    private final ArrayDeque<ByteString> prefixesStack;

    private B0() {
        this.prefixesStack = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ByteString balance(ByteString byteString, ByteString byteString2) {
        doBalance(byteString);
        doBalance(byteString2);
        ByteString byteStringPop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            byteStringPop = new C0(this.prefixesStack.pop(), byteStringPop, null);
        }
        return byteStringPop;
    }

    private void doBalance(ByteString byteString) {
        if (byteString.isBalanced()) {
            insert(byteString);
            return;
        }
        if (!(byteString instanceof C0)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
        }
        C0 c0 = (C0) byteString;
        doBalance(c0.left);
        doBalance(c0.right);
    }

    private int getDepthBinForLength(int i) {
        int iBinarySearch = Arrays.binarySearch(C0.minLengthByDepth, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private void insert(ByteString byteString) {
        A0 a0;
        int depthBinForLength = getDepthBinForLength(byteString.size());
        int iMinLength = C0.minLength(depthBinForLength + 1);
        if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
            this.prefixesStack.push(byteString);
            return;
        }
        int iMinLength2 = C0.minLength(depthBinForLength);
        ByteString byteStringPop = this.prefixesStack.pop();
        while (true) {
            a0 = null;
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                break;
            } else {
                byteStringPop = new C0(this.prefixesStack.pop(), byteStringPop, a0);
            }
        }
        C0 c0 = new C0(byteStringPop, byteString, a0);
        while (!this.prefixesStack.isEmpty()) {
            if (this.prefixesStack.peek().size() >= C0.minLength(getDepthBinForLength(c0.size()) + 1)) {
                break;
            } else {
                c0 = new C0(this.prefixesStack.pop(), c0, a0);
            }
        }
        this.prefixesStack.push(c0);
    }

    public /* synthetic */ B0(A0 a0) {
        this();
    }
}

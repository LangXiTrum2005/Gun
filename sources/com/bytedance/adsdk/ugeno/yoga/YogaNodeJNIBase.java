package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
public abstract class YogaNodeJNIBase extends sLN implements Cloneable {
    private lk JXs;
    private YogaNodeJNIBase LD;
    protected long Lxb;
    private QAg ZU;

    @com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
    private float[] arr;
    private boolean ebl;
    private Object lc;
    private List<YogaNodeJNIBase> lk;

    @com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
    private int mLayoutDirection;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.ebl = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.Lxb = j;
    }

    @com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.lk;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.lk.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.LD = this;
        return yogaNodeJNIBase.Lxb;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void JVA(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void JXs(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void OY(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void QAg(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase LD(int i) {
        List<YogaNodeJNIBase> list = this.lk;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
        yogaNodeJNIBaseRemove.LD = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.Lxb, yogaNodeJNIBaseRemove.Lxb);
        return yogaNodeJNIBaseRemove;
    }

    @com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
    public final float baseline(float f, float f2) {
        return this.JXs.Lxb(this, f, f2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void ebl(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void lc(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    /* JADX INFO: renamed from: lk, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase Lxb(int i) {
        List<YogaNodeJNIBase> list = this.lk;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @com.bytedance.adsdk.ugeno.yoga.Lxb.Lxb
    public final long measure(float f, int i, float f2, int i2) {
        if (JVA()) {
            return this.ZU.Lxb(this, f, nBu.Lxb(i), f2, nBu.Lxb(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    /* JADX INFO: renamed from: nBu, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase LD() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void sLN(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.Lxb, f);
    }

    public boolean JVA() {
        return this.ZU != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public float JXs() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public int Lxb() {
        List<YogaNodeJNIBase> list = this.lk;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public float OY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public Object QAg() {
        return this.lc;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public float ebl() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public float lc() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void nBu(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.Lxb, f);
    }

    private void LD(sLN sln) {
        QAg();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(sLN sln, int i) {
        if (sln instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) sln;
            if (yogaNodeJNIBase.LD == null) {
                if (this.lk == null) {
                    this.lk = new ArrayList(4);
                }
                this.lk.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.LD = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.Lxb, yogaNodeJNIBase.Lxb, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void LD(LD ld) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.Lxb, ld.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void lk(LD ld) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.Lxb, ld.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void LD(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void lk(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void LD(JXs jXs, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.Lxb, jXs.Lxb(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void ZU(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void lk(JXs jXs, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.Lxb, jXs.Lxb(), f);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void ZU() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.Lxb);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void lk() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.Lxb);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public int Lxb(sLN sln) {
        List<YogaNodeJNIBase> list = this.lk;
        if (list == null) {
            return -1;
        }
        return list.indexOf(sln);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(float f, float f2) {
        LD((sLN) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.lk;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.LD(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].Lxb;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.Lxb, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(ZU zu) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.Lxb, zu.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(lc lcVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.Lxb, lcVar.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(ebl eblVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.Lxb, eblVar.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(LD ld) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.Lxb, ld.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(IeN ieN) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.Lxb, ieN.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(VVE vve) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.Lxb, vve.Lxb());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.Lxb, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(JXs jXs, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.Lxb, jXs.Lxb(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(QAg qAg) {
        this.ZU = qAg;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.Lxb, qAg != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.sLN
    public void Lxb(Object obj) {
        this.lc = obj;
    }
}

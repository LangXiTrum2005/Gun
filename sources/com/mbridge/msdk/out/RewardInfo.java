package com.mbridge.msdk.out;

import com.mbridge.msdk.system.NoProGuard;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RewardInfo implements Serializable, NoProGuard {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z, int i) {
        this.isCompleteView = z;
        this.rewardAlertStatus = i;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z) {
        this.isCompleteView = z;
    }

    public void setRewardAlertStatus(int i) {
        this.rewardAlertStatus = i;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardInfo{isCompleteView=");
        sb.append(this.isCompleteView);
        sb.append(", rewardName='");
        sb.append(this.rewardName);
        sb.append("', rewardAmount='");
        sb.append(this.rewardAmount);
        sb.append("', rewardAlertStatus=");
        return DM.k(sb, this.rewardAlertStatus, '}');
    }

    public RewardInfo(boolean z, String str, String str2) {
        this.isCompleteView = z;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z, String str, String str2, int i) {
        this.isCompleteView = z;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i;
    }
}

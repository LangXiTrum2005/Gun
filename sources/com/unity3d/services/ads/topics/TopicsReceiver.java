package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SM;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsReceiver implements OutcomeReceiver<GetTopicsResponse, Exception> {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender iEventSender) {
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final JSONObject formatTopic(Topic topic) throws JSONException {
        AbstractC2995aW.q(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(GetTopicsResponse getTopicsResponse) {
        onResult2(SM.n(getTopicsResponse));
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception exc) {
        AbstractC2995aW.q(exc, "error");
        DeviceLog.debug("GetTopics exception: " + exc);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, exc.toString());
    }

    /* JADX INFO: renamed from: onResult, reason: avoid collision after fix types in other method */
    public void onResult2(GetTopicsResponse getTopicsResponse) {
        AbstractC2995aW.q(getTopicsResponse, "result");
        JSONArray jSONArray = new JSONArray();
        List topics = getTopicsResponse.getTopics();
        AbstractC2995aW.p(topics, "result.topics");
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic topicO = SM.o(it.next());
            AbstractC2995aW.p(topicO, "it");
            jSONArray.put(formatTopic(topicO));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String string = jSONArray.toString();
        AbstractC2995aW.p(string, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, string);
    }
}

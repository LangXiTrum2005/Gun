package com.unity3d.services.core.log;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes4.dex */
class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        String className;
        String methodName;
        int lineNumber;
        String strConcat = this._originalMessage;
        StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            className = stackTraceElement.getClassName();
            methodName = this._stackTraceElement.getMethodName();
            lineNumber = this._stackTraceElement.getLineNumber();
        } else {
            className = "UnknownClass";
            methodName = "unknownMethod";
            lineNumber = -1;
        }
        if (strConcat != null && !strConcat.isEmpty()) {
            strConcat = " :: ".concat(strConcat);
        }
        if (strConcat == null) {
            strConcat = "";
        }
        return className + "." + methodName + "()" + AbstractC5044xl.g(" (line:", lineNumber, ")") + strConcat;
    }
}

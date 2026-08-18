package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.f9a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ComponentActivity.ReportFullyDrawnExecutorApi16Impl) obj).lambda$execute$0();
                break;
            case 1:
                ((ComponentActivity) obj).invalidateMenu();
                break;
            case 2:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) obj);
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) obj);
                break;
        }
    }
}

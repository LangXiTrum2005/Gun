package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner) {
            AbstractC2995aW.q(savedStateRegistryOwner, "owner");
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                ViewModel viewModel = viewModelStore.get(it.next());
                AbstractC2995aW.n(viewModel);
                LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, savedStateRegistryOwner.getLifecycle());
            }
            if (!viewModelStore.keys().isEmpty()) {
                savedStateRegistry.runOnNextRecreation(OnRecreation.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void attachHandleIfNeeded(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        AbstractC2995aW.q(viewModel, "viewModel");
        AbstractC2995aW.q(savedStateRegistry, "registry");
        AbstractC2995aW.q(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.isAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        INSTANCE.tryToAddRecreator(savedStateRegistry, lifecycle);
    }

    public static final SavedStateHandleController create(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        AbstractC2995aW.q(savedStateRegistry, "registry");
        AbstractC2995aW.q(lifecycle, "lifecycle");
        AbstractC2995aW.n(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.Companion.createHandle(savedStateRegistry.consumeRestoredStateForKey(str), bundle));
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        INSTANCE.tryToAddRecreator(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    private final void tryToAddRecreator(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            savedStateRegistry.runOnNextRecreation(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.tryToAddRecreator.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    AbstractC2995aW.q(lifecycleOwner, "source");
                    AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        savedStateRegistry.runOnNextRecreation(OnRecreation.class);
                    }
                }
            });
        }
    }
}

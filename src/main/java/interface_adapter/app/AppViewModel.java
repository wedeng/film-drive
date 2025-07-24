package interface_adapter.app;

import interface_adapter.ViewModel;

/**
 * The ViewModel for the AppView.
 */
public class AppViewModel extends ViewModel<AppPageState> {

    public AppViewModel() {
        super("app");
        setState(new AppPageState());
    }

}

package interface_adapter.app;

/**
 * The State for the app.
 */
public class AppPageState {

    private AppPage page = AppPage.DISCOVER;
    private String error;

    public AppPage getPage() {
        return page;
    }

    public void setPage(AppPage page) {
        this.page = page;
    }

    public void setError(String errorMessage) {
        this.error = errorMessage;
    }

    public String getError() {
        return error;
    }
}

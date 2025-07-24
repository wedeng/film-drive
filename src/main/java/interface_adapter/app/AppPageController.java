package interface_adapter.app;

import use_case.note.NoteInputBoundary;

/**
 * Controller for app page related Use Cases.
 */
public class AppPageController {

    private final NoteInputBoundary noteInteractor;

    public AppPageController(NoteInputBoundary noteInteractor) {
        this.noteInteractor = noteInteractor;
    }

    /**
     * Executes app page related Use Cases.
     * @param page the page to be recorded
     */
    public void execute(String page) {
        if (page != null) {
            // TODO: Convert the given page into a certain execution of the search use case
//            noteInteractor.executeSave(page);
        }
        else {
            noteInteractor.executeRefresh();
        }
    }
}

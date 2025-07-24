package use_case.watchlist;

public interface MovieOutputBoundary {
    void prepareSearchSuccessView(MovieSearchOutputData outputData);
    void prepareAddToSavedMoviesSuccessView(String message);
    void prepareFailView(String errorMessage);
}
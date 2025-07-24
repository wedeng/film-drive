package use_case.movie;

public interface MovieOutputBoundary {
    void prepareSearchSuccessView(MovieSearchOutputData outputData);
    void prepareAddToSavedMoviesSuccessView(String message);
    void prepareFailView(String errorMessage);
}
package use_case.movie;

public interface MovieInputBoundary {
    void executeSearch(MovieSearchInputData inputData);
    void executeAddToSavedMovies(int movieId);
}
package use_case.watchlist;

public interface MovieInputBoundary {
    void executeSearch(MovieSearchInputData inputData);
    void executeAddToSavedMovies(int movieId);
}
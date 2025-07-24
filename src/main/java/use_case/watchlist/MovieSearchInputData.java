package use_case.watchlist;

public class MovieSearchInputData {
    private final String searchQuery;

    public MovieSearchInputData(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public String getSearchQuery() {
        return searchQuery;
    }
}
package use_case.recommendation;

import java.util.List;

import entity.Movie;

public class RecommendationOutputData {
    private final int accountId;

    private List<Movie> recommendedMovies;

    private final boolean isSuccessful;

    public RecommendationOutputData(int accountId, List<Movie> recommendedMovies,
                                    boolean isSuccessful) {
        this.accountId = accountId;
        this.recommendedMovies = recommendedMovies;
        this.isSuccessful = isSuccessful;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public List<Movie> getRecommendedMovies() {
        return this.recommendedMovies;
    }

    public boolean getSuccessful() {
        return this.isSuccessful;
    }
}

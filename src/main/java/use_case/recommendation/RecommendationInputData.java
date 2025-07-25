package use_case.recommendation;

import java.util.List;

/**
 * Input Data for the recommendation use case.
 */

public class RecommendationInputData {
    private final int accountId;
    private int maxRecommendations;
    private List<Integer> watchedMovieIds;

    public RecommendationInputData(int accountId, List<Integer> watchedMovieId, int maxRecommendations) {
        this.accountId = accountId;
        this.watchedMovieIds = watchedMovieId;
        this.maxRecommendations = maxRecommendations;   
    }

    public int getAccountId() {
        return this.accountId;
    }

    public int getMaxRecommendations() {
        return this.maxRecommendations;
    }

    public List<Integer> getWatchedMovieIds() {
        return this.watchedMovieIds;
    }
}

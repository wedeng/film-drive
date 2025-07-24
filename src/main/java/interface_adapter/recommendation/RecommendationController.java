package interface_adapter.recommendation;

import java.util.List;

import use_case.recommendation.RecommendationInputBoundary;
import use_case.recommendation.RecommendationInputData;

public class RecommendationController {
    private final RecommendationInputBoundary recommendationInputBoundary;

    public RecommendationController(RecommendationInputBoundary recommendationInputBoundary) {
        this.recommendationInputBoundary = recommendationInputBoundary;
    }

    /**
     * Executes the recommendation Use Case.
     * @param accountId accountId of AppUser who requests a recommendation.
     * @param watchedMovieId a list of the AppUsers watched Movie Ids.
     * @param maxRecommendations the movie recommendation count.
     */
    public void execute(int accountId, List<Integer> watchedMovieId, int maxRecommendations) {
        final RecommendationInputData recommendationInputData = new RecommendationInputData(accountId,
                watchedMovieId, maxRecommendations);
        recommendationInputBoundary.executeRecommendation(recommendationInputData);
    }
}


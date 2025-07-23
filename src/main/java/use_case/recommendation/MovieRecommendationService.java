package use_case.recommendation;

import java.util.List;

import entity.Movie;

/**
 * An interface of the recommendation service we provide.
 */

public interface MovieRecommendationService {
    /**
     * List of recommended Movies given a Movie.
     * @param movieId the id of a given movie.
     * @return A list of recommended movies.
     */
    List<Movie> recommendMovies(int movieId);
}

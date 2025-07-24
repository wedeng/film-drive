package use_case.movie;

import entity.Movie;
import entity.AppUser;
import java.util.List;

public interface MovieDataAccessInterface {
    List<Movie> searchMovies(String query) throws DataAccessException;
    void addToWatchList(AppUser user, int movieId) throws DataAccessException;
    AppUser getCurrentUser() throws DataAccessException;
}
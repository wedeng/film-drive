package use_case.movie;

import entity.Movie;
import java.util.List;

public class MovieSearchOutputData {
    private final List<Movie> movies;

    public MovieSearchOutputData(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
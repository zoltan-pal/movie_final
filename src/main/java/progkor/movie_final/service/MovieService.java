package progkor.movie_final.service;

import progkor.movie_final.data.model.Movie;

import java.util.List;

public interface MovieService {

    /*
     * TODO.
     *@param movies TODO.
     *@return TODO.
     * */
    Movie createMovie(Movie movie); //create

    Movie retrieveByMovieId(Long id); //read
    List<Movie> retrieveAllMovie(); // read

    Movie update(Movie movie); // update

    void deleteMovieById(Long id); // delete
}

import java.util.ArrayList;
// Övning B, sorterar listan i omvänd ordning
public class ReverseMovieRepository implements MovieRepository {

    private final ArrayList<Movie> movies = new ArrayList<>();

    @Override
    public void add(Movie movie) {
        movies.add(movie);
    }

    @Override
    public ArrayList<Movie> getAll() {
        ArrayList<Movie> reversedMovies = new ArrayList<>();

        for (int index = movies.size() - 1; index >= 0; index--) {
            reversedMovies.add(movies.get(index));
        }

        return reversedMovies;
    }
}
import java.util.ArrayList;

public class ConsoleMovieRepository implements MovieRepository{
    private final ArrayList<Movie> movies = new ArrayList<>(); // Här finns samlingen i minnet.

    @Override
    public void add (Movie movie) {
        movies.add(movie); // Här lagras filmobjektet i listan
    }

    @Override
    public ArrayList<Movie> getAll() {
        return movies; // Här lämnas samma lista tillbaka
    }
}

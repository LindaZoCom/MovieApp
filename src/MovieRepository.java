import java.util.ArrayList;

public interface MovieRepository {
    void add(Movie movie); // Accepterar FeatureFilm och Documentary genom Movie-typen.
    ArrayList<Movie> getAll(); // Anger vilken typ som returneras.
}

import java.util.ArrayList;

public class MovieApp {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new FeatureFilm("Shrek", 90, "Animation"));
        movies.add(new FeatureFilm("Sista natten med gänget", 110, "Drama"));
        movies.add(new FeatureFilm("Nyckeln till frihet", 140, "Drama"));
        movies.add(new Documentary("Övningsdokumentären", 55, "Filmhistoria"));

        for (Movie movie : movies) {
            System.out.println(movie.describe());

        }
    }
}
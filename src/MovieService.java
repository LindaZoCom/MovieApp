import java.util.ArrayList;

public class MovieService { // Serviceklassen känner till kontraktet MovieRepository, inte en specifik implementation.
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository; // Samma repository sparas i servicefältet
    }

    public void addMovie(Movie movie) {
        movieRepository.add(movie); // Skickar filmen vidare till repository
    }

    public void printAllMovies() {
        ArrayList<Movie> movies = movieRepository.getAll(); // Här hämtar vi lagrade filmer
        for (Movie movie : movies) {
            System.out.println(movie.describe()); // Skriver rätt filmtyps beskrivning (describe)
        }
    }
    public int getMovieCount() {
        return movieRepository.getAll().size();
    }
    // --------------------------------------------------------
    // ÖVNING DEL 1
    // Den ska:
    // - Söka efter filmer där titeln innehåller searchText.
    // - Inte bry sig om stora/små bokstäver.
    // - Skriva ut describe() för varje träff.
    // - Skriva "Inga filmer hittades." om ingen film matchar.
    // --------------------------------------------------------
    public void printMoviesMatching(String searchText) {
        ArrayList<Movie> movies = movieRepository.getAll();

        boolean foundMatch = false;

        for (Movie movie : movies) {
            String title = movie.getTitle().toLowerCase();
            String search = searchText.toLowerCase();

            if (title.contains(search)) {
                System.out.println(movie.describe());
                foundMatch = true;
            }
        }

        if (!foundMatch) {
            System.out.println("Inga filmer hittades.");
        }
    }
}

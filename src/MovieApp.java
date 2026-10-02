import java.util.ArrayList;

public class MovieApp {
    public static void main(String[] args) {
       MovieRepository movieRepository = new ConsoleMovieRepository(); //Skapar EN lagringsinstans
        MovieService movieService = new MovieService(movieRepository); // Skickar in samma instans
        movieService.addMovie(new FeatureFilm("Shrek", 90, "Animation")); // Startar lagringskedjan
        movieService.addMovie(new Documentary("Övningsdokumentär", 55, "Filmhistoria")); //Lagrar en annan Movie-typ
        movieService.addMovie(new FeatureFilm("Sista natten med gänget (American Graffiti)", 110, "drama"));
        movieService.addMovie(new FeatureFilm("Nyckeln till frihet", 142, "drama"));
        movieService.addMovie(new Documentary("The Act of Killing", 159, "Indonesiens historia"));

//        System.out.println("Filmer i listan: " + movieRepository.getAll().size()); //Visar vi lagringen före utskrift
        System.out.println("=== Alla filmer ===");
        movieService.printAllMovies(); // Visar vad som finns i listan
        System.out.println();
        System.out.println("Antal filmer: " + movieService.getMovieCount());

        // ----------------------------------------------------
        // ÖVNING DEL 2
        // Kör en sökning som ger exakt en träff.
        // ----------------------------------------------------
        System.out.println();
        System.out.println("=== Sökning: Shrek ===");
        movieService.printMoviesMatching("Shrek");

        // ----------------------------------------------------
        // ÖVNING DEL 3
        // Kör en sökning som använder en del av en titel.
        // Här ska båda titlarna med "natten" eller "frihet"
        // testas beroende på vilken sökning gruppen väljer.
        // Byt gärna till egna sökord.
        // ----------------------------------------------------
        System.out.println();
        System.out.println("=== Sökning: natt ===");
        movieService.printMoviesMatching("natt");

        // ----------------------------------------------------
        // ÖVNING DEL 4
        // Kontrollera att sökningen inte bryr sig om stora
        // och små bokstäver.
        // ----------------------------------------------------
        System.out.println();
        System.out.println("=== Sökning: SHREK ===");
        movieService.printMoviesMatching("SHREK");

        // ----------------------------------------------------
        // ÖVNING DEL 5
        // Testa ett sökord som inte finns i någon titel.
        // Programmet ska då skriva:
        // Inga filmer hittades.
        // ----------------------------------------------------
        System.out.println();
        System.out.println("=== Sökning: rymdskepp ===");
        movieService.printMoviesMatching("rymdskepp");
    }
}
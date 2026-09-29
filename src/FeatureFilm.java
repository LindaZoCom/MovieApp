public class FeatureFilm extends Movie {
    private final String genre;

    public FeatureFilm(String title, int durationMinutes, String genre) {
        super(title, durationMinutes);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String describe() {
        return "Spelfilm: " + basicInfo() + ",genre: " + genre;
    }
}

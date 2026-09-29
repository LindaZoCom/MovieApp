public abstract class Movie {
    private final String title;
    private final int durationMinutes;

    public Movie(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    protected String basicInfo() {
        return title + "(" + durationMinutes + " min)";
    }

    public abstract String describe();
    }



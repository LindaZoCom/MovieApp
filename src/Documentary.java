public class Documentary extends Movie {
    private final String topic;

    public Documentary(String title, int durationMinutes, String topic) {
        super(title, durationMinutes);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String describe() {
        return "Dokumentär: " + basicInfo() + ", ämne: " + topic;
    }
}

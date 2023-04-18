package by.tms.models;

public class Series extends Show {

    private String lastEpisode;
    private int numberOfSeasons;
    private int numberOfEpisodes;

    public void setLastEpisode(String lastEpisode) {
        this.lastEpisode = lastEpisode;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        if (numberOfSeasons > 0) {
            this.numberOfSeasons = numberOfSeasons;
        } else {
            throw new RuntimeException("Количество сезонов должно быть больше нуля");
        }
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        if (numberOfEpisodes > 0) {
            this.numberOfEpisodes = numberOfEpisodes;
        } else {
            throw new RuntimeException("Количество серий должно быть больше нуля");
        }
    }

    @Override
    public String toString() {
        return "Название: " + super.getShowTitle() +
                ", Год выпуска: " + super.getReleaseYear() +
                ", Последний сезон: " + lastEpisode +
                ", Страна производства: " + super.getCountryCode() +
                ", Количество сезонов: " + numberOfSeasons +
                ", Количество серий: " + numberOfEpisodes +
                ", Рейтинг фильма: " + super.getRating() +
                ", Количество проголосовавших: " + super.getRatesCounter();
    }
}

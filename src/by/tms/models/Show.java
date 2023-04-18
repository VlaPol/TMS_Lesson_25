package by.tms.models;

public abstract class Show {

    private String showTitle;
    private int releaseYear;
    private String countryCode;
    private double rating;
    private int ratesCounter;

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear > 1800) {
            this.releaseYear = releaseYear;
        } else {
            throw new RuntimeException("Проверьте значение введенного года");
        }
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0) {
            this.rating = rating;
        } else {
            throw new RuntimeException("Рейтинг не может быт отрицательным");
        }
    }

    public int getRatesCounter() {
        return ratesCounter;
    }

    public void setRatesCounter(int ratesCounter) {
        if (ratesCounter >= 0) {
            this.ratesCounter = ratesCounter;
        } else {
            throw new RuntimeException("Количество проголосовавших не может быт отрицательным");
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "showTitle='" + showTitle + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", rating=" + rating +
                ", ratesCounter=" + ratesCounter +
                '}';
    }

}

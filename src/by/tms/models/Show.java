package by.tms.models;

public abstract class Show {

    private String showTitle;
    private String releaseYear;
    private String countryCode;
    private double rating;
    private int ratesCounter;

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
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
        this.rating = rating;
    }

    public int getRatesCounter() {
        return ratesCounter;
    }

    public void setRatesCounter(int ratesCounter) {
        this.ratesCounter = ratesCounter;
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

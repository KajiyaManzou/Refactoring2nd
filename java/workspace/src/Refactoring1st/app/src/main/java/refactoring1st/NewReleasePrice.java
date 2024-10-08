package refactoring1st;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int dayRented) {
        return dayRented * 3;
    }

    public int getFrequentRentalPoints(int dayRented) {
        return (dayRented > 1) ? 2 : 1;
    }
}

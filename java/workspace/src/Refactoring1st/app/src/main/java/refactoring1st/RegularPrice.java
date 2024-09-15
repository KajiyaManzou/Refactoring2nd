package refactoring1st;

public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }
    public double getCharge(int dayRented) {
        double result = 2;
        if (dayRented > 2)
            result += (dayRented - 2) * 2.5;
        return result;
    }
}

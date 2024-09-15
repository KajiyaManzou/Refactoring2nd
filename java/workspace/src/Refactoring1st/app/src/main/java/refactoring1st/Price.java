package refactoring1st;

abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int dayRented);
    public int getFrequentRentalPoints(int dayRented) {
        return 1;
    }
}

package refactoring1st;

abstract class Price {
    abstract int getPriceCode();

    public double getCharge(int dayRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (dayRented > 2)
                    result += (dayRented - 2) * 2.5;
                break;
            case Movie.NEW_RELEASE:
                result += dayRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (dayRented > 3)
                    result += (dayRented - 3) * 1.5;
                break;
        }
        return result;
    }
}

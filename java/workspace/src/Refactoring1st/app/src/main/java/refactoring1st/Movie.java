package refactoring1st;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch(arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("不正な料金コード");
        }
    }
    
    public String getTitle() {
        return _title;
    }

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

    public int getFrequentRentalPoints(int dayRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && dayRented > 1)
            return 2;
        else 
            return 1;
}
}
public enum Months {
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(30, Season.SPRING),
    APRIL(31, Season.SPRING),
    MAY(30, Season.SPRING),
    JUNE(31, Season.SUMMER),
    JULY(30, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER),
    UNKNOWN();

    private int days;
    private Season season;

    Months(int days, Season season) {
        this.days = days;
        this.season = season;
    }

    Months() {
    }

    public static Months parse(String month) {
        Months result;
        try {
            result = month == null ? null : Months.valueOf(month);
        } catch (IllegalArgumentException e) {
            result = UNKNOWN;
        }
        return result;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }
}

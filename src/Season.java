public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN,
    UNKNOWN;

    Season() {
    }

    public static Season parse(String season) {
        Season result;
        try {
            result = season == null ? null : Season.valueOf(season);
        } catch (IllegalArgumentException e) {
            result = UNKNOWN;
        }
        return result;
    }

}

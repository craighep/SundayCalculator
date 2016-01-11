package sundaycounter;

/**
 * Enum representing a day. Allows a day to be initialised, and the day to be
 * retrieved using its day of the week number.
 *
 * @author Craig
 */
public enum Day {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private int value;

    private Day(int value) {
        this.value = value;
    }

    /**
     * Gets the day from the enum using the day in the week number.
     *
     * @param value Day in the week number
     * @return day Day corresponding to the number in a week
     */
    static Day fromValue(int value) {
        for (Day my : Day.values()) {
            if (my.value == value) {
                return my;
            }
        }
        return null;
    }

    /**
     * Gets the day's number in the week.
     *
     * @return value Day number in the week
     */
    public int getValue() {
        return this.value;
    }
}

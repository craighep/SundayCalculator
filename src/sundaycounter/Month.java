package sundaycounter;

/**
 * Class represents a month. Has methods to get any given day based on the day
 * number, and get the last day of the month.
 *
 * @author Craig
 */
public class Month {

    private int days;
    private int start;

    /**
     * Initialises the month, and decides how many days is in the month. Sets
     * the start day for that month also.
     *
     * @param month The month number
     * @param startDay The day this month starts on
     * @param isLeapYear Flag for signifying if February has an extra day
     */
    public Month(int month, Day startDay, boolean isLeapYear) {
        switch (month) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 10:
            case 11:
                this.days = 31;
                break;
            case 3:
            case 5:
            case 8:
            case 9:
                this.days = 30;
                break;
            case 1:
                if (isLeapYear) {
                    this.days = 29;
                } else {
                    this.days = 28;
                }
                break;
        }
        this.start = startDay.getValue();
    }

    /**
     * Takes in the number day of that month, and returns the day corresponding,
     * based from the start day.
     *
     * @param month The month number
     * @return day Day with the value provided for this month
     */
    public Day getDay(int dayVal) {
        int startDay = (dayVal + this.start) % 7; // calculate remainder taking into account start day
        return Day.fromValue(startDay);
    }

    /**
     * Returns the starting day for the month following this one.
     *
     * @return day The day at the start of a following month
     */
    public Day getNextStartDay() {
        return getDay(this.days + 1);
    }
}

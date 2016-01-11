package sundaycounter;

/**
 * Represents a year. Includes methods to calculate the number of Sundays
 * starting any months, and the capability to calculate the day starting the
 * next year.
 *
 * @author Craig
 */
class Year {

    private int year;
    private Day currentDay;
    private boolean isLeapYear = false;

    /**
     * Initialises the year, also checking if it is a leap year.
     *
     * @param startDay The day the year starts with
     * @param year The year
     */
    public Year(Day startDay, int year) {
        currentDay = startDay;
        this.year = year;
        if (year % 400 == 0) {
            isLeapYear = true;
        }
    }

    /**
     * Loops through all months in the year and checks if any starts with
     * Sunday.
     *
     * @return sundays Number of sundays in the year
     */
    public int calculateSundays() {
        int sundays = 0;
        Month month;
        for (int i = 0; i < 12; i++) {
            month = new Month(i, currentDay, isLeapYear);
            if (month.getDay(0) == Day.SUNDAY) {
                sundays++;
            }
            currentDay = month.getNextStartDay(); // start next month with this
        }
        return sundays;
    }

    /**
     * Returns the day to start the next year with.
     *
     * @return currentDay Day following on from this year
     */
    public Day getNextStartDay() {
        return currentDay;
    }

}

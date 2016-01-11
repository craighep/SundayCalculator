package sundaycounter;

/**
 * Takes in a start and end year, and outputs the number of months with Sunday
 * as the first month.
 *
 * @author Craig
 */
public class SundayCounter {

    static final int STARTYEAR = 1901;
    static final int ENDYEAR = 2000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year year;
        int sundayCount = 0;
        Day startDay = Day.MONDAY;
        int currentYear = STARTYEAR;

        while (currentYear <= ENDYEAR) {
            year = new Year(startDay, currentYear++);
            sundayCount += year.calculateSundays();
            startDay = year.getNextStartDay();
        }
        System.out.println("Sundays on first of the month between period: " + sundayCount);
    }
}

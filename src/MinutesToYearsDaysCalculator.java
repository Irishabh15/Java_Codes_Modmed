public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else{
            int minutesInYear = 365*24*60;
            long years = (long) (minutes / minutesInYear);
            int days = (int) (minutes / 60 / 24) % 365;
            System.out.println(minutes +" min" + " = " +years+ " y and " +days+" d ");
        }
    }

}
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true)
        {
            boolean getInt = sc.hasNextInt();
            if(getInt)
            {
                int n = sc.nextInt();
                sum = sum+n;
                count++;
            }
            else{
                break;
            }
        }
        long avg = (Math.round((double)sum/count));
        System.out.println("SUM = "+sum+" AVG = "+avg);

    }
}

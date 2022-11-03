public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        if(number<0)
        {
            return -1;
        }
        else
        {

            while(number!=0)
            {
                int num = number%10;
                int rem = number/10;
                number = rem;
                if(num%2==0)
                {
                    sum =  sum+num;
                }
            }
        }
        return sum;
    }
}
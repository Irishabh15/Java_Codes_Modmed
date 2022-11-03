public class NumberToWords {
    static String[] sArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void numberToWords(int number)
    {

        if(number<0)
        {
            System.out.println("Invalid Value");
        }

        else if(number==0 || number<10){
            System.out.println(sArr[number]);
        }

        else{
            int trailingZeroes = Integer.numberOfTrailingZeros(number);
            while(trailingZeroes!=0)
            {
                System.out.print("Zero ");
            }
            int a = reverse(number);
            while(a!=0)
            {
                int lst = a%10;
                System.out.print(sArr[lst] + " ");
                a = a/10;
            }

        }

    }

    public static int reverse(int number)
    {
        int revNum = 0;
        int num = number;
        int num1=0;
        if(number<0)
        {
            num1 = -1*number;
        }
        else{
            num1=number;
        }
        while(num1!=0)
        {
            revNum = revNum*10 + num1%10;;
            num1 = num1/10;
        }

        return num<0 ? -1*revNum : revNum;
    }

    public static int getDigitCount(int number)
    {
        int count=0;
        if(number<0)
        {
            return -1;
        }
        else if(number==0)
        {
            return 1;
        }
        else{

            while(number!=0)
            {
                int lst = number%10;
                count++;
                number = number/10;
            }
        }
        return count;
    }


}
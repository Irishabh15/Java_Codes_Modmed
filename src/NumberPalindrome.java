public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if(number<10){
            return true;
        }

        int num = number;
        int res = 0;
        while(num!=0){
            res = (res*10) + (num%10);
            num = num / 10;
        }

        return res == number;
    }
}

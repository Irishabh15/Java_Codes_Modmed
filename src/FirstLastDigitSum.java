public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        if(number>=0 && number<10){
            return number*2;
        }

        String nStr = Integer.toString(number);
        int fd = Integer.parseInt(nStr.charAt(0)+"");
        int ld = number%10;

        return  fd+ld;

    }
}
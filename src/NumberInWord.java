public class NumberInWord {
    static String[] arr = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
    public static void printNumberInWord(int num){
        if(num<0 || num>=10){
            System.out.println("OTHER");
        }

        else{
            System.out.println(arr[num]);
        }
    }
}

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int frsta = a/10;
        int lasta = a%10;
        int frstb = b/10;
        int lastb = b%10;


        if(str1.length()==2 && str2.length()==2)
        {
            if(frsta == frstb || frsta == lastb || lasta == frstb || lasta == lastb)
            {
                return true;
            }

        }
        return false;
    }
}
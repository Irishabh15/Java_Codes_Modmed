public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount<0 || goal<0) return false;
        int weight = 5*bigCount + smallCount;
        if(weight == goal) return true;

        else {
            if(weight > goal && smallCount >= goal%5) return true;
            else if (bigCount == 0 && smallCount >= goal) return true;
            else return false;

        }
    }
}
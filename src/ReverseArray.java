import java.util.Arrays;
public class ReverseArray {
    private static void reverse(int[] array){
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            temp[j] = array[i];
            j++;
        }
        System.out.print("Array = ");
        System.out.println(Arrays.toString(array));
        System.out.print("Reversed array = ");
        System.out.println(Arrays.toString(temp));
    }

}
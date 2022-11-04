import java.util.Scanner;
public class MinimumElement {

    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        return elements;
    }

    private static int[] readElements(int elements){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[elements];
        for(int i=0;i<elements;i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static int findMin(int[] arr){
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mn){
                mn = arr[i];
            }
        }

        return mn;
    }
}
package difficult;

import java.lang.reflect.Array;

public class BubbleSort {
    public static void sort(int[] arr){
     int n = arr.length;
     int temp;

        for(int i = 0; i < n; i++ ){
            for (int j = 1; j < n-i; j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
            for( int a : arr){
              System.out.print(a + " ");
            }
            System.out.println();
        }
        for( int a : arr){

                System.out.print(a + " ");
            }

    }

public static void main(String[] args){
        int [] arr = {4,9,5,1,56,47};
        sort(arr);
}
}

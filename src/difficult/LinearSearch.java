package difficult;

public class LinearSearch {
    public static int search(int[]a, int key){
        int index = -1;
        int length = a.length;
       for(int i = 0; i < length; i++ ){
           if(a[i] == key){
               index = i;

           }
       }

        return index;
    }
    public static void main (String[]args){
        int numbers[] = {45,78,98,34,28,90};
       int pos = search(numbers, 88);
       System.out.println(pos);

    }
}

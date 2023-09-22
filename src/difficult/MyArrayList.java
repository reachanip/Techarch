package difficult;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MyArrayList {
    public static void main (String[]args){
        String para = "my name is Anindita";
        System.out.println(para.getBytes(StandardCharsets.UTF_8));//("Anindita","*******"));
        System.out.println(para);
        int i = 5;
        Integer j = 5;
        j = i;
        ArrayList <Integer> cars = new ArrayList <Integer>();
    }
}

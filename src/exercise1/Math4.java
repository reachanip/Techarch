package exercise1;

public class Math4 {
    public static int area(int width, int height){
        int area = width * height;
        return area;
    }
    public static int perimeter(int width, int height){
        int perimeter = 2 * (width + height);
        return perimeter;
    }
public static void main (String[] args){
        System.out.println(area(3, 4));
        System.out.println(perimeter(3, 4));
}

}

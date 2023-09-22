package difficult;

public class SumFromString {
    public static int sum(String s){
        int sum = 0;
        char x;
        for(int i = 0; i < s.length(); i++){
            x = s.charAt(i);
            if(x >= '0' && x <= '9') {
                x = s.charAt(i);
                sum += x - '0';
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int sum = sum("Ani678");
        System.out.println(sum);
    }
}

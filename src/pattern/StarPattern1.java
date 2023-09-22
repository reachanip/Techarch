package pattern;

public class StarPattern1 {
    public static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            if(i <= n/2) {
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j = 0; j <= n-i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void pattern2(int n) {
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-(n/2); i <= n ; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        //pattern1(20);
        pattern2(20);
    }
}

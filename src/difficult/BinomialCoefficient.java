package difficult;

public class BinomialCoefficient {
    public int factorial(int a){
        int f = 1;
       for(int i = 1; i <= a ; i++){
           f *= i;
       }
        return f;
    }
    public  int binCoe(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int c = fact_n / (fact_r * fact_nmr);
        return c;
    }
    public static void main (String[] args){
        BinomialCoefficient bc = new BinomialCoefficient();
        int binCoe = bc.binCoe(5, 2);
        System.out.println(binCoe);
    }

}

package Recursion.Basic;

public class Sum {
    // By Parameterised method
    // static void printSum(int i,int sum){
    //     if(i<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     printSum(i-1, sum+i);
    // }
    // public static void main(String[] args) {
    //     printSum(3,0);
    // }



    // By functional method
    // static int printSum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n + printSum(n-1);
    // }
    // public static void main(String[] args) {
    //    System.out.println(printSum(3)); 
    // }



    // Factorial
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
       System.out.println(fact(4)); 
    }
}

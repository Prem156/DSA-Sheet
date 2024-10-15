package Recursion.Basic;
import java.util.*;
public class basic {
//     static int count = 0;   //! use static keyword with global variable. not use inside the function call.
//     static void printNumber(){
//         if(count==3){
//             return;
//         }
//         System.out.println(count);
//         count++;
//         printNumber();
//     }



//     static void printName(int i,int n,String name){
//         if(i>n){
//             return;
//         }
//         System.out.println(name);
//         printName(i+1,n, name);
//     }


     
//     public static void main(String[] args) {
//         // printNumber();
//         int n;
//         String name;

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of times to print the name: ");
//         n = sc.nextInt();  // Read integer input for n

//         sc.nextLine();  // Consume the leftover newline character

//         System.out.print("Enter the name: ");
//         name = sc.nextLine();  // Read the string input for name

//         printName(1, n, name);  // Initial call with i = 1
//     }



// static void printRevNum(int i,int n){
//     if(i<1){
//         return;
//     }
//     System.out.println(i);
//     printRevNum(i-1, n);
// }
// public static void main(String[] args) {
//     int n;
//     Scanner sc = new Scanner (System.in);
//     n = sc.nextInt();
//     printRevNum(n,n);
// }



// // Print 1 to N with backtarck
// static void printNum(int i,int n){
//     if(i<1){
//     return;
//     }
//     printNum(i-1, n);
//     System.out.println(i);
// }
// public static void main(String[] args) {
//     int n = 5;
//     printNum(n,n);
// }




// Print N to 1 with backtarck
static void printNum(int i,int n){
    if(i>n){
    return;
    }
    printNum(i+1, n);
    System.out.println(i);
}
public static void main(String[] args) {
    int n = 5;
    printNum(1,n);
}

}

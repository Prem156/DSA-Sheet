import java.util.Scanner;

public class arraySortedOrNot {
    static boolean check_sorted(int n,int[] arr){
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store : ");
        n = sc.nextInt();
        int[] arr = new int[10];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check_sorted(n,arr));
    }
}

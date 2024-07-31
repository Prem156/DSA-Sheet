import java.util.*;
public class second_largest_element {
    static int secondlargest(int [] arr){
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                secondlargest = largest;
                largest = arr[i];
            }
            if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    static int secondsmallest(int[] arr){
        int minvalue = arr[0];
        int secondminimumvalue = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(minvalue > arr[i]){
                secondminimumvalue = minvalue;
                minvalue = arr[i];
            }
            if(arr[i] != minvalue && arr[i] < secondminimumvalue){
                secondminimumvalue = arr[i];
            }
        }
        return secondminimumvalue;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,3};
        System.out.println(secondlargest(arr));
        System.out.println(secondsmallest(arr));
    }
}

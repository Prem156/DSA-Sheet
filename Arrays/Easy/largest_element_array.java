public class largest_element_array {
    static int largest_element(int[] arr) {
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxvalue < arr[i]) {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 10 };
        System.out.println("The largest element in the array is " + largest_element(arr));
    }
}
public class LongestConsecutiveSequence {
    static void consecutiveSequence(int[] arr) {
        int min = 10000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min  == arr[i]) {
                count++;
                min = min + 1;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 100, 600, 3, 2, 1, 4 };
        consecutiveSequence(arr);
    }
}

public class moveZeroes {

    // BRUTE FORCE

    static void movezeroes(int[] arr) {
        int[] temp = new int[arr.length];
        int nz = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[nz] = arr[i];
                nz++;
            }
        }
        for (int i = 0; i < nz; i++) {
            arr[i] = temp[i];
        }
        for (int i = nz; i < arr.length; i++) {
            arr[i] = 0;
        }
    }


    // OPTIMAL APPROACH

    static void move_zeroes(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return ;

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        move_zeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class zeroMatrix {

    static void marksrow(int[][] arr, int n, int m, int i) {
        // Marks all elements of row 'i' as -1
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {  // Don't overwrite existing zeros
                arr[i][j] = -1;
            }
        }
    }

    static void markscol(int[][] arr, int n, int m, int j) {
        // Marks all elements of column 'j' as -1
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {  // Don't overwrite existing zeros
                arr[i][j] = -1;
            }
        }
    }

    static void zeromatrix(int[][] arr, int n, int m) {
        // Traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    // Mark entire row and column where arr[i][j] is 0
                    marksrow(arr, n, m, i);
                    markscol(arr, n, m, j);
                }
            }
        }

        // Set -1s to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }



    //BETTER approach
    static void zeromatrix2(int[][] arr,int n,int m){
        int[] col = {0};
        int[] row = {0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        
        // Call zeromatrix method to modify the input matrix
        // zeromatrix(matrix, 3, 3);
        zeromatrix2(matrix, 3, 3);
        
        // Print the modified matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

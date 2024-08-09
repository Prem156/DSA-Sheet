public class union {
    static int[] FindUnion(int[] arr1,int n,int [] arr2,int m){
        int[] union = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(k==0 || union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(k==0 || union[k-1] != arr2[j]){
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            }
            else{
                if(k==0 || union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
        }

        while(i<n){
            if(k==0 || union[k-1] != arr1[i]){
                union[k] = arr1[i];
                k++;
            }
            i++;
        }
        while(j<m){
            if(k==0 || union[k-1] !=arr2[j]){
                union[k] = arr2[j];
                k++;
            }
            j++;
        }
        int [] result = new int[k];
        for(int x=0;x<k;x++){
            result[x] = union[x];
        }
        return result;
    }
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,5,6,7};
    int[] arr1 = {2,3,4,4,5,8,9,10,11,12};
    int n = arr.length;
    int m = arr1.length;
    int [] arr2 = FindUnion(arr,n, arr1,m);
    for(int i : arr2){
        System.out.print(i + " ");
    }
   } 
}

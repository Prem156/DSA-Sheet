import java.util.*;
public class RearrangeArrayBySign {
    static int[] rearrangeArray(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        for(int i=0;i<arr.length/2;i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    public static ArrayList<Integer> Rearrangearray(ArrayList<Integer> arr){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.size(), 0));
        int posindex = 0;
        int negindex = 1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                ans.set(posindex, arr.get(i));
                posindex +=2;
            }
            else{
                ans.set(negindex, arr.get(i));
                negindex +=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        int [] ans = rearrangeArray(arr);
        // for(int i : ans)
        // System.out.print(i+ " ");

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-4,-5));
        ArrayList<Integer> ans1 = Rearrangearray(A);
        for(int i=0;i<ans1.size();i++){
            System.out.print(ans1.get(i) + " ");
        }
    }
}

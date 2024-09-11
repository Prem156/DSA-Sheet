import java.util.*;
public class LeadersInArray {
    static  ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader) ans.add(arr[i]);

        }
        return ans;
    }


    // Optimal
    static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = arr[arr.length-1];
        ans.add(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > maxi){
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {10,22,12,3,0,6};
        // ArrayList<Integer> ans = leaders(arr);
        // for(int i =0;i<ans.size();i++){
        //     System.out.print(ans.get(i) + " ");
        // }

        ArrayList<Integer> ans1 = leader(arr);
        for(int i =0;i<ans1.size();i++){
            System.out.print(ans1.get(i) + " ");
        }
    }
}

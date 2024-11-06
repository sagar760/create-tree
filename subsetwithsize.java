import java.util.ArrayList;

public class subsetwithsize {
    static void solve(int arr[],ArrayList<ArrayList<Integer>> list,  ArrayList<Integer> ans,int index,int k ,int n){
        //base case
        
        if (index >= n) {
            if (ans.size() == k) {
                list.add(new ArrayList<>(ans)); // add a copy of ans
            }
            return;
        }
        // exclude
        solve(arr, list, ans, index+1, k, n);
        //include
        int current = arr[index];
        ans.add(current);
        solve(arr, list, ans, index+1, k, n); 
        ans.remove(ans.size() - 1); 

    }
    public static void main(String[] args) {
       int k = 2;
       int arr[] ={1,2,3,4};
       int n = arr.length;
       int index  = 0;
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       ArrayList<Integer> ans = new ArrayList<>();
       solve(arr, list, ans, index, k, n);
      

       for(ArrayList<Integer> l:list){
        System.out.println(l);
       }
    

    }
}

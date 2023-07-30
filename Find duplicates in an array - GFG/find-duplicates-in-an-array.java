//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(hs1.contains(arr[i])){
                hs2.add(arr[i]);
            }
            else{
                hs1.add(arr[i]);
            }
        }
        
        for(Integer dupliVal:hs2){
            al.add(dupliVal);
        }
        
        Collections.sort(al);
        
        if(al.size()==0){
            al.add(-1);
        }
        return al;
    }
}

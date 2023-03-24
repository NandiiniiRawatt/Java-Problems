//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Gfg
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a); // sort the ArrayList in non-decreasing order
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) 
        {
            int diff = a.get(i + m - 1) - a.get(i); // calculate the difference between max and min chocolates in packets given to m students
            if (diff < minDiff) 
            {
                minDiff = diff; // update the minimum difference
            }
        }
        return minDiff;
    }
}

Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*
  //solution
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                 System.out.print("*"+"");
            }
            System.out.println();
        }
        for(int k=0;k<n-1;k++)
        {
            for(int l=1;l<n-k;l++)
            {
              System.out.print("*"+"");    
            }
            System.out.println();
        }
    }
}

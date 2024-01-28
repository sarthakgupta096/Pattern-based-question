package Pattern;

 /*Problem statement
 
 Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.

For every value of ‘N’, help sam to print the corresponding Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
2 2 
3 3 3

*/

public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
             int temp=i;
            for(int j=0;j<=i;j++)
            {
            System.out.print(temp+1+" ");
            }
            System.out.println();
        }
    }
}
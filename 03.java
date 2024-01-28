//question link
https://www.codingninjas.com/studio/problems/n-triangles_6573689
package Pattern;

 /*Problem statement
  Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3

*/
public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {

            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*Insertion Sort is a simple sorting technique which was covered in previous challenges. Sometimes, arrays may be too large for us to wait around for insertion sort to finish. Is there some other way we can calculate the number of times Insertion Sort shifts each elements when sorting an array?

If ki is the number of elements over which the ith element of the array has to shift, then the total number of shifts will be k1 +k2 +...+k+...+kN.

Input Format 
The first line contains the number of test cases, T. T test cases follow. The first line for each test case contains N, the number of elements to be sorted. The next line contains NN integers (a[1],a[2], ..., a[N]).

Output Format 
Output T lines containing the required answer for each test case.

Constraints 
1≤T≤15 
1≤N≤100000
1≤a[i]≤10000000

Sample Input

2
5  
1 1 1 2 2  
5  
2 1 3 1 2
Sample Output

0  
4   
Explanation 
The first test case is already sorted, therefore there's no need to shift any element. In the second case, it will proceed in the following way.

Array: 2 1 3 1 2 -> 1 2 3 1 2 -> 1 1 2 3 2 -> 1 1 2 2 3
Moves:   -        1       -    2         -  1            = 4


*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int j=0;j<n;j++){
                ar[j]=in.nextInt();
               // System.out.print(" elem= "+ ar[j]);
                
            }
            //System.out.println(" ");
            long c = insertSort(ar);      
            System.out.println(c);
        }

}
    
    
    public static long insertSort(int[] ar)
    {
    	
    	for (int x=0;x<ar.length;x++)
        {
        	System.out.print(" "+ ar[x]);
        }
       int neighboring_value, marker,temp,shiftcounter;
        
        shiftcounter=0;
        neighboring_value=0;
        marker=0;
        //first element
        int initial_value= 0;
        boolean move;

        for(int i=1;i<ar.length;i++)
            {
        	neighboring_value = ar[i];
        	System.out.println("neighboring value="+ neighboring_value);
        	//marks the previous element which compared with the new element
        	marker=i-1;
        	
        	while(marker>=0 && (ar[marker]>neighboring_value) )
        	{
    
                	
                	temp= ar[marker];
                	ar[marker]= ar[marker+1];
                	ar[marker+1]=temp;
                	marker = marker -1;
                	
                    shiftcounter=shiftcounter+1; 

        }//end loop
        	
        	
        }//end for
        
        
        
        return shiftcounter;
       
    }
    
   
    
    
}

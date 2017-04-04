import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
      
        int[] shift = new int[k];
        for (int i = 0; i < k; i++) {
            shift[i] = a[i];
        }
        
        int[] remainder = new int[n-k];
        for (int i = k; i < n; i++) {
            remainder[i-k] = a[i];
        }
        
        
        int index = 0;
        for (int i = 0; i < remainder.length; i++) {
            a[index++] = remainder[i];
        }
        for (int i = 0; i < shift.length; i++) {
            a[index++] = shift[i];
        }
        
        
        return a;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}

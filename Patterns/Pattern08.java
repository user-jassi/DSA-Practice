/*
*Problem: for n = 4
    *******
     *****
      ***
       *

* Approach: run the outer loop for n times(to reverse a pattern, just run the outer loop in negative), 
     look for the symetry in the pattern 
     like how much space and * per row, then try to make a relation between n,
     row number and number of spaces or *.
            
*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern08 {

    public void printPattern(int n){
        for(int i = n; i>=1; i--){
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println("");  
        }
        
    }

    public static void main(String[]arg){
        Pattern08 obj = new Pattern08();
        obj.printPattern(4);
    }
    
}

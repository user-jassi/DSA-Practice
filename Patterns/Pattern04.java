/*
*Problem: for n = 4
       1
       22
       333
       4444

* Approach: run the outer loop for n times , 
 inner loop will run for outer loop's iteration varible times and will 
 print the value of it each time.

*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern04 {
       public void printPattern(int n){
              for(int i =1; i<=n; i++){
                     for(int j =1; j<=i; j++){
                            System.out.print(i);
                     }        
                     System.out.println("");      

              }
       }

       public static void main (String[] args){
              Pattern04 obj = new Pattern04();
              obj.printPattern(5);

       }
} 
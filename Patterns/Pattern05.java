/*
*Problem: for n = 4
       ****
       ***
       **
       *

* Approach: run the outer loop for n times , start iteration variable(i) from n and
            make it minus by 1 for each iteration.
            inner loop will run for i times and print the *
            

*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern05 {

    public void printPattern(int n){
        for(int i =n; i>=1;i-- ){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){

        Pattern05 obj = new Pattern05();
        obj.printPattern(4);

    }
}

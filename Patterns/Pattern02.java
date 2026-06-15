/**
 * Problem: Print a right angle triangle of star for given number n
     *
     **
     ***
     ****
 *Approach: Run the outer loop for n times , 
            then Run the inner loop for <=i times to print * and 
            give new line after completion of innner loop
  *Time Complexity: O(n2)
  * Space Complexity:O(1)
*/

public class Pattern02{

    public void printPattern(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<=i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Pattern02 obj = new Pattern02();
        obj.printPattern(5);
    }

}
/**
 * Problem: Print a Square Pattern of star for given number n
 *Approach: Run the outer loop for n times , 
            then Run the inner loop for n times to print * and 
            give new line after completion of innner loop
  *Time Complexity: O(n2)
  * Space Complexity: O(1)
*/
public class Pattern01_Square{
    public void printPattern(int num){
        for(int i = 1; i<= num; i++ ){
            for(int j =1; j<= num; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        Pattern01_Square obj = new Pattern01_Square();
        obj.printPattern(5);
    }


}
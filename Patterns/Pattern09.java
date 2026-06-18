
/*Problem: for n = 4
   *
  ***
 *****
*******
*******
 *****
  ***
   *

* Approach:  look for the symetry in the pattern, we can devided the pattern in two part, 
             First half and second half then we can approach each half by figuring out the relation between numbers
             of * or spaces and row number and n     
*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern09 {

    public void printPattern(int n){
        //First half
            for(int i =1; i<=n; i++){
                for(int j =1; j<=(n-i); j++){
                    System.out.print(" ");
                }

                for(int j = 1; j<=(2*i-1); j++){
                    System.out.print("*");

                }

                System.out.println("");

            }

            //Second Half

            for(int i=n; i>=1;i-- ){
                for(int j =1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j =1; j <= (2*i -1); j++){
                    System.out.print("*");
                }

                System.out.println("");
            }

        }
    
    public static void main(String[] arg){

        Pattern09 obj = new Pattern09();
        obj.printPattern(4);


    }
    
}

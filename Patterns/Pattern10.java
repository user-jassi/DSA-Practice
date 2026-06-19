
/*Problem: for n = 5

*
**
***
****
*****
****
***
**
*

* Approach:  look for the symetry in the pattern, we can devided the pattern in two part, 
             First part include from 1 to 5th row (for n =5)  and second part includes from 6th to 9th row then 
             we can approach each half by figuring out the relation between numbers
             of * or spaces and row number and n     
*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern10 {
    public void printPattern(int n){
        //First part
        for(int i=1; i<=n;i++){
            for(int j =1; j<=i; j++ )
                System.out.print("*");
            System.out.println("");
        }
        
        //Second part
        for(int i = (n-1); i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        } 
    }

    public static void main (String[] main){
        Pattern10 obj = new Pattern10();
        obj.printPattern(5);

    }
    
}

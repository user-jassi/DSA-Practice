/*
*Problem: for n = 4
       *
      ***
     *****
    *******

* Approach: run the outer loop for n times , look for the symetry in the pattern 
            like how much space and * per row, then try to make a relation between n,
            row number and number of spaces or *.
            
*Time Complexity: O(n2)
*Space Complexity: O(1)
 */


public class Pattern07 {
    public void printPattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            // for(int l=1;l<=(n-i);l++){
            //     System.out.print(" ");
            // }

            System.out.println("");
        }

        System.out.println("Hello");

    }

    public static void main(String[] args){
        Pattern07 obj = new Pattern07();
        obj.printPattern(4);

    }
    
}


/*Problem: for n = 5

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

* Approach:  Analyse the pattern carefully, try to find a relation between
             row number and first number of the row, then analyse the each row to find a pattern.
*Time Complexity: O(n2)
*Space Complexity: O(1)
 */

public class Pattern11 {
    public void printPattern(int n){
        for(int i=1; i<=n; i++){
            if(i%2!=0){ //i is odd
                for(int j=1; j<=i; j++){
                    if(j%2 !=0){
                        System.out.print("1 ");

                    }else{
                        System.out.print("0 ");
                    }
                    
                }
            }else{
                for(int j=1; j<=i; j++){
                    if(j%2 !=0){
                        System.out.print("0 ");

                    }else{
                        System.out.print("1 ");
                    }
                    
                }

            }

            System.out.println("");
        }
    }

    public static void main(String[] args){
        Pattern11 obj = new Pattern11();
        obj.printPattern(5);

    }
    
}

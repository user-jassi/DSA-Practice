/*
for n= 5;
A
BB
CCC
DDDD
EEEEE


approach:- Observe the pattern, number of rows = n, each char is printed for ith times in each row.
*Time Complexity: O(n2)
*Space Complexity: O(1)  

*/


public class Pattern16 {

    public static void printPattern(int n){

        for (int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A' + i));
            }

            System.out.println("");
        }

        
    }

    public static void main(String arg[]){

        Pattern16.printPattern(5);
    }
    
}

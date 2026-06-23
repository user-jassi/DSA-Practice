
/*
for n= 4;
D
CD
BCD
ABCD

approach:- observe the pattern, each lined ending with the same char, try to define it in terms of n, 
           then define starting of each roe in terms of n and i.
*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/

public class Pattern18 {
    public static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for(char j = (char)('A' + (n-i)); j<= ('A' + (n-1));j++ ){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Pattern18.printPattern(4);
    }
    
}

/*

Pattern for n =5
ABCDE
ABCD
ABC
AB
A

approach:- Char is staring form A evrytime,also number of rows = n, number of char in each row = i (row number)
*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/
public class Pattern15 {

    public static void printPattern(int n){

        for(int i =n; i>= 1; i--){
            for(char j = 'A'; j<= 'A' + (i-1); j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){

        Pattern15.printPattern(5);

    }
    
}

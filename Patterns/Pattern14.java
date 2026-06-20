/*
Pattern for n =4
A
AB
ABC
ABCD

approach:- Char is staring form A evrytime,also number of rows = n, number of char in each row = i (row number)
           
*/
public class Pattern14 {
    public static void printPattern(int n){
        char letter = 'A';
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(letter);
                if(j<i)
                    letter++;
                else
                    letter = 'A';

            }
            System.out.println("");
        }
    }
    
    //Approach:2
    public static void printPattern2(int n){
        for(int i =1; i<=n; i++){
            for(char ch = 'A'; ch<= 'A' + (i-1); ch++){
                System.out.print(ch);
            }

            System.out.println("");
        }
    }

    public static void main(String[] arg){

        //Pattern14.printPattern(5);
        Pattern14.printPattern2(4);

    }
    
}

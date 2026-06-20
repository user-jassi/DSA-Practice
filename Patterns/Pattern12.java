/*
Problem: for n = 5
1        1
12      21
123    321
1234  4321
1234554321

 Approach: we can devide the pattern in three parts , numbers-Spaces-numbers, try to find the relation between 
           numbers or spaces and row number and n.
*Time Complexity: O(n2)
*Space Complexity: O(1)
*/
public class Pattern12 {

    public static void printPattern(int n){

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println("");
        }
    }

    public static void main(String[] arg){

       Pattern12.printPattern(5);

    }
    
}

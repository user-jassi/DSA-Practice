/*
Problem for n =5

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

Approach:- as we can see in the pattern, number is geting inceased by 1 every time, 
           so we have to take a counter to track it, 
           then find the relation between count of numbers in each row and row number.
*Time Complexity: O(n2)
*Space Complexity: O(1)

*/


public class Pattern13 {

    public static void printPattern(int n){
        int num =1;

        //run the oter loop for n times as n rows has to be printed.
        for(int i = 1; i<=n; i++){
            //inner loop to print the num, and we will increase the num by 1 after printing it
            for(int j =1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        Pattern13.printPattern(5);
    }
    
}

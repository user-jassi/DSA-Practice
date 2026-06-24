/*
for n= 5;
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

approach:- observe the pattern,we can devide the pattern in two half as per the symetry around horizontal axis
           also for each half we can see there are few start then spaces then again starts in each row.
           try to make the first half by defining starts and space for each row, then for the second half you 
           have to only reverse the pattern.

*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/


public class Pattern19 {

    public static void printPattern(int n){

        for(int i = 1; i<=n; i++){

            for(int j =n; j>=i; j--){
                System.out.print("*");
            }

            for(int j = 1; j<= (i-1)*2; j++){
                System.out.print(" ");
            }

            for(int j =n; j>=i; j--){
                System.out.print("*");
            }

            System.out.println("");


        }

        for(int i = n; i>=1; i--){

            for(int j =n; j>=i; j--){
                System.out.print("*");
            }

            for(int j = 1; j<= (i-1)*2; j++){
                System.out.print(" ");
            }

            for(int j =n; j>=i; j--){
                System.out.print("*");
            }

            System.out.println("");


        }
    }

    public static void main(String[] args){

        Pattern19.printPattern(6);

    }
    
}



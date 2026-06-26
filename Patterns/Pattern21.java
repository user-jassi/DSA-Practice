/*
for n= 5;

*****
*   *
*   *
*   *
*****
approach:- observe the pattern,we can see that for i =1 and i =n, n number of * printed and for rest of the 
           rows only first and last (nth) column have * rest are blank.

*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/
public class Pattern21 {

    public static void printPattern(int n){

        for(int i=1; i<=n; i++){
            if(i == 1 || i== n){
                for(int j =1; j<=n; j++){

                    System.out.print("*");

                }
                
            }else{
                for(int j = 1; j<=n; j++){
                    if(j ==1 || j==n){

                        System.out.print("*");

                    }else{
                        System.out.print(" ");

                    }
                    
                }
            }

            System.out.println("");
        }

    }

    public static void main(String[] args){

        Pattern21.printPattern(5);

    }
    
}

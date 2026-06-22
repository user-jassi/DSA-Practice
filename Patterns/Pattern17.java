/*
for n= 5;
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

approach 1:- there are few spaces in each row at starting,
           then we can devide the whole pattern in two parts as per symetry, 
           in this we we can print the pattern with the help of three loops (on for spaces and rest two for charecters)
           find the relation between i, n and chr/spaces for each part.
*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/

public class Pattern17 {

    public static void printPattern(int n){

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=(n-i); j++ ){
                System.out.print(" ");
            }

            for(char j = 'A'; j<= 'A' +(i-1); j++ ){
                System.out.print(j);
            }


            if(i != 1){
                for(char j= (char)('A' + (i-2)); j>='A'; j--){
                System.out.print(j);
            }
            }
            System.out.println("");

            }
        }

    public static void main(String[] args){

        Pattern17.printPattern(5);

    }
    
}

/*
for n= 4;
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4

approach:- i am anable to solve it very first and have to look at solution, 
          calculate the distacnce of the current location from all the four boundaries then take the min 
          of these distances and substract it from n, you will get the number that need to be printed. 
          how to think like this, i wiill come naturally with more and more practice of several type questions

*Time Complexity: O(n2)
*Space Complexity: O(1)  
*/

public class Pattern22 {
    public static void printPattern(int n){

        //Outer loop to print the 2n-1 rows
        for(int i=0; i < (2*n-1); i++){
            //inner loop to print 2*n -1 numbers in each row.
            for(int j =0; j< (2*n -1); j++){
                //Distance of current cell from 
                int top =i; 
                int bottom = (2*n-2) - i; 
                int left = j;
                int right = (2*n-2) - j;
                int num = n - Math.min(Math.min(right, left), Math.min(top,bottom));
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Pattern22.printPattern(4);

    }
    
}

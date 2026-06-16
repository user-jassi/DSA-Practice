/*
*Problem: for n = 5
      12345
      1234
      123
      12
      1

* Approach: run the outer loop for n times , start iteration variable(i) from n and
            make it minus by 1 for each iteration.
            inner loop will run for i times and print the j
            

*Time Complexity: O(n2)
*Space Complexity: O(1)
 */



public class Pattern06 {

    public void printPattern(int n){

        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }

    public static void main(String[] args){

        Pattern06 obj = new Pattern06();
        obj.printPattern(5);


    }
    
}

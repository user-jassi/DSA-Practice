

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

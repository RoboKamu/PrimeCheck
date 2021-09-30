import java.util.Scanner;

public class primtal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for input
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        
        //call the object prime to start the sequence, and see if input is prime
        int prime = prime(num);
        
        //see if the returned value is True or False
        if (prime == true){
            System.out.println("It is a prime");
        }
        else{
            System.out.println("It is not a prime");
        }
    }
    
    public static boolean prime(int num){
        //make an list from 0 up to num
        int[] numList = new int[num];
        for (int z = 0; z <= num-1; z++){
            numList[z] = z;
        }
        
        //loop through all numbers up to num, and calculate which 2 multiply together
        for (int i = 1; i <= num-1; i++){
            for (int n = 1; n <= num-1; n++){
                if (i*numList[n] == num){
                    //2 numbers that are not 1 or num, multiply to num
                    return false;
                }
            }            
        }
        return true;
    }
}

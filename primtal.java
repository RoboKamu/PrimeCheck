import java.util.Scanner;

public class primtal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for input
        System.out.println("Ange ett heltal: ");
        int num = input.nextInt();
        
        //call the object prime to start the sequence, and see if input is prime
        prime(num);
        
        //see if the returned value is None(not prime) or not None(prime)
        if (prime(num) == true){
            System.out.println("Det är ett primtal");
        }
        else{
            System.out.println("Det är inte ett primtal");
        }
        
        
    }
    
    public static boolean prime(int num){
        Scanner input = new Scanner(System.in);
        
        //make an list from 0 up to num
        int numList[] = new int[num];
        for (int z = 0; z < num; z++){
            numList[z] = z;
    }
        
        //loop through number and calculate if some multiply to the num
        for (int i = 0; i < num; i++){
            for (int n = 0; n < num-1; n++){
                if (i*numList[n] == num){
                    return true;
                }
            }
        }
    }
}

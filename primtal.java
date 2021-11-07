import java.util.Scanner;

public class Primtal2 {
    
    public static void main(String[] args) {
        
        //setup scanner
        Scanner input = new Scanner(System.in);
        
        //get input from user
        System.out.println("Ange ett heltal: ");
        int num = input.nextInt();
        
        //call the METHOD prime (an object is an instace of a class, a method is what the object can performe, an action)
        boolean prime = prime(num);
        
        //if the method returns false; it is not prime, otherwise it's prime
        if (prime == true) {
            System.out.println(num + " är ett primtal");
        } else {
            System.out.println(num + " är inte ett primtal");
        }
    }
    
    public static boolean prime(int num){
        
        /*
        See if there is a divisor of the integer num.
        To do this we will loop through all the numbers between 1 and num, and 
        divide num with the numbers to see if they have a remainder.
        If they do; then num is a composite number and not prime.
        */
        
        for (int m = 2; (num - 1) > m; m++) {
            if (num % m == 0) {
                return false;
            }
        }
        
        //all numbers that are less or equal to 1 cannot be prime
        if (num <= 1){
            return false;
        }
        
        //if both of these statements fail; it is prime
        return true;  
    }
}

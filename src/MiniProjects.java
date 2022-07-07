import java.util.Scanner;

public class MiniProjects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int k = s.nextInt();
        boolean isAsal= true ;
        for (int i = 2 ; i < k ; i++) {
            if (k%i == 0){
                isAsal= false ;
            }
        }
        if (isAsal){
            System.out.println("The number you entered is prime. ");
        }

        else {
            System.out.println("The number you entered is not prime ");
        }





    }


}
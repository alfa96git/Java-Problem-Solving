import java.util.Scanner;

public class odd_even_number {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if ( num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else{
            System.out.println(num + " is odd number.");
        }
    }
}

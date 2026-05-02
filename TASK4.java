import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("INPUT A NAME : " );
            String name = scan.nextLine();
            
            String reversed = new StringBuilder(name).reverse().toString();
            if (name.equals(reversed)){
                System.out.println("The input string is a palindrome");
            }
                else{
                    System.out.println("The input string is not a palindrome");
            }
        }

        ;
    }
}

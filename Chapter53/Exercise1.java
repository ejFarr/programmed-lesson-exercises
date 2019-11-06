import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 1;
        Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

        Pantry hubbard = new Pantry( goose, apple, rhub );
        System.out.println( "Welcome to Mother Hubbard's Pantry" );
        while (selection >= 1 && selection <= 3) {
            System.out.println( hubbard );
            System.out.println("Enter your selection (1, 2, or 3): ");
            selection = scan.nextInt();
            hubbard.select(selection);
            if (selection < 1 || selection > 3) {
                System.out.println("Good bye");
                break;
            }

            System.out.println("Enter amount to spread: ");
            hubbard.spread(scan.nextInt());
        }
    }
}
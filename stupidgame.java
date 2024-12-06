import java.util.Scanner;

public class stupidgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many pencils would you like to use: ");
        int pencils = scan.nextInt();
        scan.nextLine();

        System.out.print("Player 1 name: ");
        String player1 = scan.nextLine();

        System.out.print("Player 2 name: ");
        String player2 = scan.nextLine();

        int turn = 0; 


        while (pencils > 0) {

            for (int i = 0; i < pencils; i++) {
                if (i > 0 && i % 5 == 0) {
                    System.out.print(" "); 
                }
                System.out.print("|");
            }
            System.out.print("\n");

            if (turn == 0) {
                System.out.println(player1 + "'s turn:");
            } else {
                System.out.println(player2 + "'s turn:");
            }

  
            int remove = scan.nextInt();


            while (remove < 1 || remove > 3 || remove > pencils) {
                if (remove > pencils) {
                    System.out.println("Not enough pencils left. Try again.");
                } else {
                    System.out.println("Possible values: '1', '2', or '3'");
                }
                remove = scan.nextInt();
            }

            pencils -= remove; 
            turn = 1 - turn;
        }

        if (turn == 0) {
            System.out.println(player1 + " won!");
        } else {
            System.out.println(player2 + " won!");
        }

        scan.close();
    }
}

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many pencils would you like to use: ");
        String pencilss = scan.nextLine();
        int pencils=Integer.parseInt(pencilss);
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

            String remove = scan.nextLine();
            /*if(remove instanceof String){System.out.println("Truse");}else{System.out.println("false");}*/
            try {
                int removetoint = Integer.parseInt(remove);
                if (removetoint < 1 || removetoint > 3) {
                    System.out.println("Possible values: '1', '2', or '3'");
                } else {
                    pencils -= removetoint;
                    turn = 1 - turn;
                }
            } catch (NumberFormatException e) {
                System.out.println("Possible values: '1', '2', or '3'");
            }
        }

    if (turn == 0) {
        System.out.println(player1 + " won!");
    }else {
        System.out.println(player2 + " won!");
    }
}

}

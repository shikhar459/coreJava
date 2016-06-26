import java.util.*;

class Game1 {
    public static void main(String args[]) {
        int user1, user2;
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Rock Paper Scissor Game ****");
        System.out.println("User-1 Select your Optoin\n (1) for ROCK \n (2) for PAPER\n (3) for SCISSOR");
        user1 = sc.nextInt();
        System.out.println("User-2 Select your Optoin\n (1) for ROCK \n (2) for PAPER\n (3) for SCISSOR");
        user2 = sc.nextInt();

        String ch1, ch2;

        // Generate User 1 Choice
        if (user1 == 1) {
            ch1 = "Rock";
        } else if (user1 == 2) {
            ch1 = "Paper";
        } else if (user1 == 3) {
            ch1 = "Scissor";
        } else {
            ch1 = null;
        }

        // Generate User 2 Choice
        if (user2 == 1) {
            ch2 = "Rock";
        } else if (user2 == 2) {
            ch2 = "Paper";
        } else if (user2 == 3) {
            ch2 = "Scissor";
        } else {
            ch2 = null;
        }

        //Now check the Game Condition.

        if ((user1 == user2) && (ch1 != null) && (ch2 != null)) {
            System.out.println("User 1 selects " + ch1 + "\nUser 2 Selects " + ch2);
            System.out.println("What the hell just happend... The game is Draw");
        } else if ((user1 == 1 && user2 == 2) || (user1 == 2 && user2 == 1)) {
            System.out.println("User 1 selects " + ch1 + "\nUser 2 Selects " + ch2);
            if (user1 == 1) {
                System.out.println("Paper eats Rock...User 2 has won the Game!!!");
            } else {
                System.out.println("Paper eats Rock...User 1 has won the Game!!!");
            }
        } else if ((user1 == 2 && user2 == 3) || (user1 == 3 && user2 == 2)) {
            System.out.println("User 1 selects " + ch1 + "\nUser 2 Selects " + ch2);
            if (user1 == 2) {
                System.out.println("Scissor cuts Paper...User 2 has won the Game!!!");
            } else {
                System.out.println("Scissor cuts Paper...User 1 has won the Game!!!");
            }
        } else if ((user1 == 3 && user2 == 1) || (user1 == 1 && user2 == 3)) {
            System.out.println("User 1 selects " + ch1 + "\nUser 2 Selects " + ch2);
            if (user1 == 3) {
                System.out.println("Rock Crushes Scissor ...User 2 has won the Game!!!");
            } else {
                System.out.println("Rock Crushes Scissor ...User 1 has won the Game!!!");
            }
        } else {
            System.out.println("Wrong Input by any of the user.... Are you out of your Mind");
        }
    }
}
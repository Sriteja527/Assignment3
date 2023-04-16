import java.util.*;
public class GuesserGame{
    int guessernum, a,b,c;
    Scanner sc = new Scanner(System.in);
    void Guesser(){
        System.out.println("Enter the guessernumber between 1 to 20 range:"); // enhancement
     guessernum = sc.nextInt(); // 21

    }
    void player()
    {
        System.out.println("Enter the player number:");
        a = sc.nextInt(); //22
        b = sc.nextInt(); //23
        c = sc.nextInt(); //24
    }
    void umpire()
    {
        if(guessernum > 20)
        {
            System.out.println("You have entered the numbers above 20 please enter the number between 0 to 20");
        }
        else{
        int gues = guessernum; // here umpire will collect the number from guesser.
        int player1 = a; // here umpire will collect the numbers from players as well.
        int player2 = b;
        int player3 = c;
        if(player1 == gues)    //umpire will comparing the who has won
        {
            if(player1 == gues && player2 == gues)
            {
                System.out.println("player1 and player2 won the match:");
            }
            if(player1 == gues && player3 == gues)
            {
                System.out.println("player1 and player3 won the match:");
            }
            if(player1 == gues && player2 == gues && player3 == gues)
            {
                System.out.println("All players won the match:");
            }
            System.out.println("Player1 won the match:");
        }
        else{
            if(player2 == gues)
            {
                if(player2 == gues && player3 == gues)
                {
                    System.out.println("Player2 and Player3 won the match:");
                }
                else{

                System.out.println("player2 won the match:");
            }
            }
            else{
                if(player3 == gues)
                {
                    System.out.println("player3 won the match:");
                }
                else{
                    System.out.println("No players won the match:");
                }
            }
        }
    }
    }
    public static void main(String[] args)
    {
        GuesserGame g = new GuesserGame();
        g.Guesser();
        g.player();
        g.umpire();
    }
}
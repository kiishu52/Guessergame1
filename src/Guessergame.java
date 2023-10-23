import java.util.Scanner;

  class Player {
    int numfromplayer;
    Scanner sc=new Scanner(System.in);

    public int collectthenum() {
        System.out.println("Player Guess your number");
        numfromplayer=sc.nextInt();
        return numfromplayer;
    }
}
     class Guesser {
        int numfromguesser;
        Scanner sc=new Scanner(System.in);

        public int takethenum() {
            System.out.println("Guesser Guess your number");
            numfromguesser=sc.nextInt();
            return numfromguesser;
        }
    }
      class empire {
        int numguesser;
        int numPlayer1;
        int numPlayer2;
        int numPlayer3;

        void collect(){
            Guesser g=new Guesser();
            numguesser=g.takethenum();
        }
        void collectplayer(){
            Player p1=new Player();
            numPlayer1=p1.collectthenum();
            Player p2=new Player();
            numPlayer2=p2.collectthenum() ;
            Player p3=new Player();
            numPlayer3 =p3.collectthenum();
        }
        void compare(){
            if(numguesser==numPlayer1){
                if(numguesser==numPlayer2&& numguesser==numPlayer3){
                    System.out.println("All player won the game");
                }
                else if (numguesser==numPlayer2) {
                    System.out.println("Only player 1 and 2 win");
                } else if (numguesser==numPlayer3) {
                    System.out.println("Only Player 1 and 3 win");
                }

            }
            else if (numguesser==numPlayer2) {
                if (numguesser == numPlayer3) {
                    System.out.println(" Only Player 2 and 3 win");
                }
                System.out.println(" Only Player 2 win");
            }
            else if (numguesser==numPlayer3) {
                System.out.println(" Only Player 3 win");
            }
            else {
                System.out.println("No player won the game Try again");
            }
        }
    }
public class Guessergame {
    public static void main(String[] args) {
        empire e =new empire();
        e.collect();
        e.collectplayer();
        e.compare();
    }
}

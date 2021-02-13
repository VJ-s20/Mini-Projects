import java.util.Scanner;
import java.util.Random;

class Game{
    Random randint =new Random();
    Scanner scan=new Scanner(System.in);
    public void isWinner(){
        int guess=0;
        while (true){
            System.out.println("Enter you guessNumber:");
            int guessNum=randint.nextInt(6);
            short player=scan.nextShort();
            if (player==guessNum) break;
            else if (! (player>=0 && player<6))break;
            else {
                System.out.println("The number was "+guessNum+":(");
                guess++;
            }
        }
        System.out.format("\tYou guessed the number right in %d guess ",guess);
    }
}
public class NumberGuess {
    public static void main(String[] args) {
        Game game=new Game();
        game.isWinner();
    }
}

import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    static void checkWinner(String comp,String user){
        if (comp.equals(user)) System.out.println("Draw");
        else if(comp.equals("R")){
            if (user.equals("P"))System.out.println("YOu won");
            else System.out.println("YOu loss!");
        }else if (comp.equals("P")){
            if (user.equals("S")) System.out.println("YOu won!");
            else System.out.println("you loss!");
        }else{
            if (user.equals("R")) System.out.println("YOu won");
            else System.out.println("YOu loss");
        }
    }
    public static void main(String[] args) {
        Random comp =new Random();
        int random=comp.nextInt(3);
        String compMove;
        switch (random){
            case 0 ->compMove="R";
            case 1 ->compMove="P";
            default -> compMove="S";
        }
        System.out.println(compMove);
        System.out.println("Enter R(Rock), P(Paper), S(scissor)");
        Scanner scan=new Scanner(System.in);
        String user=scan.next().toUpperCase();
        checkWinner(compMove,user);

    }
}

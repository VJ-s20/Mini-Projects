
import java.util.Random;
import java.util.Scanner;

public class Cipher_ {
    static String encrypt (String text,int key){
        StringBuilder encrypt_text = new StringBuilder();
        for(int i = 0; i<text.length(); i++){
            char chr=(char)(text.charAt(i)+key);
            if (chr>122){
                chr= (char) (chr-26);
            }
            encrypt_text.append(chr);
        }return encrypt_text.toString();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random randInt=new Random();
        int key=randInt.nextInt(6);
        System.out.println(key);
        System.out.print("Type here:");
        System.out.println("Encrypted text is: "+encrypt(scan.nextLine(),key));
    }
}

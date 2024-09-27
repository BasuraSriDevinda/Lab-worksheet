
import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[]arg){
        String name;
        do{

            Scanner  input =new Scanner(System.in);
            System.out.println("Enter an odd Length word: ");
            name=input.next();
        }while (name.length()%2==0);
         int index=((name.length()+1)/2);
        System.out.println("Middle Character :" + name.charAt(index-1));






    }
}




import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System .in);

        System.out.println("enter a leath ibn centimeter ");
        int centimeter= input.nextInt();
        int inch=(int) (centimeter/2.54);
        int feet = inch/12;
        System.out.println("centimeter "+centimeter +"are equale to feet  "+ feet+ " and inch "+(inch-(feet*12)));
    }
}


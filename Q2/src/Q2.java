
import java .util.Scanner;
import java.util.StringTokenizer;
public class Q2
{


    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("s full name in the format first middle last  :");
        String FullName=input.nextLine();
        String names[]=new String[3];
        int i=0;
        StringTokenizer st =new StringTokenizer(FullName," ");
        while (st.hasMoreTokens()){
            names[i]=st.nextToken();
            i++;



        }
        System.out.println(names[2]+","+names[1]+ " "+ names[0].charAt(0)+".");





    }

}
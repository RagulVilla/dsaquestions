package dsaquestions;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);


        System.out.print("Enter your First number: ");
        int a = Scan.nextInt();
        System.out.print("Enter your Second number: ");
        int b = Scan.nextInt();
        System.out.print("Enter your Third number: ");
        int c = Scan.nextInt();

        int d = a*b*c;
        int e = a+b+c;
        int res = d/e;

        System.out.print("Your Result is : "+ res);


    }



}

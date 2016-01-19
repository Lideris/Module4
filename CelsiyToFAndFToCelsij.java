import java.util.Scanner;

/**
 * Created by ua1gribovskiy on 19.01.2016.
 */
public class CelsiyToFAndFToCelsij {
    public static void main (String [] args){
        Scanner sk = new Scanner(System.in);
        System.out.println("Ведіть номер операції ");
                System.out.println  ( "1. F to C ");
                System.out.println  ("2. C to F ");
        int num = sk.nextInt();
        if (num == 1) {
            System.out.println("Введіть Градуси");
            int Grad = sk.nextInt();
            System.out.println(Grad + " градусів по Фаренгейту = "+ (Grad-32)*0.56 +" по Цельсію");
        }
        if (num == 2) {
            System.out.println("Введіть Градуси");
            int Grad = sk.nextInt();
            System.out.println(Grad + " градусів по Фаренгейту = "+ (Grad*1.8)+32 +"  по Цельсію");
    }}
}

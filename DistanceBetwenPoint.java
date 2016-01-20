import java.util.Scanner;

import static java.lang.Math.*;;;
/**
 * Created by ua1gribovskiy on 20.01.2016.
 */
public class DistanceBetwenPoint {
    public static void main(String[] args) {


        Scanner sk = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = sk.nextInt();
        System.out.println("Enter y1");
        double y1 = sk.nextInt();
        System.out.println("Enter x2");
        double x2 = sk.nextInt();
        System.out.println("Enter y2");
        double y2 = sk.nextInt();

            double Distance = Math.sqrt((Math.pow(x2 - x1,2)) + (Math.pow(y2 - y1,2)));
            System.out.println("Distance = " + Distance);
        }
    }



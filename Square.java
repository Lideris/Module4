import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthPainter;
import javax.xml.soap.SOAPPart;
import java.lang.ref.SoftReference;
import java.net.SocketPermission;
import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by ua1gribovskiy on 19.01.2016.
 */
public class Square {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Ведіть номер операції " +
                "1.Площа Трикутника " +
                "2.Площа Прямокутника " +
                "3.Площа Круга");
        int Figura = sk.nextInt();
        if (Figura == 1) {
            System.out.println("Введіть довжину Катета 1");
            int Katet1 = sk.nextInt();
            System.out.println("Введыть довжину Катета 2");
            int Katet2 = sk.nextInt();
            System.out.println("Площа Трикутника = "+ Katet1 * Katet2 / 2);
        }
        if (Figura == 2) {
            System.out.println("Введіть довжину Сторони 1");
            int Storona1 = sk.nextInt();
            System.out.println("Введыть довжину Сторони 2");
            int Storona2 = sk.nextInt();
            System.out.println("Площа Прямокутника = "+ Storona1 * Storona2);
        }
        if (Figura == 3) {
            System.out.println("Введіть радіус Круга");
            int Radius = sk.nextInt();
            System.out.println("Площа Круга = "+  3.14 * Radius * Radius);


        }
    }
}
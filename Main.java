
import java.util.Locale;
import java.util.Scanner;
import encapsulamentoExemplo1.Rectangle;




public class Main {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);

            Scanner lerDado = new Scanner(System.in);
            Rectangle rec = new Rectangle();

            System.out.println("Enter rectangle width and height: ");
            rec.setWidth(lerDado.nextDouble());
            rec.setHeight(lerDado.nextDouble());

            System.out.println("AREA = " + rec.Area());
            System.out.println("PERIMETER = " + rec.Perimeter());
            System.out.println("DIAGONAL = " + rec.Diagonal());

            lerDado.close();

        }
    }

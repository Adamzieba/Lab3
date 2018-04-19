import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class SpringApplet extends JApplet {
    // Metoda przekształcająca liczbę do postaci z dwoma miejscami po przecinku
    public static String format(double number) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.UK);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyPattern("#.##");
        return decimalFormat.format(number);
    }

    // Metoda inicjalizująca applet i testująca klasę Vector2D
    @Override
    public void init() {
        System.out.println("Created vectors");
        Vector2D first = new Vector2D(5.0, 3.0);
        Vector2D second = new Vector2D(2.0, 4.0);
        first.present("First");
        second.present("Second");

        System.out.println("\n" + "Sum and difference");
        Vector2D sum = first.add(second);
        Vector2D difference = first.subtract(second);
        sum.present("Sum");
        difference.present("Difference");

        System.out.println("\n" + "Normalized vectors");
        Vector2D firstNormalized = first.normalize();
        Vector2D secondNormalized = second.normalize();
        firstNormalized.present("First");
        secondNormalized.present("Second");

        System.out.println("\n" + "Magnitude of vectors");
        double firstMagnitude = first.getMagnitude();
        double secondMagnitude = second.getMagnitude();
        System.out.println("  " + "First: " + format(firstMagnitude));
        System.out.println("  " + "Second: " + format(secondMagnitude));

        System.out.println("\n" + "Scaled vector");
        Vector2D scaled = first.scale(3.0);
        scaled.present("Scaled");
    }

    @Override
    public void paint(Graphics graphics) {
        //
    }
}

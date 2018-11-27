public class Taschenrechner
{

    public static void main(String[] args)
    {

        System.out.println("Addieren (Integer): " + (int) addieren(6, 3));
        System.out.println("Addieren (Double): " + addieren( + 6.4, 3.4));
        System.out.println("Subtrahieren (Integer): " + (int) (int)subtrahieren(6, 3));
        System.out.println("Subtrahieren (Double): " + subtrahieren(6.4, 3.2));
        System.out.println("Multiplizieren (Integer): " + (int) multiplizieren(6, 3));
        System.out.println("Multiplizieren (Double): " + multiplizieren(6.2, 3.2));
        System.out.println("Dividieren (Integer): " + (int) dividieren(6, 3));
        System.out.println("Dividieren (Double): " + dividieren(6.4, 3.1));

    }

    // Addieren

    public static double addieren(double a, double b)
    {
        return a + b;
    }

    // Subtrahieren

    public static double subtrahieren(double a, double b)
    {
        return a - b;
    }

    // Multiplizieren

    public static double multiplizieren(double a, double b)
    {
        return a * b;
    }

    // Dividieren

    public static double dividieren(double a, double b)
    {
        return a / b;
    }

}

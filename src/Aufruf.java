import javax.swing.*;

public class Aufruf
{

    public static void main(String[] args)
    {

        Vehicle a = new Vehicle();
        a.name = "Vehicle A";
        a.power = 55;
        a.weight = 1234.5;

        Vehicle b = new Vehicle();
        b.name = "Vehicle B";
        b.power = 60;
        b.weight = 2345.6;

        JOptionPane.showMessageDialog(null, a.printName());
        a.calculatePower();

        JOptionPane.showMessageDialog(null, b.printName());
        b.calculatePower();

    }

}

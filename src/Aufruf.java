import javax.swing.*;

public class Aufruf
{

    public static void main(String[] args)
    {

        Vehicle a = new Vehicle(50, 10.5, "Vehicle A");
        JOptionPane.showMessageDialog(null, a.printName());
        a.calculatePower();

        Vehicle b = new Vehicle(60, 20.5, "Vehicle B");
        JOptionPane.showMessageDialog(null, b.printName());
        b.calculatePower();

    }

}

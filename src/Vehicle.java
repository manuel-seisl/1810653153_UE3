import javax.swing.*;

public class Vehicle
{

    int power;
    double weight;
    String name;

    public String printName()
    {
        return name;
    }

    public void calculatePower()
    {
        JOptionPane.showMessageDialog(null, power * 1.36);
    }

}

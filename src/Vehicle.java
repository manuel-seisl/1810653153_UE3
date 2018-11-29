import javax.swing.*;

public class Vehicle
{

    private int power;
    private double weight;
    private String name;

    public Vehicle(int power, double weight, String name)
    {
        this.power = power;
        this.weight = weight;
        this.name = name;
    }

    public Vehicle(){}

    public String printName()
    {
        return name;
    }

    public void calculatePower()
    {
        JOptionPane.showMessageDialog(null, power * 1.36);
    }

}

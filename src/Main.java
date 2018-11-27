import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        partialString("Manuel");
    }

    public static void partialString(String a)
    {

        int stringLen = a.length();

        if(stringLen < 3){
            JOptionPane.showMessageDialog(null, "Sie haben weniger als 3 Zeichen angegeben!");
        } else {
            System.out.println("Die 2. Hälfte des Strings lautet: " + a.substring(stringLen / 2));
        }

    }

}

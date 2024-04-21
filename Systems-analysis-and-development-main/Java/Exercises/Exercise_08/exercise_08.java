package Java.Exercises.Exercise_08;

import javax.swing.JOptionPane;
import java.lang.Double;

public class exercise_08 {
    public static void main(String[] args) {
        Double weight, height, IMC;
        weight = Double.parseDouble(JOptionPane.showInputDialog("Write your weight in kilogram: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Write your weight in meters: "));
        IMC = weight / (height * height);
        JOptionPane.showMessageDialog(null, "Your IMC is " + IMC);
    }
}

package Java.Exercises.Exercise_09;
import javax.swing.JOptionPane;

public class exercise_09 {
    public static void main(String[] args) {
        Integer numberA, numberB, sun;
        numberA = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
        numberB = Integer.parseInt(JOptionPane.showInputDialog("Write a other number: "));
        sun = numberA + numberB;
        JOptionPane.showMessageDialog(null, "The sun of " + numberA + " and " + numberB + " is " + sun);
    }
}
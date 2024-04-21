import javax.swing.*;

public class Exercise_6 {
    public static void main(String args[]) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de anos: "));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de meses: "));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias "));
        int total = (anos * 365) + (meses * 30) + dias;
        JOptionPane.showMessageDialog(null, "Parabéns, você já viveu " + total + " dias");
    }
}

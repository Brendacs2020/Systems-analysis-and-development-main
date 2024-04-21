import javax.swing.*;

public class Exercise_4 {
    public static void main(String args[]) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int dezena = (numero % 100) / 10;
        JOptionPane.showMessageDialog(null,"O dígito da dezena é: " + dezena);

    }
}

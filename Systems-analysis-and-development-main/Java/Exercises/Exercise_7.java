import javax.swing.*;

public class Exercise_7 {
    public static void main(String args[]) {
        double minimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sálario minimo atual: "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu sálario: "));
        double quantSalarios = salario / minimo;
        JOptionPane.showMessageDialog(null,"A quantidade de salários mínimos que você recebe é: " + quantSalarios);
        
    }
}

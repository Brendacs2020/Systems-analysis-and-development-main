import javax.swing.*;

public class Exercise_7 {
    public static void main(String args[]) {
        double minimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do s�lario minimo atual: "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu s�lario: "));
        double quantSalarios = salario / minimo;
        JOptionPane.showMessageDialog(null,"A quantidade de sal�rios m�nimos que voc� recebe �: " + quantSalarios);
        
    }
}

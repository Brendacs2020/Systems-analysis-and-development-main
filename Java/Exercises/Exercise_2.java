import javax.swing.*;
        
public class Exercise_2 {
    public static void main(String args[]) {
       double na = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira nota:"));
       double nb = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda nota:"));
       double nc = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira nota:"));
       double nd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta nota:"));
       double media = (na + nb + nc + nd) / 4;
       JOptionPane.showMessageDialog(null,"A média aritmética é " + media);
       
    }
}

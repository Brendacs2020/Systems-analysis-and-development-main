import javax.swing.*;

public class Exercise_3 {
    public static void main(String args[]) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de vencimento: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de vencimento: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));       
        JOptionPane.showMessageDialog(null,"A sua fatura vence em " + dia + " de " + mes + " no valor de R$ " + valor + " está fechada" );
    }
}

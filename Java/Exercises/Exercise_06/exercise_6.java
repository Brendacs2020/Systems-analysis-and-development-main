import javax.swing.JOptionPane;
import java.lang.Float;

public class exercise_6 {
    public static void main(String[] args) {
        Float altura,imc,massa;

        massa = Float.parseFloat(JOptionPane.showInputDialog("Digite sua massa (em Kilograma): "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura (em Metros): "));
        imc = massa /(altura * altura );
        JOptionPane.showMessageDialog(null,imc);
    }
    }

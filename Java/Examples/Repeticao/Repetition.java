import javax.swing.JOptionPane;

public class Repetition {
    public static void main (String[] args) {
        String message = JOptionPane.showInputDialog("Digite uma mensagem: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes que a mensagem deve ser repetida: "));
        
        for(int i=0; i<numero; i++){
            JOptionPane.showMessageDialog(null,"Mensagem: " + message);
        }
    }
}

import javax.swing.JOptionPane;

public class Exercise_1 {
    public static void main(String[] args) {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado do seu quadrado: "));
        int P = lado * 4;
        int A = lado * lado;
        JOptionPane.showMessageDialog(null,"Perímetro: " + P + " - Área: " + A);       
            
    }
}
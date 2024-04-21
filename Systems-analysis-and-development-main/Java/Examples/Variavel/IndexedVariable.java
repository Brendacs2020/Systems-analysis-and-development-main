import javax.swing.*;

public class IndexedVariable {
    public static void main(String args[]) {
        int i;
        String nomes[] = new String[5];
        for(i = 0; i <5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome: ");
            JOptionPane.showConfirmDialog(null, nomes);
        }
    }
}
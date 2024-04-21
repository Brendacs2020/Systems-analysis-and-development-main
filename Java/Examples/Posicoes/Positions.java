import javax.swing.*;

public class Positions {
    public static void main(String args[]) {
        int i;
        String nomes[ ] = new String[20];
        nomes[0] = "Ana";
        nomes[1] = "Bia";
        nomes[2] = "Carol";
        for(i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "o nome na posição "+i+ " é "+ nomes[i] );
        }
    }
}
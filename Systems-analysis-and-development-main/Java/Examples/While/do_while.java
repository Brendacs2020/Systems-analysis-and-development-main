import javax.swing.JOptionPane;

public class do_while {
    public static void main (String[] args) {
        int i=0; 
        do {
            JOptionPane.showMessageDialog(null,"Valor de i: " +i);i++;
        }
    while (i<8);
    }
}

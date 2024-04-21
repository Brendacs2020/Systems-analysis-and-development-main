import javax.swing.JOptionPane;

public class Exercise_23 {

    public static void main(String[] args) {
        double m = 0.0;
        double s = 0.0;
        int i = 1;
        while(i<=1000){
            s = s + i;
            JOptionPane.showMessageDialog(null,"soma: " + s);
            i++;
        }
	m = s / 1000;
	JOptionPane.showMessageDialog(null,"média: " + m);
    }
}

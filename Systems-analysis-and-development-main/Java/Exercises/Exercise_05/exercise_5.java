import javax.swing.JOptionPane;

public class exercise_5 {

    public static void main(String[] args) {
        Integer n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        int soma = n1 + n2;
        System.out.println(soma);
    }
    }

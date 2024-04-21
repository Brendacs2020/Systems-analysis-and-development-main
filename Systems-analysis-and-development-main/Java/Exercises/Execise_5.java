import javax.swing.*;
        
public class Execise_5 {
    public static void main(String args[]) {
    int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    int dias = entrada / 86400;
    int diasResto = entrada % 86400;
    int horas = diasResto / 3600;
    int horasResto = diasResto % 3600;
    int minutos = horasResto / 60;
    int segundos = horasResto % 60;
    JOptionPane.showMessageDialog(null,dias + " dias, " 
        + horas + " horas, " 
        + minutos + " minutos e " 
        + segundos +" segundos.");
    
    }
}

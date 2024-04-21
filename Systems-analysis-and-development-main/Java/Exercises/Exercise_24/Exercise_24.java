import javax.swing.JOptionPane;

public class Exercise_24 {

    public static void main(String[] args) {
        int i = 13;
	do{
            i++;
	    if((i % 2) == 0){
                JOptionPane.showMessageDialog(null,"Número par: " + i); 
		}
        }while(i<23);	
        
    }
}

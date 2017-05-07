
import javax.swing.JOptionPane;


public class NewClass {
    
    public static void main(String[] args) {
        
        int nota1 ,nota2;
        
        float promedio;
       
        
        nota1=Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 1: ")) ;
        
        nota2= Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 2")) ;
        
        
        promedio = (nota1 + nota2)/2;
        
        JOptionPane.showMessageDialog(null, "el promedio es "+ promedio );
                
        
        
       
    }
    
}

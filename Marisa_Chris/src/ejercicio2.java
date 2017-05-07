import java.util.Scanner;
/*
 * Ingresa por teclado el nombre del cliente y el importe gastado
 * alamcenarlos en vectores.
 * Imprimir el nombre del cliente que mas gastó
*/

public class ejercicio2 {

    private Scanner teclado;
    private String[] nombre;
    private float[] importe;
    private float importeMaximo = 0;
    private String[] nombre_que_mas_gasto;
    private int cont = 0;
            
    
    public static void main(String[] args) {
        
        ejercicio2 cliente = new ejercicio2();
        cliente.cargar();
        cliente.elQueMasPapotaTiene();
        cliente.mostrar();
    }
    
    public void cargar(){
        
        teclado = new Scanner(System.in);
        nombre = new String[5];
        importe = new float[5];
        nombre_que_mas_gasto = new String[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Ingresa el nombre del cliente: ");
            nombre[i] = teclado.next();
            
            System.out.print("Ingresa el importe de la factura: ");
            importe[i] = teclado.nextFloat();
        }       
    }
    
    public void elQueMasPapotaTiene(){
        
        for (int i = 0; i < 5; i++) {
            
            if (importeMaximo <= importe[i]) {
                
                importeMaximo = importe[i];
                nombre_que_mas_gasto[cont] = nombre[i];
                cont++;
            }
        }        
    }
    
    public void mostrar(){
        
        for (int i = 0; i < cont; i++) {
            
            //if (nombre_que_mas_gasto[i] != null) {
                System.out.println("El que mas gasto es: " + nombre_que_mas_gasto[i]);
            //}           
        }
    }
}

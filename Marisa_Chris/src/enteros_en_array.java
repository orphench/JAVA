import java.util.Scanner;
/*
 * a.- Ingresa por teclado 5 numeros enteros
 *     y guardalos en un vector o array
 * b.- Imprimirlos
 */

/**
 *
 * @author Chris & Marisa
 */
public class enteros_en_array {
    
    private Scanner teclado;
    private int[] numero;
    
    public static void main(String[] args) {
        
      enteros_en_array enteros = new enteros_en_array();  
      enteros.ingresar();
      enteros.mostrar();
    }
            
    public void ingresar(){
        
        teclado = new Scanner(System.in);
        numero = new int[5];
        
        for(int i=0; i<5; i++){
            
            System.out.print("Ingresa el numero " + i + " : ");
            numero[i] = teclado.nextInt();
        }
    }
    
    public void mostrar(){
        
        for(int i=0; i<5; i++){
            
            System.out.println(numero[i]);
        }
    }
}

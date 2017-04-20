import java.util.Scanner;
/* (Lease con la voz del Robor de Colon (Aldo/Sujeto)
 * Que pasa con los metodos?
 * Hay muchas cosas que tienes que saber para comprender mejor a los metodos
 * Los metodos se usan para separar y reutilizar el codigo del programa
 * Realizan una serie de intrucciones definidas en una clase
 * Se invocan mediante un nombre
 * Chupate esa Java!
 */

/**
 *
 * @author MARISITA & CHRISITO
 */
public class Metodos_1 {
    
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public static void main(String[] args){
        
        Metodos_1 met = new Metodos_1();
        met.carga();
        met.imprime();
        met.esMayor();
    }
    
    public void carga(){
        
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.next();
        
        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();
    }
    
    public void imprime(){
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
    
    public void esMayor(){
        
        if(edad >= 18){
            
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }               
}

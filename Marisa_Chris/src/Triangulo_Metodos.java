import java.util.Scanner;
/*
 * cargar datos
 * indicar si es equilatero
 * que lado es mayor
 * 
 */

/**
 *
 * @author USER
 */
public class Triangulo_Metodos {
    
    private Scanner teclado;
    private int lado1, lado2, lado3;
    
    public static void main(String[] args){
        
        Triangulo_Metodos tri = new Triangulo_Metodos();
        tri.cargar();
        tri.ladoMayor();
        tri.equilatero();       
    }
    
    public void cargar(){
        
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el lado uno del triangulo: ");
        lado1 = teclado.nextInt();
        
        System.out.print("Ingrese el lado dos del triangulo: ");
        lado2 = teclado.nextInt();
        
        System.out.print("Ingrese el lado tres del triangulo: ");
        lado3 = teclado.nextInt();
    }
    
    public void ladoMayor(){
    
        if((lado1 > lado2) && (lado1 > lado3)){
            
           System.out.print("El lado mayor es el lado 1"); 
        }
        else{
            
            if((lado2 > lado1) && (lado2 > lado3)){
                
                System.out.print("El lado mayor el el lado 2"); 
            }
            else{
                
                if((lado3 > lado1) && (lado3 > lado2)){
                    
                    System.out.print("El lado mayor el el lado 3"); 
                }
                else{
                
                    System.out.print("Los tres lados son iguales");
                }    
                
            }
               
        }
            
    }
    
    public void equilatero(){
        
        if((lado1 == lado2) && (lado1 == lado3)){
            
            System.out.print("El triangulo es equilatero");
        }
    }
    
}

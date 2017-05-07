import java.util.Scanner;
/*
 * Dada una lista de 5 empleados
 * Cargar por teclado nombre y sueldo
 *
 * a.- Imprimir el listado de empleados y sueldo
 * b.- Averiguar el sueldo promedio e imprimo los nombres
 *     de todos los empleados cuyo sueldo sea inferior al promedio
 * c.- Agregar el sector al que pertenece cada empleado
 *     Administracion, Informatica, Contabilidad
 *     RRHH, Gerencia
 * d.- Imprimir el nombre de cada empleado y el sector al que pertenece
 */

/**
 *
 * @author Chris & Marisa
 */
public class ClaseDeComoUsarArray {
    
    private Scanner teclado;
    private String[] nombre;
    private float[] sueldo;
    private String[] sector;
    
    public static void main(String[] args){
        
        ClaseDeComoUsarArray array = new ClaseDeComoUsarArray();
        array.cargar();
        array.mostrar();
        array.promedio();
        array.mostrarSector();
    }
    
    public void cargar(){
        
        teclado = new Scanner(System.in);
        nombre = new String[6];
        sueldo = new float[6];
        sector = new String[6];
        //String nombre[] = new String[6];
        
        for(int i = 0; i < 5; i++){
            
            System.out.print("Ingresa el nombre del empleado: ");
            nombre[i] = teclado.next();
            
            System.out.print("Ingresa el sueldo del empleado: ");
            sueldo[i] = teclado.nextFloat();
            
            System.out.print("Ingresa el sector del empleado: ");
            sector[i] = teclado.next();
        }       
    }
    
    public void mostrar(){
        
        System.out.println("LISTADO DE EMPLEADOS");
        
        for(int i = 0; i < 5; i++){
            
           System.out.println("Nombre: " + nombre[i] + " Sueldo: " + sueldo[i]); 
        }     
    }
    
    public void promedio(){
        
        float suma_sueldo = 0;
        float promedio;
        
        for(int i = 0; i < 5; i++){
            
            suma_sueldo = sueldo[i] + suma_sueldo;
        }
        
        promedio = suma_sueldo / 5;
        
        System.out.println("Lista de empleados de sueldo menor al promedio");
        
        for(int i = 0; i < 5; i++){
            
            if(sueldo[i] < promedio){
                
                System.out.println("Nombre: " + nombre[i]);
            }   
        }      
    }
    
    public void mostrarSector(){
        
        System.out.println("LISTADO DE EMPLEADOS POR SECTOR");
        
        for(int i = 0; i < 5; i++){
            
           System.out.println("Nombre: " + nombre[i] + " Sector: " + sector[i]); 
        }     
    }
            
    
}

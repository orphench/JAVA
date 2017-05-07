import java.util.Scanner;
/*
 * Dada la lista de 5 alumnos de un curso y las 2 notas obtenidas
 * Se pide:
 * a.- Ingresar nombre, apellido, sexo, nota1, nota2
 * b.- Calcular y guardar el promedio de cada alumno
 * c.- Imprimir el nombre y apellido de los alumnos reprobados (promedio < 4)
 * d.- Imprimir el nombre, apellido y promedio de los alumnos aprobados 
 *     (promedio >= 4 y promedio < 8)
 * e.- Imprimir nombre, apellido y promedio de los alumnos promocionados
 *     (promedo >= 8 y nota1 >= 6 y nota2 >= 6)
 * f.- Agregar un vector con el sexo del alumno
 * g.- Cantidad de varones reprobados
 * h.- Cantidad de mujeres promocionadas
 * i.- Porcentaje de mujeres de la comicion
 * j.- Cantidad de alumnos que aporbaron el primer parcial y no el segundo
 */

/**
 *
 * @author Chris & Marisa
 */
public class arrayAlumnos {
    
   private Scanner teclado;
   private String[] nombre;
   private String[] apellido;
   private String[] sexo;
   private int[] nota1, nota2;
   private int[] promedio;
   
    
   
    public static void main(String[] args){
        
        arrayAlumnos alumnos = new arrayAlumnos();
        
        
        alumnos.carga();
        //alumnos.mostrar();
        alumnos.promedio();
        alumnos.mostrarReprobados();
        alumnos.mostrarAprobados();
        alumnos.mostrarPromocionados();
        alumnos.varonesReprobados();
        alumnos.mujeresPromocionadas();
        alumnos.porcentaje();
        alumnos.primeroSi_segundoNo();
    }
    
    public void carga(){
        
        teclado = new Scanner(System.in);
        nombre = new String[6];
        apellido = new String[6];
        sexo = new String[6];
        nota1 = new int [6];
        nota2 =new int [6];
        //promedio = new int [6];
        
        for(int i=0; i<5; i++){
                      
            System.out.print("ingrese nombre: ");
            nombre[i] = teclado.next();
            System.out.print("ingrese apellido: ");
            apellido[i]= teclado.next();
            System.out.print("ingrese sexo: ");
            sexo[i]= teclado.next();
            System.out.print("ingrese primera nota: ");
            nota1[i] = teclado.nextInt();
            System.out.print("ingrese segunda nota: ");
            nota2[i] = teclado.nextInt();
            
            
        }    
    }
    
    /*public void mostrar(){
        
        for( int i=0; i<5; i++){
            
            System.out.println("NOMBRE: " + nombre[i] + " APELLIDO: " +apellido[i] );
        }
    }*/
    
    public void promedio(){
        
        promedio = new int [6];
        
        for(int i=0; i<5; i++){
            
            promedio[i] = (nota1[i] + nota2[i]) / 2;
        }       
    }
    
    public void mostrarReprobados(){
        
        System.out.println("****LISTA DE BURROS****");
        
        for(int i=0; i<5; i++){
            
            if(promedio[i] < 4){
                
                System.out.println("NOMBRE: " + nombre[i] + " APELLIDO: " + apellido[i] + " PROMEDIOS: " + promedio[i]);
            }
        }       
    }
    
    public void mostrarAprobados(){
        
        System.out.println("****LISTA DE APROBADOS****");
        
        for(int i=0; i<5; i++){
            
            if(promedio[i] >= 4 && promedio[i] < 8){
                
                System.out.println("NOMBRE: " + nombre[i] + " APELLIDO: " + apellido[i] + " PROMEDIOS: " + promedio[i]);
            }
        }
    }
    
    
    public void mostrarPromocionados(){
        
        System.out.println("****LISTA DE PROMOCIONADOS****");
        
        for(int i=0; i<5; i++){
            
            if(promedio[i] >= 8 && nota1[i] >=4 && nota2[i] >= 4){
                
                System.out.println("NOMBRE: " + nombre[i] + " APELLIDO: " + apellido[i] + " PROMEDIOS: " + promedio[i]);
            }
        }
    }
    
    public void varonesReprobados(){
        
        int cantM = 0;
        
        for(int i=0; i<5; i++){
            
            if(sexo[i].equals("M") && promedio[i] < 4){
                
               cantM++;
               System.out.println("Cantidad de varones reprobados: " + cantM);
            }
        }
    }
    
    public void mujeresPromocionadas(){
        
        int cantF = 0;
        
        for(int i=0; i<5; i++){
            
            if(sexo[i].equals("F") && promedio[i] >= 8){
                
               cantF++;
               System.out.println("Cantidad de mujeres promocionadas: " + cantF);
            }
        }
    }
    
    public void porcentaje(){
        
        int mujeres = 0;
        float porcentajeF;
        
        for(int i=0; i<5; i++){
            
            if(sexo[i].equals("F")){
                
                mujeres++;
            }
        }
        
        porcentajeF = (mujeres * 100) / 5;
        
        System.out.println("El porcentaje de mujeres es: " + porcentajeF);
    }
    
    public void primeroSi_segundoNo(){
        
        int si_no = 0;
        
        for(int i=0; i<5; i++){
            
            if(nota1[i] >= 4 && nota2[i] < 4){
                
                si_no++;
            }
        }
        
        System.out.println("La cantidad de alumnos que aprobaron el 1er parcial y no el 2do son: " + si_no);
    }
    
}

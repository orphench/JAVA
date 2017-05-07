import java.util.Scanner;

/*
 * Ingresa por teclado
 * Fecha, Nro de Factura, nombre Cliente, Nro de Articulo, Cant. de Articulo,
 * Precio, Impuestos +3%, IVA +21%, Total a Pagar
 * Se emitieron en 6 dias consecutivos 12 facturas
 * a.- Total facturado por fecha
 * b.- Total cobrado de IVA
 * c.- Cant. vendida por articulo
 * d.- Total de clientes
 * e.- Cant. de facturas por cliente
 */

/**
 *
 * @author Chris & Marisa
 */
public class Factura {
    
    private Scanner teclado;
    private int dia[], mes, año, nroFactura[], nroArticulo[], cantArticulo[];
    private int contadorFactura = 0, hoyFactura;
    private String[] nombreCliente;
    private float precio[], impuestos = 3, iva = 21, total_pagar, totalFactura[], totalXdia[];
    
    public static void main(String[] args) {
        
        Factura unaFactura = new Factura();
        unaFactura.cargar();
        unaFactura.mostar();
        
    }
    
    public void cargar(){
        
        dia = new int[4];
        teclado = new Scanner(System.in);
        nroFactura = new int[12];
        nombreCliente = new String[12];
        nroArticulo = new int[12];
        cantArticulo = new int[12];
        precio = new float[12];
        totalFactura = new float[4];
        totalXdia = new float[4];
        
        System.out.println("*Ingresa fecha de hoy*");
        /*System.out.print("dia: ");
        dia[0] = teclado.nextInt();
        System.out.print("mes: ");
        mes = teclado.nextInt();
        System.out.print("año: ");
        año = teclado.nextInt();*/
        
        System.out.print("");
        
        //while(contadorFactura <= 12)
        //{
                         
            for (int i = 0; i < 3; i++) {
                
                if(i == 0){
                    System.out.print("dia: ");
                    dia[i] = teclado.nextInt();
                }
                else{
                    
                    dia[i] = dia[0] + i;
                } 
                
                System.out.print("Cuantas Facturas cargas el " + dia[i] + ": ");
                hoyFactura = teclado.nextInt();
                
                for (int j = 0; j < hoyFactura; j++){
                                                
                    System.out.print("Ingrese el Nro de Factura: ");
                    nroFactura[j] = teclado.nextInt();

                    System.out.print("Ingrese el Nombre del cliente: ");
                    nombreCliente[j] = teclado.next();

                    System.out.print("Ingrese el numero de articulo: ");
                    nroArticulo[j] = teclado.nextInt();

                    System.out.print("Cantidad del articulo: ");
                    cantArticulo[j] = teclado.nextInt();

                    System.out.print("Precio: ");
                    precio[j] = teclado.nextFloat();
                    
                    totalFactura[i] = cantArticulo[j] * precio[j];
                    totalXdia[i] = totalFactura[i] + totalXdia[i];
                }
            
                //contadorFactura = contadorFactura + hoyFactura;
            }
        //}
            
            
        
    }
    
    public void iva(){
        
        for (int i = 0; i < 3; i++) {
            
            
        }
        
    }
    
    public void mostar(){
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("El total del dia " + dia[i] + "es: " + totalXdia[i]);
            
        }
        
    }
    
   
    
}
    


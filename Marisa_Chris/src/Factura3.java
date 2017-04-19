import java.util.Scanner;
//Creado por Marisita la ingeniera de familia
public class Factura3{
    
    public static void main (String [] args){
        
        Scanner teclado=new Scanner (System.in);
        
        String nombre, apellido;
        int dia=0, mes=0, anio=0, diah=0, mesh=0, anioh=0, plazopago=0, nuevafecha=0, salida=0;           
        float importe=0;
        
        
        System.out.print("Ingresar nombre: ");
        nombre=teclado.next();
        
        System.out.print ("Ingresar Apellido: ");
        apellido=teclado.next ();
        
        System.out.println("Ingresar datos de la factura");
        
        System.out.print ("Ingresar Dia: ");
        dia=teclado.nextInt();
        
        System.out.print ("Ingresar Mes: ");
        mes=teclado.nextInt();
        
        System.out.print ("Ingresar Año: ");
        anio=teclado.nextInt ();
        
        System.out.print("Ingresar Importe: ");
        importe=teclado.nextFloat();
        
        System.out.print("Ingrese plazo de pago: ");
        plazopago=teclado.nextInt();
        
        System.out.println("Ingresar la fecha de hoy");
        
        System.out.print("Ingresar Dia: ");
        diah=teclado.nextInt();
        
        System.out.print("Ingresar Mes: ");
        mesh=teclado.nextInt();
        
        System.out.print("Ingresar Año: ");
        anioh=teclado.nextInt();       
        
        nuevafecha=dia+plazopago;
        
        while((nuevafecha>=31)&&(salida==0))
        {
            switch (mes)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:

                        if(nuevafecha>31)
                        {
                            nuevafecha=nuevafecha-31;
                            mes++;
                        }
                        else
                        {
                            salida++;

                        }
                        break;
                case 2: 
                    
                        if(nuevafecha>28)
                        {
                            nuevafecha=nuevafecha-28;
                            mes++;
                        }
                        break;

                case 4: case 6: case 9: case 11:

                        if(nuevafecha>30)
                        {
                            nuevafecha=nuevafecha-30;
                            mes++;
                        }
                        break;                             
            }       
        }
        
        if((nuevafecha>diah)&&(mes>=mesh)&&(anio>=anioh))
        {
            System.out.println("La fecha de vencimiento es: " + nuevafecha + "/"+mes+"/"+anio);
            System.out.println("No vencida");
        }
        
        else
        {
            if (anio>=2017)
            {
                System.out.println("La fecha de vencimiento es: " + nuevafecha + "/"+mes+"/"+anio);
                System.out.println("No vencida");
            }
            else
            {
                System.out.println("La fecha de vencimiento es: " + nuevafecha + "/"+mes+"/"+anio);
                System.out.println("Vencida");
            }
        }
    }
    
}

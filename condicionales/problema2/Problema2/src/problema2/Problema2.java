/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        > Solución que imprima el costo de un pedido de un artículo del cual se
        tiene la descripción, la cantidad que se requiere y el precio unitario.
        Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.

        */

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descr_Ar;
        double precUnitario_Ar;
        int cant_Ar;
        double costoTotal_Ar;
        
        System.out.println("Ingrese la descripcion");
        descr_Ar = entrada.nextLine();
        System.out.println("Ingrese el precio unitario del articulo");
        precUnitario_Ar = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        cant_Ar = entrada.nextInt();
        costoTotal_Ar = precUnitario_Ar * cant_Ar;
        if (cant_Ar > 50) {
            costoTotal_Ar = costoTotal_Ar - (costoTotal_Ar * 0.15);
        }
        System.out.printf("%s\nCantidad del Articulo: %s \nPrecio Unitario: %.2f \nCosto Total del Articulo: %.2f\n",descr_Ar,cant_Ar,precUnitario_Ar,costoTotal_Ar);
    }
    
}

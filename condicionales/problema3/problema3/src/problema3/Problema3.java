/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* >Elaborar una solución que permita leer los datos de un automóvil 
        (marca, origen y costo) imprima el impuesto por pagar y el precio de venta 
        (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, 
        si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese la Marca del automóvil");
        String marca_A = entrada.nextLine();
        System.out.println("Ingrese el Origen del automóvil( Alemania ,Japon ,Italia ,USA )");
        String origen_A = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        double costo_A = entrada.nextInt();
        double impuesto_A = 0;

        if (origen_A.equals("Alemania")) {
            impuesto_A = (costo_A * 20) / 100;
        } else {
            if (origen_A.equals("Japon")) {
                impuesto_A = (costo_A * 30) / 100;
            } else {
                if (origen_A.equals("Italia")) {
                    impuesto_A = (costo_A * 15) / 100;
                } else {
                    if (origen_A.equals("USA")) {
                        impuesto_A = (costo_A * 8) / 100;
                    } else {
                        System.out.println("Origen Incorrecto");
                    }
                }
            }
        }
        double precioV_A = costo_A + impuesto_A;
        System.out.printf("""
                          La marca del autom\u00f3vil es: %s
                          El Origen del autom\u00f3vil es: %s
                          El costo del autom\u00f3vil es: %.2f
                          El impuesto del autom\u00f3vil es: %.2f
                          El precio  de venta es: %.2f\n""",
                marca_A, origen_A,
                costo_A, impuesto_A, precioV_A);
    }

}

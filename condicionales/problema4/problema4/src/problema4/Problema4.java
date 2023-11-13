/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        > En una hosteria de la ciudad de Loja se hace un descuento del 10% si
        el cliente se hospeda más de 5 días,del 15% si se hospeda más de 10 días
        y del 20% si se hospeda más de 15 días. Elaborar un solución que pida
        como datos de entrada el número de días y el precio diario de la habitación 
        y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el numero de dias a hospedar");
        int num_dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitación");
        double precio = entrada.nextDouble();
        double subtotal = num_dias * precio;
        double descuento = 0;
        if (num_dias > 5 && num_dias <= 10) {
            descuento = (subtotal * 10) / 100;
        } else {
            if (num_dias > 10 && num_dias <= 15) {
                descuento = (subtotal * 15) / 100;
            } else {
                if (num_dias > 15) {
                    descuento = (subtotal * 20) / 100;
                }
            }
        }
        double total = subtotal - descuento;
        System.out.printf("El Subtotal a pagar es: %.2f\nEl Descuento es: %.2f\n"
                + "El Total a pagar es:%.2f\n", subtotal, descuento, total);
    }

}

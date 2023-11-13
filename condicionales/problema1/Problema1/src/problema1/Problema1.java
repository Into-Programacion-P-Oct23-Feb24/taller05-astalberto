/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author alber
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz.
        Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
        Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cost_kWh;
        double consumo_kWh;
        double total;
        int edad;
        System.out.println("Ingrese su Edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el valor de costo por kilovatio/hora");
        cost_kWh = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes");
        consumo_kWh = entrada.nextDouble();
        total = cost_kWh * consumo_kWh;
        if (edad > 65) {
            total = total - ((total*10)/100);
        }
        System.out.printf("El valor a cancelar de la planilla de luz es :%.2f\n", total);
        
        
    }
    
}

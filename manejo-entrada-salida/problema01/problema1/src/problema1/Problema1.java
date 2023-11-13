/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        > Generar un programa que permita calcular y presentar el área de un triángulo.
        Los datos deben ser pedidos al usuario.
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese la base del triangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("El area del triangulo es: %.2f",area);
    }

}

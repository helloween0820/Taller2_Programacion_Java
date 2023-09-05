/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorpositivosnegativos;

import java.util.Scanner;

/**
 *
 * @author sebastiancaicedo
 */
public class ContadorPositivosNegativos {

    public static void main(String[] args) {
       int positivos = 0;
        int negativos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese varios valores, termine con cero:");

        while (true) {
            int valor = sc.nextInt();

            if (valor == 0) {
                break;
            }

            if (valor > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.print("Positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

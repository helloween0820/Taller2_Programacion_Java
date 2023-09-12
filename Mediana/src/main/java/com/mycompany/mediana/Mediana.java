/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sebastiancaicedo
 */
public class Mediana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        System.out.println("Ingrese números separados por espacios y finalice con un punto '.'");
        while (true) {
            String entrada = sc.next();

            if (entrada.equals(".")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese números separados por espacios.");
            }
        }

        // Ordenar la lista de números
        Collections.sort(numeros);

        int n = numeros.size();
        double mediana;

        if (n % 2 == 1) { // Cantidad de números impar
            mediana = numeros.get(n / 2);
        } else { // Cantidad de números par
            int indice1 = n / 2 - 1;
            int indice2 = n / 2;
            double numero1 = numeros.get(indice1);
            double numero2 = numeros.get(indice2);
            mediana = (numero1 + numero2) / 2.0;
        }

        System.out.println("La mediana es " + mediana);
    }
}

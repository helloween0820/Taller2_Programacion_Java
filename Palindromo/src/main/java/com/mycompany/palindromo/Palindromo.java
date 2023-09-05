/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author sebastiancaicedo
 */
public class Palindromo {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = sc.nextLine();

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palíndromo");
        } else {
            System.out.println(numero + " no es un palíndromo");
        }
    }

    public static boolean esPalindromo(String numero) {
        // Comparar la cadena original con su versión invertida
        StringBuilder reverso = new StringBuilder(numero).reverse();
        return numero.equals(reverso.toString());
    }
}

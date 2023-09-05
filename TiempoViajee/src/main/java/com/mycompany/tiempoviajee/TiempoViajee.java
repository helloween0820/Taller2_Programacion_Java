/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiempoviajee;

import java.util.Scanner;

/**
 *
 * @author sebastiancaicedo
 */
public class TiempoViajee {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int totalMinutes = 0;

        while (true) {
            System.out.print("Duracion tramo: ");
            int duracionTramo = sc.nextInt();

            if (duracionTramo == 0) {
                break;
            }

            totalMinutes += duracionTramo;
        }

        int horas = totalMinutes / 60;
        int minutos = totalMinutes % 60;

        System.out.printf("Tiempo total de viaje: %d:%02d horas%n", horas, minutos);
    }
}

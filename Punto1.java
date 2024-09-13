package Taller2;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");
        int n = sc.nextInt();
        sc.nextLine();
     
        double[] calificaciones = new double[n];
       
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i]; 
        }

        double promedio = suma / n;

        System.out.println("Promedio de calificaciones: " + promedio);

        if (promedio >= 60) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        } 
        
    }
}

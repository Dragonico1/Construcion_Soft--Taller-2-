package Taller2;

import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número entero positivo: ");
        int num = sc.nextInt();  
        sc.nextLine(); 
         
        if (num < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int factorial = 1; 
            for (int i = 1; i <= num; i++) {
                factorial =factorial*i;  
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}

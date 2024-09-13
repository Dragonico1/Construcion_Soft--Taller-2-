package Taller2;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String Men = sc.nextLine();

        int Desplaza = 0;
        do {
            System.out.print("Ingrese el valor de desplazamiento: ");
            Desplaza = sc.nextInt();
            sc.nextLine();

            if (Desplaza <= 0) {
                System.out.println("El valor de desplazamiento debe ser mayor a 0. Intente nuevamente.");
            }
        } while (Desplaza <= 0);
        

        char[] Letras = Men.toCharArray();

        for (int i = 0; i < Letras.length; i++) {
            char c = Letras[i];

            if (c >= 'A' && c <= 'Z') {
                Letras[i] = (char) ((c - 'A' + Desplaza) % 26 + 'A');
            }
            else if (c >= 'a' && c <= 'z') {
                Letras[i] = (char) ((c - 'a' + Desplaza) % 26 + 'a');
            }
        }

        String MenC = new String(Letras);

        System.out.println("Mensaje cifrado: " + MenC);
    }
}
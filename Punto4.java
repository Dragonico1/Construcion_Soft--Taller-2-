package Taller2;

import java.util.Scanner;


public class Punto4 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad de columnas  de la Matriz 1");
        int columna=sc.nextInt();
        sc.nextLine();

        System.out.println("ingrese la cantidad de filas Matriz 1");
        int fila=sc.nextInt();
        sc.nextLine();

        System.out.println("ingrese la cantidad de columnas de la Matriz 2");
        int columna1=sc.nextInt();
        sc.nextLine();

        System.out.println("ingrese la cantidad de filas de laMatriz 2");
        int fila1=sc.nextInt();
        sc.nextLine();

        int [][] mat1=new int [fila][columna];
        int [][] mat2=new int [fila1][columna1];

        int[][] suma = new int[fila1][columna1];
       
        if(columna==columna1 && fila==fila1){

            for(int i=0;i<fila;i++){
                for(int a=0;a<columna;a++){
                    System.out.println("Ingresa los valores de la primera matriz");

                    mat1[i][a]=sc.nextInt();
                    
                }
            }

            for(int i=0;i<fila1;i++){
                for(int a=0;a<columna1;a++){
                    System.out.println("Ingresa los valores de la segunda matriz");

                    mat2[i][a]=sc.nextInt();
                }
           }

           for(int i=0;i<fila1;i++){
            for(int a=0;a<columna1;a++){

                suma[i][a]=mat1[i][a]+mat2[i][a];
                System.out.print(suma[i][a]+" ");

            }
            System.out.println();
       }

        }
        else{
            System.out.println("La dimensiones ingresadas sin incorrectas");
        }

    }
    
    
}

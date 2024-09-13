package Taller2;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();  
        ArrayList<Boolean> completadas = new ArrayList<>();  

        int opcion;

        do {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);  
                    completadas.add(false); 
                    System.out.println("Tarea agregada con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el número de la tarea completada: ");
                    int numTarea = sc.nextInt();
                    if (numTarea > 0 && numTarea <= tareas.size()) {
                        completadas.set(numTarea - 1, true);  
                        System.out.println("Tarea " + numTarea + " marcada como completada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Tareas pendientes:");
                    for (int i = 0; i < tareas.size(); i++) {
                        if (!completadas.get(i)) {
                            System.out.println((i + 1) + ". " + tareas.get(i)); 
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

    }
}


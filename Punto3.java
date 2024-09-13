package Taller2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Punto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>pares =new ArrayList<>();
        List<Integer>impares =new ArrayList<>();

        System.out.println("Ingrese la cantidad de numeros que desea ingresar:   ");
        int CantNum = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=CantNum ;i++){
            System.out.println("Ingrese el número :   " +i);
            int Num= sc.nextInt();

            if(Num %2==0){
                pares.add(Num);
            }
            else{
                impares.add(Num);
            }
        }

        System.out.println("Numeros pares : "+pares);
        System.out.println("Numeros impares : "+impares);


        
    }
    
}

package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	    //Este es un comentario

        /*
         * comentario multilinea
         */

        //VARIABLES Y SU DECLARACION:
        boolean condicion = true;
        char caracter = 96;
        char caracter2 = 'A';

        byte b = 1;
        short s = 5;

        int num = 10;
        long numeroLong = 2147483647;

        float numFloat = 3.14f;

        double numDouble = 3.14;

        String nombre = "Andrea";

        // OPERACIONES:
        //RESTA (-):

         int resta = 5-9;
         int suma = num + 6;

         int mult = resta * suma;


         double div = Double.valueOf(resta)/Double.valueOf(mult);

         int mod = 25 % 4;

         //IMPRIMIR EN CONSOLA:
        System.out.println("Esta es la resta: " + resta);
        System.out.println("Suma: " + suma);
        System.out.println("Mult: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Resto: " + mod);

        // Obtener el input en consola:
        // Librería SCANNER:
        // import java.util.Scanner;

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Ingresa tu nombre: ");
        String nomb = scanner.nextLine();

        System.out.print("Hola, tu nombre es: ");
        System.out.print(nomb + " \n");

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Hola, tu edad es: " + edad);*/

        // CONDICIONALES:
        //

        boolean res = 9 < 7;


        if (res){
            System.out.println("Aqui NO debe de entrar");

        } else if (10==10){
            System.out.println("Aqui debe de entrar");
            if (nombre.equals("Andrea")){
                System.out.println("Tu nombre es Andrea");
            }
        }
        else {
            System.out.println("Aqui NO debe de entrar");
        }

        switch (num) {
            case 1:
                System.out.println("No debería de entrar aquí");
                break;
            case 10:
                System.out.println("Ahora si debería de entrar aquí");
                break;
            default:
                System.out.println("No es ni 1 ni 10");
                break;
        }

        // for:
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //while:
        int j = 0;
        while (j < 10){
            System.out.println("Dentro del while: " + j);
            j++;
        }

        //do while:
        int x = 0;
        do {
            System.out.println("Desde el do while: " + x);
            x++;
        } while (x < 10);

        //Arreglos:
        int[] arreglo = new int[10];
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        arreglo[4] = 5;
        arreglo[5] = 6;
        arreglo[6] = 7;
        arreglo[7] = 8;
        arreglo[8] = 9;
        arreglo[9] = 10;

        System.out.println(arreglo[0]);
        System.out.println("Impresion del Arreglo con un for: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

    }
}

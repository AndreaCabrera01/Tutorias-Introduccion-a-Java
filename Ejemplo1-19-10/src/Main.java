import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        do {
            int opcion = 0;
            System.out.println("--------------MENU-----------------");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACIÓN");
            System.out.println("4. DIVISIÓN");
            System.out.println("5. SALIR");
            opcion = leer.nextInt();
            if(opcion == 1){
                // SUMA
                Menu_suma();
            }else if(opcion == 2){
                //RESTA
                System.out.println("-----------RESTA-----------");
                System.out.println("Ingresa el primer numero");
                int numero_1 = leer.nextInt();
                System.out.println("Ingresa el segundo numero");
                int numero_2 = leer.nextInt();
                Resta_de_numeros(numero_1, numero_2);
            }else if(opcion == 3){
                //MULTIPLICACION
                Menu_multiplicacion();
            }else if(opcion == 4){
                //DIVISION
                Menu_division();
            }else if(opcion == 5){
                //SALIR
                break;
            }else{
                //MENSAJE DE ERROR
                System.out.println("[ERROR] La opción que ingresaste no es valida");
            }
        }while (true);
    }

    //Funcion
    public static int Suma_de_numeros(int num1, int num2){
        return num1 + num2;
    }

    //Metodo
    public static void Resta_de_numeros(int num1, int num2){
        int resultado = num1 - num2;
        System.out.println("El resultado es "+ resultado);
    }

    //Metodo Menu-Suma
    public static void Menu_suma(){
        Scanner leer2 = new Scanner(System.in);
        System.out.println("-----------SUMA-----------");
        System.out.println("Ingresa el primer numero");
        int numero_1 = leer2.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numero_2 = leer2.nextInt();
        System.out.println("El resultado es " + Suma_de_numeros(numero_1, numero_2));
    }

    //Metodo Menu-Multiplicación
    public static void Menu_multiplicacion(){
        Scanner leer3 = new Scanner(System.in);
        System.out.println("-----------MULTPLICACION-----------");
        System.out.println("Ingresa el primer numero");
        int numero_1 = leer3.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numero_2 = leer3.nextInt();
        System.out.println("El resultado es " + Multplicacion(numero_1, numero_2));
    }

    //Funcion Multiplicación
    public static int Multplicacion(int num1, int num2){
        return num1 * num2;
    }

    //Metodo Menu-Division
    public static void Menu_division(){
        Scanner leer4 = new Scanner(System.in);
        System.out.println("-----------DIVISION-----------");
        System.out.println("Ingresa el primer numero");
        int numero_1 = leer4.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numero_2 = leer4.nextInt();
        System.out.println("El resultado es " + Division_dos_numeros(numero_1, numero_2));
    }

    //Funcion Division
    public static float Division_dos_numeros(int num1, int num2){
        return num1 / num2;
    }
}
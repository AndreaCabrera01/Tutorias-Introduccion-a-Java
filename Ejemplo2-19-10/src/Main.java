import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CREAR UN OBJETO
        //NOMBRE DE LA CLASE nombre = new NOMBRE DE LA CLASE();
        Estudiante estudiante1 = new Estudiante(201901, "Rodrigo", 22, "M");
        Estudiante estudiante2 = new Estudiante(202002, "Juan", 15, "M");
        // IMPRIMIR EL OBJETO
        //estudiante1.Imprimir();
        //estudiante2.Imprimir();
        //CAMBIAR EL VALOR DE UN ATRIBUTO
        //CAMBIAR EL CARNET
        estudiante1.setCarnet(201902);
        //estudiante1.Imprimir();
        estudiante1.setNombre("Alejandro");
        //estudiante1.Imprimir();
        estudiante1.setEdad(20);
        //estudiante1.Imprimir();

        //VALIDAR EDAD
        //estudiante1.ValidarEdad();
        //estudiante2.ValidarEdad();

        Estudiante[] estudiantes = new Estudiante[3];
        /*estudiantes[0] = estudiante1;
        estudiantes[1] = estudiante2;
        estudiantes[2] = new Estudiante(202103, "Maria", 18);
        estudiantes[3] = new Estudiante(202204, "Pedro", 17);
        estudiantes[4] = new Estudiante(202305, "Luis", 16);*/

        //IMPRIMIR TODOS LOS ESTUDIANTES
        /*for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            estudiantes[i].ValidarEdad();
        }*/

        Scanner leer = new Scanner(System.in);
        int contador = 0;
        do{
            System.out.println("----------REGISTRO DE ESTUDIANTES----------");
            System.out.println("Ingresa un carnet:");
            int carnet = leer.nextInt();
            System.out.println("Ingresa un nombre:");
            String nombre = leer.next();
            System.out.println("Ingresa una edad:");
            int edad = leer.nextInt();
            System.out.println("Ingresa un genero[M/F]:");
            String genero = leer.next();
            Estudiante nuevo_estudiante = new Estudiante(carnet, nombre, edad, genero);
            estudiantes[contador] = nuevo_estudiante;
            contador ++;
        }while(contador< 3);

        /*System.out.println("----------LISTA DE ESTUDIANTES----------");
        for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            //estudiantes[i].ValidarEdad();
        }*/

        System.out.println("----------NOTAS-----------");
        for(int i = 0; i < estudiantes.length; i ++){
            System.out.println("Ingresa la nota del estudiante " + estudiantes[i].getCarnet());
            int nota = leer.nextInt();
            estudiantes[i].setNota(nota);
        }
        System.out.println("----------LISTA DE ESTUDIANTES----------");
        for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            //estudiantes[i].ValidarEdad();
        }
    }
}
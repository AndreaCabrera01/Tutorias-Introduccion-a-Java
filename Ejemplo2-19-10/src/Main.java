import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //CREAR UN OBJETO
        //NOMBRE DE LA CLASE nombre = new NOMBRE DE LA CLASE();
        Estudiante estudiante1 = new Estudiante(201901, "Rodrigo", 22, "M");
        estudiante1.setNota(100);
        Estudiante estudiante2 = new Estudiante(202002, "Juan", 15, "M");
        estudiante2.setNota(90);
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

        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = estudiante1;
        estudiantes[1] = estudiante2;
        estudiantes[2] = new Estudiante(202103, "Maria", 18, "F");
        estudiantes[2].setNota(80);
        estudiantes[3] = new Estudiante(202204, "Pedro", 17, "M");
        estudiantes[3].setNota(70);
        estudiantes[4] = new Estudiante(202305, "Luis", 16, "M");
        estudiantes[4].setNota(60);

        //IMPRIMIR TODOS LOS ESTUDIANTES
        /*for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            estudiantes[i].ValidarEdad();
        }*/

        Scanner leer = new Scanner(System.in);
        int contador = 0;
        /*do{
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
        }while(contador< 3);*/

        /*System.out.println("----------LISTA DE ESTUDIANTES----------");
        for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            //estudiantes[i].ValidarEdad();
        }*/

        System.out.println("----------NOTAS-----------");
        /*for(int i = 0; i < estudiantes.length; i ++){
            System.out.println("Ingresa la nota del estudiante " + estudiantes[i].getCarnet());
            int nota = leer.nextInt();
            estudiantes[i].setNota(nota);
        }*/
        System.out.println("----------LISTA DE ESTUDIANTES----------");
        for(int i = 0; i < estudiantes.length; i++){
            estudiantes[i].Imprimir();
            //estudiantes[i].ValidarEdad();
        }

        String ruta = "reporte_estudiantes.html";
        FileWriter fichero = null;
        PrintWriter pw = null;
        String html = "";

        try{
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            StringBuilder lapiz = new StringBuilder();

            pw.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "\t<meta charset=\"utf-8\">\n" +
                    "\t<title>Ejemplo Reporte</title>\n" +
                    "</head>\n" +
                    "\n" +
                    "<style type=\"text/css\">\n" +
                    "body {\n" +
                    "\tmargin: 0;\n" +
                    "\tfont-family: Trebuchet MS, sans-serif;\n" +
                    "\tbackground-color: #F5F5F5;\n" +
                    "}\n" +
                    "\n" +
                    "table {\n" +
                    "\tborder-collapse: collapse;\n" +
                    "\twidth: 50%;\n" +
                    "}\n" +
                    "\n" +
                    ".topnav {\n" +
                    "\toverflow: hidden;\n" +
                    "\tbackground-color: #363062;\n" +
                    "\ttext-align: center;\n" +
                    "}\n" +
                    "\n" +
                    "td, th {\n" +
                    "\tfont-family: bahnschrift;\n" +
                    "\tborder: 1px solid #000;\n" +
                    "\ttext-align: center;\n" +
                    "\tpadding: 8px;\n" +
                    "}\n" +
                    "</style>\n" +
                    "<body>\n" +
                    "\t<div class=\"topnav\">\n" +
                    "\t\t<h1>REPORTE</h1> \n" +
                    "\t</div>\n" +
                    "\n" +
                    "\t<br><br>\n" +
                    "\n" +
                    "\t<div class=\"tableClass\" style=\"text-align: center;\">\n" +
                    "\t\t<table align=\"center\">\n" +
                    "\t\t\t<tr>\n" +
                    "\t\t\t\t<th colspan=\"4\" style=\"background-color: #4D4C7D; color:white\">Listado de Alumnos</th>\n" +
                    "\t\t\t</tr>\n" +
                    "\t\t\t<tr style=\"font-weight: bold; background-color: #F99417;\">\n" +
                    "\t\t\t\t<th>Carnet</th>\n" +
                    "\t\t\t\t<th>Nombre</th>\n" +
                    "\t\t\t\t<th>Edad</th>\n" +
                    "\t\t\t\t<th>Nota</th>\n" +
                    "\t\t\t</tr>");
            for(int i = 0; i < estudiantes.length; i++){
                pw.println("\t\t\t<tr>");
                pw.println("\t\t\t\t<td style=\"background-color: white;\">" + Integer.toString(estudiantes[i].getCarnet()) + "</td>");
                pw.println("\t\t\t\t<td style=\"background-color: white;\">" + estudiantes[i].getNombre() + "</td>");
                pw.println("\t\t\t\t<td style=\"background-color: white;\">" + Integer.toString(estudiantes[i].getEdad()) + "</td>");
                if(estudiantes[i].getNota()>=61) {
                    pw.println("\t\t\t\t<td style=\"background-color: green;\" >" + Integer.toString(estudiantes[i].getNota()) + "</td>");
                }else{
                    pw.println("\t\t\t\t<td style=\"background-color: red;\" >" + Integer.toString(estudiantes[i].getNota()) + "</td>");
                }
                pw.println("\t\t\t</tr>");
            }
            pw.println("\t\t</table>\n" +
                    "\t</div>\n" +
                    "\n" +
                    "\t<div class=\"aprep\" style=\"text-align: center;\">\n" +
                    "\t\t<p>La cantidad de alumnos que aprobaron son:</p>");
            int aprobados = 0;
            int reprobados = 0;
            for(int i = 0; i < estudiantes.length; i++){
                if(estudiantes[i].getNota()>= 61){
                    aprobados ++;
                }else {
                    reprobados ++;
                }
            }
            pw.println("\t\t<p style=\"color: green; font-weight: bold;\">"+Integer.toString(aprobados)+"</p>");
            pw.println("\t\t<p>La cantidad de alumnos que reprobaron son:</p>");
            pw.println("\t\t<p style=\"color: red; font-weight: bold;\">"+Integer.toString(reprobados)+"</p>");
            pw.println("\t</div>\n" +
                    "</body>\n" +
                    "</html>");


            System.out.println("Se genero el listado de estudiantes!");
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero){
                    fichero.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
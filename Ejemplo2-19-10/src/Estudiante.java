public class Estudiante {
    //ATRIBUTOS
    private int carnet;
    private String nombre;
    private int edad;
    private int nota;
    private String genero;

    //CONSTRUCTOR
    public Estudiante(int carnet, String nombre, int edad, String genero){
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = 0;
        this.genero = genero;
    }

    //METODOS
    // METODO IMPRIMIR ESTUDIANTE
    public void Imprimir(){
        System.out.println("-> Carnet: " + this.carnet);
        System.out.println("-> Nombre: " + this.nombre);
        System.out.println("-> Edad: " + this.edad);
        System.out.println("-> Nota: " + this.nota);
        if(this.genero.equals("M")){
            System.out.println("-> Genero: Masculino");
        }else if(this.genero.equals("F")) {
            System.out.println("-> Genero: Femenino");
        }
        if(nota >= 61){
            System.out.println("APROBADO");
        }else{
            System.out.println("REPROBADO");
        }
        System.out.println("----------------------------");
    }

    public void ValidarEdad(){
        if (this.edad >=18){
            System.out.println("El estudiante " + this.nombre +  " es mayor de edad");
        }else {
            System.out.println("El estudiante " + this.nombre +  " es menor de edad");
        }
    }

    //ENCAPSULAMIENTO
    public int getCarnet(){
        return this.carnet;
    }

    public void setCarnet(int carnet){
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

package ejercicio2_1;

public class Alumno extends Persona {

    public Alumno() {
        System.out.println("Se crea Alumno...");
        this.nombre="Sin nombre";
    }
    
    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}

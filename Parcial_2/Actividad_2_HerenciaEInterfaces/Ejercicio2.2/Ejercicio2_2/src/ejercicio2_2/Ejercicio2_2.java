package ejercicio2_2;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3,4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
    
}

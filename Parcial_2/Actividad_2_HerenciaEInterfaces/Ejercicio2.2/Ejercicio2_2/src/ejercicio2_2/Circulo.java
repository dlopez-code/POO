package ejercicio2_2;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...\n\n"
                + "Se imprime un Circulo con radio: " + radio
                + ", area: " + String.format("%.2f", calcularArea())
                + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}

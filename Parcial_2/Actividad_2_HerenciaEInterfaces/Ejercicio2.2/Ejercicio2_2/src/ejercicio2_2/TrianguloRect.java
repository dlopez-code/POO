package ejercicio2_2;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
        
        
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }
    @Override 
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt((Math.pow(ancho,2)+Math.pow(alto,2)));
        double perimetro = ancho+alto+hipotenusa;
        
        return perimetro;
    }
    
     @Override
    public String imprimeFigura() { //sobreescritura del metodo heredado
        return "Se imprime una FiguraPlana...\n\n"+"Se imprime un Triangulo con alto: "
                + alto+", ancho: "+ancho+", area: "+String.format("%.2f", calcularArea())+", perimetro:"
                +String.format("%.2f", calcularPerimetro());
    }
}

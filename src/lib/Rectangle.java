package lib;

public class Rectangle {
    double largura;
    double altura;
    public  Rectangle(double largura, double altura){
        this.altura = altura;
        this.largura = largura;

    }
    public double calcularArea(){
        return this.largura* this.altura;
    }
    public  double calcularPerimetro(){
        return this.largura * 2 + this.altura * 2;
    }
}

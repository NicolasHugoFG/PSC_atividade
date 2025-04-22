package lib;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public  Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public  void exibirDetalhes(){
        System.out.println("marca: "+this.marca+"\nmodelo: "+ this.modelo + "\nano: " + this.ano );
    }
}

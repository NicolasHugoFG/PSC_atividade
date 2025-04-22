package lib;

import java.io.Console;

public class Dog {
    String nome;
    int idade;
    String raca;

    public Dog(String nome, int idade,String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public  void latir(){
        System.out.println( this.nome  + " says: au au");

    }

    public void ler(Book book){
        book.exibirInformaçoes();
    }
}

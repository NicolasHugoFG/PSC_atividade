package lib;

public class Book {
    String nome;
    int num_pags;
    String a;

    public Book(String nome, int num_pags, String a){
        this.nome = nome;
        this.num_pags = num_pags;
        this.a = a;

    }

    public void exibirInformaçoes(){
        System.out.println("nome: " + this.nome + "\nnum_pags: "+ this.num_pags + "\nautor: "+ this.a);

    }
}

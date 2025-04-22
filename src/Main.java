import lib.Book;
import lib.ContaBancaria;
import lib.Dog;
import lib.Rectangle;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("rufus", 4, "pitbull");
        Dog dog2 = new Dog("rufus", 4, "pitbull");
        Dog dog3 = new Dog("rufus", 4, "pitbull");
        Book  book = new Book("harry poter", 300, "Sei nao");
        ContaBancaria contaBancaria = new ContaBancaria("1", 200);
        Rectangle rectangle = new Rectangle(10, 5);

        dog.latir();
        dog.ler(book);
        contaBancaria.depositar(100);
        contaBancaria.sacar(50);
        System.out.println(rectangle.calcularArea());
        System.out.println(rectangle.calcularPerimetro());


    }
}
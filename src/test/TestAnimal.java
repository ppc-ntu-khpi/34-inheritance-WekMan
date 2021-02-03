package test;
import domain.Lion;

public class TestAnimal {

    public static void main(String[] args) {
        Lion lion = new Lion("Bob");
        System.out.println(lion);
        lion.hunt();
        lion.eat();
        lion.speak();
        lion.play();
    }
}

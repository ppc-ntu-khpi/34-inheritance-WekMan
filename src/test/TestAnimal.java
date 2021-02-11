package test;
import domain.Lion;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Lion lion = new Lion("Bob");
        System.out.println(lion);
        lion.hunt();
        lion.eat();
        lion.speak();
        lion.play();
    }
}

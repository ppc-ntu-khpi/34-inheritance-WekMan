package domain;

public class Lion extends Predator {

    private String kind;

    public Lion(String name, int weight, int age, String kind) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.kind = kind;
    }

    public Lion() {
        this("Arthur",120,12,"Panthera leo persica");
    }
    
    public Lion(String name){
        this(name,120,12,"Panthera leo persica");
    }
    public void play() {
        System.out.println("Lion is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting for zebra");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind+"\n\n This is Lion";
    }

    @Override
    public void speak() {
        System.out.println("growls");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats animals");
    }
    
}

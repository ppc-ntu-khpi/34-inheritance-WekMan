package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int age;

    public Animal() {
        name="generic animal";
        weight = 120;
        age = 12;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "Animal{" + "\n Name:\t" + name + "\nWeight:\t" + weight + "\nAge:\t" + age + '}';
    }

  
}

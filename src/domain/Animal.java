package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;

    protected int age;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="generic animal";
        weight = 120;
        age = 12;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating...");
    }


/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Animal speaking...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal{" + "\n Name:\t" + name + "\nWeight:\t" + weight + "\nAge:\t" + age + '}';
    }

  
}

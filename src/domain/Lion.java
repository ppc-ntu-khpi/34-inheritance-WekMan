package domain;


 /**
 * The class Lion extends predator
 */ 
public class Lion extends Predator {

    private String kind;


/** 
 *
 * Lion
 *
 * @param name  the name
 * @param weight  the weight
 * @param age  the age
 * @param kind  the kind
 */
    public Lion(String name, int weight, int age, String kind) { 

        this.name = name;
        this.weight = weight;
        this.age = age;
        this.kind = kind;
    }


/** 
 *
 * Lion
 *
 */
    public Lion() { 

        this("Arthur",120,12,"Panthera leo persica");
    }
    

/** 
 *
 * Lion
 *
 * @param name  the name
 */
    public Lion(String name){ 

        this(name,120,12,"Panthera leo persica");
    }

/** 
 *
 * Play
 *
 */
    public void play() { 

        System.out.println("Lion is playing...");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Lion is hunting for zebra");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nKind:\t" + this.kind+"\n\n This is Lion";
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("growls");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Lion eats animals");
    }
    
}

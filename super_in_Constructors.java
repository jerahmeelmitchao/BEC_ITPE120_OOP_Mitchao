public class super_in_Constructors {
    String name;

    super_in_Constructors(String name) {
        this.name = name;
    }
}

class Dog extends super_in_Constructors {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}


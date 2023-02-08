package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.Polimorfizm.Przyklad;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myBird = new Bird();
        Animal myDog = new Dog();

        myAnimal.move();
        myBird.move();
        myDog.move();
    }
}

class Animal {
    public void move() {
        System.out.println("Poruszam się");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Latam");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Biegam");
    }
}
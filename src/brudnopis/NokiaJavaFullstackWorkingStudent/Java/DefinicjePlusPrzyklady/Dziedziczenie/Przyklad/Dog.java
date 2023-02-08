package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.Dziedziczenie.Przyklad;

public class Dog extends Animal {
    private int numberOfLegs;

    public Dog(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}

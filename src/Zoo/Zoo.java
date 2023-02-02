package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals;


    public Zoo() {
        this.animals = new ArrayList<>();
        this.animals.add(new Giraffe("Giraffe", 5, "Brown"));
        this.animals.add(new Lion("Lion", 7, "Yellow"));
        this.animals.add(new Elephant("Elephant", 20, "Gray"));
        this.animals.add(new Monkey("Monkey", 2, "Black"));
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
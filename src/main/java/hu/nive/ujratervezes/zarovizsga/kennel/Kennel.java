package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public List<Dog> addDog(Dog dog) {
        dogs.add(dog);
        List<Dog> result = dogs;
        return result;
    }

    public void feedAll() {
        for (Dog dog : dogs) {
            dog.feed();
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }


    public Dog findByName(String name) {
        Dog result = null;
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        throw new IllegalArgumentException("Can not find dog!");
    }


    public void playWith(String name, int i) {
        findByName(name).play(i);
    }

    public List<String> getHappyDogNames(int i) {
        List<String> happyDogs = new ArrayList<>();
        for (Dog dog : dogs) {
            ;
            if (dog.getHappiness() > i) {
                happyDogs.add(dog.getName());
            }
        }
        return happyDogs;
    }
}





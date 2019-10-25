package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

        Assert.assertEquals(1, (int) DogHouse.getNumberOfDogs());

    }

    @Test
    public void testRemove() {
        Date birthDate = new Date();
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog("Milo", birthDate);
        DogHouse.add(animal);
        Dog animal2 = AnimalFactory.createDog("Spot", birthDate);
        DogHouse.add(animal2);

        DogHouse.remove(1);
        Assert.assertEquals(1, (int) DogHouse.getNumberOfDogs());

        DogHouse.remove(0);
        Assert.assertEquals(0, (int) DogHouse.getNumberOfDogs());
    }
    @Test
    public void testRemoveAgain() {
        Date birthDate = new Date();
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog("Milo", birthDate);
        DogHouse.add(animal);
        Dog animal2 = AnimalFactory.createDog("Spot", birthDate);
        DogHouse.add(animal2);

        DogHouse.remove(animal);
        Assert.assertEquals(1, (int) DogHouse.getNumberOfDogs());

        DogHouse.remove(animal2);
        Assert.assertEquals(0, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void testGetDogByID() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Dog dog = DogHouse.getDogById(0);

        Assert.assertEquals(animal, dog);

    }

    @Test
    public void add() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        Assert.assertEquals(3, (int) DogHouse.getNumberOfDogs());

    }
}

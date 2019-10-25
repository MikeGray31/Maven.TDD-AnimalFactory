package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        String name = "Snowbell";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);

        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());

    }

    @Test
    public void testRemove() {
        Date birthDate = new Date();
        CatHouse.clear();
        Cat animal = AnimalFactory.createCat("Snowbell", birthDate);
        CatHouse.add(animal);
        Cat animal2 = AnimalFactory.createCat("Winstong", birthDate);
        CatHouse.add(animal2);

        CatHouse.remove(1);
        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());

        CatHouse.remove(0);
        Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
    }
    @Test
    public void testRemoveAgain() {
        Date birthDate = new Date();
        CatHouse.clear();
        Cat animal = AnimalFactory.createCat("Snowbell", birthDate);
        CatHouse.add(animal);
        Cat animal2 = AnimalFactory.createCat("Winstong", birthDate);
        CatHouse.add(animal2);

        CatHouse.remove(animal);
        Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());

        CatHouse.remove(animal2);
        Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
    }

    @Test
    public void testGetCatByID() {

        String name = "Snowbell";
        Date birthDate = new Date();
        CatHouse.clear();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);
        Cat cat = CatHouse.getCatById(0);

        Assert.assertEquals(animal, cat);

    }

    @Test
    public void add() {
        // Given (some
        String name = "Snowbell";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);
        Assert.assertEquals(3, (int) CatHouse.getNumberOfCats());

    }

}

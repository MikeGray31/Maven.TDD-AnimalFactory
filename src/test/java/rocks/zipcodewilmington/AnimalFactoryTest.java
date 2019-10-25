package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDog(){
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "Spot";
        Date birthday = new Date();

        Dog dog = animalFactory.createDog(name, birthday);

        Assert.assertEquals(birthday, dog.getBirthDate());
        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void createCat(){
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "Snowbell";
        Date birthday = new Date();

        Cat cat = animalFactory.createCat(name, birthday);

        Assert.assertEquals(birthday, cat.getBirthDate());
        Assert.assertEquals(name, cat.getName());
    }
}

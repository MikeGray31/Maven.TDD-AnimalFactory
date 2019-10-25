package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Zula";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void setBirthDatetest() {
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();
        cat.setBirthDate(givenBirthDate);
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
    }

    @Test
    public void getIdtest() {
        Integer givenId = 5;

        Cat cat = new Cat(null, null, givenId);

        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speaktest() {


        Cat cat = new Cat(null, null, null);

        String meow = cat.speak();

        Assert.assertEquals("meow!", meow);
    }

    @Test
    public void eatTest() {
        Cat cat = new Cat(null, null, null);
        Food meat = new Food();
        cat.eat(meat);
        Assert.assertEquals( 1, (int) cat.getNumberOfMealsEaten());
    }

    @Test
    public void testAnimalInheritance(){
        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(true, cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(true, cat instanceof Mammal);
    }

}

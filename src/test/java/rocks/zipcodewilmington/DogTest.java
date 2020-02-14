package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void TestSpeak() {
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSetBirthDate() {
        Date date = new Date();
        Dog dog = new Dog(null, date, null);
        Date expected = date;
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestEat() {
        Dog dog = new Dog(null, null, null);
        dog.eat(new Food());
        dog.eat(new Food());
        Integer expected = 2;
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetID() {
        Dog dog = new Dog(null, null, 1);
        Integer expected = 1;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestAnimalIheritance() {
        Dog dog = new Dog(null, null, 1);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void TestMammalInheritance() {
        Dog dog = new Dog(null, null, 1);
        Assert.assertTrue(dog instanceof Mammal);
    }
}

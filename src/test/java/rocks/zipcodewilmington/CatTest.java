package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

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
    public void TestSetName() {
        Cat cat = new Cat("", new Date(), ThreadLocalRandom.current().nextInt(1, 100));
        cat.setName("Nemo");
        String expected = "Nemo";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSpeak() {
        Cat cat = new Cat("", new Date(), ThreadLocalRandom.current().nextInt(1, 100));
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestSetBirthDate() {
        Date date = new Date();
        Cat cat = new Cat("", date, ThreadLocalRandom.current().nextInt(1, 100));
        Date expected = date;
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestEat() {
        Cat cat = new Cat("", new Date(), ThreadLocalRandom.current().nextInt(1, 100));
        cat.eat(new Food());
        cat.eat(new Food());
        Integer expected = 2;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetID() {
        Cat cat = new Cat("", new Date(), 1);
        Integer expected = 1;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestAnimalIheritance() {
        Cat cat = new Cat("", new Date(), ThreadLocalRandom.current().nextInt(1, 100));
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void TestMammalInheritance() {
        Cat cat = new Cat("", new Date(), ThreadLocalRandom.current().nextInt(1, 100));
        Assert.assertTrue(cat instanceof Mammal);
    }

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

}

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
    public void catNameTest() {
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        cat.setName("Mikeal");

        String expected = "Mikeal";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        int numberOfMealsEaten = cat.getNumberOfMealsEaten();

        cat.eat(new Food());

        int actualNumberofMealsEaten = cat.getNumberOfMealsEaten();
        int extpextedNumberOfMealsEaten = numberOfMealsEaten +1;

        Assert.assertEquals(extpextedNumberOfMealsEaten, actualNumberofMealsEaten);
    }

    @Test
    public void getIdTest() {
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        Integer actualId = cat.getId();

        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void animalInheritanceTest() {
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        boolean isAnimal = cat instanceof Animal;
        boolean expected = true;

        Assert.assertEquals(expected, isAnimal);
    }

    @Test
    public void mammalInheritanceTest() {
        String name = "Mikaila";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(name,givenBirthDate, givenId);

        boolean isMammal = cat instanceof Mammal;
        boolean expected = true;

        Assert.assertEquals(expected, isMammal);
    }
}

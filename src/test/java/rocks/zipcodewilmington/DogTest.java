package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

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
    public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);
        Date givenDate = new Date();

        dog.setBirthDate(givenDate);

        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(givenDate,actualDate);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest() {
        Dog dog = new Dog(null, null, null);
        int initMealsEaten = dog.getNumberOfMealsEaten();
        dog.eat(new Food());

        int acutalMealsEaten = dog.getNumberOfMealsEaten();
        int expectedMealsEaten = initMealsEaten +1;

        Assert.assertEquals(expectedMealsEaten, acutalMealsEaten);
    }

    @Test
    public void getIdTest() {
        int expectedID = 1;
        Dog dog = new Dog(null, null, 1);
        int actualId = dog.getId();

        Assert.assertEquals(expectedID, actualId);
    }

    @Test
	public void animalInheritanceTest() {
	    Dog dog = new Dog(null, null, null);

	    boolean isAnimal = dog instanceof Animal;

	    Assert.assertTrue(isAnimal);
    }

    @Test
	public void mammalInheritanceTest(){
	    Dog dog = new Dog(null, null, null);

	    boolean isMammal = dog instanceof Mammal;

	    Assert.assertTrue(isMammal);
    }
}

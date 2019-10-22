package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
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

    @Test
    public void addDogTest() {
        Dog dog = new Dog(null, null, 1);

        DogHouse.add(dog);

        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertEquals(dog, actualDog);
    }

    @Test
    public void removeDogByIdTest() {
        Dog dog = new Dog(null, null, 1);

        DogHouse.add(dog);
        DogHouse.remove(1);

        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertNull(actualDog);
    }

    @Test
    public void removeDogByDogTest() {
        Dog dog = new Dog(null, null, 1);

        DogHouse.add(dog);
        DogHouse.remove(dog);

        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertNull(actualDog);
    }

    @Test
    public void getDogByIdTest() {
        Dog dog = new Dog(null, null, 1);

        DogHouse.add(dog);

        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertEquals(dog, actualDog);
    }

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
    }
}

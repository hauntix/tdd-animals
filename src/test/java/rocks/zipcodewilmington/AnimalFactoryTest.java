package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

	@Test
	public void createDogTest() {
		String name = "Joe";
		Date birthDate = new Date();
		Dog dog = AnimalFactory.createDog(name, birthDate);

		String actualName = dog.getName();
		Date actualDate = dog.getBirthDate();

		Assert.assertEquals(name, actualName);
		Assert.assertEquals(birthDate, actualDate);
	}

	@Test
	public void createCatTest() {
		String name = "Mikaila";
		Date birthDate = new Date();
		Cat cat = AnimalFactory.createCat(name, birthDate);

		String actualName = cat.getName();
		Date actualDate = cat.getBirthDate();

		Assert.assertEquals(name, actualName);
		Assert.assertEquals(birthDate, actualDate);
	}
}

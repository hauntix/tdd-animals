package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
	public void addCatTest(){
		Cat cat = new Cat(null,null, 1);

		CatHouse.add(cat);
		Cat actualCat = CatHouse.getCatById(1);

		Assert.assertEquals(cat, actualCat);
	}

	@Test
	public void removeCatByCatTest() {
		Cat cat = new Cat(null, null, 1);

		CatHouse.add(cat);
		CatHouse.remove(cat);

		Cat actualCat = CatHouse.getCatById(1);

		Assert.assertNull(actualCat);
	}

	@Test
	public void removeCatByID() {
		Cat cat = new Cat(null, null, 1);

		CatHouse.add(cat);
		CatHouse.remove(1);

		Cat actualCat = CatHouse.getCatById(1);

		Assert.assertNull(actualCat);
	}

	@Test
	public void getNumberOfCatsTest() {
		Cat cat = new Cat(null, null, null);

		CatHouse.add(cat);

		int expected = 1;
		int actual = CatHouse.getNumberOfCats();

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void getCatByIdTest(){
		Cat cat = new Cat(null, null, 1);

		CatHouse.add(cat);

		Cat actualCat = CatHouse.getCatById(1);

		Assert.assertEquals(cat, actualCat);
	}


}

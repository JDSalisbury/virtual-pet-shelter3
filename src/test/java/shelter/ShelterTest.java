package shelter;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShelterTest {

	private PetShelter underTest = new PetShelter();
	private VirtualPet newPet = new VirtualPet("Bill", "", 20, 20, 20);
	private VirtualPet newPet2 = new VirtualPet("Frank", "", 20, 20, 20);

	private void addingPet() {
		underTest.admitPet(newPet);
	}

	private void addingPetTwo() {
		underTest.admitPet(newPet2);
	}

	@Test
	public void shouldAddNewPetToShelter() {
		addingPet();
		assertThat(underTest.petList(), contains(newPet));

	}

	@Test
	public void shouldAddNewTwoPetToShelter() {
		addingPet();
		addingPetTwo();
		assertThat(underTest.petList(), contains(newPet, newPet2));
	}

	@Test
	public void shouldRemoveNewPetFromShelter() {
		underTest.adoptPet(newPet.getName());
		underTest.findAnimal("Bill");
		assertThat(underTest.findAnimal("Bill"), is(nullValue()));
	}

	@Test
	public void shouldFeedAllPets() {
		addingPet();
		addingPetTwo();
		underTest.feedAll();
		assertThat(newPet.getHunger(), is(25));
		assertThat(newPet2.getHunger(), is(25));
	}

	@Test
	public void shouldWaterAllPets() {
		addingPet();
		addingPetTwo();
		underTest.waterAll();
		assertThat(newPet.getThirst(), is(25));
		assertThat(newPet2.getThirst(), is(25));
	}

	@Test
	public void shouldFunAllPets() {
		addingPet();
		addingPetTwo();
		underTest.funAll();
		assertThat(newPet.getBoredom(), is(25));
		assertThat(newPet2.getBoredom(), is(25));
	}

	@Test
	public void shouldTickAllPets() {
		addingPet();
		addingPetTwo();
		underTest.tickAll();
		assertThat(newPet.getBoredom(), is(25));
		assertThat(newPet2.getThirst(), is(25));
	}

}

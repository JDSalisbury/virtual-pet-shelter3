package shelter;

import org.junit.Assert;
import java.util.Collection;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShelterTest {

	private VirtualPet newPet;

	@Test
	public void shouldAddNewPetToShelter() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("Bob", "", 0, 0, 0);
		underTest.admitPet(newPet);
		Collection<VirtualPet> check = underTest.petList();
		assertThat(check, contains(newPet));

	}

	@Test
	public void shouldAddNewTwoPetToShelter() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("Bob", "", 0, 0, 0);
		VirtualPet newPet2 = new VirtualPet("Frank", "", 0, 0, 0);
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		Collection<VirtualPet> check = underTest.petList();
		assertThat(check, contains(newPet, newPet2));
	}

	@Test
	public void shouldRemoveNewPetFromShelter() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("Bob", "", 0, 0, 0);
		underTest.adoptPet(newPet.getName());
		underTest.findAnimal("Bob");
		VirtualPet check = underTest.findAnimal("Bob");
		assertThat(check, is(nullValue()));
	}

	@Test
	public void shouldFeedAllPets() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("", "", 20, 20, 20);
		VirtualPet newPet2 = new VirtualPet("", "", 20, 20, 20);
		underTest.feedAll();
		int check = newPet.getHunger();
		int check2 = newPet2.getHunger();
		assertThat(check, is(25));
		assertThat(check2, is(25));
	}

	@Test
	public void shouldWaterAllPets() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("", "", 20, 20, 20);
		VirtualPet newPet2 = new VirtualPet("", "", 20, 20, 20);
		underTest.waterAll();
		int check = newPet.getThirst();
		int check2 = newPet2.getThirst();
		assertThat(check, is(25));
		assertThat(check2, is(25));
	}

	@Test
	public void shouldFunAllPets() {
		PetShelter underTest = new PetShelter();
		VirtualPet newPet = new VirtualPet("", "", 20, 20, 20);
		VirtualPet newPet2 = new VirtualPet("", "", 20, 20, 20);
		underTest.funAll();
		int check = newPet.getBoredom();
		int check2 = newPet2.getBoredom();
		assertThat(check, is(25));
		assertThat(check2, is(25));
	}

}

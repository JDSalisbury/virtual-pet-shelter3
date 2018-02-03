package shelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldMakeVirtualPetObject() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
		int check = underTest.getHunger();
		assertEquals(0, check);
	}

	@Test
	public void shouldMakeVirtualPetGetsThirst() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
		int check = underTest.getThirst();
		assertEquals(0, check);
	}

	@Test
	public void shouldMakeVirtualPetGetsBoredom() {
		VirtualPet underTest = new VirtualPet("", "", 0, 0, 0);
		int check = underTest.getBoredom();
		assertEquals(0, check);
	}

	@Test
	public void shouldFeed() {
		VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(25, check);
	}

	@Test
	public void shouldWater() {
		VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);
		underTest.water();
		int check = underTest.getThirst();
		assertEquals(25, check);
	}

	@Test
	public void shouldPlay() {
		VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);
		underTest.play();
		int check = underTest.getBoredom();
		assertEquals(25, check);
	}

	@Test
	public void shouldMakeVirtualPetWithNameandDescription() {
		VirtualPet underTest = new VirtualPet("", "");
		String check = underTest.getName();
		assertEquals("", check);
	}

	@Test
	public void shouldReturnDescription() {
		VirtualPet underTest = new VirtualPet("", "");
		String check = underTest.getDescription();
		assertEquals("", check);
	}

	@Test
	public void shouldTick() {
		VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(25, check);
	}

	@Test
	public void shouldTickThirst() {
		VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);
		underTest.tick();
		int check = underTest.getThirst();
		assertEquals(25, check);
	}

}

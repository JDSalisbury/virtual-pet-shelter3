package shelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	private VirtualPet underTest = new VirtualPet("", "", 20, 20, 20);;

	@Test
	public void shouldMakeVirtualPetObject() {
		assertEquals(20, underTest.getHunger());
	}

	@Test
	public void shouldMakeVirtualPetGetsThirst() {
		assertEquals(20, underTest.getThirst());
	}

	@Test
	public void shouldMakeVirtualPetGetsBoredom() {
		assertEquals(20, underTest.getBoredom());
	}

	@Test
	public void shouldFeed() {
		underTest.feed();
		assertEquals(25, underTest.getHunger());
	}

	@Test
	public void shouldWater() {
		underTest.water();
		assertEquals(25, underTest.getThirst());
	}

	@Test
	public void shouldPlay() {
		underTest.play();
		assertEquals(25, underTest.getBoredom());
	}

	@Test
	public void shouldMakeVirtualPetWithNameandDescription() {
		assertEquals("", underTest.getName());
	}

	@Test
	public void shouldReturnDescription() {
		assertEquals("", underTest.getDescription());
	}

	@Test
	public void shouldTick() {
		underTest.tick();
		assertEquals(25, underTest.getHunger());
	}

	@Test
	public void shouldTickThirst() {
		underTest.tick();
		assertEquals(25, underTest.getThirst());
	}

}

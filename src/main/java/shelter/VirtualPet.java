package shelter;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private String description;
	private String name;

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.name = name;
		this.description = description;
	}

	public VirtualPet(int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public VirtualPet() {
		this(20, 20, 20);
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void feed() {
		int eat = 5;
		hunger += eat;

	}

	public void water() {
		int drink = 5;
		thirst += drink;

	}

	public void play() {
		int fun = 5;
		boredom += fun;

	}

	public void tick() {
		hunger -= 5;
		thirst -= 5;
		boredom -= 5;

	}

}

package shelter;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private String description;
	private String name;
	private int eat = 5;
	private int drink = 5;
	private int fun = 5;

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.name = name;
		this.description = description;
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
		hunger += eat;
	}

	public void water() {
		thirst += drink;
	}

	public void play() {
		boredom += fun;
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		boredom += 5;

	}

	@Override
	public String toString() {
		return "" + name + "\t\t|" + hunger + "\t|" + thirst + "\t|" + boredom + "\t-" + description;
	}

}

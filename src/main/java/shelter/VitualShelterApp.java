package shelter;

import java.util.Map.Entry;
import java.util.Scanner;

public class VitualShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PetShelter shelterPets = new PetShelter();

		addVirtualPets(shelterPets);

		String move;
		int turn = 0;
		int day = 0;
		do {
			statBoard(shelterPets);
			turn++;
			options();

			move = input.nextLine();

			if (move.equals("1")) {
				shelterPets.feedAll();
			}

			if (move.equals("2")) {
				shelterPets.waterAll();
			}

			ifOptionIsThree(input, shelterPets, move);

			ifOptionIsFour(input, shelterPets, move);

			ifOptionIsFive(input, shelterPets, move);

			day = theTick(shelterPets, turn, day);

		} while (!(move.equals("6")));
		exitSequence();
	}

	private static void addVirtualPets(PetShelter shelterPets) {
		VirtualPet merry = new VirtualPet("Merry", "really the only capable one");
		VirtualPet pippin = new VirtualPet("Pippin", "always ready for second breakfast");
		VirtualPet sam = new VirtualPet("Sam", "very protective of Frodo, but like in a weird way");
		VirtualPet frodo = new VirtualPet("Frodo", "kinda highstrung");

		shelterPets.admitPet(merry);
		shelterPets.admitPet(pippin);
		shelterPets.admitPet(sam);
		shelterPets.admitPet(frodo);
	}

	public static void ifOptionIsFive(Scanner input, PetShelter shelterPets, String move) {
		if (move.equals("5")) {
			System.out.println("Who whould you like to give us?");
			System.out.println("Whats its name?");
			String newPetName = input.nextLine();
			System.out.println("Could you give us a brief description?");
			String newPetDescription = input.nextLine();
			VirtualPet newPet = new VirtualPet(newPetName, newPetDescription);
			shelterPets.admitPet(newPet);
		}
	}

	public static void ifOptionIsFour(Scanner input, PetShelter shelterPets, String move) {
		if (move.equals("4")) {
			System.out.println("Who would you like to adopt?");
			for (VirtualPet entry : shelterPets.petList()) {
				System.out.println("The pet's name is " + entry.getName() + " and he is " + entry.getDescription());
			}
			String choice = input.nextLine();
			shelterPets.adoptPet(choice);
		}
	}

	public static void ifOptionIsThree(Scanner input, PetShelter shelterPets, String move) {
		if (move.equals("3")) {
			System.out.println("What pet would you like to play with?");
			for (VirtualPet entry : shelterPets.petList()) {
				System.out.println("The pet's name is " + entry.getName() + " and he is " + entry.getDescription());
			}
			String choice = input.nextLine();
			shelterPets.playWithAPet(choice);
		}
	}

	public static int theTick(PetShelter shelterPets, int turn, int day) {
		if (turn % 2 == 0) {
			shelterPets.tickAll();
			;
			day++;
			System.out.println("");
			System.out.println("You have been here for " + day + " days, thanks for volunteering your time with us at");
		}
		return day;
	}

	public static void options() {
		System.out.println("What would you like to do next?");

		System.out.println("1. Feed the pets?");
		System.out.println("2. Water the pets?");
		System.out.println("3. Play with a pet?");
		System.out.println("4. Adopt a pet?");
		System.out.println("5. Admit a pet?");
		System.out.println("6. Quite");
	}

	public static void exitSequence() {
		System.out.println("Thank you for coming to hang out with The VirtualPets of Shire Shelter");
		System.exit(0);
	}

	public static void statBoard(PetShelter shelterPets) {
		System.out.println("The VirtualPets of Shire Shelter!");
		System.out.println("________________________________________");
		System.out.println("Name\t\t|Hunger\t|Thirst\t|Boredom");

		for (Entry<String, VirtualPet> entry : shelterPets.shelter.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println("");
	}
}
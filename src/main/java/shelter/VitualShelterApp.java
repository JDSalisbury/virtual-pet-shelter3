package shelter;

import java.util.Map.Entry;

public class VitualShelterApp {

	public static void main(String[] args) {

		PetShelter shelterPets = new PetShelter();

		VirtualPet merry = new VirtualPet("Merry", "really the only capable one");
		VirtualPet pippin = new VirtualPet("Pippin", "always ready for second breakfast");
		VirtualPet sam = new VirtualPet("Sam", "very protective of Frodo, but like in a weird way");
		VirtualPet frodo = new VirtualPet("Frodo", "kinda highstrung");

		shelterPets.admitPet(merry);
		shelterPets.admitPet(pippin);
		shelterPets.admitPet(sam);
		shelterPets.admitPet(frodo);

		for (VirtualPet entry : shelterPets.petList()) {
			System.out.println("The pet's name is " + entry.getName() + " and he is " + entry.getDescription());
		}

		System.out.println("Merry is feeling kinda hungry: " + merry.getHunger());
		System.out.println("So is Pippin: " + pippin.getHunger());

		System.out.println("Lets Feed Them!");
		shelterPets.feedAll();

		System.out.println("Merry is feeling kinda hungry: " + merry.getHunger());
		System.out.println("So is Pippin: " + pippin.getHunger());

		
		
		
		System.out.println("Name\t\t|Hunger\t|Thirst\t|Boredom");
		
			for(Entry<String, VirtualPet> entry: shelterPets.shelter.entrySet()) {
				System.out.println(entry.getValue());
		}
		
	
		
	
}
}
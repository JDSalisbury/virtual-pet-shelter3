package shelter;

public class VitualShelterApp {

	public static void main(String[] args) {
		
		
		PetShelter shelter = new PetShelter();
		
		VirtualPet merry = new VirtualPet("Merry", " Perceptive and Intelligent");
		VirtualPet pippin = new VirtualPet("Pippin", "Always Ready for Second Breakfast");
		VirtualPet sam = new VirtualPet("Sam", "Very protective of Frodo");
		VirtualPet frodo = new VirtualPet("Frodo", "Kind of highstrung");
		
		shelter.admitPet(merry);
		shelter.admitPet(pippin);
		shelter.admitPet(sam);
		shelter.admitPet(frodo);
		
		for(VirtualPet entry: shelter.petList()) {
			  System.out.println("The pet's name is " + entry.getName());
			  System.out.println("and he is " + entry.getDescription());
			}
		
		System.out.println("Merry is feeling kinda hungry: "+merry.getHunger());
		System.out.println("So is Pippin: " + pippin.getHunger());
		
		System.out.println("Lets Feed Them!");
		shelter.feedAll();
		
		System.out.println("Merry is feeling kinda hungry: "+merry.getHunger());
		System.out.println("So is Pippin: " + pippin.getHunger());
		
	}

}

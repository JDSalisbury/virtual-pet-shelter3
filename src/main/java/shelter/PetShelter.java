package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	private Map<String, VirtualPet> shelter = new HashMap<>();

	public void admitPet(VirtualPet newPet) {
		shelter.put(newPet.getName(), newPet);

	}

	public Collection<VirtualPet> petList() {

		return shelter.values();
	}

	public void adoptPet(String name) {
		shelter.remove(name);

	}

	public VirtualPet findAnimal(String name) {
		return shelter.get(name);

	}

	public void feedAll() {
		for(VirtualPet shelter: shelter) {
			shelter.feed();
			
		}
		
	}

	// feedAPet
	// feeds one pet
	//
	// feedsallPets
	// go through map
	// feedAPet

}

package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();

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
		for (VirtualPet pet : petList()) {
			pet.feed();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : petList()) {
			pet.water();
		}
	}

	public void funAll() {
		for (VirtualPet pet : petList()) {
			pet.play();
		}
	}

	public void tickAll() {
		for (VirtualPet pet : petList()) {
			pet.tick();
		}
	}

	public void playWithAPet(String name) {
		shelter.get(name).play();
	}

}

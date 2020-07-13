import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	

	private Map<Material, Integer> warehouses;
	
	
	// set warehouse an empty HashMap in constructor 
	// set initial capacity to 50
	public Warehouse() {
		this.warehouses = new HashMap<>(50);
	}

	public Map<Material, Integer> getWarehouse() {
		return warehouses;
	}

	public void setWarehouse(Map<Material, Integer> warehouse) {
		this.warehouses = warehouse;
	}
	
	// add some Materials to the warehouse if quantity more than max_capasity don't add a material
	public Map<Material, Integer> addMaterial(Material material, Integer quantity) {
		if(material.getMax_capacity() < quantity) {
			System.out.print("Can't add the material, the quantity is too much");
		} else {
			warehouses.put(material, quantity);
		}
		return warehouses;	
	}
	
	// remove material from wareHouse
	public Material removeMaterial(Material material) {
		warehouses.remove(material);
		return material;
	}

	@Override
	public String toString() {
		return "Warehouses --> "+ warehouses;
	}


}

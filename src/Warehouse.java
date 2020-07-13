import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	
	
	private Map<Material, Integer> warehouse;
	
	
	// set warehouse an empty HashMap in constructor 
	// set initial capacity to 50
	public Warehouse() {
		this.warehouse = new HashMap<>(50);
	}

	public Map<Material, Integer> getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Map<Material, Integer> warehouse) {
		this.warehouse = warehouse;
	}
	
	// add some Materials to the warehouse if quantity more than max_capasity don't add a material
	public Map<Material, Integer> addMaterial(Material material, Integer quantity) {
		if(material.getMax_capacity() < quantity) {
			System.out.print("Can't add the material, the quantity is too much");
		} else {
			warehouse.put(material, quantity);
		}
		return warehouse;	
	}
	
	// remove material from wareHouse
	public Map<Material, Integer> removeMaterial(Material material) {
		warehouse.remove(material);
		return warehouse;
	}

	@Override
	public String toString() {
		return "Warehouse [warehouse=" + warehouse + "]";
	}

}

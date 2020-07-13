import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Warehouse> warehouses;
	
	// initialize warehouse to empty ArrayList
	public Player() {
		this.warehouses = new ArrayList<>();
	}

	public List<Warehouse> getWarehouses() {
	
		return warehouses;
	}

	// add warehouse to list of Warehouses for Player
	public List<Warehouse> addWarehouse(Warehouse warehouse) {
		this.warehouses.add( warehouse);
		return warehouses;
	}
	
	/*
	 * Replace material from one warehouse to another
	 * 	@param warehouse_from_index - index of warehouse from which we need to remove material
	 *	@param warehouse_to_index - index of warehouse where we replace our material
	 * 	@param material - material that we want to replace
	 * 
	 */
	
	public List<Warehouse> removeFromOneWarehouseToAnother(Integer warehouse_from_index,
			Integer warehouse_to_index, Material material) {
		
		Warehouse warehouse_from = warehouses.get(warehouse_from_index);
		Warehouse warehouse_to = warehouses.get(warehouse_to_index);
		
		//get the material quantity from the warehouse
		Integer quantity_from = warehouse_from.getWarehouse().get(material);		
	
		if(warehouse_to.getWarehouse().containsKey(material)) {
			
			// check material total quality if we replace it
			Integer quantity_to = warehouse_to.getWarehouse().get(material);
			Integer total_quantity = quantity_from + quantity_to;
			
			
			if(total_quantity > material.getMax_capacity() && quantity_to == material.getMax_capacity()) {
				System.out.println("Can't replace the material");

			} else if(quantity_to < material.getMax_capacity() && total_quantity > material.getMax_capacity()) {
				
				total_quantity = (material.getMax_capacity() - quantity_to) + quantity_to;
				warehouse_to.getWarehouse().put(material, total_quantity);
				System.out.print("Material replaced partial");
			} else {
				warehouse_from.removeMaterial(material);
				warehouse_to.getWarehouse().put(material, total_quantity);	
			}
		} else {
			warehouse_from.removeMaterial(material);
			warehouse_to.getWarehouse().put(material, quantity_from);
		}
				
		return warehouses;
	}
	
	public void showWarehouses() {
		for(Warehouse warehouse : warehouses) {
			System.out.println(warehouse);
		}
	}
}

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Warehouse> warehouses;
	
	// initialize warehose to emty ArrayList
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

	@Override
	public String toString() {
		return "Player [warehouse=" + warehouses + "]";
	}
}

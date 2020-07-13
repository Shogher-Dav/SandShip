
public class Game {

	public static void main(String[] args) {
		
		//Create first player
		Player player1 = new Player();

		// Create materials that can be added 
		Material iron_material = new Material("Iron", "Iron is a silver-gray metal", "icon_of_iron", 55);
		Material copper_material = new Material("Copper", "Copper is produced in massive stars", "icon_of_copper", 30);
		Material bolt_material = new Material("Bolt", "Bolt is produced in massive stars", "icon_of_bolt", 100);

		
		//Create a warehouse
		Warehouse first_warehouse = new Warehouse();
		Warehouse second_warehouse = new Warehouse();

		// add warehouses to player
		player1.addWarehouse(first_warehouse);
		player1.addWarehouse(second_warehouse);
		
		first_warehouse.addMaterial(iron_material, 20);
		first_warehouse.addMaterial(bolt_material, 15);
		first_warehouse.addMaterial(copper_material, 10);


		
		second_warehouse.addMaterial(iron_material, 55);
		second_warehouse.addMaterial(copper_material, 10);
		second_warehouse.addMaterial(copper_material, 5);
		
		// remove iron_material from the fisrt_warehouse
		first_warehouse.removeMaterial(iron_material);
		
		
		// replace bolt_material from first warehouse to second	
		player1.removeFromOneWarehouseToAnother(0, 1, bolt_material);
		
		player1.showWarehouses();



	}

}

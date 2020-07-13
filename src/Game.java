
public class Game {

	public static void main(String[] args) {
		
		//Create first player
		Player player1 = new Player();

		// Create materials that can be added 
		Material iron_material = new Material("Iron", "Iron is a silver-gray metal", "icon_of_iron", 50);
		Material copper_material = new Material("Copper", "Copper is produced in massive stars", "copper_of_iron", 30);
		
		//Create a warehouse
		Warehouse first_warehouse = new Warehouse();
		
		first_warehouse.addMaterial(iron_material, 50);
		first_warehouse.addMaterial(copper_material, 10);
		
		first_warehouse.removeMaterial(iron_material);
		
		System.out.println(player1.addWarehouse(first_warehouse));


	}

}


public class Material {
	
	private String name;
	private String description;
	private String icon;
	private Integer max_capacity;
	
	/*
	 * Constructor for a Material.
	 * 
	 * @param name- name of material
	 * @param description- description of material
	 * @param icon- icon for material
	 * @param max_capacity - the max value of material that you can store in warehouse
	 */
	
	public Material(String name, String description, String icon, Integer max_capacity) {
		this.name = name;
		this.description = description;
		this.icon = icon;
		this.max_capacity = max_capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getMax_capacity() {
		return max_capacity;
	}

	public void setMax_capacity(Integer max_capacity) {
		this.max_capacity = max_capacity;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", description=" + description + ", icon=" + icon + ", max_capacity="
				+ max_capacity + "]";
	}
}

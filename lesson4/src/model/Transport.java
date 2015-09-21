package model;

public abstract class Transport {
	public Transport(String model, String manufacturer, String weight, int year) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.year = year;
	}
	private String model;
	private String manufacturer;
	private String weight;
	private int year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public abstract void build();
	
}

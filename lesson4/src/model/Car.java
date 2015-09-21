package model;

public class Car extends Transport {

	public Car(String model, String manufacturer, String weight, int year,
			String carcass) {
		super(model, manufacturer, weight, year);
		this.carcass = carcass;
	}
	public Car(String model, String manufacturer, String weight, int year) {
		super(model, manufacturer, weight, year);
		// TODO Auto-generated constructor stub
	}
	private String carcass;
	public String getCarcass() {
		return carcass;
	}
	public void setCarcass(String carcass) {
		this.carcass = carcass;
	}
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("build from car");
		
	}
	

}

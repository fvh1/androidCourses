package model;

public class Bus extends Transport {

	public Bus(String model, String manufacturer, String weight, int year,
			String route) {
		super(model, manufacturer, weight, year);
		this.route = route;
	}
	public Bus(String model, String manufacturer, String weight, int year) {
		super(model, manufacturer, weight, year);
		// TODO Auto-generated constructor stub
		
	}
	private String route;
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("build from Bus");
	}
}

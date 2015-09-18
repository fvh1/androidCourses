
public class Car {
	private String maker;
	private String model;
	private String color;
	private int year;
	Car (String maker, String  model, String  color, int year){
		this.maker=maker;
		this.color=color;
		this.model=model;
		this.year=year;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return this.maker+", "+this.model+", "+this.color+Integer.toString(this.year);
	}
}

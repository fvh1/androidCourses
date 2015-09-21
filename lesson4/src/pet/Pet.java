package pet;

public abstract class Pet {
	
	public Pet(String name, String type, String color, boolean isHungry) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.isHungry = isHungry;
	}
	private String name;
	private String type;
	private String color;
	private boolean isHungry;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	public String aboutPet(){
		String isHungry;
		if (this.isHungry){
			isHungry="is hungry";
		}else{
			isHungry="is not hungry";
		}
		return this.name+" is a "+this.color+" "+this.type+". Now it "+isHungry+".";
	}
	public abstract void eat(String food);
	public abstract void say();
	public abstract void play(String toy);
}

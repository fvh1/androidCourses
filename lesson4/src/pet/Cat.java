package pet;

public class Cat extends Pet {

	public Cat(String name, String color, boolean isHungry) {
		super(name, "cat", color, isHungry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		if (food.equalsIgnoreCase("milk")){
			this.setHungry(false);
			System.out.println(this.getName()+" drinks milk");
		}
		if (food.equalsIgnoreCase("bone")){
			System.out.println(this.getName()+" rejects bone");
		}
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		String say;
		if (this.isHungry()){
			say="Maw!";
		}else{
			say="Mrr";
		}
		System.out.println(this.getName()+" says "+say);
	}

	@Override
	public void play(String toy) {
		// TODO Auto-generated method stub
		if (toy.equalsIgnoreCase("bow-knot")){
			System.out.println(this.getName()+" plays with "+toy);
		}
		if (toy.equalsIgnoreCase("branch")){
			System.out.println(this.getName()+" ignores "+toy);
		}
	}

}

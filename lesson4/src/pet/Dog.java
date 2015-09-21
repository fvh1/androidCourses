package pet;

public class Dog extends Pet {

	public Dog(String name, String color, boolean isHungry) {
		super(name, "dog", color, isHungry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		if (food.equalsIgnoreCase("bone")){
			this.setHungry(false);
			System.out.println(this.getName()+" eats bone");
		}
		if (food.equalsIgnoreCase("milk")){
			System.out.println(this.getName()+" rejects milk");
		}
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		String say;
		if (this.isHungry()){
			say="Grrrow!";
		}else{
			say="Wof";
		}
		System.out.println(this.getName()+" says "+say);
	}

	@Override
	public void play(String toy) {
		// TODO Auto-generated method stub
		if (toy.equalsIgnoreCase("branch")){
			System.out.println(this.getName()+" plays with "+toy);
		}
		if (toy.equalsIgnoreCase("bow-knot")){
			System.out.println(this.getName()+" ignores "+toy);
		}
	}

}

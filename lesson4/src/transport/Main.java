package transport;

import pet.Cat;
import pet.Dog;
import pet.Pet;



public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet;
		boolean isCat=true;
		if(isCat){
			pet=new Cat("Kitty","Black",true);
		}else{
			pet=new Dog("Bobby","Yellow",false);
		}
		System.out.println(pet.aboutPet());
		pet.eat("milk");
		pet.say();
		pet.play("branch");
	}

}

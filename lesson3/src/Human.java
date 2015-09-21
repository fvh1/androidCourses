import java.util.Date;
import java.util.Scanner;


public class Human {
	//constructor
	public Human(String firstName, String secondName, Date birthDate,
			boolean isNotAWoman) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthDate = birthDate;
		this.isNotAWoman = isNotAWoman;
	}
	public Human(){
		Scanner sc= new Scanner(System.in);
		System.out.print("First name: ");
		this.firstName=sc.nextLine();
		System.out.print("Second name: ");
		this.secondName=sc.nextLine();
		System.out.print("Birth date (dd mm yyyy): ");
		this.birthDate=new Date(sc.nextInt(), sc.nextInt(),sc.nextInt());
		boolean correctSex=false;
		while (!correctSex){
			System.out.print("Sex (male/female:)");
			String sex=sc.next();
			if (sex.equalsIgnoreCase("male")){
				this.isNotAWoman=true;
				correctSex=true;
			}else if(sex.equalsIgnoreCase("female")){
				this.isNotAWoman=false;
				correctSex=true;
			}
			
		}
		//sc.close();
		
	}
	protected String firstName;
	protected String secondName;
	protected Date birthDate;
	//sexist jokes
	protected boolean isNotAWoman;
	//auto-generated getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public boolean getSex() {
		return isNotAWoman;
	}
	public void setSex(boolean isNotAWoman) {
		this.isNotAWoman = isNotAWoman;
	}
	public String toString(){
		return this.firstName+' '+this.secondName;
	}
	
}

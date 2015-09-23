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
			System.out.print("Sex (male/female):");
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (isNotAWoman ? 1231 : 1237);
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isNotAWoman != other.isNotAWoman)
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}
}
	

import java.util.ArrayList;


public class city {
	public static class Toponim{
		public Toponim(String name, GPS gps) {
			super();
			this.name = name;
			this.gps = gps;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public GPS getGps() {
			return gps;
		}
		public void setGps(GPS gps) {
			this.gps = gps;
		}
		public class Home{
			public Home(String number, GPS gps) {
				super();
				this.number = number;
				this.gps = gps;
			}
			public String number;
			public GPS gps;
			public String getNumber() {
				return number;
			}
			public GPS getGps() {
				return gps;
			}
		}
		public String name;
		public GPS gps;
		public String postfix;
		public ArrayList<Home> homes;
		public void addHome(String number, GPS gps){
			this.homes.add(new Home(number, gps));
		}
		public ArrayList<Home> getHomes() {
			return homes;
		}
		public Home getHome(String number){
			for (Home home:this.homes){
				if (home.getNumber().equals(number))
					return home;
			}
			System.out.println("There is no home you are looking for");
			return null;
		}
	}
	public class Street extends Toponim{

		public Street(String name, GPS gps) {
			super(name, gps);
			this.postfix="Street";
			// TODO Auto-generated constructor stub
		}
		
	}
	public class Square extends Toponim{

		public Square(String name, GPS gps) {
			super(name, gps);
			this.postfix="Square";
			// TODO Auto-generated constructor stub
		}
		
	}
	private ArrayList<Toponim> toponims;
	public void addStreet(String name, GPS gps){
		this.toponims.add(new Street(name,gps));
	}
	public void addSquare(String name, GPS gps){
		this.toponims.add(new Street(name,gps));
	}
	public void addHome(String toponimName, String number, GPS gps){
		for (Toponim toponim:this.toponims){
			if (toponim.name.equals(toponimName)){
				toponim.addHome(number,gps);
				return;
			}
		}
		System.out.println("There is no toponim you are looking for");
	}
	
}

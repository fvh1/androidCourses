import java.util.Date;
import java.util.Scanner;


public class Doctor extends Human {
	public Doctor(String firstName, String secondName, Date birthDate,
			boolean isNotAWoman, String specialisation, Hospital hospital) {
		super(firstName, secondName, birthDate, isNotAWoman);
		this.specialization=specialisation;
		this.hospital=hospital;
		// TODO Auto-generated constructor stub
	}
	public Doctor(Hospital hospital){
		super();
		this.hospital=hospital;
		Scanner sc= new Scanner(System.in);
		boolean correctSpecialization=false;
		while (!correctSpecialization){
			System.out.print("Specialization (traumatologist|not traumatologist):)");
			String specialization=sc.next();
			if (specialization.equalsIgnoreCase("traumatologist")||specialization.equalsIgnoreCase("not traumatologist")){
				this.specialization=specialization;
				correctSpecialization=true;
			}
		}
		//sc.close();
	}
	private Hospital hospital;
	private String specialization;
	//int max=hospital.getMaxNumberOfPatientsPerDoctor();
	private Patient [] listOfPatients=new Patient[5];
	public String getSpecialisation() {
		return specialization;
	}

	public void setSpecialisation(String specialization) {
		this.specialization = specialization;
	}
	
	public Patient[] getListOfPatients() {
		return listOfPatients;
	}
	public boolean addPatient(Patient patient){
		boolean isAdded=false;
		for (int i=0;i<10;i++){
			
			try {
				boolean b=listOfPatients[i]==null;
			}
			finally{
				listOfPatients[i]=patient;
				isAdded=true;
			}
			
		}
		return isAdded;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}

import java.util.Date;
import java.util.Scanner;


public class Patient extends Human {

	public Patient(String firstName, String secondName, Date birthDate,
			boolean isNotAWoman, String diagnosis, Doctor doctor) {
		super(firstName, secondName, birthDate, isNotAWoman);
		// TODO Auto-generated constructor stub
		this.doctor=doctor;
		this.diagnosis=diagnosis;
	}
	public Patient(Date birthDate,
			boolean isNotAWoman) {
		super("firstName", "Doe", birthDate, isNotAWoman);
		if (isNotAWoman){
			this.firstName="John";
		}else{
			this.firstName="Jane";
		}
		
	}
	public Patient(){
		super();
		Scanner sc= new Scanner(System.in);
		System.out.print("Diagnosis:");
		this.diagnosis=sc.next();
		//sc.close();
	}
	private String diagnosis;
	private Doctor doctor;
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

}

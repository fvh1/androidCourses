import java.util.ArrayList;


public class Hospital {
	public Hospital(String name) {
		this.name = name;
		
	}
	private String name;
	private ArrayList<Doctor> listOfDoctors= new ArrayList<Doctor>();
	private ArrayList<Patient> listOfPatients= new ArrayList<Patient>();
	
	public ArrayList<Doctor> getListOfDoctors() {
		return listOfDoctors;
	}
	public ArrayList<Patient> getListOfPatients() {
		return listOfPatients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addDoctor(){
		Doctor doctor=new Doctor(this);
		this.listOfDoctors.add(doctor);
	}
	private String diagnostics(String diagnosis){
		String specialization="";
		if (diagnosis.equalsIgnoreCase("broken_leg")||diagnosis.equalsIgnoreCase("broken_arm")){
			specialization="traumatologist";
		}else{
			specialization="non-traumatologist";
		}
		return specialization;
	}
	public void addNewPatient (){
		Patient patient= new Patient();
		this.listOfPatients.add(patient);
		String specialization=diagnostics(patient.getDiagnosis());
		for (Doctor doctor:listOfDoctors){
			if (doctor.getSpecialization().equalsIgnoreCase(specialization)){
				doctor.addPatient(patient);
			}
		}
	}
}

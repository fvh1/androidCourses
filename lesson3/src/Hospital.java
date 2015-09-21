
public class Hospital {
	public Hospital(String name, int maxNumberOfPatients,
			int maxNumberOfDoctors, int maxNumberOfPatientsPerDoctor) {
		this.name = name;
		this.maxNumberOfPatients = maxNumberOfPatients;
		this.maxNumberOfDoctors = maxNumberOfDoctors;
		this.maxNumberOfPatientsPerDoctor = maxNumberOfPatientsPerDoctor;
	}
	private String name;
	private int maxNumberOfPatients;
	private int maxNumberOfDoctors;
	private int maxNumberOfPatientsPerDoctor;
	private Doctor [] listOfDoctors= new Doctor [maxNumberOfDoctors];
	private Patient [] listOfPatients= new Patient [maxNumberOfPatients];
	public int getMaxNumberOfPatients() {
		return maxNumberOfPatients;
	}
	public void setMaxNumberOfPatients(int maxNumberOfPatients) {
		this.maxNumberOfPatients = maxNumberOfPatients;
	}
	public int getMaxNumberOfDoctors() {
		return maxNumberOfDoctors;
	}
	public void setMaxNumberOfDoctors(int maxNumberOfDoctors) {
		this.maxNumberOfDoctors = maxNumberOfDoctors;
	}
	public int getMaxNumberOfPatientsPerDoctor() {
		return maxNumberOfPatientsPerDoctor;
	}
	public void setMaxNumberOfPatientsPerDoctor(int maxNumberOfPatientsPerDoctor) {
		this.maxNumberOfPatientsPerDoctor = maxNumberOfPatientsPerDoctor;
	}
	public Doctor[] getListOfDoctors() {
		return listOfDoctors;
	}
	public Patient[] getListOfPatients() {
		return listOfPatients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void populateDoctors(){
		for (int i=0;i<maxNumberOfDoctors;i++){
			listOfDoctors[i]=new Doctor(this);
				
			
		}
	}
	private String diagnostics(String diagnosis){
		String specialization="";
		if (diagnosis=="broken leg"||diagnosis=="broken arm"){
			specialization="traumatologist";
		}else{
			specialization="not traumatologist";
		}
		return specialization;
	}
	public boolean addNewPatient (){
		Patient patient= new Patient();
		String specialization=diagnostics(patient.getDiagnosis());
		for (int i=0;i<maxNumberOfPatients;i++){
			if (listOfPatients[i]==null){
				for (Doctor doctor:listOfDoctors){
					if (doctor.getSpecialization()==specialization){
						if (doctor.addPatient(patient)){
							return doctor.addPatient(patient);
						}
					}
				}
			}
		}
		return false;
	}
}

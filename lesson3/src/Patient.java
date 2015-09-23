import java.util.Date;
import java.util.Scanner;
import java.util.Set;


public class Patient extends Human {

	public Patient(String firstName, String secondName, Date birthDate,
			boolean isNotAWoman, String diagnosis, Doctor doctor, Hospital hospital) {
		super(firstName, secondName, birthDate, isNotAWoman);
		// TODO Auto-generated constructor stub
		this.doctor=doctor;
		this.diagnosis=diagnosis;
		this.hospital=hospital;
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
	public Patient(Hospital hospital){
		super();
		Scanner sc= new Scanner(System.in).useDelimiter("\\r\\n");;
		boolean correctDiagnosis=false;
		while (!correctDiagnosis){
			System.out.print("Diagnosis: (");
			Set<String> listOfDiagnosis=hospital.getlistOfDiagnosis();
			for (String Diagnosis:listOfDiagnosis){
				System.out.print(Diagnosis+"|");
			}
			System.out.println("):");
			String Diagnosis=sc.next();
			if (listOfDiagnosis.contains(Diagnosis)){
				this.diagnosis=Diagnosis;
				correctDiagnosis=true;
				break;
			}
		}
		//sc.close();
	}
	private Hospital hospital;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		return true;
	}
	

}


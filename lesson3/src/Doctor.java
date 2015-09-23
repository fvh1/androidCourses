import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;


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
		Scanner sc= new Scanner(System.in).useDelimiter("\\r\\n");
		boolean correctSpecialization=false;
		ArrayList<String> listOfSpecializations=hospital.getlistOfSpecializations();
		while (!correctSpecialization){
			System.out.print("Specialization (");
			for (String spec:listOfSpecializations){
				System.out.print(spec+"|");
			}
			System.out.println("):");
			String spec=sc.next();
			for (int i=0;i<listOfSpecializations.size();i++){
				if (listOfSpecializations.get(i).equals(spec)){
					this.specialization=spec;
					correctSpecialization=true;
					break;
				}
			}
		}
		//sc.close();
	}
	private Hospital hospital;
	private String specialization;
	private ArrayList<Patient> listOfPatients= new ArrayList<Patient>();
	public String getSpecialisation() {
		return specialization;
	}

	public void setSpecialisation(String specialization) {
		this.specialization = specialization;
	}
	
	public ArrayList<Patient> getListOfPatients() {
		return listOfPatients;
	}
	public void addPatient(Patient patient){
		this.listOfPatients.add(patient);
		
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
	public int getNumberOfPatients(){
		return this.listOfPatients.size();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
		result = prime * result + ((listOfPatients == null) ? 0 : listOfPatients.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		Doctor other = (Doctor) obj;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		if (listOfPatients == null) {
			if (other.listOfPatients != null)
				return false;
		} else if (!listOfPatients.equals(other.listOfPatients))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

}


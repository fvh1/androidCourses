import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Set;


public class Hospital {
	public Hospital(String name) {
		this.name = name;
		try {
			BufferedReader illnessList = new BufferedReader(new FileReader("src/illnessList.csv"));
			while (illnessList.ready()){
				String [] currentIllness=illnessList.readLine().split(";");
				this.illnessSpecialization.put(currentIllness[0], currentIllness[1]);
			}
			illnessList.close();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private String name;
	private ArrayList<Doctor> listOfDoctors= new ArrayList<Doctor>();
	private ArrayList<Patient> listOfPatients= new ArrayList<Patient>();
	private HashMap <String, String> illnessSpecialization=new HashMap<String, String>();
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
	public void addNewPatient (){
		Patient patient= new Patient(this);
		this.listOfPatients.add(patient);
		String specialization=this.illnessSpecialization.get(patient.getDiagnosis());
		int minNumberOfPatients=Integer.MAX_VALUE;
		int numberOfDoctor=0;
		for (int i=0;i<listOfDoctors.size();i++){
			if (listOfDoctors.get(i).getSpecialization().equalsIgnoreCase(specialization)){
				if (minNumberOfPatients>listOfDoctors.get(i).getNumberOfPatients()){
					minNumberOfPatients=listOfDoctors.get(i).getNumberOfPatients();
					numberOfDoctor=i;
				}
			}
		}
		listOfDoctors.get(numberOfDoctor).addPatient(patient);
	}
	public Set<String> getlistOfDiagnosis(){
		return illnessSpecialization.keySet();
	}
	public ArrayList<String> getlistOfSpecializations(){
		ArrayList<String> listOfSpecializations=new ArrayList<String>();
		String[] fullList=this.illnessSpecialization.values().toArray(new String[0]);
		for (int i=0;i<fullList.length;i++){
			if (!listOfSpecializations.contains(fullList[i])){
				listOfSpecializations.add(fullList[i]);
			}
		}
		return listOfSpecializations;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((illnessSpecialization == null) ? 0 : illnessSpecialization.hashCode());
		result = prime * result + ((listOfDoctors == null) ? 0 : listOfDoctors.hashCode());
		result = prime * result + ((listOfPatients == null) ? 0 : listOfPatients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Hospital other = (Hospital) obj;
		if (illnessSpecialization == null) {
			if (other.illnessSpecialization != null)
				return false;
		} else if (!illnessSpecialization.equals(other.illnessSpecialization))
			return false;
		if (listOfDoctors == null) {
			if (other.listOfDoctors != null)
				return false;
		} else if (!listOfDoctors.equals(other.listOfDoctors))
			return false;
		if (listOfPatients == null) {
			if (other.listOfPatients != null)
				return false;
		} else if (!listOfPatients.equals(other.listOfPatients))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Calendar getEverageDoctorsAge(){
		long everage=0;
		Date current=new Date();
		for(Doctor doctor:this.listOfDoctors){
			everage+=current.getTime()-doctor.getBirthDate().getTime();
		}
		everage=everage/this.listOfDoctors.size();
		Calendar avg=new GregorianCalendar();
		avg.setTimeInMillis(everage);
		return avg;
	}
}
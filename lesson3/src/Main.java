import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hospital hospital=new Hospital("Hospital #1");
		System.out.println("Doctor#1");
		hospital.addDoctor();
		System.out.println("Doctor#2");
		hospital.addDoctor();
		System.out.println("Patient#1");
		hospital.addNewPatient();
		System.out.println("Patient#2");
		hospital.addNewPatient();
		System.out.println("Patient#3");
		hospital.addNewPatient();
		System.out.println("Patient#4");
		hospital.addNewPatient();
		System.out.println("Patient#5");
		hospital.addNewPatient();
		Scanner sc= new Scanner(System.in);
		sc.close();
		System.out.println("List of patients:");
		ArrayList<Doctor> listOfDoctors=hospital.getListOfDoctors();
		for (int i=0;i<listOfDoctors.size();i++){
			ArrayList<Patient> listOfPatients=listOfDoctors.get(i).getListOfPatients();
			for(int j=0;j<listOfPatients.size();j++){
				System.out.println("Patient "+listOfPatients.get(j).toString()+"- Doctor "+listOfDoctors.get(i).toString());
			}
		}
		
	}

}

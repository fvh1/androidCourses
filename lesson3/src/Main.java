import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hospital hospital=new Hospital("Hospital #1",5,2,5);
		hospital.populateDoctors();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		Scanner sc= new Scanner(System.in);
		sc.close();
		Patient [] listOfPatients=hospital.getListOfPatients();
		
		for (Patient patient:listOfPatients){
			System.out.println(patient.toString()+"- "+patient.getDoctor().toString());
		}
		
	}

}

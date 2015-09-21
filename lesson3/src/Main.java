import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hospital hospital=new Hospital("Hospital #1");
		hospital.addDoctor();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		hospital.addNewPatient();
		Scanner sc= new Scanner(System.in);
		sc.close();
		for (Doctor doctor:hospital.getListOfDoctors()){
			for(Patient patient:doctor.getListOfPatients()){
				System.out.println("Patient "+patient.toString()+"- Doctor "+doctor.toString());
			}
		}
		
	}

}

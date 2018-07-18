package appointmentapp;

import java.util.ArrayList;

public class ListOfPatient {

	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void add(Patient p) {
		this.patients.add(p);
	}
	
	public void remove(Patient p) {
		this.patients.remove(p);
	}
}

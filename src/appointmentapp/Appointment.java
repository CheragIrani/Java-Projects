package appointmentapp;

import java.time.LocalDate;

public class Appointment {


private LocalDate date;
private Doctor doctor;
private Patient patient;


public LocalDate getDate(){
	return date;
}
public Person getPatient(){
	return patient;
}
public Person getDoctor(){
	return doctor;
}

public void setDate(LocalDate date){
	this.date = date;
}
public void setDoctor(Doctor doctor){
	this.doctor = doctor;
}
public void setPatient(Patient patient){
	this.patient = patient;
}
}

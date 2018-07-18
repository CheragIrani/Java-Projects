package appointmentapp;

public abstract class Person {
	private String name;
	private String surname;
	
	public String getName(){
		if (name == null) return "";
		return name;
	}
	public String getSurname(){
		if (surname == null) return "";
		return surname;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public String toString() {
		return name + " " + surname;
	}
	
	public boolean equals(Object other) {
		// return other == this;
		
		if (this == other) return true;
		if (other instanceof Person) {
			Person otherPerson = (Person)other;
			if (!getName().equals(otherPerson.getName())) return false;
			if (!getSurname().equals(otherPerson.getSurname())) return false;
			return true;
		} else {
			return false;
		}
	}
	
	
}

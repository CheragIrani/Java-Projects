package appointmentapp;

public class Patient extends Person {
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int hashCode() {
		return getAge() + getName().hashCode() + getSurname().hashCode();
	}
	
	public String toString() {
		String personToString = super.toString();
		return "Patient " + personToString + " with age " + age;
	}
	
	public boolean equals(Object other) {
		if (!super.equals(other)) return false;
		if (other instanceof Patient){
			Patient otherPatient = (Patient)other;
			return this.age == otherPatient.age;
		}else return false;
	}
	
	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.setName("P1");
		p1.setAge(20);
		Patient p2 = new Patient();
		p2.setName("P2");
		p2.setAge(20);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() == p2.hashCode());
		
	}
}

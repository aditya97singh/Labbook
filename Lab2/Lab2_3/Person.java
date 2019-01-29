package Labbook_mod1.lab2.lab2_3;

public class Person {
 private String firstName;
 private String lastName;
 private char gender;
 public Person(String f,String l,char g)
 {
	 this.firstName=f;
	 this.lastName=l;
	 this.gender=g;
 }
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
 
}

package Labbook_mod1.lab2.lab2_3;

public class PersonMain {

	public static void main(String[] args) {
		
    Person p=new Person("Aditya","Singh",'M');
    System.out.println("Person Details");
    System.out.println("______________");
    System.out.println("First Name:"+p.getFirstName());
    System.out.println("Last Name:"+p.getLastName());
    System.out.println("Gender:"+p.getGender());

	}

}

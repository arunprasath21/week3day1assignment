package week3.Day1.org.Bank;

public class Students {
	 
	public void getStudentInfo (int id) {
			id = 12548;
	}
	public void getStudentInfo (int id ,String name) {
		id = 1234;
		name = "Arun";
	}
	public void getStudentInfo (String email ,int phonenumber ) {
	 	email = "arunselvaraj21@gmail.com";
	 	phonenumber = 984025864;
	}
	 	public static void main(String[] args) {
			Students stud = new Students();
			
			stud.getStudentInfo(12548);
			System.out.println(12548);
			
			stud.getStudentInfo(1234, "Arun");
			System.out.println(1234 + " Arun");
			
			stud.getStudentInfo("arunselvaraj21@gmail.com" , 984025864);
			System.out.println("arunselvaraj21@gmail.com"  +  984025864);
	}
		 
}
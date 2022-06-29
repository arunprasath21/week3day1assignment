package week3.Day1.org.Bank;

public class Students {
	 
	public void getStudentInfo (int id) {
			 System.out.println("The ID : " + id );
	}
	public void getStudentInfo (int id ,String name) {
			System.out.println("The ID :"+ id  + " , "+"The Name : " + name);
	}
	public void getStudentInfo (String email ,int phonenumber ) {
	 		System.out.println("The email :" + email + " , " +"The PhoneNumber :" + phonenumber);
	}
	 	public static void main(String[] args) {
			Students stud = new Students();
			
			stud.getStudentInfo(256654);
			
			stud.getStudentInfo(1234, "ArunPrasath");
			
			stud.getStudentInfo("arunselvaraj21@gmail.com" , 984025864);
			
	}
		 
}
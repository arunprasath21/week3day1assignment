package week3.Day1.org.student;

import week3.Day1.org.department.Department;

public class Student extends Department{
	public void studentName() {}
	public void studentDept() {}
	public void studentId()	{}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeCode();
		System.out.println("The ID number Is : " + stud.collegeCode());
		
		stud.collegeName();
		System.out.println("The College Name Is : "+ stud.collegeName());
		
		stud.collegeRank();
		System.out.println("The college Rank Is : " + stud.collegeRank());
		
		stud.deptname();
		System.out.println("The Department Name Is : " + stud.deptname());
		
		stud.studentDept();
		String e = "Mechanical";
		System.out.println("The Student Department Is : " +  e);
		
		stud.studentId();
		int f = 2548548;
		System.out.println("The Student ID Is : " + f);
		
		stud.studentName();
		String g = "Arunprasath";
		System.out.println("The Student Name Is : " + g);
	}

}

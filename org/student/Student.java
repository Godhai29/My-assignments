package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("The Student Name is Godhai Lakshmi");
}
	public void studentDept() {
		System.out.println("Department is CSE");
	}
	public void studentId() {
		System.out.println("Student ID-2K14311");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentId();
		stud.studentName();
		stud.studentDept();
	}
}

package method.overload;

public class Students {
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID is:"+id +"\nStudent name is:" +name);
	}
	public void getStudentInfo(String emailId,long phoneNumber) {
		System.out.println("Student mail ID: "+emailId +"\nPhone Number:"+phoneNumber);	
	}
	public static void main(String[] args) {
	Students stud=new Students();
	stud.getStudentInfo(120, "Godhai Lakshmi");
	stud.getStudentInfo("godhailakshmi@gmail.com", 9080610039l);
	}
}

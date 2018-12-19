import java.util.ArrayList;

public class StudentList extends Student {
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentList (String studentName, int age, String homeCity,ArrayList<Student> students){
		super(studentName, age, homeCity);
		this.students = students;
	}
	public void addProduct (Student s){
		students.add(s);
	}
}
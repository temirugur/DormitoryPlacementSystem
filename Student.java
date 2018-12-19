public abstract class Student {
	private String studentName;
	private int age;
	private String homeCity;
	
	public Student (String studentName, int age, String homeCity) {
		this.studentName = studentName;
		this.age = age;
		this.homeCity = homeCity;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getHomeCity() {
		return homeCity;
	}
}
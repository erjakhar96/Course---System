import java.util.ArrayList;

public class Course {
	String subject;
	ArrayList<Student> studentsEnrolled = new ArrayList<Student>();

	void addStudent(Student s) {
		studentsEnrolled.add(s);
	}
	Course(String cName) {
		this.subject = cName;
	}
	public String toString() {
		return subject+"\n";
	}
}
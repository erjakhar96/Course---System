import java.util.ArrayList;
import java.util.Scanner;

public class CourseSystem {
	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		CourseSystem coursesystem = new CourseSystem();
		do {
			coursesystem.printOptions();
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();

			if (option == 0)
				break;
			switch (option) {
			case 1: {

				System.out.println("Enter Student name" + ":");
				String studentName = scanner.next();
				Student student = new Student(studentName);
				coursesystem.addStudent(student);

			}
				break;
			case 2: {
				System.out.println("Enter Subject name" + ":");
				String courseName = scanner.next();
				Course course = new Course(courseName);
				coursesystem.addCourse(course);
			}
				break;
			case 3: {
				coursesystem.printAllStudent();
				System.out.println("Enter Student id" + ":");
				int id = scanner.nextInt();
				if (id >= 0 && id < coursesystem.students.size()) {
					while (true) {
						System.out.println("Enter course Name : ");
						String c_name = scanner.next();
						Course c = coursesystem.findCourse(c_name);
						if (c != null) {
							coursesystem.students.get(id).course.add(c);
						} else {
							System.out
									.println("Sorry , course name not found ");
						}
						System.out.println("Enter 0 to exit 1 for add more courses");
						int key = scanner.nextInt();
						if (key == 0) {
							break;
						}
					}
				} else {
					System.out.println("please enter valid id ");
				}
			}
				break;
			case 4: {
				coursesystem.printAllStudent();
				System.out.println("Choose Student ID : ");
				int id = scanner.nextInt();
				if (id >= 0 && id < coursesystem.students.size()) {
					coursesystem.students.get(id).printCourse();
				} else {
					System.out.println("please enter valid id ");
				}

			}
				break;
			case 5: {
				coursesystem.printAllCourse();
				System.out.println("Choose Course ID : ");
				int id = scanner.nextInt();
				if (id >= 0 && id < coursesystem.courses.size()) {
					coursesystem.students.get(id).printStudent(
							coursesystem.courses.get(id));
				} else {
					System.out.println("please enter valid id ");
				}
			}
				break;
			}
		} while (true);
	}

	void printOptions() {
		System.out.println("Enter operation number you want to do:");
		System.out.println("0 to exit");
		System.out.println("1 to Add new Student");
		System.out.println("2 for Add new course");
		System.out.println("3 for enroll student on course");
		System.out.println("4 print All Course of a Student");
		System.out.println("4 print All Students of a Course");
	}

	void printAllStudent() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(i + "  " + students.get(i));
		}
	}

	void printAllCourse() {
		for (int j = 0; j < courses.size(); j++)
			System.out.print(j+" "+courses.get(j));
	}

/*	Student findStudent(String name) {
		for (int j = 0; j < students.size(); j++) {
			Student s = students.get(j);
			if (s.name.equals(name))
				return s;
		}
		return null;
	}*/

	Course findCourse(String name) {
		for (int j = 0; j < courses.size(); j++) {
			Course c = courses.get(j);
			if (c.subject.equals(name))
				return c;
		}
		return null;

	}

	void addStudent(Student s) {
		students.add(s);
	}

	void addCourse(Course c) {
		courses.add(c);
	}
}

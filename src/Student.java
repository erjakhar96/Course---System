import java.util.ArrayList;


public class Student {
	String name;
	ArrayList<Course> course = new ArrayList<Course>();
	public String toString() {
		return  name +"\n";
	}
    Student(String sName){
    	this.name = sName;
    }
    void printCourse(){
    	for(int i = 0 ; i < course.size(); i++){
    		System.out.println(course.get(i)+"  ");
    	}
    }
    void printStudent(Course c){
    	for(int i = 0 ; i < course.size(); i++){
    		if(course.get(i).equals(c)){
    		System.out.println(this.name+"  ");
    		}
    	}
    }
}

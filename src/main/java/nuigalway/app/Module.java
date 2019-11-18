package nuigalway.app;
import java.util.ArrayList;

public class Module {

	private String name;
	private String id;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Student> students = new ArrayList<Student>();

	public Module(String name, String id, ArrayList<Course> courses, ArrayList<Student> students) {
		this.name = name;
		this.id = id;
		this.courses = courses;
		this.students = students;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", id='" + getId() + "'" +
			", courses='" + getCourses() + "'" +
			", students='" + getStudents() + "'" +
			"}";
	}
	

}

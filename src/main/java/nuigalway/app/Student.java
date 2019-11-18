package nuigalway.app;
import org.joda.time.DateTime;

public class Student {
	
	private String name;
	private int age;
	private DateTime DOB;
	private int ID;
	private String username;
	private String[] courses;
	private String[] modules;

	public Student(String name, int age, DateTime DOB, int ID, String username, String[] courses, String[] modules) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.username = username;
		this.courses = courses;
		this.modules = modules;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return this.DOB;
	}

	public void setDOB(DateTime DOB) {
		this.DOB = DOB;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUsername() {
		username = name + age;
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String[] getCourses() {
		return this.courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getModules() {
		return this.modules;
	}

	public void setModules(String[] modules) {
		this.modules = modules;
	}


	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", age='" + getAge() + "'" +
			", DOB='" + getDOB() + "'" +
			", ID='" + getID() + "'" +
			", username='" + getUsername() + "'" +
			", courses='" + getCourses() + "'" +
			", modules='" + getModules() + "'" +
			"}";
	}


}

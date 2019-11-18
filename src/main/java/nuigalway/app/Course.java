package nuigalway.app;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {

	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;

	public Course(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Module> getModules() {
		return this.modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return this.endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}


	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", modules='" + getModules() + "'" +
			", students='" + getStudents() + "'" +
			", startDate='" + getStartDate() + "'" +
			", endDate='" + getEndDate() + "'" +
			"}";
	}


}

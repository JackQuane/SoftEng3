package nuigalway.app;
import org.joda.time.DateTime;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {

	@Test
	public void test() {
		DateTime c = new DateTime();
		Student tom = new Student("Tom", 22, c, 56, "tom", null, null);
		Course cs = new Course("Computer Science", null, null, c, c);
		Module software = new Module("Software", "S100", null, null);
		tom.getUsername();
		
	}
	

}

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
    developer = new Developer("Jane Doe", 34215, 30000.00);

    }

    @Test
    public void checkDeveloperHasName() {
        assertEquals("Jane Doe", developer.getName());
    }

    @Test
    public void checkDeveloperHasNiNumber() {
        assertEquals(34215, developer.getNiNumber(), 0.0);

    }

    @Test
    public void checkDeveloperHasSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void checkCanRaiseSalary() {
        assertEquals(35000.00, developer.raiseSalary(5000.00), 0.0);
    }

    @Test
    public void checkCanPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.0);
    }

}

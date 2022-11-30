import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Samwise Gamgee", 112233, 27000.00);

    }

    @Test
    public void checkDatabaseAdminHasName() {
        assertEquals("Samwise Gamgee", databaseAdmin.getName());
    }

    @Test
    public void checkDatabaseAdminHasNiNumber() {
        assertEquals(112233, databaseAdmin.getNiNumber(), 0.0);

    }

    @Test
    public void checkDatabaseAdminHasSalary() {
        assertEquals(27000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void checkCanRaiseSalary() {
        assertEquals(28000.00, databaseAdmin.raiseSalary(1000.00), 0.0);
    }

    @Test
    public void checkCanPayBonus() {
        assertEquals(270.00, databaseAdmin.payBonus(), 0.0);
    }

}
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John Smith", 43211432, 40000, "Factory");

    }

    @Test
    public void checkManagerHasName() {
        assertEquals("John Smith", manager.getName());
    }

    @Test
    public void checkManagerHasNiNumber() {
        assertEquals(43211432, manager.getNiNumber());
    }

    @Test
    public void checkManagerHasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.0 );
    }

    @Test
    public void checkManagerHasDeptName() {
        assertEquals("Factory", manager.getDeptName());
    }

    @Test
    public void checkCanRaiseSalary() {
        assertEquals(40500.00, manager.raiseSalary(500.00), 0.0);
    }

    @Test
    public void checkCanPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.0);
    }

}



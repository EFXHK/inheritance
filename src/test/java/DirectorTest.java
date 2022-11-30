import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director( "Christof", 9999, 80000, "Head Honcho", 10000);
    }

    @Test
    public void checkDirectorHasName() {
        assertEquals("Christof", director.getName());
    }

    @Test
    public void checkDirectorHasNiNumber() {
        assertEquals(9999, director.getNiNumber());
    }

    @Test
    public void checkDirectorHasSalary() {
        assertEquals(80000.00, director.getSalary(), 0.0 );
    }

    @Test
    public void checkDirectorHasDeptName() {
        assertEquals("Head Honcho", director.getDeptName());
    }

    @Test
    public void checkCanRaiseSalary() {
        assertEquals(80500.00, director.raiseSalary(500.00), 0.0);
    }

    @Test
    public void checkCanPayBonus() {
        assertEquals(800.00, director.payBonus(), 0.0);
    }

}

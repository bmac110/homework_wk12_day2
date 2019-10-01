package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor = new Visitor(13, 1.5, 200 );
        visitor2 = new Visitor(13, 50.5, 200 );
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void determineIsAllowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void canGetPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canGetDoubleFee(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }
}

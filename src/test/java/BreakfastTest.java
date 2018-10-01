import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class BreakfastTest {

    @BeforeEach
    void setUp() {
    }



    @Test
    public void test_Egss_Is_Fried() throws Exception {

        // Egg
        // Fry
        // Check for state change
        Breakfast breakfast = new Breakfast();
        Egg egg = new Egg();
        egg.fry(egg);
        assertTrue(egg.isFried());
    }

    @AfterEach
    void tearDown() {
    }
}
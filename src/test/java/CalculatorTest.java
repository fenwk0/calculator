import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test_addition(){
        System.out.println("CalculatorTest.test_addition");
        int numberUnderTest = 4;
        assertTrue(numberUnderTest == Calculator.add(2,2));
    }

    @Test
    public void test_subtraction(){
        System.out.println("CalculatorTest.test_subtraction");
        int numberUnderTest = 4;
        assertTrue(numberUnderTest == Calculator.sub(6,2));
    }
    @AfterEach
    void tearDown() {
    }
}
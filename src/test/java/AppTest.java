import no4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static final Calculator calculator = new Calculator();

    // Run when start
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeAll Class - Run before test all method once");
    }

    // Run when start running method
    @BeforeEach
    void setUp() throws Exception {
        System.out.println("- @BeforeEach Class - Run before each test methods");
    }

    // Run when all methods testing done
    @AfterAll
    static void setupAfterClass() throws Exception {
        System.out.println("@AfterAll Class - Run after all test method once");
    }

    // Run when end running method
    @AfterEach
    void setUpAfterEach() throws Exception {
        System.out.println("- @AfterEach Class - Run after each test methods");
    }

    @DisplayName("firstTest")
    @Test
    public void test() {
        System.out.println("=> firstTest" + assertThrows(NumberFormatException.class, () -> {
            calculator.add("5", "abc");
        }));
    }

    @DisplayName("secondTest")
    @Test
    public void test2() {
        System.out.println("=> secondTest" + assertThrows(NullPointerException.class, () -> {
            calculator.subtract("5", null);
        }));

    }

}

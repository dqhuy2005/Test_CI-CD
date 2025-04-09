import no4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {

    private final Calculator calculator = new Calculator();

    @Test(groups = "regressionTest")
    public void testGroup() {
        // This is multiply test.
        Assert.assertEquals(calculator.multiply(2, 4), 6);
    }

    @Test(groups = "regressionTest")
    public void testGroup1() {
        System.out.println("Group Test 2!");
    }

    @Test(groups = "regressionTest")
    public void testGroup2() {
        System.out.println("Group Test 3!");
    }

    @Test(groups = "regressionTest")
    public void testGroup3() {
        System.out.println("Group Test 4!");
    }

}

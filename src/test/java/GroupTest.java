import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "regressionTest")
    public void testGroup() {
        System.out.println("Group Test 1!");
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

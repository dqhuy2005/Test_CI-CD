package tests;

import no4.Lab4.VatCalcalator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTestNG {

    VatCalcalator vat = new VatCalcalator();

    @Test(groups = "testVATCalculator")
    public void testVatCalculator() {
        double expectedVat = 10;
        Assert.assertEquals(vat.calcVat(100), expectedVat);
        Assert.assertNotEquals(vat.calcVat(1000), expectedVat);
    }

    @Test(groups = "testVATCalculator")
    public void testVatCalculator1() {
        double expectedVat = 20;
        Assert.assertEquals(vat.calcVat(200), expectedVat);
        Assert.assertNotEquals(vat.calcVat(2000), expectedVat);
    }

    @Test(groups = "testVATCalculator")
    public void testVatCalculator2() {
        double expectedVat = 30;
        Assert.assertEquals(vat.calcVat(300), expectedVat);
        Assert.assertNotEquals(vat.calcVat(1000), expectedVat);
    }

    @Test(groups = "testVATCalculator")
    public void testVatCalculator3() {
        double expectedVat = 40;
        Assert.assertEquals(vat.calcVat(400), expectedVat);
        Assert.assertNotEquals(vat.calcVat(4000), expectedVat);
    }

}

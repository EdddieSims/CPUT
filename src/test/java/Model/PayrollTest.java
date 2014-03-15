package Model;


import model.Payroll;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Meena
 */
public class PayrollTest {
    
    public PayrollTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        @Test
    public void TestExpenses() 
    {
        Payroll pay = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        //act,exp
        Assert.assertEquals(pay.getName(),"Kabaso");
        Assert.assertEquals(pay.getJob(),"Dentist");
        Assert.assertEquals(pay.getSal(),3700.0);
        Assert.assertEquals(pay.hrsWeek(),40);
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        Payroll pay = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        
        Payroll pay7 = new Payroll.BuildMe("Assistant").roll(pay).Hours(20).Job(1700.0).name("Shannon").build();
        Assert.assertEquals(pay7.getName(),"Shannon");
        Assert.assertEquals(pay7.getJob(),"Dentist");
        Assert.assertEquals(pay7.getSal(),1700.0);
        Assert.assertEquals(pay7.hrsWeek(),20);
        
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

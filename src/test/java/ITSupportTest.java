
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
public class ITSupportTest {
    
    public ITSupportTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
         @Test
    public void TestExpenses() 
    {
        ITSupport equi = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
        //act,exp
        Assert.assertEquals(equi.getEquip(),"Computer Hardware");
        Assert.assertEquals(equi.getSuppName(),"Computer Mania");
        Assert.assertEquals(equi.getinv(),"Inv003");
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        ITSupport equi = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
        
        ITSupport equi22 = new ITSupport.BuildMe("mSquared Programmers").itt(equi).inv("InvMM0069857").name("Dental Management Software").build();
        Assert.assertEquals(equi22.getEquip(),"Dental Management Software");
        Assert.assertEquals(equi22.getSuppName(),"Computer Mania");
        Assert.assertEquals(equi22.getinv(),"InvMM0069857");
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

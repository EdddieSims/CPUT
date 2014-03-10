/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class InvoicePatTest {
    
    public InvoicePatTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestPayments() 
     {
         InvoicePat pay = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
         
         Assert.assertEquals(pay.getInv(),"Inv001");
         Assert.assertEquals(pay.getName(),"Meena Nathoo");
     
     }
     @Test
     public static void testUpdate() throws Exception
     {
         InvoicePat pay = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
         
         InvoicePat pay2 = new InvoicePat.BuildMe("Inv003").invP(pay).name("Muneem Waggie").build();
         Assert.assertEquals(pay2.getInv(),"Inv001");
         Assert.assertEquals(pay2.getName(),"Muneem Waggie");
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

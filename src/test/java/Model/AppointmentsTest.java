package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Appointments;
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
public class AppointmentsTest {
    
    public AppointmentsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestExpenses() 
    {
        Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
        //act,exp
        Assert.assertEquals(appoint.getAppNum(),"123456");
        Assert.assertEquals(appoint.getReason(),"Toothache");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
        Appointments app2 = new Appointments.BuildMe("736373").app(appoint).reason("ToothExtraction").build();
         Assert.assertEquals(app2.getAppNum(),"123456");
        Assert.assertEquals(app2.getReason(),"ToothExtraction");
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

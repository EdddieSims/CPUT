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
public class DentistTest {
    
    public DentistTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestExpenses() 
    {
        Dentist denti = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        //act,exp
        Assert.assertEquals(denti.getName(),"Kabaso");
        Assert.assertEquals(denti.getJob(),"Permanent");
        Assert.assertEquals(denti.getSal(),3700.0);
        Assert.assertEquals(denti.hrsWeek(),40);
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        Dentist denti = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        Dentist denti2 = new Dentist.BuildMe("Casual").dentist(denti).Hours(20).Job(1700.0).name("Shannon").build();
        
        Assert.assertEquals(denti2.getName(),"Shannon");
        Assert.assertEquals(denti2.getJob(),"Permanent");
        Assert.assertEquals(denti2.getSal(),1700.0);
        Assert.assertEquals(denti2.hrsWeek(),20);
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

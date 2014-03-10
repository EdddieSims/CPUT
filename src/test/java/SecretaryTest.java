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
public class SecretaryTest {
    
    public SecretaryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
    public void TestExpenses() 
    {
        secretary  sec = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
        //act,exp
        Assert.assertEquals(sec.getName(),"Kruben Naidoo");
        Assert.assertEquals(sec.getJob(),"Permanent Secretary");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        secretary  secii = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
        
        secretary sec2 = new secretary.BuildMe("Part-time Worker").sec(secii).name("RadFord Burger").build();
        Assert.assertEquals(sec2.getName(),"RadFord Burger");
        Assert.assertEquals(sec2.getJob(),"Permanent Secretary");
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

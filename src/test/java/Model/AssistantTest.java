package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Assistant;
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
public class AssistantTest {
    
    public AssistantTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestExpenses() 
    {
        Assistant ass = new Assistant.BuildMe("Permanent").name("Boniface Kabaso").build();
        //act,exp
        Assert.assertEquals(ass.getName(),"Boniface Kabaso");
        Assert.assertEquals(ass.getJob(),"Permanent");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        Assistant ass = new Assistant.BuildMe("Part-time Worker").name("Meena Waggie").build();
        Assistant ass2 = new Assistant.BuildMe("Part-time Worker").assi(ass).name("Muneem Waggie").build();
        Assert.assertEquals(ass2.getName(),"Muneem Waggie");
        Assert.assertEquals(ass2.getJob(),"Part-time Worker");
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

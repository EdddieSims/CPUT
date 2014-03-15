package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Cleaner;
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
public class CleanerTest {
    
    public CleanerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestCleaner() 
    {
        Cleaner ass = new Cleaner.BuildMe("Permanent").name("Zettie").CleanerTy("Floor Cleaner").build();
        //act,exp
        Assert.assertEquals(ass.getName(),"Zettie");
        Assert.assertEquals(ass.getJob(),"Permanent");
        Assert.assertEquals(ass.getCleaner(),"Floor Cleaner");
        
    }
    @Test
    public static void TextCleanerUpdate() throws Exception 
    {
        Cleaner ass = new Cleaner.BuildMe("Part-time Worker").name("Zettie").CleanerTy("Floor Cleaner").build();
        Cleaner ass2 = new Cleaner.BuildMe("Part-time Worker").clean(ass).name("Muneem Waggie").CleanerTy("Dental Equipment Cleaner").build();
        Assert.assertEquals(ass2.getName(),"Muneem Waggie");
        Assert.assertEquals(ass2.getJob(),"Part-time Worker");
        Assert.assertEquals(ass2.getCleaner(),"Dental Equipment Cleaner");
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

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
public class ClinicalDocumentsTest {
    
    public ClinicalDocumentsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
    public void TestExpenses() 
    {
        ClinicalDocuments app = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        //act,exp
        Assert.assertEquals(app.getPatNum(),"DentPat12345");
        Assert.assertEquals(app.getHistory(),"Diabetic");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        ClinicalDocuments app = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        ClinicalDocuments app22 = new ClinicalDocuments.BuildMe("DentPat736373").clini(app).patHistory("High Blood Pressure").build();
        Assert.assertEquals(app22.getPatNum(),"DentPat12345");
        Assert.assertEquals(app22.getHistory(),"High Blood Pressure");
        
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

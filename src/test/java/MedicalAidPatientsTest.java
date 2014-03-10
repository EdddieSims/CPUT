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
public class MedicalAidPatientsTest {
    
    public MedicalAidPatientsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestExpenses() 
    {
        MedicalAidPatients MedAid = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
        //act,exp
        Assert.assertEquals(MedAid.getMedAidNum(),"Disc0094");
        Assert.assertEquals(MedAid.getAmountCovered(),500.0);
        Assert.assertEquals(MedAid.getMedAidPolicyName(),"Discovery");
        Assert.assertEquals(MedAid.getName(),"Meena");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        MedicalAidPatients MedAid = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
        
        MedicalAidPatients MedAid2 = new MedicalAidPatients.BuildMe("Metro776678").MedP(MedAid).amountCovered(780.0).MedAidPolicyName("Old Mutual").name("Miche").build();
        Assert.assertEquals(MedAid2.getMedAidNum(),"Disc0094");
        Assert.assertEquals(MedAid2.getAmountCovered(),780.0);
        Assert.assertEquals(MedAid2.getMedAidPolicyName(),"Old Mutual");
        Assert.assertEquals(MedAid2.getName(),"Miche");
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

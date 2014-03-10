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
public class PatientProcedureTest {
    
    public PatientProcedureTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestPatientProcedure() 
    {
       PatientProcedure p = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
        //act,exp
        Assert.assertEquals(p.getMedAidNum(),"Disc00");
        Assert.assertEquals(p.getAmountPayable(),900.0);
        Assert.assertEquals(p.getMedAidPolicyName(),"Old Mutual");
        Assert.assertEquals(p.getName(),"Eddie");
        Assert.assertEquals(p.getProdName(),"Tooth Extraction");
        
    }
    @Test
    public static void TextPatientProcedureUpdate() throws Exception 
    {
        PatientProcedure p = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
       
        PatientProcedure pee = new PatientProcedure.BuildMe("Patient Fillings").Pati(p).MedAidNum("Disc0097").MedAidPolicyName("Discovery").amountPayable(800.0).name("Meena").build();
       Assert.assertEquals(pee.getMedAidNum(),"Disc0097");
        Assert.assertEquals(pee.getAmountPayable(),800.0);
        Assert.assertEquals(pee.getMedAidPolicyName(),"Discovery");
        Assert.assertEquals(pee.getName(),"Meena");
        Assert.assertEquals(pee.getProdName(),"Tooth Extraction");
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

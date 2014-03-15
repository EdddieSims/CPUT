package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.PrivatePatients;
import java.util.ArrayList;
import java.util.List;
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
public class PrivatePatientsTest {
    public PrivatePatientsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
      @Test
    public void TestPrivatePatients() 
    {
        PrivatePatients poce = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
        //act,exp
        Assert.assertEquals(poce.getName(),"Muneem");
        Assert.assertEquals(poce.getAmountCovered(),9000.0);
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        PrivatePatients poce = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
        PrivatePatients poce2 = new PrivatePatients.BuildMe("Meena").privi(poce).amountCovered(900.0).build();
        Assert.assertEquals(poce2.getName(),"Muneem");
        Assert.assertEquals(poce2.getAmountCovered(),900.0);
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

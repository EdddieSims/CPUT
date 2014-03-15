package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Payments;
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
public class PaymentsTest {
    
    public PaymentsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestPayments() 
     {
         Payments pay = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
         Assert.assertEquals(pay.getItemPayable(),"Rent Money");
         Assert.assertEquals(pay.getAmount(),230.0);
     
     }
     @Test
     public static void testUpdate() throws Exception
     {
         Payments pay = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
         
         Payments pay3 = new Payments.BuildMe(700.0).pay(pay).itemPay("Rates Money").build();
         
         Assert.assertEquals(pay3.getItemPayable(),"Rates Money");
         Assert.assertEquals(pay3.getAmount(),230.0);
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

package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Orders;
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
public class OrdersTest {
    
    public OrdersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestPayments() 
     {
         Orders ord = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
         Assert.assertEquals(ord.getEquip(),"12-feb-2014");
         Assert.assertEquals(ord.getOrderNumber(),"Ord4356");
     
     }
     @Test
     public static void testUpdate() throws Exception
     {
         
         Orders ord = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
         
         Orders ord4 = new Orders.BuildMe("Ord4356444445555555").or(ord).name("10-feb-2014").build();
         Assert.assertEquals(ord4.getEquip(),"10-feb-2014");
         Assert.assertEquals(ord4.getOrderNumber(),"Ord4356");
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

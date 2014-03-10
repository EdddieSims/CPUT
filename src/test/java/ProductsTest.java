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
public class ProductsTest {
    
    public ProductsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestMe() 
     {
         Products pro = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
         Assert.assertEquals(pro.geProdDescr(),"Tooth-Paste");
         Assert.assertEquals(pro.getProdId(),"Prod4356-99000-5r5e5r6");
     
     }
     @Test
     public static void testUpdate() throws Exception
     {
         Products pro = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
        
         Products pro2 = new Products.BuildMe("Prod4356-9").prods(pro).name("Tooth-Brushes").build();
         Assert.assertEquals(pro2.geProdDescr(),"Tooth-Brushes");
         Assert.assertEquals(pro2.getProdId(),"Prod4356-99000-5r5e5r6");
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

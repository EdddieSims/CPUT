/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethod;

import FactoryMethodPattern.FactoryMethodClass;
import FactoryMethodPattern.FactoryMethodInterface;
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
public class FactoryMethodTest {
    
    public FactoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testMe() throws Exception 
     {
        FactoryMethodClass fact =  new FactoryMethodClass();
        FactoryMethodInterface intf = fact.getNames(FactoryMethodClass.name1);
        
        FactoryMethodInterface int2 = fact.getNames(FactoryMethodClass.name2);
        
        Assert.assertEquals(intf.getName(),"Meena");
        Assert.assertEquals(int2.getName(),"Muneem");
        
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

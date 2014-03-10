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
public class TeethSuppliersTest {
    
    public TeethSuppliersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        @Test
    public void TestExpenses() 
    {
        TeethSuppliers tt = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
        //act,exp
        Assert.assertEquals(tt.getEquip(),"PlainSets Teeth");
        Assert.assertEquals(tt.getSuppName(),"The Tooth Fairy");
        Assert.assertEquals(tt.getinv(),"Inv001Tooth");
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        TeethSuppliers tt = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
        
        TeethSuppliers ttr = new TeethSuppliers.BuildMe("The Magic Maker").teet(tt).inv("InvMM006gic").name("Gold Teeth").build();
        Assert.assertEquals(ttr.getEquip(),"Gold Teeth");
        Assert.assertEquals(ttr.getSuppName(),"The Tooth Fairy");
        Assert.assertEquals(ttr.getinv(),"InvMM006gic");
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

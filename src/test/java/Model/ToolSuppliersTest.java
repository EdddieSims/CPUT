package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.ToolSuppliers;
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
public class ToolSuppliersTest {
    
    public ToolSuppliersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        @Test
    public void TestExpenses() 
    {
        ToolSuppliers tt = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        //act,exp
        Assert.assertEquals(tt.getEquip(),"Tools to Fix Dental Tools");
        Assert.assertEquals(tt.getSuppName(),"hw");
        Assert.assertEquals(tt.getinv(),"Inv001hw");
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        ToolSuppliers tt = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        
        ToolSuppliers ttt = new ToolSuppliers.BuildMe("HardWStore").tooli(tt).inv("InvMM006").name("Tools to Fix Dental Tools").build();
        Assert.assertEquals(ttt.getEquip(),"Tools to Fix Dental Tools");
        Assert.assertEquals(ttt.getSuppName(),"hw");
        Assert.assertEquals(ttt.getinv(),"InvMM006");
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

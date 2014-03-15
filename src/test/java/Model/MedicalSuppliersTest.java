package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.MedicalSuppliers;
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
public class MedicalSuppliersTest {
    
    public MedicalSuppliersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestExpenses() 
    {
        MedicalSuppliers medi = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
        //act,exp
        Assert.assertEquals(medi.getEquip(),"Dental Injection Liquid");
        Assert.assertEquals(medi.getSuppName(),"Amgen");
        Assert.assertEquals(medi.getinv(),"Inv00123");
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        MedicalSuppliers medi = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
        
        MedicalSuppliers medi22 = new MedicalSuppliers.BuildMe("RedCross").mediSup(medi).inv("InvMM0065").name("Medicine").build();
        Assert.assertEquals(medi22.getEquip(),"Medicine");
        Assert.assertEquals(medi22.getSuppName(),"Amgen");
        Assert.assertEquals(medi22.getinv(),"InvMM0065");
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

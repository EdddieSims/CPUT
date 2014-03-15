package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.EquipmentSuppliers;
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
public class EquipSuppliersTest {
    
    public EquipSuppliersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
       @Test
    public void TestExpenses() 
    {
        EquipmentSuppliers equi = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
        //act,exp
        Assert.assertEquals(equi.getEquip(),"Dental HW Tools");
        Assert.assertEquals(equi.getSuppName(),"CampWell");
        Assert.assertEquals(equi.getinv(),"Inv001");
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
        EquipmentSuppliers equi = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
        
        
        EquipmentSuppliers equi2 = new EquipmentSuppliers.BuildMe("m&m h/w").equip(equi).inv("InvMM006").name("Dental Patient Chairs").build();
        Assert.assertEquals(equi2.getEquip(),"Dental Patient Chairs");
        Assert.assertEquals(equi2.getSuppName(),"CampWell");
        Assert.assertEquals(equi2.getinv(),"InvMM006");
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

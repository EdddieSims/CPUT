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
public class ExpensesTest {
    
    public ExpensesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestExpenses() 
    {
        Expenses exp = new Expenses.BuildMe(500.0).itemP("Computer").build();
        //act,exp
        Assert.assertEquals(exp.getAmount(),500.0);
        Assert.assertEquals(exp.getItemPurch(),"Computer");
        
    }
    @Test
    public static void TextExpensesUpdate() throws Exception 
    {
         Expenses exp = new Expenses.BuildMe(500.0).itemP("Computer").build();
         
        Expenses exp2 = new Expenses.BuildMe(200.00).expenses(exp).itemP("Mouse").build();
         Assert.assertEquals(exp2.getAmount(),500.0);
        Assert.assertEquals(exp2.getItemPurch(),"Mouse");
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

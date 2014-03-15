/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Expenses;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.crud.ExpensesCrudService;

/**
 *
 * @author Meena
 */
public class ExpensesTestCrudService {
    
    public ExpensesTestCrudService() {
    }

    @Mock
    ExpensesCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         Expenses ass = new Expenses.BuildMe(500.0).itemP("Computer").build();
        Expenses returnExpenses = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnExpenses);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Expenses ass = new Expenses.BuildMe(500.0).itemP("Computer").build();
        Expenses returnExpenses = crudService.find(ass.getItemPurch());
        when(crudService.find(ass.getItemPurch())).thenReturn(returnExpenses);
        Mockito.verify(crudService).find(ass.getItemPurch());

    }

    @Test
    public void testUpdate() throws Exception {

       Expenses ass = new Expenses.BuildMe(500.0).itemP("Computer").build();
       Expenses ass2 = new Expenses.BuildMe(200.00).expenses(ass).itemP("Mouse").build();

        Expenses returnExpenses = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnExpenses);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Expenses ass = new Expenses.BuildMe(500.0).itemP("Computer").build();
        Expenses returnExpenses = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnExpenses);
        Mockito.verify(crudService).remove(ass);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ExpensesCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

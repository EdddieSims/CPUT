/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Orders;
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
import services.crud.OrdersCrudService;

/**
 *
 * @author Meena
 */
public class OrdersTestCrudService {
    
    public OrdersTestCrudService() {
    }

    @Mock
    OrdersCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         Orders ass = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
        Orders returnOrders = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnOrders);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         Orders ass = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
        Orders returnOrders = crudService.find(ass.getOrderNumber());
        when(crudService.find(ass.getOrderNumber())).thenReturn(returnOrders);
        Mockito.verify(crudService).find(ass.getOrderNumber());

    }

    @Test
    public void testUpdate() throws Exception {

      Orders ass = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
      Orders ass2 = new Orders.BuildMe("Ord4356444445555555").or(ass).name("10-feb-2014").build();
         
        Orders returnOrders = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnOrders);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

         Orders ass = new Orders.BuildMe("Ord4356").name("12-feb-2014").build();
        Orders returnOrders = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnOrders);
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
        crudService = Mockito.mock(OrdersCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

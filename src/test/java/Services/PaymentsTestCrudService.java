/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Payments;
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
import services.crud.PaymentsCrudService;

/**
 *
 * @author Meena
 */
public class PaymentsTestCrudService {
    
    public PaymentsTestCrudService() {
    }

    @Mock
    PaymentsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Payments ass = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
        Payments returnPayments = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnPayments);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Payments ass = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
        Payments returnPayments = crudService.find(ass.getItemPayable());
        when(crudService.find(ass.getItemPayable())).thenReturn(returnPayments);
        Mockito.verify(crudService).find(ass.getItemPayable());

    }

    @Test
    public void testUpdate() throws Exception {

       Payments ass = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
         
       Payments ass2 = new Payments.BuildMe(700.0).pay(ass).itemPay("Rates Money").build();
        Payments returnPayments = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnPayments);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Payments ass = new Payments.BuildMe(230.0).itemPay("Rent Money").build();
        Payments returnPayments = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnPayments);
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
        crudService = Mockito.mock(PaymentsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

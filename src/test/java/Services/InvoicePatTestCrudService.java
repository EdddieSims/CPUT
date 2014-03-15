/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.InvoicePat;
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
import services.crud.InvoicePatCrudService;

/**
 *
 * @author Meena
 */
public class InvoicePatTestCrudService {
    
    public InvoicePatTestCrudService() {
    }

  @Mock
    InvoicePatCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        InvoicePat ass = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
        InvoicePat returnInvoicePat = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnInvoicePat);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        InvoicePat ass = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
        InvoicePat returnInvoicePat = crudService.find(ass.getInv());
        when(crudService.find(ass.getInv())).thenReturn(returnInvoicePat);
        Mockito.verify(crudService).find(ass.getInv());

    }

    @Test
    public void testUpdate() throws Exception {

        InvoicePat ass = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
        InvoicePat ass2 = new InvoicePat.BuildMe("Inv003").invP(ass).name("Muneem Waggie").build();
        
        InvoicePat returnInvoicePat = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnInvoicePat);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        InvoicePat ass = new InvoicePat.BuildMe("Inv001").name("Meena Nathoo").build();
        InvoicePat returnInvoicePat = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnInvoicePat);
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
        crudService = Mockito.mock(InvoicePatCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

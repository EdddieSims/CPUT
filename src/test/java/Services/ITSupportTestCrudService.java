/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.ITSupport;
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
import services.crud.ITSupportCrudService;

/**
 *
 * @author Meena
 */
public class ITSupportTestCrudService {
    
    public ITSupportTestCrudService() {
    }

    @Mock
    ITSupportCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        ITSupport ass = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
        ITSupport returnITSupport = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnITSupport);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        ITSupport ass = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
        ITSupport returnITSupport = crudService.find(ass.getSuppName());
        when(crudService.find(ass.getSuppName())).thenReturn(returnITSupport);
        Mockito.verify(crudService).find(ass.getSuppName());

    }

    @Test
    public void testUpdate() throws Exception {

       ITSupport ass = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
       ITSupport ass2 = new ITSupport.BuildMe("mSquared Programmers").itt(ass).inv("InvMM0069857").name("Dental Management Software").build();

        ITSupport returnITSupport = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnITSupport);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        ITSupport ass = new ITSupport.BuildMe("Computer Mania").inv("Inv003").name("Computer Hardware").build();
        ITSupport returnITSupport = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnITSupport);
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
        crudService = Mockito.mock(ITSupportCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

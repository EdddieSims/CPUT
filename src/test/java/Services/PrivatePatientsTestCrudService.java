/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.PrivatePatients;
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
import services.crud.PrivatePatientsCrudService;

/**
 *
 * @author Meena
 */
public class PrivatePatientsTestCrudService {
    
    public PrivatePatientsTestCrudService() {
    }

    @Mock
    PrivatePatientsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        PrivatePatients ass = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
        PrivatePatients returnPrivatePatients = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnPrivatePatients);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        PrivatePatients ass = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
        PrivatePatients returnPrivatePatients = crudService.find(ass.getName());
        when(crudService.find(ass.getName())).thenReturn(returnPrivatePatients);
        Mockito.verify(crudService).find(ass.getName());

    }

    @Test
    public void testUpdate() throws Exception {

       PrivatePatients ass = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
       PrivatePatients ass2 = new PrivatePatients.BuildMe("Meena").privi(ass).amountCovered(900.0).build();
        PrivatePatients returnPrivatePatients = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnPrivatePatients);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        PrivatePatients ass = new PrivatePatients.BuildMe("Muneem").amountCovered(9000.0).build();
        PrivatePatients returnPrivatePatients = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnPrivatePatients);
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
        crudService = Mockito.mock(PrivatePatientsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

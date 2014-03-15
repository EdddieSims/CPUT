/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Dentist;
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
import services.crud.DentistCrudService;

/**
 *
 * @author Meena
 */
public class DentistTestCrudService {
    
    public DentistTestCrudService() {
    }
 @Mock
    DentistCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Dentist ass = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        Dentist returnDentist = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnDentist);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Dentist ass = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        Dentist returnDentist = crudService.find(ass.getJob());
        when(crudService.find(ass.getJob())).thenReturn(returnDentist);
        Mockito.verify(crudService).find(ass.getJob());

    }

    @Test
    public void testUpdate() throws Exception {

       Dentist ass = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        Dentist ass2 = new Dentist.BuildMe("Casual").dentist(ass).Hours(20).Job(1700.0).name("Shannon").build();
        
        Dentist returnDentist = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnDentist);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Dentist ass = new Dentist.BuildMe("Permanent").Hours(40).Job(3700.0).name("Kabaso").build();
        Dentist returnDentist = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnDentist);
        Mockito.verify(crudService).remove(ass);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception 
    {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DentistCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

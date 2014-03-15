/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.secretary;
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
import services.crud.SecretaryCrudService;

/**
 *
 * @author Meena
 */
public class SecretaryTestCrudService {
    
    public SecretaryTestCrudService() {
    }

    @Mock
    SecretaryCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        secretary ass = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
        secretary returnsecretary = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnsecretary);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        secretary ass = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
        secretary returnsecretary = crudService.find(ass.getJob());
        when(crudService.find(ass.getJob())).thenReturn(returnsecretary);
        Mockito.verify(crudService).find(ass.getJob());

    }

    @Test
    public void testUpdate() throws Exception {

       secretary ass = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
       secretary ass2 = new secretary.BuildMe("Part-time Worker").sec(ass).name("RadFord Burger").build();

        secretary returnsecretary = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnsecretary);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        secretary ass = new secretary.BuildMe("Permanent Secretary").name("Kruben Naidoo").build();
        secretary returnsecretary = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnsecretary);
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
        crudService = Mockito.mock(SecretaryCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

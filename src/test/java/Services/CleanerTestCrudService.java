/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Cleaner;
import model.Cleaner;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.crud.CleanerCrudService;
import services.crud.CleanerCrudService;

/**
 *
 * @author Meena
 */
public class CleanerTestCrudService {
    
    public CleanerTestCrudService() {
    }

    @Mock
    CleanerCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Cleaner ass = new Cleaner.BuildMe("Permanent").name("Zettie").CleanerTy("Floor Cleaner").build();
        Cleaner returnCleaner = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnCleaner);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         Cleaner ass = new Cleaner.BuildMe("Permanent").name("Zettie").CleanerTy("Floor Cleaner").build();
        Cleaner returnCleaner = crudService.find(ass.getJob());
        when(crudService.find(ass.getJob())).thenReturn(returnCleaner);
        Mockito.verify(crudService).find(ass.getJob());

    }

    @Test
    public void testUpdate() throws Exception {

        Cleaner ass = new Cleaner.BuildMe("Permanent").name("Zettie").CleanerTy("Floor Cleaner").build();
        Cleaner ass2 = new Cleaner.BuildMe("Part-time Worker").clean(ass).name("Muneem Waggie").build();

        Cleaner returnCleaner = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnCleaner);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Cleaner ass = new Cleaner.BuildMe("Permanent").name("Zettie").CleanerTy("Floor Cleaner").build();
        Cleaner returnCleaner = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnCleaner);
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
        crudService = Mockito.mock(CleanerCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

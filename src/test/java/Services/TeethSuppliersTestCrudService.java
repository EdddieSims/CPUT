/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.TeethSuppliers;
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
import services.crud.TeethSuppliersCrudService;

/**
 *
 * @author Meena
 */
public class TeethSuppliersTestCrudService {
    
    public TeethSuppliersTestCrudService() {
    }

    @Mock
    TeethSuppliersCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        TeethSuppliers ass = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
        TeethSuppliers returnTeethSuppliers = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnTeethSuppliers);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        TeethSuppliers ass = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
        TeethSuppliers returnTeethSuppliers = crudService.find(ass.getSuppName());
        when(crudService.find(ass.getSuppName())).thenReturn(returnTeethSuppliers);
        Mockito.verify(crudService).find(ass.getSuppName());

    }

    @Test
    public void testUpdate() throws Exception {

       TeethSuppliers ass = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
       TeethSuppliers ass2 = new TeethSuppliers.BuildMe("The Magic Maker").teet(ass).inv("InvMM006gic").name("Gold Teeth").build();
        
        TeethSuppliers returnTeethSuppliers = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnTeethSuppliers);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        TeethSuppliers ass = new TeethSuppliers.BuildMe("The Tooth Fairy").inv("Inv001Tooth").name("PlainSets Teeth").build();
        TeethSuppliers returnTeethSuppliers = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnTeethSuppliers);
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
        crudService = Mockito.mock(TeethSuppliersCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

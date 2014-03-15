/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.ToolSuppliers;
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
import services.crud.ToolSuppliersCrudService;

/**
 *
 * @author Meena
 */
public class ToolSuppliersTestCrudService {
    
    public ToolSuppliersTestCrudService() {
    }

    @Mock
    ToolSuppliersCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         ToolSuppliers ass = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        ToolSuppliers returnToolSuppliers = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnToolSuppliers);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         ToolSuppliers ass = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        ToolSuppliers returnToolSuppliers = crudService.find(ass.getSuppName());
        when(crudService.find(ass.getSuppName())).thenReturn(returnToolSuppliers);
        Mockito.verify(crudService).find(ass.getSuppName());

    }

    @Test
    public void testUpdate() throws Exception {

        ToolSuppliers ass = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        
        ToolSuppliers ass2 = new ToolSuppliers.BuildMe("HardWStore").tooli(ass).inv("InvMM006").name("Tools to Fix Dental Tools").build();
        
        ToolSuppliers returnToolSuppliers = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnToolSuppliers);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        ToolSuppliers ass = new ToolSuppliers.BuildMe("hw").inv("Inv001hw").name("Tools to Fix Dental Tools").build();
        ToolSuppliers returnToolSuppliers = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnToolSuppliers);
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
        crudService = Mockito.mock(ToolSuppliersCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

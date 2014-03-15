/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.MedicalSuppliers;
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
import services.crud.MedicalSuppliersCrudService;

/**
 *
 * @author Meena
 */
public class MedicalSuppliersTestCrudService {
    
    public MedicalSuppliersTestCrudService() {
    }

    @Mock
    MedicalSuppliersCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        MedicalSuppliers ass = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
      
        MedicalSuppliers returnMedicalSuppliers = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnMedicalSuppliers);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        MedicalSuppliers ass = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
      
        MedicalSuppliers returnMedicalSuppliers = crudService.find(ass.getSuppName());
        when(crudService.find(ass.getSuppName())).thenReturn(returnMedicalSuppliers);
        Mockito.verify(crudService).find(ass.getSuppName());

    }

    @Test
    public void testUpdate() throws Exception {

       MedicalSuppliers ass = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
       MedicalSuppliers ass2 = new MedicalSuppliers.BuildMe("RedCross").mediSup(ass).inv("InvMM0065").name("Medicine").build();
        
        MedicalSuppliers returnMedicalSuppliers = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnMedicalSuppliers);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        MedicalSuppliers ass = new MedicalSuppliers.BuildMe("Amgen").inv("Inv00123").name("Dental Injection Liquid").build();
        MedicalSuppliers returnMedicalSuppliers = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnMedicalSuppliers);
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
        crudService = Mockito.mock(MedicalSuppliersCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

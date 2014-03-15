/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.EquipmentSuppliers;
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
import services.crud.EquipmentSuppliersCrudService;

/**
 *
 * @author Meena
 */
public class EquipSuppliersTestCrudService {
    
    public EquipSuppliersTestCrudService() {
    }

    @Mock
    EquipmentSuppliersCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         EquipmentSuppliers ass = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
       
        EquipmentSuppliers returnEquipSuppliers = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnEquipSuppliers);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         EquipmentSuppliers ass = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
       
        EquipmentSuppliers returnEquipSuppliers = crudService.find(ass.getSuppName());
        when(crudService.find(ass.getSuppName())).thenReturn(returnEquipSuppliers);
        Mockito.verify(crudService).find(ass.getSuppName());

    }

    @Test
    public void testUpdate() throws Exception {

       EquipmentSuppliers ass = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
       EquipmentSuppliers ass2 = new EquipmentSuppliers.BuildMe("m&m h/w").equip(ass).inv("InvMM006").name("Dental Patient Chairs").build();
       
        EquipmentSuppliers returnEquipSuppliers = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnEquipSuppliers);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

         EquipmentSuppliers ass = new EquipmentSuppliers.BuildMe("CampWell").inv("Inv001").name("Dental HW Tools").build();
       
        EquipmentSuppliers returnEquipSuppliers = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnEquipSuppliers);
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
        crudService = Mockito.mock(EquipmentSuppliersCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

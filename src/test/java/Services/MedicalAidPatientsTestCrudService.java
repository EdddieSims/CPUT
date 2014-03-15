/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.MedicalAidPatients;
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
import services.crud.MedicalAidPatientsCrudService;

/**
 *
 * @author Meena
 */
public class MedicalAidPatientsTestCrudService {
    
    public MedicalAidPatientsTestCrudService() {
    }

    @Mock
    MedicalAidPatientsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        MedicalAidPatients ass = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
      
        MedicalAidPatients returnMedicalAidPatients = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnMedicalAidPatients);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        MedicalAidPatients ass = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
        MedicalAidPatients returnMedicalAidPatients = crudService.find(ass.getMedAidNum());
        when(crudService.find(ass.getMedAidNum())).thenReturn(returnMedicalAidPatients);
        Mockito.verify(crudService).find(ass.getMedAidNum());

    }

    @Test
    public void testUpdate() throws Exception {

       MedicalAidPatients ass = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
       MedicalAidPatients ass2 = new MedicalAidPatients.BuildMe("Metro776678").MedP(ass).amountCovered(780.0).MedAidPolicyName("Old Mutual").name("Miche").build();
        
        MedicalAidPatients returnMedicalAidPatients = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnMedicalAidPatients);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        MedicalAidPatients ass = new MedicalAidPatients.BuildMe("Disc0094").amountCovered(500.0).MedAidPolicyName("Discovery").name("Meena").build();
      
        MedicalAidPatients returnMedicalAidPatients = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnMedicalAidPatients);
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
        crudService = Mockito.mock(MedicalAidPatientsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

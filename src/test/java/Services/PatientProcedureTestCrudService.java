/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.PatientProcedure;
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
import services.crud.PatientProcedureCrudService;

/**
 *
 * @author Meena
 */
public class PatientProcedureTestCrudService {
    
    public PatientProcedureTestCrudService() {
    }

   @Mock
    PatientProcedureCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        PatientProcedure ass = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
       
        PatientProcedure returnPatientProcedure = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnPatientProcedure);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        PatientProcedure ass = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
        PatientProcedure returnPatientProcedure = crudService.find(ass.getProdName());
        when(crudService.find(ass.getProdName())).thenReturn(returnPatientProcedure);
        Mockito.verify(crudService).find(ass.getProdName());

    }

    @Test
    public void testUpdate() throws Exception {

       PatientProcedure ass = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
       PatientProcedure ass2 = new PatientProcedure.BuildMe("Patient Fillings").Pati(ass).MedAidNum("Disc0097").MedAidPolicyName("Discovery").amountPayable(800.0).name("Meena").build();
      
        PatientProcedure returnPatientProcedure = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnPatientProcedure);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

       PatientProcedure ass = new PatientProcedure.BuildMe("Tooth Extraction").MedAidNum("Disc00").MedAidPolicyName("Old Mutual").amountPayable(900.0).name("Eddie").build();
       
        PatientProcedure returnPatientProcedure = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnPatientProcedure);
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
        crudService = Mockito.mock(PatientProcedureCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

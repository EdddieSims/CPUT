/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.ClinicalDocuments;
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
import services.crud.ClinicalDocumentsCrudService;

/**
 *
 * @author Meena
 */
public class ClinicalDocumentsTestCrudService {
    
    public ClinicalDocumentsTestCrudService() {
    }

     @Mock
    ClinicalDocumentsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         ClinicalDocuments ass = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        ClinicalDocuments returnClinicalDocuments = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnClinicalDocuments);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         ClinicalDocuments ass = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        ClinicalDocuments returnClinicalDocuments = crudService.find(ass.getPatNum());
        when(crudService.find(ass.getPatNum())).thenReturn(returnClinicalDocuments);
        Mockito.verify(crudService).find(ass.getPatNum());

    }

    @Test
    public void testUpdate() throws Exception {

        ClinicalDocuments ass = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        ClinicalDocuments ass2 = new ClinicalDocuments.BuildMe("Part-time Worker").clini(ass).name("Muneem Waggie").build();

        ClinicalDocuments returnClinicalDocuments = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnClinicalDocuments);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

         ClinicalDocuments ass = new ClinicalDocuments.BuildMe("DentPat12345").patHistory("Diabetic").build();
        ClinicalDocuments returnClinicalDocuments = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnClinicalDocuments);
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
        crudService = Mockito.mock(ClinicalDocumentsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

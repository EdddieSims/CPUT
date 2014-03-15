/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Assistant;
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
import services.crud.AssistantCrudService;

/**
 *
 * @author Meena
 */
public class AssistantTestCrudService {
    
    public AssistantTestCrudService() {
    }

    @Mock
    AssistantCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Assistant ass = new Assistant.BuildMe("Part-time Worker").name("Meena Waggie").build();
        Assistant returnAssistant = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnAssistant);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Assistant ass = new Assistant.BuildMe("Part-time Worker").name("Meena Waggie").build();
        Assistant returnAssistant = crudService.find(ass.getJob());
        when(crudService.find(ass.getJob())).thenReturn(returnAssistant);
        Mockito.verify(crudService).find(ass.getJob());

    }

    @Test
    public void testUpdate() throws Exception {

       Assistant ass = new Assistant.BuildMe("Part-time Worker").name("Meena Waggie").build();
        Assistant ass2 = new Assistant.BuildMe("Part-time Worker").assi(ass).name("Muneem Waggie").build();

        Assistant returnAssistant = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnAssistant);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Assistant ass = new Assistant.BuildMe("Part-time Worker").name("Meena Waggie").build();
        Assistant returnAssistant = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnAssistant);
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
        crudService = Mockito.mock(AssistantCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

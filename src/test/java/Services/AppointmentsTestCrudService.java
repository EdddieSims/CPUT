/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Appointments;
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
import services.crud.AppointmentsCrudService;

/**
 *
 * @author Meena
 */
public class AppointmentsTestCrudService {
    
    public AppointmentsTestCrudService() 
    {
    }
    
    @Mock
    AppointmentsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
        Appointments returnAppointments = crudService.persist(appoint);
        when(crudService.persist(appoint)).thenReturn(returnAppointments);
        Mockito.verify(crudService).persist(appoint);


    }

    @Test
    public void testRead() throws Exception {
        Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
        Appointments returnAppointments = crudService.find(appoint.getAppNum());
        when(crudService.find(appoint.getAppNum())).thenReturn(returnAppointments);
        Mockito.verify(crudService).find(appoint.getAppNum());

    }

    @Test
    public void testUpdate() throws Exception {

       Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
       Appointments app2 = new Appointments.BuildMe("736373").app(appoint).reason("ToothExtraction").build();

        Appointments returnAppointments = crudService.merge(app2);
        when(crudService.merge(app2)).thenReturn(returnAppointments);
        Mockito.verify(crudService).merge(app2);

    }

    @Test
    public void testDelete() throws Exception {

        Appointments appoint = new Appointments.BuildMe("123456").reason("Toothache").build();
        Appointments returnAppointments = crudService.remove(appoint);
        when(crudService.remove(appoint)).thenReturn(returnAppointments);
        Mockito.verify(crudService).remove(appoint);

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
        crudService = Mockito.mock(AppointmentsCrudService.class);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

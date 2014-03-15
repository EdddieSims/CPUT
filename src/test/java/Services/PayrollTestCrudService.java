/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Payroll;
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
import services.crud.PayrollCrudService;

/**
 *
 * @author Meena
 */
public class PayrollTestCrudService {
    
    public PayrollTestCrudService() {
    }

    @Mock
    PayrollCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
        Payroll ass = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        Payroll returnPayroll = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnPayroll);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Payroll ass = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        Payroll returnPayroll = crudService.find(ass.getJob());
        when(crudService.find(ass.getJob())).thenReturn(returnPayroll);
        Mockito.verify(crudService).find(ass.getJob());

    }

    @Test
    public void testUpdate() throws Exception {

      Payroll ass = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        
      Payroll ass2 = new Payroll.BuildMe("Assistant").roll(ass).Hours(20).Job(1700.0).name("Shannon").build();
        
        Payroll returnPayroll = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnPayroll);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

        Payroll ass = new Payroll.BuildMe("Dentist").Hours(40).Job(3700.0).name("Kabaso").build();
        Payroll returnPayroll = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnPayroll);
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
        crudService = Mockito.mock(PayrollCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

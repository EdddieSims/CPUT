/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import model.Products;
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
import services.crud.ProductsCrudService;

/**
 *
 * @author Meena
 */
public class ProductsTestCrudService {
    
    public ProductsTestCrudService() {
    }

    @Mock
    ProductsCrudService crudService;
    
    @Test
    public void testCreate() throws Exception {
         Products ass = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
        Products returnProducts = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnProducts);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
         Products ass = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
        Products returnProducts = crudService.find(ass.getProdId());
        when(crudService.find(ass.getProdId())).thenReturn(returnProducts);
        Mockito.verify(crudService).find(ass.getProdId());

    }

    @Test
    public void testUpdate() throws Exception {

         Products ass = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
         Products ass2 = new Products.BuildMe("Prod4356-9").prods(ass).name("Tooth-Brushes").build();

        Products returnProducts = crudService.merge(ass2);
        when(crudService.merge(ass2)).thenReturn(returnProducts);
        Mockito.verify(crudService).merge(ass2);

    }

    @Test
    public void testDelete() throws Exception {

         Products ass = new Products.BuildMe("Prod4356-99000-5r5e5r6").name("Tooth-Paste").build();
        Products returnProducts = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnProducts);
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
        crudService = Mockito.mock(ProductsCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

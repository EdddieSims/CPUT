/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.InvoicePat;
import services.crud.InvoicePatCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class InvoicePatCrudServiceImplements implements InvoicePatCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public InvoicePat find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public InvoicePat persist(InvoicePat entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public InvoicePat merge(InvoicePat entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public InvoicePat remove(InvoicePat entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<InvoicePat> findAll() {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.Payments;
import services.crud.PaymentsCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class PaymentsCrudServiceImplements implements PaymentsCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Payments find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Payments persist(Payments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Payments merge(Payments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Payments remove(Payments entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Payments> findAll() {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.Products;
import services.crud.ProductsCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class ProductsCrudServiceImplements implements ProductsCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Products find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Products persist(Products entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Products merge(Products entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Products remove(Products entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Products> findAll() {
        return null;
    }
}

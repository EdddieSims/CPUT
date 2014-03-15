/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.TeethSuppliers;
import services.crud.TeethSuppliersCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class TeethSuppliersCrudServiceImplements implements TeethSuppliersCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public TeethSuppliers find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public TeethSuppliers persist(TeethSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public TeethSuppliers merge(TeethSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TeethSuppliers remove(TeethSuppliers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TeethSuppliers> findAll() {
        return null;
    }
}

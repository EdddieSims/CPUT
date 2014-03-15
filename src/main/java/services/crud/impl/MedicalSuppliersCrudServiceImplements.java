/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.MedicalSuppliers;
import services.crud.MedicalSuppliersCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class MedicalSuppliersCrudServiceImplements implements MedicalSuppliersCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MedicalSuppliers find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MedicalSuppliers persist(MedicalSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MedicalSuppliers merge(MedicalSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MedicalSuppliers remove(MedicalSuppliers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MedicalSuppliers> findAll() {
        return null;
    }
}

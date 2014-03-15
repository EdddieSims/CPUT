/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.EquipmentSuppliers;
import services.crud.EquipmentSuppliersCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class EquipmentSuppliersCrudServiceImplements implements EquipmentSuppliersCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public EquipmentSuppliers find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public EquipmentSuppliers persist(EquipmentSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public EquipmentSuppliers merge(EquipmentSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public EquipmentSuppliers remove(EquipmentSuppliers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<EquipmentSuppliers> findAll() {
        return null;
    }
}

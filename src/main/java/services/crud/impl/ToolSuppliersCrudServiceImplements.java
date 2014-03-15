/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, chooToolSuppliersCrudServiceImplementsmplates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.ToolSuppliers;
import services.crud.ToolSuppliersCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class ToolSuppliersCrudServiceImplements implements ToolSuppliersCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ToolSuppliers find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ToolSuppliers persist(ToolSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ToolSuppliers merge(ToolSuppliers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ToolSuppliers remove(ToolSuppliers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ToolSuppliers> findAll() {
        return null;
    }

   
}

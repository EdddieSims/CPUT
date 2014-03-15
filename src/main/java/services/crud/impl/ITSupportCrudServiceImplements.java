/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.ITSupport;
import services.crud.ITSupportCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class ITSupportCrudServiceImplements implements ITSupportCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ITSupport find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ITSupport persist(ITSupport entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ITSupport merge(ITSupport entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ITSupport remove(ITSupport entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ITSupport> findAll() {
        return null;
    }
}

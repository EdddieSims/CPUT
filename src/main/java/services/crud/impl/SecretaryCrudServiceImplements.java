/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.secretary;
import services.crud.SecretaryCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class SecretaryCrudServiceImplements implements SecretaryCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public secretary find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public secretary persist(secretary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public secretary merge(secretary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public secretary remove(secretary entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<secretary> findAll() {
        return null;
    }

   

   
}

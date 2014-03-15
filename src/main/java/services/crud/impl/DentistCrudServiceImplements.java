/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.Dentist;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.crud.DentistCrudService;
/**
 *
 * @author Meena
 */
public class DentistCrudServiceImplements implements DentistCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Dentist find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Dentist persist(Dentist entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Dentist merge(Dentist entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Dentist remove(Dentist entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Dentist> findAll() {
        return null;
    }
}

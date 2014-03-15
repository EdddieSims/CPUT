/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.PatientProcedure;
import services.crud.PatientProcedureCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class PatientProcedureCrudServiceImplements implements PatientProcedureCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PatientProcedure find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PatientProcedure persist(PatientProcedure entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PatientProcedure merge(PatientProcedure entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PatientProcedure remove(PatientProcedure entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PatientProcedure> findAll() {
        return null;
    }
}

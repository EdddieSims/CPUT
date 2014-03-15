/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.PrivatePatients;
import services.crud.PrivatePatientsCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class PrivatePatientsCrudServiceImplements implements PrivatePatientsCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PrivatePatients find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PrivatePatients persist(PrivatePatients entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PrivatePatients merge(PrivatePatients entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PrivatePatients remove(PrivatePatients entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PrivatePatients> findAll() {
        return null;
    }
}

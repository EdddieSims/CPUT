/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.MedicalAidPatients;
import services.crud.MedicalAidPatientsCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class MedicalAidPatientsCrudServiceImplements implements MedicalAidPatientsCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public MedicalAidPatients find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public MedicalAidPatients persist(MedicalAidPatients entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MedicalAidPatients merge(MedicalAidPatients entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MedicalAidPatients remove(MedicalAidPatients entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<MedicalAidPatients> findAll() {
        return null;
    }
}

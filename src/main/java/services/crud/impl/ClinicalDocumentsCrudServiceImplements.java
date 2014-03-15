/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.ClinicalDocuments;
import services.crud.ClinicalDocumentsCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Meena
 */
public class ClinicalDocumentsCrudServiceImplements implements ClinicalDocumentsCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ClinicalDocuments find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ClinicalDocuments persist(ClinicalDocuments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ClinicalDocuments merge(ClinicalDocuments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ClinicalDocuments remove(ClinicalDocuments entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClinicalDocuments> findAll() {
        return null;
    }
}

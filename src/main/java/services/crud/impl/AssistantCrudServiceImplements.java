/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.Appointments;
import model.Assistant;
import services.crud.AssistantCrudService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Meena
 */
public class AssistantCrudServiceImplements implements AssistantCrudService
{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Assistant find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Assistant persist(Assistant entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Assistant merge(Assistant entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Assistant remove(Assistant entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Assistant> findAll() {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.crud.impl;

import java.util.List;
import model.Appointments;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import services.crud.AppointmentsCrudService;

/**
 *
 * @author Meena
 */
public class AppointmentsCrudServiceImplements implements AppointmentsCrudService
{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Appointments find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Appointments persist(Appointments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Appointments merge(Appointments entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Appointments remove(Appointments entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Appointments> findAll() {
        return null;
    }

   
}


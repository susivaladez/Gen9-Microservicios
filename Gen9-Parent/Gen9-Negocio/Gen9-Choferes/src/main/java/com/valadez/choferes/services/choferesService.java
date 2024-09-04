package com.valadez.choferes.choferes.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.valadez.choferes.dao.IChoferesDao;
import com.valadez.choferes.models.Chofer;



public class choferesService {


    @Autowired
    IChoferesDao choferesDao;


    public List<Chofer> getAll() {
        List<Chofer> listado = new ArrayList<>();
        listado = this.choferesDao.findAll();
        return listado;
    }


    public Optional<Chofer> findById(Long id) {
        Optional<Chofer> find = this.choferesDao.findById(id);
        if(find.isPresent()){
            return find;
        }
        return Optional.empty();
    }


    public Chofer save(Chofer t) {
        return this.choferesDao.save(t);
    }


    public void delete(Chofer t) {
        this.choferesDao.delete(t);
    }





}

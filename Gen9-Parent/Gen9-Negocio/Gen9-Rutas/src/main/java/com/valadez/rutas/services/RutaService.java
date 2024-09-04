package com.valadez.rutas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.valadez.rutas.models.Ruta;

@Component
public class RutaService {

    @Autowired
    IRutaDao rutasDao;


    public List<Ruta> getAll() {
        List<Ruta> listado = new ArrayList<>();
        listado = this.rutaDao.findAll();
        return listado;
    }


    public Optional<Ruta> findById(Long id) {
        Optional<Ruta> find = this.rutaDao.findById(id);
        if(find.isPresent()){
            return find;
        }
        return Optional.empty();
    }


    public Ruta save(Ruta t) {
        return this.rutaDao.save(t);
    }


    public void delete(Ruta t) {
        this.rutaDao.delete(t);
    }





}

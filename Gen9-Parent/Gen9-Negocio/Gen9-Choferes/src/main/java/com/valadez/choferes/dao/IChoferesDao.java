package com.valadez.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valadez.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository <Chofer, Long>{

}

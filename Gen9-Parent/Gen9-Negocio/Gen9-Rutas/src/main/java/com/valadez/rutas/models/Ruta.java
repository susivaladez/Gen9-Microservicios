package com.valadez.rutas.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "m3_rutas")
@Entity
public class Ruta {

     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
    @SequenceGenerator(sequenceName = "customer_seq1", allocationSize = 1, name = "CUST_SEQ1")

    private Long id;
    private Long choferId;
    private Long camionId;
    private Float distancia;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegadaEstimada;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getChoferId() {
        return choferId;
    }
    public void setChoferId(Long choferId) {
        this.choferId = choferId;
    }
    public Long getCamionId() {
        return camionId;
    }
    public void setCamionId(Long camionId) {
        this.camionId = camionId;
    }
    public Float getDistancia() {
        return distancia;
    }
    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public LocalDate getFechaLlegadaEstimada() {
        return fechaLlegadaEstimada;
    }
    public void setFechaLlegadaEstimada(LocalDate fechaLlegadaEstimada) {
        this.fechaLlegadaEstimada = fechaLlegadaEstimada;
    }


    //gets y sets




}

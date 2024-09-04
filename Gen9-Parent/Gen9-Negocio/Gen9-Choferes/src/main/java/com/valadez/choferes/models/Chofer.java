package com.valadez.choferes.models;
import java.time.LocalDate;

@Entify
@Table(name = "m1_choferes")
public class Chofer {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
    @SequenceGenerator(sequenceName = "customer_seq1", allocationSize = 1, name = "CUST_SEQ1")

private Long id;
private String nombre;
private String apPaterno;
private String apMaterno;
private String licencia;
private String telefono;
private LocalDate fechaNacimiento;
private Boolean disponibilidad;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApPaterno() {
    return apPaterno;
}

public void setApPaterno(String apPaterno) {
    this.apPaterno = apPaterno;
}

public String getApMaterno() {
    return apMaterno;
}

public void setApMaterno(String apMaterno) {
    this.apMaterno = apMaterno;
}

public String getLicencia() {
    return licencia;
}

public void setLicencia(String licencia) {
    this.licencia = licencia;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public Boolean getDisponibilidad() {
    return disponibilidad;
}

public void setDisponibilidad(Boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
}

}

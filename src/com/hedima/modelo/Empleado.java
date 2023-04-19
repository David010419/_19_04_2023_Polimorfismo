package com.hedima.modelo;

import java.time.LocalDate;

public class Empleado {

    //Atributos
    private String nombre;

    private double sueldo;

    private LocalDate fNacimiento;

    //Metodo

    public String mostrarInfo() {
        return "Nombre " + nombre + " Sueldo " + sueldo + " FechaNacimiento " + fNacimiento;
    }
    //Constructores
    public Empleado() {
    }

    public Empleado(String nombre, double sueldo, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
}

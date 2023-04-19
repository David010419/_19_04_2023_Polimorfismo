package com.hedima.modelo;

import java.time.LocalDate;

public class Gerente extends Empleado {

    //Atributos
    private String departamento;

    //Metodo sobreescribir el método

    @Override
    public String mostrarInfo() {
        //Se tiene dos opciones
        //1. Modificar todo
        //2. Complementar información como es en este caso, añadir solo el departamento.
        return super.mostrarInfo() + " Departamento " + departamento;
    }


    //Los constructores no se heredan.
    //Si que los puedo llamar con -super

    //Constructor


    public Gerente() {

    }

    public Gerente(String nombre, double sueldo, LocalDate fNacimiento, String departamento) {
        super(nombre, sueldo, fNacimiento);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
